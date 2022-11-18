/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcal.json;

import java.util.ArrayList;

/**
 *
 * @author esteban
 */
public class ComprobanteJSON {
  private String TpoComp;
  private int NumComp;
  private String FechaContable;
  private String GlosaAnalisis;
  private ArrayList<MovimientoJSON> Movimientos;

    public String getTpoComp() {
        return TpoComp;
    }

    public void setTpoComp(String TpoComp) {
        this.TpoComp = TpoComp;
    }

    public int getNumComp() {
        return NumComp;
    }

    public void setNumComp(int NumComp) {
        this.NumComp = NumComp;
    }

    public String getFechaContable() {
        return FechaContable;
    }

    public void setFechaContable(String FechaContable) {
        this.FechaContable = FechaContable;
    }

    public String getGlosaAnalisis() {
        return GlosaAnalisis;
    }

    public void setGlosaAnalisis(String GlosaAnalisis) {
        this.GlosaAnalisis = GlosaAnalisis;
    }

    public ArrayList<MovimientoJSON> getMovimientos() {
        return Movimientos;
    }

    public void setMovimientos(ArrayList<MovimientoJSON> Movimientos) {
        this.Movimientos = Movimientos;
    }
}
