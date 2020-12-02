import Management.UserManagement;
import User.User;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class MyPLS extends Application
{
  @Override
  public void start(Stage primaryStage){

    primaryStage.setTitle("MyPLS");
    primaryStage.show();
  }

  public static void main(String[] args){
    launch(args);
    UserManagement userManagement = new UserManagement(new ArrayList<User>());

  }
}
