package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;



import java.io.IOException;

//Add the functionality to save the text field on given data

public class Login {
    public Login(){
    }

@FXML
private Button button;

@FXML
    private Label wronglogin;

@FXML
    private TextField username;
@FXML
    private PasswordField passwo;

@FXML
public void userlogin(ActionEvent event) throws IOException{
    checklogin();
}

@FXML
private ImageView linkedinImageView;

    public void handleLinkedinClick(MouseEvent event) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI("https://www.linkedin.com/in/kushalbansal112/"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    public void handleGithubClick(MouseEvent event) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI("https://github.com/kushal7201"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    public void handleMailClick(MouseEvent event) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI("mailto:iit2022021@iiita.ac.in"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }


public void skip(ActionEvent event) throws IOException{
    Main m=new Main();
    m.changeScene("styles/CVUI.fxml");

}
public void checklogin() throws IOException{

    if(username.getText().toString().equals("kushal") && passwo.getText().toString().equals("k-11")){
        Main m=new Main();
        wronglogin.setText("Success!");
        m.changeScene("styles/CVUI.fxml");
    }

    else if(username.getText().isEmpty() && passwo.getText().isEmpty()){
        wronglogin.setText("Please enter your data");
    }

    else{
        wronglogin.setText("Wrong username or password");
    }
}
}
