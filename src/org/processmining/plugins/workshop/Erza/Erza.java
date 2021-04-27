package org.processmining.plugins.workshop.Erza;

import org.processmining.contexts.uitopia.annotations.UITopiaVariant;
import org.processmining.framework.plugin.PluginContext;
import org.processmining.framework.plugin.annotations.Plugin;

public class Erza {

	@Plugin(
			name = "Plugin Erza",
			parameterLabels = {"Input String"},
            returnLabels = { "Output String"}, 
            returnTypes = { String.class }, 
            userAccessible = true, 
            help = "Belajar Plugin Outputnya String"
	)
	@UITopiaVariant(
			affiliation = "Seika Academy",
			author = "Erza Putra",
			email = "erzaputra@seika.id"
	)
	public static String pluginBaru(PluginContext context, String input) {
		return "output= "+input;
	}

}
