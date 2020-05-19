package c18312261;

import ie.tudublin.*;

public class Wave extends Visual
{
    public void settings()
    {
        size(1024, 800, P3D);
    }

    public void setup()
    {
        startMinim();
        startListening();
        //loadAudio("heroplanet.mp3");
        colorMode(HSB);

    }
    
    public void draw()
    {
        background(0);
        stroke(255);

        float[] bands = getBands();

        //calculateFFT();

        try
        {
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
  
        for (int i = 0; i < 250; i++)
        {
            ellipse(i, 200, 10, bands[i]);
        }   
    }
}