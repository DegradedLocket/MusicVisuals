package c18312261;

import ie.tudublin.*;

public class Wave extends Visual
{
    
    /* MyVisualiser visual;
    
    //float ampHist[];

    public  Wave(MyVisualiser visual)
    {
        this.visual = visual;
    }

    public void render()
    {
        beginShape();

        for (int i = 0; i < getAudioBuffer().size() ; i++)
        {
            float y = map(getAmplitude(), 0, 1, (float)height, 0);
            vertex(i, y);
        }
        endShape();
    } */

    public void settings()
    {
        size(1024, 800, P3D);
    }

    public void setup()
    {
        startMinim();
        startListening();
        loadAudio("heroplanet.mp3");
        getAudioPlayer().cue(0);
        getAudioPlayer().play();
        colorMode(HSB);
    }

    public void draw()
    {
        background(0);
        stroke(255);
        noFill();
        calculateAverageAmplitude();

        beginShape();
        for (int i = 0; i < getAudioBuffer().size() ; i++)
        {
            float y = map(getAmplitude(), 0, 1, height, 10);
            vertex(i, y);
            //point(i, y);
        }
        endShape();
    }

}