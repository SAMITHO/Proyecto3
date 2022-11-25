/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3;

/**
 *
 * @author samue
 */


import java.io.File;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;


/**
 * --module-path "C:\Librerias_java\javafx-sdk-17.0.1\lib" --add-modules javafx.controls,javafx.fxml
 * @author PC
 */
public class ironmantrailer extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        final String Nombre_archivo = "C:\\Users\\samue\\OneDrive\\Desktop\\Proyecto3\\src\\Peliculas y clips\\Iron man\\Iron Man (2008) Trailer #1 _ Movieclips Classic Trailers.mp4";
    File archivo = new File (Nombre_archivo);
    
    Media video = new Media(archivo.toURI().toString());
    MediaPlayer reproductor = new MediaPlayer(video);
    MediaView ventana = new MediaView(reproductor);
    reproductor.setAutoPlay(true);
    reproductor.setVolume(1.2);
    
    Group escenario = new Group();
    escenario.getChildren().add(ventana);
    Scene escena = new Scene(escenario, 1280,700 );
    stage.setScene(escena);
    stage.setTitle("IronMan_Trailer");
    stage.show();
    
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

