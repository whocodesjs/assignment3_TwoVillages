package assignment3_000905188;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *  This class represents a house. It is a subclass of the class Village.
 *
 *  @author Jovain Chisholm
 */
public class House {
    /** The size of the house */
    private double size;
    /** The color of the house */
    private Color color;
    /** The x and y coordinates of the house */
    private double x,y;
    /** The number of occupants in the house */
    private int occupants;
    /** The window of the house */
    private Window window;
    /** The door of the house */
    private Door door;

    /** Creates a house with the specified size and color
     * @param x the x coordinate of the house
     * @param y the y coordinate of the house
     * @param size the size of the house
     * @param color the color of the house
     */

    public House(double x, double y, double size, Color color) {
        this.size = size;
        this.color = color;
        this.x = x;
        this.y = y;
        this.occupants = 0;
        this.window = new Window(x + size / 4, y + size / 4, size / 6);
        this.door = new Door(x + size / 2, y + size * 3 / 4, size / 2);
    }

    public int getOccupants() {
        return occupants;
    }

    /** Sets the number of occupants in the house
     * @param occupants the number of occupants in the house
     */
    public void setOccupants(int occupants) {
        this.occupants = occupants;
    }

    /** Returns the size of the house
     * @return the size of the house
     */

    public double getSize() {
        return size;
    }

    public House(double x, double y) {
        this.x = x;
        this.y = y;
        this.size = 250;
        this.color = Color.GOLD;
        this.occupants = 1;
        this.window = new Window(x + size / 4, y + size / 4, size / 6);
        this.door = new Door(x + size / 2, y + size * 3 / 4, size / 2);
    }

    /** Draws the house
     * @param gc the GraphicsContext to draw on
     */

    public void draw(GraphicsContext gc) {
        gc.fillRect(x, y, size, size);
        gc.setFill(color);
        window.draw(gc);
        door.draw(gc);

    }
}
