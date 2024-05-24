package co.edu.uco.tiendachepito.api.response.pais;

import co.edu.uco.tiendachepito.api.response.Response;
import co.edu.uco.tiendachepito.dto.PaisDTO;

import java.util.List;

public class PaisResponse extends Response<PaisDTO> {

    public static final PaisResponse build(List<String> mensajes, List<PaisDTO> datos) {
        Response<PaisDTO> instance = new PaisResponse();
        instance.setDato(datos);

        return instance;
    }

    public static final Response(<PaisDTO> build(final)) {
        Response<PaisDTO> instance = new PaisResponse();
        instance.setDato(datos);

        return instance;
    }
    
}
