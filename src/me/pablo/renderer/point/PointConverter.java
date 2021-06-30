package me.pablo.renderer.point;

import me.pablo.renderer.Display;

import java.awt.*;

public class PointConverter {

    private static double scale = 1;

    public static Point convertPoint(MyPoint point3D) {
        double x3D = point3D.y * scale;
        double y3D = point3D.z * scale;
        double depth  = point3D.x *  scale;
        double[] newVal = scale(x3D, y3D, depth);

        int x2D = (int) (Display.WIDTH / 2 + newVal[0]);
        int y2D = (int) (Display.HEIGHT / 2 - newVal[1]);

        Point point2D = new Point(x2D, y2D);
        return point2D;
    }

    private static double[] scale(double x3D, double y3D, double depth) {
        double dist = Math.sqrt(x3D*x3D + y3D*y3D);
        double theta = Math.atan2(y3D, x3D);
        double depth2 = 15 - depth;
        double localScale = Math.abs(1400/(depth2+1400));
    }

}
