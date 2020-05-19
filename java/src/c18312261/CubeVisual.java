package c18312261;

import ie.tudublin.*;

public class CubeVisual extends Visual
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

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }

        //switch statement to change visuals
        switch (key) {
            case '1':
                
                break;
        
            default:
                break;
        }
    }

    float angle = 0;

    public void draw()
    {
        background(0);
        calculateAverageAmplitude();
        stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        strokeWeight(5);
        noFill();
        lights();
        
        camera(0, 0, 0, 0, 0, -1, 0, 1, 0);

        float boxSize = 50 + (200 * getSmoothedAmplitude());

        pushMatrix();
        translate(0 + (600 * getSmoothedAmplitude()), 0, -400);
        rotateX(angle);
        rotateZ(angle);        
        box(boxSize);   
        popMatrix();

        
        pushMatrix();
        translate(0 - (600 * getSmoothedAmplitude()), 0, -400);
        rotateX(-angle);
        rotateZ(-angle);       
        box(boxSize);   
        popMatrix();

        angle += 0.01f;
    }

}