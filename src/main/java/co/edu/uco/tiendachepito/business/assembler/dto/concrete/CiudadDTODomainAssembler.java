package co.edu.uco.tiendachepito.business.assembler.dto.concrete;

import co.edu.uco.tiendachepito.business.assembler.dto.DTODomainAssembler;
import co.edu.uco.tiendachepito.business.domain.CiudadDomain;
import co.edu.uco.tiendachepito.business.domain.DepartamentoDomain;
import co.edu.uco.tiendachepito.business.domain.PaisDomain;
import co.edu.uco.tiendachepito.crosscutting.helpers.ObjectHelper;
import co.edu.uco.tiendachepito.dto.CiudadDTO;
import co.edu.uco.tiendachepito.dto.DepartamentoDTO;
import co.edu.uco.tiendachepito.dto.PaisDTO;

public final class CiudadDTODomainAssembler implements DTODomainAssembler<CiudadDomain, CiudadDTO> {

    private static final DTODomainAssembler<CiudadDomain, CiudadDTO> instancia =
            new CiudadDTODomainAssembler();

    public static final DTODomainAssembler<DepartamentoDomain, DepartamentoDTO> departamentoAssembler =
            DepartamentoDTODomainAssembler.obtenerInstancia();

    private CiudadDTODomainAssembler() {
        super();
    }

    public static final DTODomainAssembler<CiudadDomain, CiudadDTO> obtenerInstancia(){
        return instancia;
    }

    @Override
    public final CiudadDomain ensamblarDominio(final CiudadDTO dto) {
        var CiudadDtoTmp = ObjectHelper.getObjectHelper().getDefault(dto, new CiudadDTO());
        var departamentoDomain = departamentoAssembler.ensamblarDominio(CiudadDtoTmp.getDepartamento());
        return CiudadDomain.crear(CiudadDtoTmp.getId(),CiudadDtoTmp.getNombre(),departamentoDomain);
    }

    @Override
    public final CiudadDTO ensamblarDTO(final CiudadDomain dominio) {
        var CiudadDomainTmp = ObjectHelper.getObjectHelper().getDefault(dominio, CiudadDomain.crear());
        var departamentoDTO = departamentoAssembler.ensamblarDTO(CiudadDomainTmp.getDepartamento());

        return CiudadDTO.build().setId(CiudadDomainTmp.getId()).setNombre(CiudadDomainTmp.getNombre()).setDepartamento(departamentoDTO);
    }
}
