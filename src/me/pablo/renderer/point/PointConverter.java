package me.pablo.renderer.point;

import me.pablo.renderer.Display;

import java.awt.*;

public class PointConverter {

    public static Point convertPoint(MyPoint point3D) {
        int x2D = (int) (Display.WIDTH / 2 + point3D.y);
        int y2D = (int) (Display.HEIGHT / 2 - point3D.z);

        Point point2D = new Point(x2D, y2D);
        return point2D;
    }

}
