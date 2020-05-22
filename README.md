# Music Visualiser Project

Name: Conor Melia

Student Number: C18312261

## Instructions
- Fork this repository and use it a starter project for your assignment
- Create a new package named your student number and put all your code in this package.
- You should start by creating a subclass of ie.tudublin.Visual
- There is an example visualiser called MyVisual in the example package
- Check out the WaveForm and AudioBandsVisual for examples of how to call the Processing functions from other classes that are not subclasses of PApplet

# Description of the assignment

# Instructions
For the Circle Visualiser, initially there is only a single circle. In order to 
add more circles to the visualiser the 'e' key is pressed.

For the Wave, you can change how high the wave is using 'w' and 's'. 'w' increses how much the amplitude makes the wave, 's' decreases the height. The minimum value is 1.

# How it works
When creating these visuals I used the example as a guideline for developing mine.
I have visuals called in two different ways, CubeVisual and CircleVis are called 
and created directly in the Main method. Circles on the other hand is called in the MyVisualiser class which creates objects for this visuals.

Cube Visual is a basic visualier that has both rotation and laterally. The amplitude dictates how big the cubes are as well as how far they travel from the center of the screen.

Wave creates a line  of Amplitudes over time. It acts like a graph where the X value represents the Time and the Y value represents the amplitude. The colour is also changed using the amplitude.
# What I am most proud of in the assignment
I was most proud of the Wave graphic as it took me a lot of trial and error to get working. I ended up having to reserach the beginShape and endShape functions as well as the vertex in proceesing as well as using an ArrayList to store the history of amplitude so it would dynamically increase in size.

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

