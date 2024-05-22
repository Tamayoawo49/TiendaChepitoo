package co.edu.uco.tiendachepito.business.domain;

public class CiudadDomain {
    private int id;
    private String nombre;
    private DepartamentoDomain departamento;

    public int getId() {
        return id;
    }

    private final void  setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    private final void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DepartamentoDomain getDepartamento() {
        return departamento;
    }

    private final  void setDepartamento(DepartamentoDomain departamento) {
        this.departamento = departamento;
    }
}
