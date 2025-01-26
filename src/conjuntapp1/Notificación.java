package conjuntapp1;
/**@author Alejandra
 */
public class Notificación {
    private String Emisor;
    private Usuario Receptor;
    private String Mensaje;
    private String FechaEnvio;
    private boolean Visto;
    
    public Notificación(String Emisor,Usuario Receptor, String Mensaje, String FechaEnvio, boolean Visto){
        this.Emisor = Emisor;
        this.Receptor = Receptor;
        this.Mensaje = Mensaje;
        this.FechaEnvio = FechaEnvio;
        this.Visto = Visto;
    }
    public String getEmisor() {
        return Emisor;
    }
    public void setEmisor(String Emisor) {
        this.Emisor = Emisor;
    }
    public Usuario getReceptor() {
        return Receptor;
    }
    public void setReceptor(Usuario Receptor) {
        this.Receptor = Receptor;
    }
    public String getMensaje() {
        return Mensaje;
    }
    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
    public String getFechaEnvio() {
        return FechaEnvio;
    }
    public void setFechaEnvio(String FechaEnvio) {
        this.FechaEnvio = FechaEnvio;
    }
    public boolean getVisto(){
        return Visto;
    }
    public void setVisto(boolean Visto) {
        this.Visto = Visto;
    }
    public String VerNotificaciones(){
        return "De: " + Emisor +
                " Fecha:" + FechaEnvio +
                "\n " + Mensaje;
    }
}
