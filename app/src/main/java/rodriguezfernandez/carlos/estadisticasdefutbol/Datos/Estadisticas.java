package rodriguezfernandez.carlos.estadisticasdefutbol.Datos;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;

@Entity(tableName = "estadisticas",primaryKeys = {"dorsal","partido"})
public class Estadisticas {
    @ColumnInfo(name = "dorsal")
    private int dorsal;
    @ColumnInfo(name = "partido")
    private int partido;
    @ColumnInfo(name = "tiros")
    private int tiros;
    @ColumnInfo(name = "goles")
    private int goles;
    @ColumnInfo(name = "faltas")
    private int faltas;
    @ColumnInfo(name ="minE" )
    private int minutoEntrada;
    @ColumnInfo(name = "minS")
    private int minutoSalida;

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getPartido() {
        return partido;
    }

    public void setPartido(int partido) {
        this.partido = partido;
    }

    public int getTiros() {
        return tiros;
    }

    public void setTiros(int tiros) {
        this.tiros = tiros;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getMinutoEntrada() {
        return minutoEntrada;
    }

    public void setMinutoEntrada(int minutoEntrada) {
        this.minutoEntrada = minutoEntrada;
    }

    public int getMinutoSalida() {
        return minutoSalida;
    }

    public void setMinutoSalida(int minutoSalida) {
        this.minutoSalida = minutoSalida;
    }
}
