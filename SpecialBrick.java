import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class SpecialBrick extends Brick {
    private boolean isSpecial;

    public SpecialBrick(int x, int y, int width, int height, int scoreValue, boolean isSpecial) {
        super(x, y, width, height, scoreValue);
        this.isSpecial = isSpecial;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    // Override
    public void draw(Graphics2D g) {
        if (isSpecial) {
            g.setColor(Color.ORANGE);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }
}
