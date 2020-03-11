package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;
import processing.data.*;

public class UI extends PApplet

{	
	ArrayList<Colour> colours = new ArrayList<Colour>();
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();

	

	public void loadColours()
	{
		Table t = loadTable("colours.csv", "header");
		for(TableRow tr:t.rows())
		{
			Colour c = new Colour(tr);
			colours.add(c);
		}
	}

	public void loadResistors()
	{
		Table t = loadTable("resistors.csv");
		for(TableRow tr:t.rows())
		{
			Resistor r = new Resistor(tr.getInt(0));
			resistors.add(r);
		}
	}

	public void printColours()
    {
        for(Colour c:colours)
        {
            println(c);
		}
	}
	
	public Colour findColour(int value)
    {
		for(Colour c:colours)
		{
			if(value == c.value)
			{
				return c;
			}
		}

		return null;
	}
	
	public void drawResistors()
	{
		for(Resistor r:resistors)
		{
			r.render(this, colours);
		}
	}

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		loadColours();
		loadResistors();
		printColours();
	}
	
	public void draw()
	{
		background(150);
		drawResistors();
	}
}
