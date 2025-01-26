package conjuntapp1;
/**@author Alejandra
 */
public class Reservación {
    private int idReservación;
    private Usuario usuario;
    private String Hora;
    private String Fecha;
    private String EspacioReservado;
    private String EstadoReserva;
    
    public Reservación(int idReservación, Usuario usuario, String Hora, String Fecha, String EspacioReservado, String EstadoReserva){
        this.idReservación = idReservación;
        this.usuario = usuario;
        this.Hora = Hora;
        this.Fecha = Fecha;
        this.EspacioReservado = EspacioReservado;
        this.EstadoReserva = EstadoReserva;
    }
    public int getidReservación() {
        return idReservación;
    }
    public void setidReservación(int idReservación) {
        this.idReservación = idReservación;
    }
    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getHora() {
        return Hora;
    }
    public void setHora(String Hora) {
        this.Hora = Hora;
    }
    public String getFecha() {
        return Fecha;
    }
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    public String getEspacioReservado() {
        return EspacioReservado;
    }
    public void EspacioReservado(String EspacioReservado) {
        this.EspacioReservado = EspacioReservado;
    }
    public String getEstadoReserva() {
        return EstadoReserva;
    }
    public void setEstadoReserva(String EstadoReserva) {
        this.EstadoReserva = EstadoReserva;
    }
    public String VerReservaciones(){
        return idReservación +" Fecha: "+Fecha+
                "\n Hora: "+Hora+
                "\n Espacio: "+EspacioReservado+
                "\n Estado de la reserva: "+EstadoReserva;
    }
}
