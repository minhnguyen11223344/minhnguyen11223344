package register;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class registerMain extends Application {

	@Override
	public void start(Stage primaryStage) {

		try {

// Đọc file fxml và vẽ giao diện.
			Parent root =

					FXMLLoader.load(getClass().getResource(" register.fxml"));

			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Minh họa JavaFX với FXML");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void main(String[] args) {

		launch(args);

	}
}
