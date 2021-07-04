package client.view.login;

import client.view.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import java.io.IOException;

public class LoginController
{

  @FXML private Rectangle emailBox;
  @FXML private Rectangle passwordBox;

  // move to viewModel and bind
  private Image emailIcon = new Image("shared/resources/images/email.png");
  private Image passwordIcon = new Image("shared/resources/images/password.png");
  private ViewHandler viewHandler;

    public void init(ViewHandler viewHandler)
    {
      this.viewHandler = viewHandler;
      if (emailIcon != null || passwordIcon != null)
      {
        emailBox.setFill(new ImagePattern(emailIcon));
        passwordBox.setFill(new ImagePattern(passwordIcon));
      }
      else
      {
        emailBox.setFill(Color.TRANSPARENT);
        passwordBox.setFill(Color.TRANSPARENT);
      }
    }

  @FXML public void ouButtonCreateAccountWindow(ActionEvent actionEvent)
      throws IOException
  {
    viewHandler.openView("RegisterUser");
  }

  @FXML public void onButtonLogin(ActionEvent actionEvent) throws IOException
  {
    viewHandler.openView("Lobby");
  }
}
