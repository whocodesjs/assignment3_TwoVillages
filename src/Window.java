package assignment3_000905188;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *  Class Window - a graphical object that can be drawn to the screen, at the specified position.
 * This class represents a window.
 *  @author Jovain Chisholm
 */
public class Window {
    /** The x coordinate of the window */
    private double   x;
    /** The y coordinate of the window */
    private double y;
    /** The diameter of the window */
    private double diameter;

    // Constructor for objects of class Window
    public Window(double x, double y, double diameter) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }

    /** Draws the window
     * @param gc the GraphicsContext to draw on
     */
    public void draw(GraphicsContext gc) {
        // draw the window
        gc.setFill(Color.WHITE);
        gc.fillRect(x, y, diameter, diameter);
    }
}
