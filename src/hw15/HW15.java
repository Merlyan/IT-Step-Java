/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Valik
 */
public class HW15 extends Application {

    public int i = 0;

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL url = getClass().getResource("player.fxml");
        Parent root = FXMLLoader.load(url);

        primaryStage.setTitle("MP3 Player");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        // вариант получения полного пути к файлу.
        String[] songs = {
            "Beating-Around-The-Bush.mp3",
            "Hells-Bells.mp3.mp3",
            "Highway-To-Hell.mp3",
            "T.N.T.mp3",
            "Thunderstruck.mp3"
        };

        String filePath = Paths.get("D:\\Programming\\HW15\\src\\mp3\\" + songs[i]).toUri().toString();

        Music music = new Music(filePath);
        music.play();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
