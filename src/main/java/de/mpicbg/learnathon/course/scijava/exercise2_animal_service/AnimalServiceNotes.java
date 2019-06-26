package de.mpicbg.learnathon.course.scijava.exercise2_animal_service;

/*

	Step 1:

	Create an interface called Animal, that has a isCat method.

	Step 2:

	Create two classes "Dog" and "Tiger" that implement the Animal interface.

	Step 3:

	Create a class CountCats with a main method.
	The main method, should have a list of animals.
	   List<Animal> animals = Arrays.asList( new Dog(), new Cat() );
	The main method, should iterate of the list, count the cats and
	print the result.

	Demo

	Step 4:

	In the main class:
	* Create a SciJava context.
	* Get the plugin service from the context.
	* Replace Arrays.asList with pluginService.createInstancesOfClass

	Demo

	Step 5:

	Make the CountCats class, a SciJava Command the can be called
	from the menu path "Test > Count cats".

	Demo

	Step 6:

	In the CountCats class, do some refactoring to have a method countCats.

	Demo

	Step 7:

	Create a class AnimalService that:
	 * Extends AbstractService.
	 * Implements SciJavaService.
	 * Has a @Plugin(type = Service.class) annotation

	Move the countCats method to that AnimalService.

	Demo

 */
public class AnimalServiceNotes {

}
