package c18312261;

import java.util.ArrayList;

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

    ArrayList<Float> ampHist = new ArrayList<Float>();

    int sizeOfGraph = 1;
    
    public void keyPressed()
    {
        
        if (key == 'w')
        {
            sizeOfGraph++;
        }
        else if (key == 's')
        {
            if(sizeOfGraph > 1)
            {
                sizeOfGraph--;
            }
        }
        
        //switch statement to change visuals
    }
    public void settings()
    {
        size(1024, 800, P3D);
    }

    public void setup()
    {
        startMinim();
       // startListening();
        
        loadAudio("heroplanet.mp3");
        getAudioPlayer().cue(0);
        getAudioPlayer().play();
       
        colorMode(HSB);
    }

    public void draw()
    {
        background(0);
        noFill();
        calculateAverageAmplitude();

        ampHist.add(getAmplitude());

        //this is where the shape of the waveform begins
        beginShape();
        //this loops through array list that contains the amplitude, graphing them
        for (int i = 0; i < ampHist.size() ; i++)
        {
            //colours the line based on amplitude
            stroke(map(i, 0, ampHist.size(), 0, 255), 255, 255);
            
            float y = (map(ampHist.get(i) * sizeOfGraph, 0, 1, height, 0));

            vertex(i, y);
        }
        endShape();
    }

}