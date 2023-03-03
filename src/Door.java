package assignment3_000905188;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *  Class Door - a graphical object that can be drawn to the screen, at the specified position.
 *  This class represents a door.
 *  @author Jovain Chisholm
 */
public class Door {
    public double x;
    public double y;
    private double height;

    // Constructor for objects of class Door
    public Door(double x, double y, double height) {
        this.x = x;
        this.y = y;
        this.height = height;
    }

    // Draws the door
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.fillRect(x, y, height / 4, height);
    }
}
