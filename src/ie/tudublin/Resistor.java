package ie.tudublin;

import processing.core.PApplet;

import java.util.ArrayList;

import ie.tudublin.Colour;

public class Resistor
{
    int value;
    int ones;
    int tens;
    int hundreds;

    public Resistor(int value)
    {
        int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
        int ones = value - ((hundreds * 100)  + (tens * 10));
        
        this.value = value;
        this.ones = ones;
        this.tens = tens;
        this.hundreds = hundreds;
    }

    public Resistor()
    {
        this(0);
    }

    public void render(PApplet pa, ArrayList<Colour> colours)
    {
        pa.colorMode(PApplet.RGB);
        pa.stroke(0);
        pa.noFill();
        pa.textSize(32);
        pa.textAlign(PApplet.CENTER, PApplet.CENTER);

        int startX = pa.width / 3;
        int startY;
        int textX = pa.width - 50;
        int textY;
        int resistorX = pa.width / 3 + 60;
        int resistorY;

        Colour c;

        /*
        Instead of using a switch statement, calculate startX, startY, resistorX, resistorY independent of the resistor value 
        i.e. every time a resistor is drawn, change the values.
        */

        switch(value)
        {
            case 618:
            {
                startY = pa.height / 5;
                textY = pa.height / 5;
                resistorY = pa.height / 5;
                pa.line(startX, startY, startX + 50, startY);
                pa.rect(startX + 50, startY - 50, 100, 100);
                pa.line(startX + 150, startY, startX + 200, startY);
                pa.fill(0);
                pa.text(value, textX, textY);
                pa.noStroke();
                c = colours.get(hundreds);
                pa.fill(c.r,c.g,c.b);
                pa.rect(resistorX, resistorY - 50, 10, 100);
                c = colours.get(tens);
                pa.fill(c.r,c.g,c.b);
                pa.rect(resistorX + 20, resistorY - 50, 10, 100);
                c = colours.get(ones);
                pa.fill(c.r,c.g,c.b);
                pa.rect(resistorX + 40, resistorY - 50, 10, 100);
                break;
            }

            case 27:
            {
                startY = (pa.height / 5) * 2;
                textY = (pa.height / 5) * 2;
                resistorY = (pa.height / 5) * 2;
                pa.line(startX, startY, startX + 50, startY);
                pa.rect(startX + 50, startY - 50, 100, 100);
                pa.line(startX + 150, startY, startX + 200, startY);
                pa.fill(0);
                pa.text(value, textX, textY);
                pa.noStroke();
                c = colours.get(hundreds);
                pa.fill(c.r,c.g,c.b);
                pa.rect(resistorX, resistorY - 50, 10, 100);
                c = colours.get(tens);
                pa.fill(c.r,c.g,c.b);
                pa.rect(resistorX + 20, resistorY - 50, 10, 100);
                c = colours.get(ones);
                pa.fill(c.r,c.g,c.b);
                pa.rect(resistorX + 40, resistorY - 50, 10, 100);
                break;
            }

            case 195:
            {
                startY = (pa.height / 5) * 3;
                textY = (pa.height / 5) * 3;
                resistorY = (pa.height / 5) * 3;
                pa.line(startX, startY, startX + 50, startY);
                pa.rect(startX + 50, startY - 50, 100, 100);
                pa.line(startX + 150, startY, startX + 200, startY);
                pa.fill(0);
                pa.text(value, textX, textY);
                pa.noStroke();
                c = colours.get(hundreds);
                pa.fill(c.r,c.g,c.b);
                pa.rect(resistorX, resistorY - 50, 10, 100);
                c = colours.get(tens);
                pa.fill(c.r,c.g,c.b);
                pa.rect(resistorX + 20, resistorY - 50, 10, 100);
                c = colours.get(ones);
                pa.fill(c.r,c.g,c.b);
                pa.rect(resistorX + 40, resistorY - 50, 10, 100);
                break;
            }

            case 93:
            {
                startY = (pa.height / 5) * 4;
                textY = (pa.height / 5) * 4;
                resistorY = (pa.height / 5) * 4;
                pa.line(startX, startY, startX + 50, startY);
                pa.rect(startX + 50, startY - 50, 100, 100);
                pa.line(startX + 150, startY, startX + 200, startY);
                pa.fill(0);
                pa.text(value, textX, textY);
                pa.noStroke();
                c = colours.get(hundreds);
                pa.fill(c.r,c.g,c.b);
                pa.rect(resistorX, resistorY - 50, 10, 100);
                c = colours.get(tens);
                pa.fill(c.r,c.g,c.b);
                pa.rect(resistorX + 20, resistorY - 50, 10, 100);
                c = colours.get(ones);
                pa.fill(c.r,c.g,c.b);
                pa.rect(resistorX + 40, resistorY - 50, 10, 100);
                break;
            }
        }

    }
}