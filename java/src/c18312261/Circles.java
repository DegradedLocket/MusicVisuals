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
        camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        background(0);
        stroke(255);
        fill(255);

        pushMatrix();
        for (int i = 0; i < getBands().length; i++)
        {
            circle(i, map(getSmoothedAmplitude(), 0, 1, 0, height), getSmoothedAmplitude() * 100);
        }
        popMatrix();
    }
}