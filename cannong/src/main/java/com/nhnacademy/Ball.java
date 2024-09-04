package com.nhnacademy;

public class Ball {
    private int x, y, radius;

    public Ball(int x, int y) {
        if (x < Integer.MAX_VALUE && x > Integer.MIN_VALUE && y < Integer.MAX_VALUE && y > Integer.MIN_VALUE) {
            this.x = x;
            this.y = y;
        } else {
            try {
                throw new OutOfBoundsException();
            } catch (OutOfBoundsException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public Ball(int x, int y, int radius) {
        this(x, y);
        if (radius > 0) {
            this.radius = radius;
        } else {
            try {
                throw new InvalidSizeException();
            } catch (InvalidSizeException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getMinX() {
        return x - radius;
    }

    public int getMinY() {
        return y - radius;
    }

    public int getMaxX() {
        return x + radius;
    }

    public int getMaxY() {
        return y + radius;
    }

    public int getWidth() {
        return radius * 2;
    }

    public int getHeight() {
        return radius * 2;
    }

    @Override
    public String toString() {
        return "Ball [x=" + x + ", y=" + y + ", radius=" + radius + "]";
    }

}