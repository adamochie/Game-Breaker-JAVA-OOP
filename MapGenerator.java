import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
    public int map[][];
    public int brickWidth;
    public int brickHeight;

    public MapGenerator(int row, int col) {
        map = new int[row][col];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                // Generate regular and special bricks based on some condition
                if (i % 2 == 0 && j % 2 == 0) {
                    map[i][j] = 2; // Special brick with value 2
                } else {
                    map[i][j] = 1; // Regular brick with value 1
                }
            }
        }

        brickWidth = 540 / col;
        brickHeight = 150 / row;
    }

    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    if (map[i][j] == 1) {
                        g.setColor(Color.white);
                    } else if (map[i][j] == 2) {
                        g.setColor(Color.orange);
                    }

                    g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);

                    // this is just to show separate brick, the game can still run without it
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }

    public void setBrickValue(int value, int row, int col) {
        if (value == 2 && map[row][col] != 0) {
            Gameplay.specialBrickHit = true; // Set the specialBrickHit variable in the Gameplay class to true
        }
        map[row][col] = value;
    }

    // Add a public getter method for map
    public int[][] getMap() {
        return map;
    }
}
