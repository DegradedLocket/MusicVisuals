package c18312261;
 
import ie.tudublin.*;

public class CircleWave extends Visual
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

        //float volume = getSmoothedAmplitude();
        translate(width/2, height/2);
        stroke(255);
        noFill();

        beginShape();
        for (int i = 0; i < degrees(TAU); i++)
        {
            float radius = 500;
            //converts angle to coordinate
            float x = radius * degrees(cos(i));
            float y = radius * degrees(sin(i));

            vertex(x, y);
        }
        endShape();

    }
}