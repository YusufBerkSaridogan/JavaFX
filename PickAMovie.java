
package JavaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Java_Event4 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
       BorderPane bp = new BorderPane();
       VBox vbox = new VBox();
       Button button = new Button("Submit");
        ComboBox<String> cbox = new ComboBox();
       cbox.getItems().addAll(
       "The Godfather", "Interstellar", "Cars 3", "The Notebook"               
       );
       vbox.setAlignment(Pos.TOP_LEFT);
       vbox.setSpacing(15);
       
       bp.setTop(vbox);
       cbox.setPromptText("What is your favorite movie?");
       
       //Adding İmage
       Image i1 = new Image("https://media.bantmag.com/wp-content/uploads/2022/01/the-godfather-2.jpg");
       Image i2 = new Image("https://www.clementoni.com/media/prod/tr/29747/pzl-250-cars-3_AjzzX4e.jpg");
       Image i3 = new Image("https://tr.web.img2.acsta.net/pictures/14/10/09/15/52/150664.jpg");
       Image i4 = new Image("https://upload.wikimedia.org/wikipedia/tr/8/86/Posternotebook.jpg");
       ImageView iw1 = new ImageView(i1);
       ImageView iw2 = new ImageView(i2);
       ImageView iw3 = new ImageView(i3);
       ImageView iw4 = new ImageView(i4);
       ImageView[] dizi = new ImageView[4];
       dizi[0] = iw1;     dizi[1] = iw2;     dizi[2] = iw3;     dizi[3] = iw4;
       
       vbox.getChildren().addAll(cbox,button);    
       //Handling Events
        button.setOnAction((event) -> {
           System.out.println("Submitted: "+cbox.getValue());
       });
        
        cbox.setOnAction(event -> {
            System.out.println("User Selected: "+cbox.getValue());
        });
       
       
       
        Scene s1 = new Scene(bp, 400, 400);
        primaryStage.setScene(s1);
        primaryStage.show();
       
       
    }
    
    public static void main(String[] args) {
      launch(args);
        
    }
    
}
