package conjuntapp1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Santiago
 */
public class Servicios {

    private final ArrayList<Usuario> usuarios;
    private static Usuario usuarioLogueado;

    // Constructor
    public Servicios() {
        usuarios = new ArrayList<>();
    }

    // Método main
    public static void main(String[] args) {
        Servicios servicio = new Servicios();
        System.out.println("¡Servicios inicializados correctamente!");
        servicio.Login();
    }

    // Métodos adicionales
    public void Login() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        do {
            System.out.println("1. Crear cuenta");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1: crearCuenta(scanner);
                break;
                case 2: iniciarSesion(scanner);
                break;
                case 3: System.out.print("Gracias por usar ConjuntApp ");
                        salir = true;
                        break;
                default: System.out.println("Opción no válida.");
            }
        } while (!salir);
    }

    
            
    public void crearCuenta(Scanner scanner) {
        System.out.println("Se encuentra creando una cuenta");
        System.out.print("Ingrese un nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        // Verificar si el usuario ya existe
        if (buscarUsuario(nombreUsuario) != null) {
            System.out.println("El usuario ya existe. Intenta con otro nombre.");
            return;
        }

        System.out.print("Ingrese una contraseña: ");
        String contrasena = scanner.nextLine();
       
        System.out.print("Ingrese un email o escriba cancelar para salir: ");
        String email = scanner.nextLine();
        boolean emailValido = false;
             if (esEmailValido(email)) {
                 emailValido = true;
            } else {
               System.out.println("El email no es válido. Debe contener un '@' y un '.'");
               return;
            }

        System.out.print("Ingrese el apartamento: ");
        int apartamento = scanner.nextInt();

        usuarios.add(new Usuario(nombreUsuario, apartamento, email, contrasena)); // Crea el usuario y lo agrega a una lista
        System.out.println("Cuenta creada exitosamente.");
        iniciarSesion(scanner);
    }
    private boolean esEmailValido(String email) {
        return email.contains("@") && email.contains(".");
    }
    // Método para iniciar sesión
    public void iniciarSesion(Scanner scanner) {
        System.out.println("Se encuentra iniciando sesion");
        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        // Buscar el usuario
        Usuario usuario = buscarUsuario(nombreUsuario);
        if (usuario == null) {
            System.out.println("Usuario no encontrado.");
            return;
        }

        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();
        // Verificar la contraseña
        if (usuario.getContraseña().equals(contrasena)) {
            usuarioLogueado = usuario;
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + usuario.getNombreUsuario() + "!");
            opciones(usuarioLogueado);
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }
   
   
    // Método para segundo menu
    private static final Scanner s = new Scanner(System.in);
    public static void opciones(Usuario x) {
        String opción;
        do {
            System.out.println("Usted está en la página principal");
            System.out.println("a. Cuenta");
            System.out.println("b. Notificaciones");
            System.out.println("c. Reservaciones");
            System.out.println("d. Visitas");
            System.out.println("e. Historial de domicilios y paquetes");
            System.out.println("f. Pagos pendientes");
            System.out.println("g. Configuración");
            System.out.println("Seleccione mediante la letra");
            opción = s.next();
        
            switch (opción){
                case "a" : VerCuenta(x);
                case "b" : VerNotificaciones();
                case "c" : VerReservaciones();
                case "d" : VerVisitas();
                case "e" : VerHDDYP();
                case "f" : VerPagosPendientes();
                case "g" : AbrirConfiguración();
                default : System.out.println("Opción no válida");
            }
        }while(!"h".equals(opción));        
    }
    public static void VerCuenta(Usuario user){
        System.out.println("CUENTA");
        System.out.println(user.infoUsuario());
    }
    public static void VerNotificaciones(){
        System.out.println("Últimas notificaciones");
        System.out.println(N1.VerNotificaciones());
        //Método mostrar una notificación de clase notificación
    }
    public static void VerReservaciones(){
        System.out.println(R1.VerReservaciones());
        //Método mostrar reservaciones de clase reservación
    }
    public static void VerVisitas(){
        System.out.println(V1.VerVisitas());
        //Método mostrar historial de visitas de clase visitas
    }
    public static void VerHDDYP(){
        System.out.println(D1.VerEstadoEntrega());
        System.out.println(D2.VerEstadoEntrega());
        System.out.println(D3.VerEstadoEntrega());
        //Método mostrar historial de domicilios y paquetes de clase DomiciliosYPaquetes
    }
    public static void VerPagosPendientes(){
        System.out.println(P1.VerPagoPendiente());
        System.out.println(P2.VerPagoPendiente());
        //Método mostrar pagos pendientes de clase pagos
    }
    private static void AbrirConfiguración() {
        boolean cerrarSesion = false;
        do {
            System.out.println("Si desea volver al menu principal, digite 1");
            System.out.println("Si desea cerrar sesión, digite 2");
            int opcion = s.nextInt();

            switch (opcion) {
                case 1: System.out.print("Gracias por usar ConjuntApp ");
                        cerrarSesion = true;
                        break;
                case 2: System.out.println("Se ha cerrado sesion");
                        usuarioLogueado = null;
                        cerrarSesion = true;
                        break;
                default: System.out.println("Opción no válida.");
            }
        } while (!cerrarSesion);
        
    }
    static final Usuario Andrea = new Usuario ("Andrea Carreño Parra", 7901, "andrecarpa@gmail.com" , "1234");
    static Notificación N1 = new Notificación ("Admin", Andrea, "Ejemplo de mensaje", "22/01/2025", true);
    static Reservación R1 = new Reservación (01, Andrea, "24/01/2025", "11:00", "Sauna", "Confirmada");
    static Visitas V1 = new Visitas (7901, "Camila Reina", "23/01/2025", "9:37");
    static Pagos P1 = new Pagos ("Gimnasio", 2000, false);
    static Pagos P2 = new Pagos ("Piscina", 2000, true);
    static DomiciliosYPaquetes D1 = new DomiciliosYPaquetes (7901, "Sandra Parra", "Sandra Parra", "20/01/2025 17:38", "23/01/2025 8:42", true, "Caja mediana");
    static DomiciliosYPaquetes D2 = new DomiciliosYPaquetes (7901, "", "Fredy Carreño", "22/01/2025 17:38", "", false, "Prensa");
    static DomiciliosYPaquetes D3 = new DomiciliosYPaquetes (7901, "", "", "23/01/2025 12:20", "23/01/2025 12:20", true, "Domicilio Cruz Verde");

    // Método para buscar un usuario por nombre
    private Usuario buscarUsuario(String nombreUsuario) {
        for (Usuario usuario: usuarios){
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;
    }
}