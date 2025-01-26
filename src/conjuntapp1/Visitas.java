package conjuntapp1;
/**@author Alejandra
 */
public class Visitas {
    public int Apto;
    public String NombreVisitante;
    public String FechaVisita;
    public String HoraIngreso;
    
    public Visitas(int Apto, String NombreVisitante, String FechaVisita, String HoraIngreso){
        this.Apto = Apto;
        this.NombreVisitante = NombreVisitante;
        this.FechaVisita = FechaVisita;
        this.HoraIngreso = HoraIngreso;
    }
    public int getApto() {
        return Apto;
    }
    public void setApto(int Apto) {
        this.Apto = Apto;
    }
    public String NombreVisitante(){
        return NombreVisitante;
    }
    public void setVisitante(String NombreVisitante) {
        this.NombreVisitante = NombreVisitante;
    }
    public String getHora() {
        return HoraIngreso;
    }
    public void setHora(String Hora) {
        this.HoraIngreso = Hora;
    }
    public String getFechaVisita() {
        return FechaVisita;
    }
    public void setFecha(String FechaVisita) {
        this.FechaVisita = FechaVisita;
    }
    public String VerVisitas(){
        return FechaVisita+"  "+HoraIngreso+
                "\n Visitante:"+NombreVisitante;
    }
}
