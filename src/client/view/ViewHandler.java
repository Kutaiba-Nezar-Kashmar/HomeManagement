package client.view;

import client.view.login.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewHandler extends Application
{
  private Stage stage = new Stage();
  private Image image = new Image("shared/resources/icon.png");

  public ViewHandler()
  {

  }

  public void openView(String id) throws IOException
  {
    Scene scene;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;
    if (id.equals("Login"))
    {
      loader.setLocation(getClass().getResource("login/" + id + "View.fxml"));
      root = loader.load();
      LoginController loginController = loader.getController();
      loginController.init();
      stage.setTitle("Login");
    }
    assert root != null;
    scene = new Scene(root);
    stage.setScene(scene);
    stage.getIcons().add(image);
    stage.show();
  }

  @Override public void start(Stage stage) throws Exception
  {
    openView("Login");
  }

}