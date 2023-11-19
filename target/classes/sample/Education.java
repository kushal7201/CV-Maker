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

public class Education implements Initializable {
    @FXML
    private TextField Institute;

    @FXML
    private TextField Institute1;

    @FXML
    private TextField Institute2;

    @FXML
    private TextField PassYear;

    @FXML
    private TextField PassYear1;

    @FXML
    private TextField PassYear2;


    @FXML
    private TextField Grade;

    @FXML
    private TextField Grade1;

    @FXML
    private TextField Grade2;

    @FXML
    private TextField Course;

    @FXML
    private TextField Course1;

    @FXML
    private TextField Course2;



    @FXML
    public Button Save;

    public void saveButton(ActionEvent event) throws IOException {
        GenerateCV.Institute = Institute.getText();
        GenerateCV.Institute1 = Institute1.getText();
        GenerateCV.Institute2 = Institute2.getText();
        GenerateCV.PassYear = PassYear.getText();
        GenerateCV.PassYear1 = PassYear1.getText();
        GenerateCV.PassYear2 = PassYear2.getText();
        GenerateCV.Grade= Grade.getText();
        GenerateCV.Grade1= Grade1.getText();
        GenerateCV.Grade2= Grade2.getText();
        GenerateCV.Course = Course.getText();
        GenerateCV.Course1= Course1.getText();
        GenerateCV.Course2 = Course2.getText();
        Stage stage = (Stage) Save.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Institute.setText(GenerateCV.Institute);
        Institute1.setText(GenerateCV.Institute1);
        Institute2.setText(GenerateCV.Institute2);
        PassYear.setText(GenerateCV.PassYear);
        PassYear1.setText(GenerateCV.PassYear1);
        PassYear2.setText(GenerateCV.PassYear2);
        Grade.setText(GenerateCV.Grade);
        Grade1.setText(GenerateCV.Grade1);
        Grade2.setText(GenerateCV.Grade2);
        Course.setText(GenerateCV.Course);
        Course1.setText(GenerateCV.Course1);
        Course2.setText(GenerateCV.Course2);

    }
}
