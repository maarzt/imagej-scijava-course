package de.mpicbg.learnathon.course.scijava.exercise3_bird_display;

/**
 * Small example class, that represents a bird.
 * The bird has a name and a kind.
 */
public class Bird {

	private String kind;

	private String name = "Coco";

	public Bird(String kind)
	{
		this.kind = kind;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public String getKind()
	{
		return kind;
	}

	@Override
	public String toString()
	{
		return "Bird " + name + " (" + kind + ")";
	}
}
