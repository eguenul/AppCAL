/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcal.json;

/**
 *
 * @author esteban
 */
public class RegistroDiarioJSON {
    
    /*   
    <RegistroDiario>
     <FechaContable>2006-01-03</FechaContable>
    <CantidadComprobantes>2</CantidadComprobantes>
    <CantidadMovimientos>6</CantidadMovimientos>
    <SumaValorComprobante>509680</SumaValorComprobante>
    </RegistroDiario>
    */
    
    private String FechaContable;
    private int CantidadComprobantes;
    private int CantidadMovimientos;
    private int SumaValorComprobante;

    public String getFechaContable() {
        return FechaContable;
    }

    public void setFechaContable(String FechaContable) {
        this.FechaContable = FechaContable;
    }

    public int getCantidadComprobantes() {
        return CantidadComprobantes;
    }

    public void setCantidadComprobantes(int CantidadComprobantes) {
        this.CantidadComprobantes = CantidadComprobantes;
    }

    public int getCantidadMovimientos() {
        return CantidadMovimientos;
    }

    public void setCantidadMovimientos(int CantidadMovimientos) {
        this.CantidadMovimientos = CantidadMovimientos;
    }

    public int getSumaValorComprobante() {
        return SumaValorComprobante;
    }

    public void setSumaValorComprobante(int SumaValorComprobante) {
        this.SumaValorComprobante = SumaValorComprobante;
    }
    
    
    
}
