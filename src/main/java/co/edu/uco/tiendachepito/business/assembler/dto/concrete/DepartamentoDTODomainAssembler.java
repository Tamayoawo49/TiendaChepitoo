package co.edu.uco.tiendachepito.business.assembler.dto.concrete;

import co.edu.uco.tiendachepito.business.assembler.dto.DTODomainAssembler;
import co.edu.uco.tiendachepito.business.domain.DepartamentoDomain;
import co.edu.uco.tiendachepito.business.domain.PaisDomain;
import co.edu.uco.tiendachepito.crosscutting.helpers.ObjectHelper;
import co.edu.uco.tiendachepito.dto.DepartamentoDTO;
import co.edu.uco.tiendachepito.dto.PaisDTO;

public final class DepartamentoDTODomainAssembler implements DTODomainAssembler <DepartamentoDomain, DepartamentoDTO>{

    private static final DTODomainAssembler<DepartamentoDomain, DepartamentoDTO> instancia =
            new DepartamentoDTODomainAssembler();

    public static final DTODomainAssembler<PaisDomain, PaisDTO> paisAssembler =
            PaisDTODomainAssembler.obtenerInstancia();

    private DepartamentoDTODomainAssembler() {
        super();
    }

    public static final DTODomainAssembler<DepartamentoDomain, DepartamentoDTO> obtenerInstancia(){
        return instancia;
    }

    @Override
    public final DepartamentoDomain ensamblarDominio(final DepartamentoDTO dto) {
        var DepartamentoDtoTmp = ObjectHelper.getObjectHelper().getDefault(dto, new DepartamentoDTO());
        var paisDomain = paisAssembler.ensamblarDominio(DepartamentoDtoTmp.getPais());
        return DepartamentoDomain.crear(DepartamentoDtoTmp.getId(),DepartamentoDtoTmp.getNombre(),
                PaisDTODomainAssembler.obtenerInstancia().ensamblarDominio(DepartamentoDtoTmp.getPais()));
    }

    @Override
    public final DepartamentoDTO ensamblarDTO(final DepartamentoDomain dominio) {
        var DepartamentoDomainTmp = ObjectHelper.getObjectHelper().getDefault(dominio, DepartamentoDomain.crear());

        var paisDTO = paisAssembler.ensamblarDTO(DepartamentoDomainTmp.getPais());
        return DepartamentoDTO.build().setId(DepartamentoDomainTmp.getId())
                .setNombre(DepartamentoDomainTmp.getNombre())
                .setPais(paisDTO);
    }
}
