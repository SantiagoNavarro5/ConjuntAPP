package conjuntapp1;

public class Usuario {

    private String NombreUsuario;
    private int ApartamentoUsuario;
    private String email;
    private String Contraseña;
    public Usuario(String NombreUsuario, int Apto, String email, String Contraseña){
        this.NombreUsuario = NombreUsuario;
        this.ApartamentoUsuario = Apto;
        this.email = email;
        this.Contraseña = Contraseña;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public int getApartamentoUsuario() {
        return ApartamentoUsuario;
    }

    public void setApartamentoUsuario(int ApartamentoUsuario) {
        this.ApartamentoUsuario = ApartamentoUsuario;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
    
    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    public String infoUsuario(){
        return "Nombre Usuario: "+NombreUsuario+
                "\n correo: "+email+
                "\n apartamento: "+ApartamentoUsuario;
    }
}
