
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

    public Cloud()
    {
        width = 140;
        height = 60;
        xPosition =  -160; // start further off the left edge
        yPosition =  40;   // near the top
        color = "gray"; // cloud color set to gray per request
        isVisible = false;
    }

    public void makeVisible()
    {
        isVisible = true;
        draw();
    }

    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }

    public void moveRight()
    {
        moveHorizontal(20);
    }

    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    public void moveUp()
    {
        moveVertical(-20);
    }

    public void moveDown()
    {
        moveVertical(20);
    }

    public void moveHorizontal(int distance)
    {
        erase();
        xPosition += distance;
        draw();
    }

    public void moveVertical(int distance)
    {
        erase();
        yPosition += distance;
        draw();
    }

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

    public void changeSize(int newWidth, int newHeight)
    {
        erase();
        width = newWidth;
        height = newHeight;
        draw();
    }

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
