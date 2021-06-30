package me.pablo.renderer.shapes;

import java.awt.*;

public class Tetrahedron {

    private MyPolygon[] polygons;
    private Color color;

    public Tetrahedron(Color color, MyPolygon... polygons) {
        this.color = color;
        this.polygons = polygons;
        this.setPolygonColor();
    }

    public void render(Graphics g) {

        for(MyPolygon poly : this.polygons) {
            poly.render(g);
        }

    }

    private void sortPolygons() {

    }

    private void setPolygonColor() {
        for(MyPolygon poly : this.polygons) {
            poly.setColor(this.color);
        }
    }

}
