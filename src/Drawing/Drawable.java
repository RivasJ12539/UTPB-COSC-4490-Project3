package src.Drawing;

import java.awt.*;

public interface Drawable {
    void draw(Graphics2D g2d);
    Point getAnchor();
}
