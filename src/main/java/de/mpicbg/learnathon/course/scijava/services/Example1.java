package de.mpicbg.learnathon.course.scijava.services;

import net.imagej.ImageJ;
import org.scijava.ui.UIService;

/**
 * Exercise:
 * Services can be easily accessed via an instance of ImageJ.
 */
public class Example1 {

	public static void main(String... args) {
		ImageJ imageJ = new ImageJ();
		// BEGIN OF THE EXERCISE
		// 1. Use method of ImageJ to get the UIService
		UIService uiService = null;
		// 2. Call uiService.show("Hello World");

		// END OF THE EXERCISE
	}
}
