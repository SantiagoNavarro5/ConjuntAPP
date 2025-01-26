package conjuntapp1;
/**@author Alejandra
 */
public class DomiciliosYPaquetes {
    private int Apto;
    private String Receptor;
    private String NombreenPaquete;
    private String FechaHoraLlegada;
    private String FechaHoraEntrega;
    private boolean Estado;
    private String FotoODescripción;
    
    public DomiciliosYPaquetes(int Apto, String Receptor, String NombreenPaquete, String FechaHoraLlegada, String FechaHoraEntrega, boolean Estado, String FotoODescripción){
        this.Apto = Apto;
        this.Receptor = Receptor;
        this.NombreenPaquete = NombreenPaquete;
        this.FechaHoraLlegada = FechaHoraLlegada;
        this.FechaHoraEntrega = FechaHoraEntrega;
        this.Estado = Estado;
        this.FotoODescripción = FotoODescripción;
    }
    public int getApto() {
        return Apto;
    }
    public void setApto(int Apto) {
        this.Apto = Apto;
    }
    public String getReceptor() {
        return Receptor;
    }
    public void setReceptor(String Receptor) {
        this.Receptor = Receptor;
    }
    public String getNombreenPaquete() {
        return NombreenPaquete;
    }
    public void setNombreenPaquete(String NombreenPaquete) {
        this.NombreenPaquete = NombreenPaquete;
    }
    public String getFechaHoraLlegada() {
        return FechaHoraLlegada;
    }
    public void setFechaHoraLlegada(String FechaHoraLlegada) {
        this.FechaHoraLlegada = FechaHoraLlegada;
    }
    public String getFechaHoraEntrega() {
        return FechaHoraEntrega;
    }
    public void setFechaHoraEntrega(String FechaHoraEntrega) {
        this.FechaHoraEntrega = FechaHoraEntrega;
    }
    public boolean getEstado(){
        return Estado;
    }
    public void setEstado(boolean Estado){
        this.Estado = Estado;
    }
    public String getFotoODescripción() {
        return FotoODescripción;
    }
    public void setFotoODescripción(String FotoODescripción) {
        this.FotoODescripción = FotoODescripción;
    }
    public String VerEstadoEntrega(){
        String j;
        j = null;
        if (Estado==false){
            j=". No ha sido recibido.";
        }else{
            if("".equals(Receptor)){
                j=". Fue recibido el "+FechaHoraEntrega;
            }else{
                j=". Fue recibido el "+FechaHoraEntrega+" por "+Receptor;
            }
        }
        return FotoODescripción+" llegó al apto "+Apto+" el "+FechaHoraLlegada+" a nombre de "+NombreenPaquete+j;
    }
}
