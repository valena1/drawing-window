/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingprogram;
import java.util.*;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * this is the class for shape drawing
 * @author Valena Nguyen
 */
public class Shape {
    // shape constructor
    protected int startX;
    protected int startY;
    protected int endX;
    protected int endY;
    protected Color lineColor;

    /**
     * Constructor
     * @param startX int x coordinate at first end
     * @param startY int y coordinate at first end
     * @param endX int x coordinate at the other end
     * @param endY int y coordinate at the other end
     * @param color Color for the line
     */
    public Shape(int startX, int startY, int endX, int endY, Color color) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.lineColor = color;
    }

    /**
     * Draws the shape
     * @param g2d The graphics context needed for drawing
     */
    public void draw(Graphics2D g2d) {
        g2d.setColor(lineColor);
        g2d.drawLine(startX, startY, endX, endY);
    }
    
    /**
     * This static method is used to draw a shape without creating a shape object
     * It is used while the user is dragging the mouse, in order to show the line in real-time
     * @param g2d The graphics context needed for drawing
     * @param x1 int x coordinate at one end
     * @param y1 int y coordinate at one end
     * @param x2 int x coordinate at the other end
     * @param y2 int y coordinate at the other end
     * @param color Color for line
     */
    public static void draw(Graphics2D g2d, int x1, int y1, int x2, int y2, Color color) {
        g2d.setColor(color);
        g2d.drawLine(x1, y1, x2, y2);
    }
}

   
