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
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
    }

    public void draw()
    {
        background(0);
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();        
    }    
}