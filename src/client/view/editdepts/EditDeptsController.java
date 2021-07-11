package client.view.editdepts;

import client.view.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class EditDeptsController
{
  private ViewHandler viewHandler;

  public void init(ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
  }

  @FXML public void onButtonBack(ActionEvent actionEvent) throws IOException
  {
    viewHandler.openView("Dept");
  }
}
