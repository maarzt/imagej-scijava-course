package de.mpicbg.learnathon.course.animals;

import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;
import org.scijava.plugin.PluginService;
import org.scijava.service.AbstractService;
import org.scijava.service.SciJavaService;
import org.scijava.service.Service;

import java.util.List;

@Plugin(type = Service.class)
public class AnimalService extends AbstractService implements SciJavaService {

	@Parameter
	private PluginService pluginService;

	public int countCats() {
		List<Animal> animals = pluginService.createInstancesOfType(Animal.class);
		int count = 0;
		for(Animal animal : animals)
			if( animal.isCat() )
				count++;
		return count;
	}

}
