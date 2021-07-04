package client.view.updateprofile;

import client.view.ViewHandler;
import com.sun.glass.ui.CommonDialogs;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class UpdateProfileController
{

  @FXML private Circle profileImage;

  //Image moved to vieModel and bind
  private Image image = new Image("shared/resources/images/me.jpg");
  private ViewHandler viewHandler;

  public void init(ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
    //profileImage.setFill(new ImagePattern(image));
  }

  @FXML public void onButtonCancel(ActionEvent actionEvent) throws IOException
  {
    viewHandler.openView("Lobby");
  }

  @FXML public void onButtonUploadAvatar(ActionEvent actionEvent)
  {
    imageChooser();
  }

  // Save the chosen image to database or a file
  //http://kelvinkagia.blogspot.com/2016/06/javafx-inserting-uploaded-image-into.html
  //https://www.google.com/search?q=file+chooser+profile+image+saved++javafx&sxsrf=ALeKk03pf_yX2AvjJWXvQzgAGbh3Tt3ajw%3A1624387778615&ei=wjDSYJLlJIjSkwWixILQCA&oq=file+chooser+profile+image+saved++javafx&gs_lcp=Cgdnd3Mtd2l6EAM6BwgjELADECc6BwgAEEcQsAM6CggAEAgQBxAKEB5Qiz9Yl1tgqogBaAFwAngAgAFYiAHzCpIBAjIxmAEAoAEBqgEHZ3dzLXdpesgBCcABAQ&sclient=gws-wiz&ved=0ahUKEwiSzpWE9KvxAhUI6aQKHSKiAIoQ4dUDCA0&uact=5
  protected void imageChooser()
  {
    FileChooser fileChooser = new FileChooser();
    FileChooser.ExtensionFilter extensionFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.JPG");
    FileChooser.ExtensionFilter extensionFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
    fileChooser.getExtensionFilters().addAll(extensionFilterJPG, extensionFilterPNG);
    File file = fileChooser.showOpenDialog(null);
    try
    {
      BufferedImage bufferedImage = ImageIO.read(file);
      image = SwingFXUtils.toFXImage(bufferedImage, null);
      profileImage.setFill(new ImagePattern(image));
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
