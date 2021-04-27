package org.processmining.plugins.workshop.intergerGenerator;

import org.processmining.contexts.uitopia.annotations.UITopiaVariant;
import org.processmining.framework.plugin.PluginContext;
import org.processmining.framework.plugin.annotations.Plugin;

public class Penjumlahan {

	@Plugin(
			name = "Penjumlahan Integer",
			parameterLabels = {"Integer 1", "Integer 2"},
            returnLabels = { "Hasil Penjumlahan"}, 
            returnTypes = { String.class }, 
            userAccessible = true, 
            help = "penjumlahan dasar"
	)
	@UITopiaVariant(
			affiliation = "Seika Academy",
			author = "Erza Putra",
			email = "erzaputra@seika.id"
	)
	public static String pluginBaru(PluginContext context, Integer number1, Integer number2) {
		
		int hasil = number1 + number2;
		
		return Integer.toString(hasil);
		
	}
	
}
