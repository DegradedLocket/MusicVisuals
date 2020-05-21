package c18312261;

import ie.tudublin.*;

public class MyVisualiser extends Visual
{
    Wave wave;

    public void settings()
    {
        size(1024, 800, P3D); 
    }

    public void setup()
    {
        startMinim();

        startListening(); 

        colorMode(HSB);

        //wave = new Wave(this);
    }

    public void draw()
    {
        background(0);
        stroke(255);
        try
        {
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        calculateFrequencyBands(); 

        //wave.render();
    }    
}