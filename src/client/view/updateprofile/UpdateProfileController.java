package client.view.updateprofile;

import client.view.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

import java.io.IOException;

public class UpdateProfileController
{

  @FXML private Circle profileImage;

  private Image image = new Image("shared/resources/images/me.jpg");
  private ViewHandler viewHandler;

  public void init(ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
    profileImage.setFill(new ImagePattern(image));
  }

  @FXML public void onButtonCancel(ActionEvent actionEvent) throws IOException
  {
    viewHandler.openView("Lobby");
  }
}
