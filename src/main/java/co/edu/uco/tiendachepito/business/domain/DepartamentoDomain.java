package co.edu.uco.tiendachepito.business.domain;

public class DepartamentoDomain {
    private int id;
    private String nombre;
    private PaisDomain pais;

    public DepartamentoDomain(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PaisDomain getPais() {
        return pais;
    }

    public void setPais(PaisDomain pais) {
        this.pais = pais;
    }
}
