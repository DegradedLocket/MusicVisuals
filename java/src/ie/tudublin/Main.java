package ie.tudublin;

import c18312261.*;
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
		
		//processing.core.PApplet.runSketch( a, new CubeVisual());
		//processing.core.PApplet.runSketch( a, new CircleVis());
		//processing.core.PApplet.runSketch( a, new CircleWave());
		//processing.core.PApplet.runSketch( a, new Wave());
		processing.core.PApplet.runSketch(a, new MyVisualiser());
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();	
	}
}