package de.mpicbg.learnathon.course.scijava.services;

import org.scijava.Context;
import org.scijava.log.LogService;
import org.scijava.plugin.Parameter;
import org.scijava.ui.UIService;

/**
 * Exercise:
 * Services can be injected using Context.inject(Object).
 */
public class Example3 {

	@Parameter
	private LogService logService;

	@Parameter
	private UIService uiService;

	public void doSomething() {
		logService.info("Hello World!");
		uiService.show("Hello World!");
	}

	public static void main(String... args) {
		Example3 example = new Example3();
		// BEGIN OF THE EXERCISE
		// 1. Create a new Context
		Context context = null;
		// 2. Call the method context.inject(Object) with example as parameter.
		// END OF THE EXERCISE
		example.doSomething();
	}
}
