package ie.tudublin;

import c18312261.MyVisualiser;
import c18312261.CircleVis;
//import example.CubeVisual;
//import example.CubeVisual1;
//import example.MyVisual;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
		//processing.core.PApplet.runSketch( a, new CubeVisual());
		//processing.core.PApplet.runSketch( a, new CubeVisual1());
		//processing.core.PApplet.runSketch( a, new MyVisual());
		processing.core.PApplet.runSketch( a, new MyVisualiser());
		processing.core.PApplet.runSketch( a, new CircleVis());	
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();	
	}
}