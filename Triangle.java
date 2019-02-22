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
public class Triangle extends Shape{
    // triangle fields
    private int topLeftX;
    private int topLeftY;
    private int width;
    private int height;
    private Color fillColor;

    /**
     * Constructor to build a triangle
     * @param startX The top left X coordinate
     * @param startY The top left Y coordinate
     * @param width The width of the rectangle
     * @param height The height of the rectangle
     * @param color The outline color of the rectangle
     */
    public Triangle(int startX, int startY, int endX, int endY, Color color, Color fillColor) {
        super(startX, startY, endX, endY, color);
        this.fillColor = fillColor;
        // calculations for the triangle
        topLeftX = Math.min(startX, endX);
        topLeftY = Math.min(startY, endY);
        width = Math.abs(startX - endX);
        height = Math.abs(startY - endY);

    }
    
     /**
     * Draws the triangle
     * @param g2d The graphics context needed for drawing
     */
    public void draw(Graphics2D g2d) {
        // g2d.setColor(fc);
        g2d.setColor(fillColor);
        int[] xPoints = new int[] {startX, ((startX + endX) / 2), endX};
        int[] yPoints = new int[] {startY, endY, startY};
        // draw solid rectangle first
        g2d.fillPolygon(xPoints,yPoints,3);
        //g2d.setColor(lc);
        g2d.setColor(lineColor);
        // draw outline on top
        g2d.drawPolygon(xPoints,yPoints,3);
    }
    
    /**
     * This static method is used to draw a triangle before an actual triangle object is created
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
        int[] xPoints = new int[] {x1, ((x1 + x2) / 2), x2};
        int[] yPoints = new int[] {y1,y2,y1};
        // set fill color
        g2d.setColor(fc);
        // draw solid triangle first
        g2d.fillPolygon(xPoints,yPoints,3);
        // set line color
        g2d.setColor(lc);
        // draw outline on top
        g2d.drawPolygon(xPoints,yPoints,3);
     
        
    }
}

   