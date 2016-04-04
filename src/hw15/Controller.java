package hw15;

import static hw15.Music.player;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class Controller {

    // трек воспроизводится
    @FXML
    public void buttonPlay() {
        player.play();
    }

    // трек приостаналивается
    @FXML
    public void buttonPause() {
        player.pause();
    }

    // трек останаливается
    @FXML
    public void buttonStop() {
        player.stop();
    }

    // перематывание трека назад
    @FXML
    public void buttonPrev() {
        player.seek(player.getCurrentTime().divide(1.5));
    }

    // перематывание трека вперед
    @FXML
    public void buttonNext() {
        player.seek(player.getCurrentTime().multiply(1.5));
    }

    // включение/отключение звука
    @FXML
    public void buttonSound() {
        if (!player.isMute()) {
            player.setMute(true);
        } else {
            player.setMute(false);
        }
    }

    // регулировка звука
    @FXML
    Slider sliderVolume;

    @FXML
    Label LabelSound;

    
    public void sliderVolume() {
        player.setVolume(sliderVolume.getValue() / 100.0);
        LabelSound.setText((int)sliderVolume.getValue() + "");
    }

    // слайдер трека
    @FXML
    Slider sliderTrack;
    
    @FXML
    Label ButtonStart;
    Label SliderEnd;
    
    @FXML
    public void sliderTrack() {
        
    }
    
}
