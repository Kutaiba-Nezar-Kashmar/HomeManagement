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
  //Hit use hyperLink
  public void init(ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;

    TreeItem<String> ob = new TreeItem<>("test1");
    TreeItem<String> ob1 = new TreeItem<>("test2");
    TreeItem<String> ob2 = new TreeItem<>("test3");
    TreeItem<String> ob3 = new TreeItem<>("test4");
    ob.getChildren().addAll(ob1, ob2, ob3);

    TreeItem<String > ob4 = new TreeItem<>("test5");
    TreeItem<String > ob5 = new TreeItem<>("test6");
    TreeItem<String > ob6 = new TreeItem<>("test7");
    ob2.getChildren().addAll(ob4, ob5);
    test.setRoot(ob);
  }


}
