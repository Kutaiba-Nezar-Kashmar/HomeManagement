package client.view.registeruser;

import client.core.HandlerFactory;
import client.view.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class RegisterUserController
{
  private ViewHandler viewHandler;

  public void init(ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
  }

  @FXML public void OnButtonLoginWindow(ActionEvent actionEvent)
      throws IOException
  {
    viewHandler.openView("Login");
  }
}
