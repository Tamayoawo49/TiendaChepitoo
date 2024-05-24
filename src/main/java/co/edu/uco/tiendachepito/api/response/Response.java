package co.edu.uco.tiendachepito.api.response;

import java.util.ArrayList;

public abstract class Response<T> {

    private List<String> mensajes= new ArrayList<E>();
    private List<T> dato;

    public List<String> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<String> mensajes) {
        this.mensajes = mensajes;
    }

    public List<T> getDato() {
        return dato;
    }

    public void setDato(List<T> dato) {
        this.dato = dato;
    }
}
