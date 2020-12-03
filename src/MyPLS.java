import GUI.MainGui;
import Management.UserManager;
import User.User;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class MyPLS extends Application
{
  public static UserManager userManager;
  @Override
  public void start(Stage primaryStage){
    GridPane gridPane = new GridPane();
    gridPane.setPrefSize(500,300);
    gridPane = MainGui.MainGui(gridPane);

    Scene scene = new Scene(gridPane);
    scene.getStylesheets().add("src/Style/MainStyle.css");
    primaryStage.setScene(scene);
    primaryStage.setTitle("MyPLS");
    primaryStage.show();
  }

  public static void main(String[] args){
    launch(args);
    userManager = new UserManager(new ArrayList<User>());


  }
}
