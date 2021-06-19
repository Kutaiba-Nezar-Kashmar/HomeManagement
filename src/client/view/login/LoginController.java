package client.view.login;

import client.view.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class LoginController
{
  private ViewHandler viewHandler;

    public void init(ViewHandler viewHandler)
    {
      this.viewHandler = viewHandler;
    }

  @FXML public void ouButtonCreateAccountWindow(ActionEvent actionEvent)
      throws IOException
  {
    viewHandler.openView("RegisterUser");
  }
}
