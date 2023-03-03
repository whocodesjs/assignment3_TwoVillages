package assignment3_000905188;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.Random;

/**
 *  Class Village - a village in the TwoVillages program
 *  @author Jovain Chisholm
 */



public class Village {
    /** The houses in the village */
    private House[] houses;
    /** The x and y coordinates of the village */
    private double x,y;
     /** The size of the village */
    private double size;
    /** The population of the village */
    private int population;
    /** The name of the village */
    private String name;

    /** The color of the village */
    private Color color;

    /** Creates a village with the specified name and color
     * @param x the x coordinate of the village
     * @param y the y coordinate of the village
     * @param name the name of the village
     * @param color the color of the village
     */

    public Village(double x, double y, String name, Color color) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.color = color;
        houses = new House[3];
        Random rand = new Random();
        double houseWidth = 100;
        double spaceBetweenHouses = 20;
        size = houseWidth * 3 + spaceBetweenHouses * 2;
        for (int i = 0; i < 3; i++) {
            double houseX = x + i * (houseWidth + spaceBetweenHouses);
            double houseY = y - houseWidth;
            int numOccupants = rand.nextInt(10) + 1;
            houses[i] = new House(houseX, houseY, houseWidth, color);
            population += numOccupants;
        }
    }

    /** draws the village
     * @param gc the graphics context
     */

    public void draw(GraphicsContext gc) {
        for (House house : houses) {
            gc.setFill(color);
            house.draw(gc);


        }
        gc.strokeText("Village: " + name, x, y + 20);
        gc.strokeText("Size: " + size / 20 + "m", x, y + 40);
        gc.strokeText("Population: " + population, x, y + 60);
    }
}
