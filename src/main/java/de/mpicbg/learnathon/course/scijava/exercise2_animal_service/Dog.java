package de.mpicbg.learnathon.course.scijava.exercise2_animal_service;

import org.scijava.plugin.Plugin;

@Plugin(type = Dog.class)
public class Dog implements Animal {

	@Override
	public boolean isCat() {
		return false;
	}
}
