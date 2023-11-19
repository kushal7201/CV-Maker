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

public class WorkExp implements Initializable {
    @FXML
    private TextField Comp1,Design1,JoinDate1,EndDate1,Comp2,Design2,JoinDate2,EndDate2;

    @FXML
    private Button Save;



    public void saveButton(ActionEvent event) throws IOException {
        GenerateCV.Comp1 = Comp1.getText();
        GenerateCV.Comp2 = Comp2.getText();
        GenerateCV.Design1 = Design1.getText();
        GenerateCV.Design2 = Design2.getText();
        GenerateCV.JoinDate1 = JoinDate1.getText();
        GenerateCV.EndDate1 = EndDate1.getText();
        GenerateCV.JoinDate2 = JoinDate2.getText();
        GenerateCV.EndDate2 = EndDate2.getText();

        Stage stage = (Stage) Save.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Comp1.setText(GenerateCV.Comp1);
        Design1.setText(GenerateCV.Design1);
        JoinDate1.setText(GenerateCV.JoinDate1);
        EndDate1.setText(GenerateCV.EndDate1);
        Comp2.setText(GenerateCV.Comp2);
        Design2.setText(GenerateCV.Design2);
        JoinDate2.setText(GenerateCV.JoinDate2);
        EndDate2.setText(GenerateCV.EndDate2);
    }
}
