/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcal.json;

/**
 *
 * @author esteban
 */
public class MovimientoJSON {
 
  private String  CodigoCuenta;
  private int Debe;
  private int Haber;         
  private String TpoDocum;
  private int Numero;

    public String getCodigoCuenta() {
        return CodigoCuenta;
    }

    public void setCodigoCuenta(String CodigoCuenta) {
        this.CodigoCuenta = CodigoCuenta;
    }

    public int getDebe() {
        return Debe;
    }

    public void setDebe(int Debe) {
        this.Debe = Debe;
    }

    public int getHaber() {
        return Haber;
    }

    public void setHaber(int Haber) {
        this.Haber = Haber;
    }

    public String getTpoDocum() {
        return TpoDocum;
    }

    public void setTpoDocum(String TpoDocum) {
        this.TpoDocum = TpoDocum;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    
    
}
