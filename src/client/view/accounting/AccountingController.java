package client.view.accounting;

import client.view.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TreeView;

import java.io.IOException;

public class AccountingController
{

  @FXML private TreeView<String> test;

  private ViewHandler viewHandler;

  //https://www.youtube.com/watch?v=4JsApAcPEnU&ab_channel=ForMyScholars
  //Open different scene: https://stackoverflow.com/questions/40798057/treeview-containing-different-types
  //Hint use hyperLink
  public void init(ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
  }

  @FXML public void onButtonGraf(ActionEvent actionEvent) throws IOException
  {
    viewHandler.openView("Graf");
  }

  @FXML public void onButtonDept(ActionEvent actionEvent) throws IOException
  {
    viewHandler.openView("Dept");
  }

  @FXML public void onButtonBack(ActionEvent actionEvent) throws IOException
  {
    viewHandler.openView("Lobby");
  }
}
