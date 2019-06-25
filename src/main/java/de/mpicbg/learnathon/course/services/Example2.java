package de.mpicbg.learnathon.course.services;

import org.scijava.Context;
import org.scijava.ui.UIService;

public class Example2 {

	public static void main(String... args) {
		// BEGIN OF THE EXERCISE
		// Create a new Context()
		Context context = null;
		// Get the UIService by using the method context.service(...)
		UIService uiService = context.service(UIService.class);
		// Call uiService.show("Hello World!");
		uiService.show("Hello World");
		// END OF THE EXERCISE
	}
}
