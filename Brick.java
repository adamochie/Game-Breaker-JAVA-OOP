import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Brick {
    private int x;
    private int y;
    private int width;
    private int height;
    private int scoreValue;

    public Brick(int x, int y, int width, int height, int scoreValue) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.scoreValue = scoreValue;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return width;
    }

    public int getScoreValue() {
        return scoreValue;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
}
