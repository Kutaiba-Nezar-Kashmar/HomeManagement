package client.view.addperson;

import client.view.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class AddPersonController
{
  private ViewHandler viewHandler;

  public void init(ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
  }

  @FXML public void onButtonBack(ActionEvent actionEvent) throws IOException
  {
    viewHandler.openView("PhoneLog");
  }

  @FXML public void onButtonCancel(ActionEvent actionEvent)
  {
  }

  @FXML public void onButtonAddPerson(ActionEvent actionEvent)
  {
  }
}
