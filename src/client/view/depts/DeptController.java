package client.view.depts;

import client.view.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class DeptController
{
  private ViewHandler viewHandler;

  public void init(ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
  }

  @FXML public void onButtonBack(ActionEvent actionEvent) throws IOException
  {
    viewHandler.openView("Accounting");
  }

  @FXML public void onButtonEdit(ActionEvent actionEvent) throws IOException
  {
    viewHandler.openView("EditDept");
  }
}
