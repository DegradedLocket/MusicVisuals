package c18312261;

import ie.tudublin.*;

public class CircleVis extends Visual
{
  
    int noOfCircles = 1;

    public void settings()
    {
        size(1920, 1080);
    }

    public void setup()
    {
        startMinim();
        //startListening();
        loadAudio("underTheBridge.mp3");
        colorMode(HSB);
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }

        if (key == 'e')
        {
            noOfCircles++;
        }
        
        //switch statement to change visuals
    }

    public void draw()
    {
        background(0);
        calculateAverageAmplitude();
        stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        strokeWeight(5);
        noFill();
        //lights();
        
        //camera(0, 0, 0, 0, 0, -1, 0, 1, 0);

        pushMatrix();
        //translate(0, 0, -200);
        
        //creates the specified no of circles
        for(int i = 1; i < noOfCircles + 1; i++)
        {
            circle(width / 2, height / 2 , 100 + ((i * 500) * getSmoothedAmplitude()));
        }   
        popMatrix();
    }
  
}