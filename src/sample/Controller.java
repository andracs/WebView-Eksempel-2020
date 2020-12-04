package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller {

    @FXML
    private WebView w1WebView;

    @FXML
    private Button b1;

    @FXML
    void visURL(ActionEvent event) {
        System.out.println("Viser hjemmesiden");
        WebEngine engine = w1WebView.getEngine();
        engine.load("https://www.youtube.com/embed/gAua3u3DXfU?fs=0&rel=0&showinfo=0&autoplay=1");
    }

}
