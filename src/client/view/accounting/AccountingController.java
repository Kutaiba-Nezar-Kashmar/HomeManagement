package client.view.accounting;

import client.view.ViewHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

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


}
