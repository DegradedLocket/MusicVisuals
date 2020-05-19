package c18312261;

import ie.tudublin.*;

public class Wave extends Visual
{
    
    MyVisualiser visual;
    
    public  Wave(MyVisualiser visual)
    {
        this.visual = visual;
    }

    public void render()
    {
        for (int i = 0; i < visual.getAudioBuffer().size(); i++)
        {
            
        }
    }
}