/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3;

/**
 *
 * @author User
 */
public class pelicula {
    int codigo;
    String nombre;
    String categoria;
    String fuente;
    String sinopsis;
    String idioma;
    String estado;
    
    public pelicula(int cod, String nom, String cat, String font, String sin, String idi, String st){
        codigo = cod;
        nombre = nom;
        categoria = cat;
        fuente = font;
        sinopsis = sin;
        idioma = idi;
        estado = st;
        
               
    }
    public int darCodigo(){
        return codigo;
    }
    
    public String darNombre(){
        return nombre;
    }
    
    public String darCategoria(){
        return categoria;
    }
    
    public String darFuente(){
        return fuente;
    }
    
    public String darSinopsis(){
        return sinopsis;
    }
    
    public String darIdioma(){
        return idioma;
    }
    
    public String darEstado(){
        return estado;
    }
    
    public void cambiarEstado(String pEstado){
        estado = pEstado;
    }
    
}
