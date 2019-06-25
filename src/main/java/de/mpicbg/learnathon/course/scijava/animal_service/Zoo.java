package de.mpicbg.learnathon.course.scijava.animal_service;

import net.imagej.ImageJ;
import org.scijava.ItemIO;
import org.scijava.command.Command;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;

@Plugin(type = Command.class, menuPath = "Test > Zoo")
public class Zoo implements Command {

	@Parameter
	private AnimalService animalService;

	@Parameter(type = ItemIO.OUTPUT)
	private int numberOfCats;

	@Override
	public void run() {
		numberOfCats = animalService.countCats();
		System.out.println( "Number of cats: " + numberOfCats );
	}

	public static void main(String... args) {
		new ImageJ().ui().showUI();
	}
}