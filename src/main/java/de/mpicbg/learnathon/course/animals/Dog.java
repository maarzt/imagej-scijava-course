package de.mpicbg.learnathon.course.animals;

import org.scijava.plugin.Plugin;

@Plugin(type = Dog.class)
public class Dog implements Animal {

	@Override
	public boolean isCat() {
		return false;
	}
}
