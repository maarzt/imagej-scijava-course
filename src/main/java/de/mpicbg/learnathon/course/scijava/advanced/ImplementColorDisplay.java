package de.mpicbg.learnathon.course.advanced;

import net.imglib2.type.numeric.ARGBType;
import org.scijava.Context;
import org.scijava.ui.UIService;

import java.awt.*;

public class ImplementColorDisplay {

	/**
	 * ADVANCED EXERCISE: Implement a SciJava display for colors.
	 *
	 * The UIService can show a lot of stuff:
	 * * Differenent image types like:
	 *   - RandomAccessibleInterval, Img, ImgPlus, Dataset and ImagePlus.
	 * * Numbers, Strings
	 * * Tables & Diagrams.
	 * But it cannot display a simple color. This is because there is no
	 * display implemented for colors yet. The goal of this exercise
	 * is to extend the UIService to be able to display Colors.
	 * We take the bird display example as a starting point an modify it
	 * such that it displays a color instead of a bird.
	 *
	 * Step 0:
	 * * Execute the main method below.
	 * * Please verify: The UIService can not display colors.
	 *
	 * Step 1:
	 * * Copy the BirdDisplay and the SwingBirdDisplayViewer to this
	 *   package, and rename them to ColorDisplay and SwingColorDisplayViewer.
	 *
	 * Step 2:
	 * * In both classes ColorDisplay and SwingColorDisplay. Replace
	 *   every use of the class Bird with Color.
	 *
	 * Step 3:
	 * * Change the method SwingColorDisplay.createDisplayPanel(...),
	 *   such that it returns a JPanel, which contains only one JLabel.
	 *   The JLabel may say "COLOR". Set the foreground color of the JLabel
	 *   accordingly.
	 */

	public static void main(String... args) {
		Context context = new Context();
		UIService uiService = context.service(UIService.class);
		uiService.show( Color.RED );
		uiService.show( Color.BLUE );
	}
}
