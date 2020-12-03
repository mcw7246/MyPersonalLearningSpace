package GUI;

import javafx.scene.layout.GridPane;

public class MainGui
{
  public static GridPane MainGui(GridPane gridPane){
    GridPane updated = gridPane;
    updated.getChildren().clear();


    return updated;
  }
}
