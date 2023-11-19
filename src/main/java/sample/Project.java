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

public class Project implements Initializable {
    @FXML
    private TextField ProjectTitle1,TechStack1,Functionality1,ProjectTitle2,TechStack2,Functionality2;

    @FXML
    private TextArea ProjDes1,ProjDes2;

    @FXML
    private Button Save;



    public void saveButton(ActionEvent event) throws IOException {
        GenerateCV.ProjDes1 = ProjDes1.getText();
        GenerateCV.ProjectTitle1 = ProjectTitle1.getText();
        GenerateCV.TechStack1 = TechStack1.getText();
        GenerateCV.Functionality1 = Functionality1.getText();
        GenerateCV.ProjDes2 = ProjDes2.getText();
        GenerateCV.ProjectTitle2 = ProjectTitle2.getText();
        GenerateCV.TechStack2 = TechStack2.getText();
        GenerateCV.Functionality2 = Functionality2.getText();

        Stage stage = (Stage) Save.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ProjDes1.setText(GenerateCV.ProjDes1);
        ProjectTitle1.setText(GenerateCV.ProjectTitle1);
        TechStack1.setText(GenerateCV.TechStack1);
        Functionality1.setText(GenerateCV.Functionality1);
        ProjDes2.setText(GenerateCV.ProjDes2);
        ProjectTitle2.setText(GenerateCV.ProjectTitle2);
        TechStack2.setText(GenerateCV.TechStack2);
        Functionality2.setText(GenerateCV.Functionality2);
    }
}
