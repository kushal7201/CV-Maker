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

public class Personal implements Initializable {
    @FXML
    private TextField FirstName;

    @FXML
    private TextField LastName;

    @FXML
    private TextField Phone;

    @FXML
    private TextField LinkedIn;

    @FXML
    private TextField EmailId;

    @FXML
    public Button closeButton;

    @FXML
    public Button Save;


    public void saveButton(ActionEvent event) throws IOException {
        GenerateCV.FirstName = FirstName.getText();
        GenerateCV.LastName = LastName.getText();
        GenerateCV.Phone = Phone.getText();
        GenerateCV.Email = EmailId.getText();
        GenerateCV.LinkedIn = LinkedIn.getText();
        Stage stage = (Stage) Save.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FirstName.setText(GenerateCV.FirstName);
        LastName.setText(GenerateCV.LastName);
        Phone.setText(GenerateCV.Phone);
        EmailId.setText(GenerateCV.Email);
        LinkedIn.setText(GenerateCV.LinkedIn);
    }
}
