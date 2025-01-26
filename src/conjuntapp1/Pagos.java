package conjuntapp1;
/**@author Alejandra
 */
public class Pagos {
    private String Servicio;
    private int Costo;
    private boolean Pago;
    
    public Pagos(String Servicio, int Costo, boolean Pago){
        this.Servicio = Servicio;
        this.Costo = Costo;
        this.Pago = Pago;
    }
    public String getServicio() {
        return Servicio;
    }
    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }
    public int getCosto(){
        return Costo;
    }
    public void setCosto(int Costo){
        this.Costo = Costo;
    }
    public boolean getPago(){
        return Pago;
    }
    public void setPago(boolean Pago) {
        this.Pago = Pago;
    }
    
    public String VerPagos(){
        String h;
        if (Pago==true){
            h="está pago";
        }else{
            h="no está pago";
        }
        return "El servicio de "+Servicio+" con un costo de $"+Costo+" "+h;
    }
    public String VerPagoPendiente(){
        String i;
        if (Pago==false){
            i=VerPagos();
            return i;
        }else{
            return "No tiene más pagos pentientes";
        }
    }
}
