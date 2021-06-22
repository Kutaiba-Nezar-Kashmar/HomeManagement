package client.view;

import client.view.lobby.LobbyController;
import client.view.login.LoginController;
import client.view.registeruser.RegisterUserController;
import client.view.updateprofile.UpdateProfileController;
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
  private Image image = new Image("shared/resources/images/favicon.png");

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
      loginController.init(this);
      stage.setTitle("Login");
    }
    else if (id.equals("RegisterUser"))
    {
      loader.setLocation(
          getClass().getResource("registeruser/" + id + "View.fxml"));
      root = loader.load();
      RegisterUserController registerUserController = loader.getController();
      registerUserController.init(this);
      stage.setTitle("Register User");
    }
    else if (id.equals("UpdateProfile"))
    {
      loader.setLocation(
          getClass().getResource("updateprofile/" + id + "View.fxml"));
      root = loader.load();
      UpdateProfileController updateProfileController = loader.getController();
      updateProfileController.init(this);
      stage.setTitle("Update profile");
    }
    else if (id.equals("Lobby"))
    {
      loader.setLocation(
          getClass().getResource("lobby/" + id + "View.fxml"));
      root = loader.load();
      LobbyController lobbyController = loader.getController();
      lobbyController.init(this);
      stage.setTitle("Lobby");
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