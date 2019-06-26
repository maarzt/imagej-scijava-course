package de.mpicbg.learnathon.course.scijava.exercise2_animal_service;

import org.scijava.log.LogService;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;

@Plugin(type = Tiger.class)
public class Tiger implements Animal{

	@Parameter
	private LogService logService;

	@Override
	public boolean isCat() {
		logService.debug("I'm a cat");
		return true;
	}
}
