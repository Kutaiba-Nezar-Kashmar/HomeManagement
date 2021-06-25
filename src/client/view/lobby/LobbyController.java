package client.view.lobby;

import client.view.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import java.io.IOException;

public class LobbyController
{
  @FXML private ImageView helpIconView;
  @FXML private Circle profileImage;
  private Image image = new Image("shared/resources/images/me.jpg");
  private Image helpIcon = new Image("shared/resources/images/help.png");


  private ViewHandler viewHandler;

  public void init(ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
    try
    {
    profileImage.setFill(new ImagePattern(image));
    helpIconView.setImage(helpIcon);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }

  @FXML public void onMouseClickedOpenProfile(MouseEvent mouseEvent)
      throws IOException
  {
    viewHandler.openView("UpdateProfile");
  }

  @FXML public void onButtonSignOut(ActionEvent actionEvent) throws IOException
  {
    viewHandler.openView("Login");
  }

  @FXML public void onMouseClickedOpenAccounting(MouseEvent mouseEvent)
      throws IOException
  {
    viewHandler.openView("Accounting");
  }
}
