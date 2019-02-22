/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingprogram;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Valena Nguyen
 */
public class Oval extends Shape {
    // oval fields
    private int x;
    private int y;
    private int width;
    private int height;
    private Color fillColor;
    
    /**
     * Constructor to build an oval
     * @param startX the top left X coordinate
     * @param startY the top left Y coordinate
     * @param endX the end X coordinate
     * @param endY the end Y coordinate
     * @param color the outline color of the oval 
     */
    public Oval(int startX, int startY, int endX, int endY, Color color, Color fillColor) {
        super(startX, startY, endX, endY, color);
        this.fillColor = fillColor;
        // calculations for the oval
        width = Math.abs(startX - endX);
        height = Math.abs(startY - endY);

    }

    /**
     * Draws the oval
     * @param g2d The graphics context needed for drawing
     */
    public void draw(Graphics2D g2d) {
        // g2d.setColor(fc)
        g2d.setColor(fillColor);
        // draw solid oval first
        g2d.fillOval(startX, startY, width, height);
        // g2d.setColor(lc)
        g2d.setColor(lineColor);
        // draw outline oval on top
        g2d.drawOval(startX, startY, width, height);
    }
    
    /**
     * This static method is used to draw an oval before an actual oval object is created
     * It is used to give the user interactive feedback as they are dragging the cursor
     * @param g2d The graphics context needed for drawing
     * @param x1 int x coordinate from where mouse pressed down
     * @param y1 int y coordinate from where mouse pressed down
     * @param x2 int x coordinate from where mouse released
     * @param y2 int y coordinate from where mouse released
     * @param lc Color for line color
     * @param fc Color for fill color
     */
    public static void draw(Graphics2D g2d, int x1, int y1, int x2, int y2, Color lc, Color fc) {
        // set fill color
        g2d.setColor(fc);
        // draw solid oval first
        g2d.fillOval(
                x1, 
                y1, 
                Math.abs(x1 - x2), 
                Math.abs(y1 - y2));
        // set line color
        g2d.setColor(lc);
        // draw outline on top
        g2d.drawOval(
                x1, 
                y1, 
                Math.abs(x1 - x2), 
                Math.abs(y1 - y2));
        
    }
}
    
