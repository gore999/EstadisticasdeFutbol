package rodriguezfernandez.carlos.estadisticasdefutbol.Datos;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "jugador")
public class Jugador {
    private static enum Posicion{Del,Med,Def,Por};

    @ColumnInfo(name = "nombre")
    private String nombre;
    @ColumnInfo(name = "apellido1")
    private String apellido1;
    @ColumnInfo(name = "apellido2")
    private String apellido2;
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "dorsal")
    private int dorsal;
    private Posicion posicion;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

}
