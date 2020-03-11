package ie.tudublin;

import processing.data.TableRow;

public class Colour
{
    private String colour;
    int r;
    int g;
    int b;
    int value;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Colour(String colour, int r, int g, int b, int value)
    {
        this.colour = colour;
        this.r = r;
        this.g = g;
        this.b = b;
        this.value = value;
    }

    public Colour()
    {
        this("unknown", 1, 1, 1, 1);
    }

    public Colour(TableRow tr)
    {
        this(
            tr.getString("colour"),
            tr.getInt("r"),
            tr.getInt("g"),
            tr.getInt("b"),
            tr.getInt("value")
        );
    }

    public String toString()
    {
        return colour + "\t" + r + "\t" 
            + g + "\t" + b + "\t" + value; 
    }
}