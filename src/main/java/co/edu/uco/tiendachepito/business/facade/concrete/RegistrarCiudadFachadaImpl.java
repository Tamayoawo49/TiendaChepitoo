package co.edu.uco.tiendachepito.business.facade.concrete;

import co.edu.uco.tiendachepito.business.facade.RegistrarCiudadFachada;
import co.edu.uco.tiendachepito.data.dao.factory.DAOFactory;
import co.edu.uco.tiendachepito.data.dao.factory.enums.Factory;
import co.edu.uco.tiendachepito.dto.CiudadDTO;

public final class RegistrarCiudadFachadaImpl implements RegistrarCiudadFachada {
    private DAOFactory factory;

    public RegistrarCiudadFachadaImpl() {
        factory = DAOFactory.getFactory(Factory.AZURESQL);


    @Override
    public final void ejecutar (final CiudadDTO ciudad){
        //TODO Auto-generated method stub
    }
}
