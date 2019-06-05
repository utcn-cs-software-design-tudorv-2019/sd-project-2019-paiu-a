package Presentation;

import Data.Admin;
import Data.AdminRepository;
import Data.BasicUser;
import Data.BasicUserRepository;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.inject.Inject;
@SpringBootApplication
public class UI extends Application {

    Stage stage;
    Scene scenefist;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        primaryStage.setTitle("Registration");

        GridPane gridPane = createRegistrationFormPane();
        addUIControls(gridPane);
        Scene scene = new Scene(gridPane, 800, 500);
        scenefist = scene;
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private GridPane createRegistrationFormPane() {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(40, 40, 40, 40));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return gridPane;
    }

    @Inject
    AdminRepository adminRepository;
    @Inject
    BasicUserRepository basicUserRepository;

    private void addUIControlsScene(GridPane gridPane) {

        Label headerLabel = new Label("Registration Form");
        gridPane.add(headerLabel, 0,0,2,1);
       GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

        // Add Name Label
        Label nameLabel = new Label("Name : ");
        gridPane.add(nameLabel, 0, 2);
        TextField nameTextField = new TextField();
        nameTextField.setPrefHeight(40);
        gridPane.add(nameTextField, 1, 2);

        // Add Email Label
        Label emailLabel = new Label("Email ID : ");
        gridPane.add(emailLabel, 0, 3);
        TextField emailField = new TextField();
        emailField.setPrefHeight(40);
        gridPane.add(emailField, 1, 3);


        // Add Address Label
        Label infoLabel = new Label("Information : ");
        gridPane.add(infoLabel, 0, 4);
        TextField infoTextField = new TextField();
        infoTextField.setPrefHeight(40);
        gridPane.add(infoTextField, 1, 4);


        Button RegisterButton = new Button("Register");
        RegisterButton.setPrefHeight(40);
        RegisterButton.setDefaultButton(true);
        RegisterButton.setPrefWidth(100);
        RegisterButton.setDefaultButton(true);
        gridPane.add(RegisterButton, 0, 8, 2, 1);
        GridPane.setHalignment(RegisterButton, HPos.CENTER);
        GridPane.setMargin(RegisterButton, new Insets(20, 0,20,0));

        RegisterButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(emailField.getText().isEmpty() ) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your email id");
                    return;}

                String name = nameTextField.getText();
                String email = emailField.getText();
                String info = infoTextField.getText();


                if(email.charAt(0)=='a' && email.charAt(1) == '.') {
                    adminRepository.save(new Admin(name,email,info));
                }
                else {
                        basicUserRepository.save(new BasicUser(name,email,info));

                }
            }
        });

        Button CloseButton = new Button("Close");
        CloseButton.setPrefHeight(40);
        CloseButton.setDefaultButton(true);
        CloseButton.setPrefWidth(100);
        gridPane.add(CloseButton, 0, 8, 2, 1);
        GridPane.setHalignment(CloseButton, HPos.RIGHT);
        GridPane.setMargin(CloseButton, new Insets(20, 0,20,0));
        CloseButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.setScene(scenefist);
                stage.show();
            }
        });

    }

    private void addUIControls(GridPane gridPane) {
        // Add Header
        Label headerLabel = new Label("Registration Form");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

        // Add Email Label
        Label emailLabel = new Label("Email ID : ");
        gridPane.add(emailLabel, 0, 2);

        // Add Email Text Field
        TextField emailField = new TextField();
        emailField.setPrefHeight(40);
        gridPane.add(emailField, 1, 2);

        // Add LoginButton Button
        Button LoginButton = new Button("Login");
        LoginButton.setPrefHeight(40);
        LoginButton.setDefaultButton(true);
        LoginButton.setPrefWidth(100);
        gridPane.add(LoginButton, 0, 4, 2, 1);
        GridPane.setHalignment(LoginButton, HPos.LEFT);
        GridPane.setMargin(LoginButton, new Insets(20, 0,20,0));

        LoginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                GridPane gridPaneScene = createRegistrationFormPane();
                addUIControlsScene(gridPaneScene);

                Scene sceneNew = new Scene(gridPaneScene, 800, 500);
                stage.setScene(sceneNew);
                stage.show();
            }
        });



        // Add SigninButton Button
        Button SigninButton = new Button("Signin");
        SigninButton.setPrefHeight(40);
        SigninButton.setDefaultButton(true);
        SigninButton.setPrefWidth(100);
        gridPane.add(SigninButton, 0, 4, 2, 1);
        GridPane.setHalignment(SigninButton, HPos.RIGHT);
        GridPane.setMargin(SigninButton, new Insets(20, 0,20,0));

        SigninButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if(emailField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your email id");
                    return;
                }

                }
                String email = emailField.getText();

        });
    }

    private void showAlert(Alert.AlertType alertType, javafx.stage.Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
