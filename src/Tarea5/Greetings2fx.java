package Tarea5;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Greetings2fx extends Application{
        private Label label;
        private TextField textField;

        @Override
        public void start(Stage primaryStage) {
            init();

            FlowPane root = createGUI();
            addWidgets(root);

            Scene scene = new Scene(root, 300, 200);
            primaryStage.setTitle("Greeting FX");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        @Override
        public void init() {
            String msg = "Para mostrar un campo de texto en una ventana simple";
            label = new Label(msg);
        }

        private FlowPane createGUI() {
            FlowPane layout = new FlowPane();
            layout.setAlignment(Pos.CENTER);
            layout.setVgap(10);
            return layout;
        }

        private void addWidgets(FlowPane layout) {
            textField = new TextField("Hello! primera GUI");

            layout.getChildren().add(label);
            layout.getChildren().add(textField);
        }

        public static void main(String[] args) {
            launch(args);
        }
    }

