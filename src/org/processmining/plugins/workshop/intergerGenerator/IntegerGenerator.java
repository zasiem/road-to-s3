package org.processmining.plugins.workshop.intergerGenerator;

import org.processmining.contexts.uitopia.annotations.UITopiaVariant;
import org.processmining.framework.plugin.PluginContext;
import org.processmining.framework.plugin.annotations.Plugin;

public class IntegerGenerator {

	@Plugin(
			name = "Random Integer Generator",
			parameterLabels = {},
            returnLabels = { "Random Integer 1", "Random Integer 2"}, 
            returnTypes = { Integer.class, Integer.class }, 
            userAccessible = true, 
            help = "generate random integer"
	)
	@UITopiaVariant(
			affiliation = "Seika Academy",
			author = "Erza Putra",
			email = "erzaputra@seika.id"
	)
	public static Object[] pluginBaru(PluginContext context) {
		
		int randomNumber1 = (int) (Math.random()*10) + 0;
		System.out.println("Random Integer 1 = " + randomNumber1);
		int randomNumber2 = (int) (Math.random()*10) + 0;
		System.out.println("Random Integer 2 = " + randomNumber2);
		
		return new Object[]{randomNumber1, randomNumber2};
		
	}
	
}
