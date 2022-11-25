/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class cliente {
    private String cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private String direccion;
    private String barrio;
    private String tel_fijo;
    private String tel_celular;
    private String usuario;
    private String contrasena;
    private ArrayList<clip> clips_disponibles;
    private ArrayList<clip> clips_actuales;
    private ArrayList<pelicula> peliculas_disponibles;
    private ArrayList<pelicula> peliculas_actuales;
    private ArrayList<sancion> sanciones;
    
    public cliente(String ced, String nom, String ap, String gen, String dir, String bar, String telfi, String telcel, String user, String contra, ArrayList<pelicula> pelis, ArrayList<clip> clipis){
        cedula = ced;
        nombre = nom;
        apellido = ap;
        genero = gen;
        direccion = dir;
        barrio = bar;
        tel_fijo = telfi;
        tel_celular = telcel;
        usuario = user;
        contrasena = contra;
        clips_disponibles = clipis;
        peliculas_disponibles = pelis;
        clips_actuales = new ArrayList<clip>();
        peliculas_actuales = new ArrayList<pelicula>();
        sanciones = new ArrayList<sancion>();
    }
    
    public String darCedula(){
        return cedula;
    }
    
    public String darNombre(){
        return nombre;
    }
    
    public String darApellido(){
        return apellido;
    }
    
    public String darGenero(){
        return genero;
    }
    
    public String darDirecion(){
        return direccion;
    }
    
    public String darBarrio(){
        return barrio;
    }
    
    public String darTelFijo(){
        return tel_fijo;
    }
    
    public String darTelCel(){
        return tel_celular;
    }
    
    public String darUsuario(){
        return usuario;
    }
    
    public String darContrasena(){
        return contrasena;
    }
    
    public ArrayList<pelicula> darPeliculasDisponibles(){
        return peliculas_disponibles;
    }
    
    public ArrayList<pelicula> darPeliculasCompradas(){
        return peliculas_actuales;
    }
    public ArrayList<clip> darClipsDisponibles(){
        return clips_disponibles;
    }
    public ArrayList<clip> darClipsComprados(){
        return clips_actuales;
    }
    
    public void cambiarContra(String contra){
        contrasena = contra;
    }
    
    
    public void comprarPelicula(pelicula pPelicula){
        peliculas_actuales.add(pPelicula);
        for(int i = 0; i<peliculas_disponibles.size(); i++){
            if(pPelicula == peliculas_disponibles.get(i)){
                peliculas_disponibles.get(i).cambiarEstado("COMPRADA");
            }
        } 
    }
    
    public void comprarClip(clip pClip){
        clips_actuales.add(pClip);
        for(int i = 0; i<clips_disponibles.size(); i++){
            if(pClip == clips_disponibles.get(i)){
                clips_disponibles.get(i);
            }
        }
    }
    
    public void alquilarPelicula(pelicula pPelicula){
        peliculas_actuales.add(pPelicula);
        for(int i = 0; i<peliculas_disponibles.size(); i++){
            if(pPelicula == peliculas_disponibles.get(i)){
                peliculas_disponibles.get(i).cambiarEstado("ALQUILADA");
            }
        } 
    }
    
     public void alquilarClip(clip pClip){
        clips_actuales.add(pClip);
        for(int i = 0; i<clips_disponibles.size(); i++){
            if(pClip == clips_disponibles.get(i)){
                clips_disponibles.get(i);
            }
        }
    }
     
     public pelicula buscarPelicula(int id){
         pelicula Peli = null;
         for(int i =0; i<peliculas_disponibles.size();i++){
             if(peliculas_disponibles.get(i).darCodigo() == id){
                 Peli =peliculas_disponibles.get(i);
             }
         }
         return Peli;
     }
     
     public pelicula buscarPeliculaXNombre(String nombre){
         pelicula Peli = null;
         for(int i =0; i<peliculas_disponibles.size();i++){
             if(peliculas_disponibles.get(i).darNombre().equals(nombre)){
                 Peli =peliculas_disponibles.get(i);
             }
         }
         return Peli;
     }
     public pelicula buscarPeliculaXFuente (String fuente){
          pelicula Peli = null;
         for(int i =0; i<peliculas_disponibles.size();i++){
             if(peliculas_disponibles.get(i).darFuente().equals(fuente)){
                 Peli =peliculas_disponibles.get(i);
             }
         }
         return Peli;
     }
    
    
    
}
