package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Achievement implements Initializable {

    @FXML
    private TextField Ach1,AchDate1,Ach2,AchDate2,Ach3,AchDate3;

    @FXML
    private TextArea AchDes1,AchDes2,AchDes3;

    @FXML
    private Button Save;

    public void saveButton(ActionEvent event) throws IOException {
        GenerateCV.Ach1 = Ach1.getText();
        GenerateCV.AchDate1 = AchDate1.getText();
        GenerateCV.Ach2 = Ach2.getText();
        GenerateCV.AchDate2 = AchDate2.getText();
        GenerateCV.Ach3 = Ach3.getText();
        GenerateCV.AchDate3 = AchDate3.getText();
        GenerateCV.AchDes1 = AchDes1.getText();
        GenerateCV.AchDes2 = AchDes2.getText();
        GenerateCV.AchDes3 = AchDes3.getText();
        Stage stage = (Stage) Save.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Ach1.setText(GenerateCV.Ach1);
        Ach2.setText(GenerateCV.Ach2);
        Ach3.setText(GenerateCV.Ach3);
        AchDate1.setText(GenerateCV.AchDate1);
        AchDate2.setText(GenerateCV.AchDate2);
        AchDate3.setText(GenerateCV.AchDate3);
        AchDes1.setText(GenerateCV.AchDes1);
        AchDes2.setText(GenerateCV.AchDes2);
        AchDes3.setText(GenerateCV.AchDes3);
    }
}
