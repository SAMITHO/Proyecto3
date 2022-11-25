/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Principal {

    private ArrayList<cliente> clientes;
    private ArrayList<pelicula> peliculas;
    private ArrayList<clip> clips;
    private cliente clienteActual;
    private Date fecha;
    private SimpleDateFormat objSDF;

    /**
     * @param args the command line arguments
     */
    // Inicializa el sistema con 10 clientes, 10 peliculas y 10 clips
    public void inicializarPlataforma() {
        // TODO code application logic here
        clienteActual = null;
        peliculas = new ArrayList<pelicula>();
        peliculas.add(new pelicula(0, "• Ant-Man and the Wasp", "", "/imagenes/ant man.png", "", "Español", "DISPONIBLE"));
        peliculas.add(new pelicula(1, "• Avengers: Era de Ultron", "", "/imagenes/avengers.png", "", "Español", "DISPONIBLE"));
        peliculas.add(new pelicula(2, "• Capitana marvel", "", "/imagenes/thor.png", "", "Español", "DISPONIBLE"));
        peliculas.add(new pelicula(3, "• Capitan America: Civil War", "", "/imagenes/capmarvel.png", "", "Español", "DISPONIBLE"));
        peliculas.add(new pelicula(4, "• Avengers: End game", "", "/imagenes/end game.png", "", "Español", "DISPONIBLE"));
        peliculas.add(new pelicula(5, "• Guardianes de la galaxia Vol.2", "", "/imagenes/guardianas.png", "", "Español", "DISPONIBLE"));
        peliculas.add(new pelicula(6, "• Iron man 1", "", "/imagenes/iron man 1.png", "", "Español", "DISPONIBLE"));
        peliculas.add(new pelicula(7, "• Spider-Man: No way home", "", "/imagenes/no way home.png", "", "Español", "DISPONIBLE"));
        peliculas.add(new pelicula(8, "• Doctor Strange: Multiverso de locura", "", "/imagenes/civil war.png", "", "Español", "DISPONIBLE"));
        peliculas.add(new pelicula(9, "• Thor: Love and thunder", "", "/imagenes/strange.png", "", "Español", "DISPONIBLE"));

        clientes = new ArrayList<cliente>();
        clientes.add(new cliente("109875432", "Juan", "Perez", "M", "Casa1", "Torcoroma", "5756893", "3104888274", "cae", "cae", peliculas, clips));
        clientes.add(new cliente("1093588502", "Camila", "Leal", "F", "Betania", "Los patios", "5753333", "3204913622", "mariani", "1273", peliculas, clips));
        clientes.add(new cliente("1093432512", "Samuel", "Alvarez", "M", "Calle 7a", "Popular", "5784000", "3187032099", "admin", "admin", peliculas, clips));
        clientes.add(new cliente("1007176223", "Santiago", "Rojas", "M", "Calle 33", "Bellavista", "", "3219745305", "srojas", "s777", peliculas, clips));
        clientes.add(new cliente("1091968386", "Sebastaian", "Beltran", "M", "Calle 38", "Los patios", "", "3106888502", "sbeltran", "0102", peliculas, clips));
        clientes.add(new cliente("1027952774", "Julian", "Valdeleon", "M", "Calle 1N", "San gregorio", "", "3042558395", "jvaldelyon", "0102", peliculas, clips));
        clientes.add(new cliente("1010102972", "Carlos", "Gomez", "M", "Int 2", "Urb Prados Club", "", "", "", "", peliculas, clips));
        clientes.add(new cliente("1092334432", "Juana", "Marquez", "F", "calle 2", "La Playa", "", "", "", "", peliculas, clips));
        clientes.add(new cliente("1092526707", "Catalina", "Angarita", "F", "catalina.angaritaz@gmail.com", "San Martin", "", "3227237832", "catis", "2022", peliculas, clips));
        clientes.add(new cliente("1092343322", "Andres", "Cepeda", "M", "andres.cepeda@gmail.com", "Patios", "", "322235445", "Andres", "Cepeda", peliculas, clips));

        fecha = new Date();
        String formatoFecha = "dd-MM-aaaa";
        objSDF = new SimpleDateFormat(formatoFecha);
        // System.out.println(objSDF.format(objDate));
    }

    public Object[][] generarReporteClientes() {
        int cantClientes = clientes.size();
        Object[][] rta = new Object[cantClientes][8];
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < cantClientes; i++) {
                if (j == 0) {
                    rta[i][j] = clientes.get(i).darCedula();
                } else if (j == 1) {
                    rta[i][j] = clientes.get(i).darNombre();
                } else if (j == 2) {
                    rta[i][j] = clientes.get(i).darApellido();
                } else if (j == 3) {
                    rta[i][j] = clientes.get(i).darGenero();
                } else if (j == 4) {
                    rta[i][j] = clientes.get(i).darBarrio();
                } else if (j == 5) {
                    rta[i][j] = clientes.get(i).darDirecion();
                } else if (j == 6) {
                    rta[i][j] = clientes.get(i).darTelFijo();
                } else if (j == 7) {
                    rta[i][j] = clientes.get(i).darTelCel();
                }
            }
        }
        return rta;
    }

    public void registrarse(String ced, String nom, String ap, String gen, String dir, String bar, String telfi, String telcel, String user, String contra) {
        clientes.add(new cliente(ced, nom, ap, gen, dir, bar, telfi, telcel, user, contra, peliculas, clips));
    }

    public boolean iniciarSesion(String usuario, String contrasena) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).darUsuario().equals(usuario) && clientes.get(i).darContrasena().equals(contrasena)) {
                clienteActual = clientes.get(i);
                return true;
            }
        }
        if (clienteActual == null) {
            JOptionPane.showMessageDialog(null, "Usuario y contrasena invalidos");
        }
        return false;
    }

    public void cerrarSesion() {
        clienteActual = null;
    }

    public void comprarPelicula(pelicula pPelicula) {
        try {
            clienteActual.comprarPelicula(pPelicula);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la sesion iniciada");
        }
    }

    public ArrayList<cliente> mostrarClientes() {
        return clientes;
    }

    public void mostrarPeliculasDisponiblesDelUsuario() {
        clienteActual.darPeliculasDisponibles();
    }

    public void mostrarPeliculasActualesDelUsuario() {
        clienteActual.darPeliculasCompradas();
    }

    public void mostrarClipsDisponiblesDelUsuario() {
        clienteActual.darClipsDisponibles();
    }

    public void mostrarClipsActualesDelUsuario() {
        clienteActual.darClipsComprados();
    }

    public cliente mostrarClienteActual() {
        return clienteActual;
    }

    public boolean clienteExiste(String user) {
        boolean existe = false;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).darUsuario().equals(user)) {
                existe = true;
            }
        }
        return existe;
    }

    public cliente buscarClienteXCedula(String cliente) {
        cliente cedula = null;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).darCedula().equals(cliente)) {
                cedula = clientes.get(i);
            }
        }
        return cedula;

    }
}
