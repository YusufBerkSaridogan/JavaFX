package java_fx_examples;

  import javafx.application.Application;
  import javafx.scene.Scene;
  import javafx.scene.control.Button;
  import javafx.scene.layout.HBox;
  import javafx.stage.Stage;
   
  public class MyJavaFX extends Application {
  
      @Override // Override the start method in the Application class
        public void start(Stage primaryStage) {
        // Create a button and place it in the scene
        Button btOK = new Button("JavaFX");
        Button btOK2 = new Button("JavaFX_2");
        HBox h1 = new HBox();
        h1.getChildren().add(btOK);
        h1.getChildren().add(btOK2);
        Scene scene = new Scene(h1, 1000, 400);
        
 
        primaryStage.setTitle("MyJavaFX Class"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
  
 /**
* The main method is only needed for the IDE with limited
* JavaFX support. Not needed for running from the command line.
*/
    public static void main(String[] args) {
        launch(args);//start metodunu başlat
    }
 
 }