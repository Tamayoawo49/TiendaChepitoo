package co.edu.uco.tiendachepito.business.domain;

import co.edu.uco.tiendachepito.crosscutting.helpers.ObjectHelper;
import co.edu.uco.tiendachepito.crosscutting.helpers.TextHelper;

public class DepartamentoDomain {
    private int id;
    private String nombre;
    private PaisDomain pais;



    public DepartamentoDomain(final int id, final String nombre, final PaisDomain pais) {
        setId(id);
        setNombre(nombre);
        setPais(pais);

    }
    private DepartamentoDomain() {
        setNombre(TextHelper.EMPTY);
        setPais(PaisDomain.crear());
    }

    public static final DepartamentoDomain crear(final int id, final String nombre, final PaisDomain pais) {
        return new DepartamentoDomain(id, nombre, pais);
    }

    public static final DepartamentoDomain crear() {
        return new DepartamentoDomain();
    }



    public DepartamentoDomain(int id) {
        this.id = id;
    }




    public String getNombre() {
        return nombre;
    }

    public final void setNombre(final String nombre) {
        this.nombre = TextHelper.applyTrim(nombre);
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

    private final void setPais(final PaisDomain pais) {
        this.pais = ObjectHelper.getObjectHelper().getDefault(pais, PaisDomain.crear());
    }
}
