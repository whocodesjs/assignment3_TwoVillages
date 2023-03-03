package assignment3_000905188;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import static javafx.application.Application.launch;

/**
 * Implementation of the Two Villages class. This will draw two villages and the king's house.
 *
 *
 * @author Jovain Chisholm
 */
public class TwoVillages extends Application {

    /**
     * @param stage
     * @throws Exception
     */

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(1000, 900); // Set canvas Size in Pixels
        stage.setTitle("Two Villages"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        /** The two villages */

        gc.strokeText("Two Villages & The King ", 450, 50);
        Village village1 = new Village(100, 400, "Toronto", Color.AQUAMARINE);
        village1.draw(gc);
        Village village2 = new Village(100, 200, "Mississauga", Color.BLUE);
        village2.draw(gc);

        /** The king's house */

    House kingsHouse = new House(500, 150);{
    gc.setFill(Color.GOLD);
        kingsHouse.draw(gc);
        gc.strokeText("Kings House", 500, 420);
        gc.strokeText("Size: " + kingsHouse.getSize() / 20 + "m", 500, 440);
        gc.strokeText("Population: " + kingsHouse.getOccupants(), 500, 460);
        }







        
        // YOUR CODE STOPS HERE
        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
