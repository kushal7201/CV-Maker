package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Skill implements Initializable {

    @FXML
    private TextField LangKnown,ProLangKnown,Others;

    @FXML
    private Button Save;

    public void saveButton(ActionEvent event) throws IOException {
        GenerateCV.LangKnown = LangKnown.getText();
        GenerateCV.ProLangKnown = ProLangKnown.getText();
        GenerateCV.Others = Others.getText();
        Stage stage = (Stage) Save.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        LangKnown.setText(GenerateCV.LangKnown);
        ProLangKnown.setText(GenerateCV.ProLangKnown);
        Others.setText(GenerateCV.Others);
    }
}
