
/**
 * A simple cloud that can be moved and drawn on the canvas.
 */
public class Cloud
{
    private int width;
    private int height;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    /**
     * Create a new cloud at default position with default color.
     */
    public Cloud()
    {
        width = 140;
        height = 60;
        xPosition =  -160; // start further off the left edge
        yPosition =  40;   // near the top
        color = "gray"; // cloud color set to gray per request
        isVisible = false;
    }

    /**
     * Make this cloud visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }

    /**
     * Make this cloud invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }

    /**
     * Move the cloud a few pixels to the right.
     */
    public void moveRight()
    {
        moveHorizontal(20);
    }

    /**
     * Move the cloud a few pixels to the left.
     */
    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    /**
     * Move the cloud a few pixels up.
     */
    public void moveUp()
    {
        moveVertical(-20);
    }

    /**
     * Move the cloud a few pixels down.
     */
    public void moveDown()
    {
        moveVertical(20);
    }

    /**
     * Move the cloud horizontally by 'distance' pixels.
     * @param distance the distance to move (positive for right, negative for left)
     */
    public void moveHorizontal(int distance)
    {
        erase();
        xPosition += distance;
        draw();
    }

    /**
     * Move the cloud vertically by 'distance' pixels.
     * @param distance the distance to move (positive for down, negative for up)
     */
    public void moveVertical(int distance)
    {
        erase();
        yPosition += distance;
        draw();
    }

    /**
     * Slowly move the cloud horizontally by 'distance' pixels.
     * @param distance the distance to move (positive for right, negative for left)
     */
    public void slowMoveHorizontal(int distance)
    {
        int delta;

        if(distance < 0) {
            delta = -1;
            distance = -distance;
        }
        else {
            delta = 1;
        }

        for(int i = 0; i < distance; i++) {
            xPosition += delta;
            draw();
        }
    }

    /**
     * Slowly move the cloud vertically by 'distance' pixels.
     * @param distance the distance to move (positive for down, negative for up)
     */
    public void slowMoveVertical(int distance)
    {
        int delta;

        if(distance < 0) {
            delta = -1;
            distance = -distance;
        }
        else {
            delta = 1;
        }

        for(int i = 0; i < distance; i++) {
            yPosition += delta;
            draw();
        }
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     * @param newWidth the new width of the cloud
     * @param newHeight the new height of the cloud
     */
    public void changeSize(int newWidth, int newHeight)
    {
        erase();
        width = newWidth;
        height = newHeight;
        draw();
    }

    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta", "black", "gray".
     * @param newColor the new color of the cloud
     */
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }

    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new java.awt.geom.RoundRectangle2D.Double(xPosition, yPosition, width, height, height/2, height/2));
            canvas.wait(10);
        }
    }

    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
