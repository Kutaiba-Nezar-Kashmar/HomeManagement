package client;

import client.view.ViewHandler;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application
{

    @Override
    public void start(Stage stage) throws Exception
    {
        ViewHandler viewHandler = new ViewHandler();
        viewHandler.start(stage);
    }
}
