package taquin;

import javafx.application.Application;
import javafx.stage.Stage;

public class Taquin extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage = new FenetreTaquin();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
