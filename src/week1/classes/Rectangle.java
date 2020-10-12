package week1.classes;

import com.sun.xml.internal.ws.util.StringUtils;

public class Rectangle {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
        this.color = "Blue";
    }

    public void setColor(String color) {
        if (color.length() > 2
                && color.length() < 20
                && color.equals(StringUtils.capitalize(color))
        ) {
            this.color = color;
        }

    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1;
        }
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1;
        }
    }

    public int getHeight() {

        return height;
    }

    public int getWidth() {

        return width;
    }

    public String getColor() {

        return color;
    }

    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(color.charAt(0));
            }
            System.out.println("");
        }
    }


}
