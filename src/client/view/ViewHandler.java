package client.view;

import client.view.accounting.AccountingController;
import client.view.currency.CurrencyController;
import client.view.depts.DeptController;
import client.view.editdepts.EditDeptsController;
import client.view.lobby.LobbyController;
import client.view.login.LoginController;
import client.view.phonelog.PhoneLogController;
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
  private final Stage stage = new Stage();
  private final Image image = new Image("shared/resources/images/favicon.png");

  public ViewHandler()
  {

  }

  public void openView(String id) throws IOException
  {
    Scene scene;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;
    switch (id)
    {
      case "Login" -> {
        loader.setLocation(getClass().getResource("login/" + id + "View.fxml"));
        root = loader.load();
        LoginController loginController = loader.getController();
        loginController.init(this);
        stage.setTitle("Login");
      }
      case "RegisterUser" -> {
        loader.setLocation(
            getClass().getResource("registeruser/" + id + "View.fxml"));
        root = loader.load();
        RegisterUserController registerUserController = loader.getController();
        registerUserController.init(this);
        stage.setTitle("Register User");
      }
      case "UpdateProfile" -> {
        loader.setLocation(
            getClass().getResource("updateprofile/" + id + "View.fxml"));
        root = loader.load();
        UpdateProfileController updateProfileController = loader
            .getController();
        updateProfileController.init(this);
        stage.setTitle("Update profile");
      }
      case "Lobby" -> {
        loader.setLocation(getClass().getResource("lobby/" + id + "View.fxml"));
        root = loader.load();
        LobbyController lobbyController = loader.getController();
        lobbyController.init(this);
        stage.setTitle("Lobby");
      }
      case "Accounting" -> {
        loader.setLocation(
            getClass().getResource("accounting/" + id + "View.fxml"));
        root = loader.load();
        AccountingController accountingController = loader.getController();
        accountingController.init(this);
        stage.setTitle("Accounting");
      }
      case "Graf" -> {
        loader.setLocation(
            getClass().getResource("accounting/" + id + "View.fxml"));
        root = loader.load();
        AccountingController accountingController = loader.getController();
        accountingController.init(this);
        Stage stageGraf = new Stage();
        stageGraf.setTitle("Graf");
        stageGraf.setScene(new Scene(root));
        stageGraf.show();
      }
      case "Dept" -> {
        loader.setLocation(getClass().getResource("depts/" + id + "View.fxml"));
        root = loader.load();
        DeptController deptController = loader.getController();
        deptController.init(this);
        stage.setTitle("Dept");
      }
      case "EditDept" -> {
        loader.setLocation(
            getClass().getResource("editdepts/" + id + "View.fxml"));
        root = loader.load();
        EditDeptsController editDeptsController = loader.getController();
        editDeptsController.init(this);
        stage.setTitle("Edit Dept");
      }
      case "Currency" -> {
        loader.setLocation(
            getClass().getResource("currency/" + id + "View.fxml"));
        root = loader.load();
        CurrencyController currencyController = loader.getController();
        currencyController.init(this);
        stage.setTitle("Currency");
      }
      case "PhoneLog" -> {
        loader.setLocation(
            getClass().getResource("phonelog/" + id + "View.fxml"));
        root = loader.load();
        PhoneLogController phoneLogController = loader.getController();
        phoneLogController.init(this);
        stage.setTitle("Phone Log");
      }
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