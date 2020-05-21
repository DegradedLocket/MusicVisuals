package c18312261;
 
import ie.tudublin.*;

public class Circles extends Visual
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
        calculateAverageAmplitude();
        calculateFrequencyBands();


        background(0);
        stroke(255);
        fill(255);

        
        for (int i = 1; i < getBands().length; i++)
        {
            circle(getSmoothedBands()[i] * 10, map(getSmoothedAmplitude(), 0, 1, 0, height), getSmoothedAmplitude() * 100);
        }

    }
}