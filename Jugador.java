package practica4;

/*
 * @author 22110090
 */
public class Jugador {
    private String nombreJ;
    private String posicion;
    private int valorMer;
    private float sueldo;
    

    public Jugador() {
        this.nombreJ = "obj";
        this.posicion = "obj";
        this.valorMer = 1;
        this.sueldo = 1;
    }

    public String getNombreJ() {
        return nombreJ;
    }

    public void setNombreJ(String nombreJ) {
        this.nombreJ = nombreJ;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getValorMer() {
        return valorMer;
    }

    public void setValorMer(int valorMer) {
        this.valorMer = valorMer;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

       

}
