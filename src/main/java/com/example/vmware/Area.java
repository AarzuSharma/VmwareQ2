package com.example.vmware;
public class Area {
    int id;
    String type;
    int radius;
    int l;
    int b;
    int side;

    public Area(int id, String type, int radius, int l, int b, int side) {
        this.id = id;
        this.type = type;
        this.radius = radius;
        this.l = l;
        this.b = b;
        this.side = side;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getRadius() {
        return radius;
    }

    public int getL() {
        return l;
    }

    public int getB() {
        return b;
    }

    public int getSide() {
        return side;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setL(int l) {
        this.l = l;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSide(int side) {
        this.side = side;
    }

}
