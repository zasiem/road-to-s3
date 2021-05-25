package org.processmining.plugins.workshop.ifPlugin;

import org.processmining.contexts.uitopia.annotations.UITopiaVariant;
import org.processmining.framework.plugin.PluginContext;
import org.processmining.framework.plugin.annotations.Plugin;

public class Nilai {
	@Plugin(
			name = "Nilai Plugin",
			parameterLabels = {"Integer"},
            returnLabels = { "Hasil Indentifikasi"}, 
            returnTypes = { String.class }, 
            userAccessible = true, 
            help = "Identifikasi integer termasuk dalam kategori nilai"
	)
	@UITopiaVariant(
			affiliation = "Seika Academy",
			author = "Erza Putra",
			email = "erzaputra@seika.id"
	)
	public static String ganjilGenap(PluginContext context, Integer input) {
		
		if(input > 80) {
			return "A";
		}else if(input > 70) {
			return "B";
		}else if(input > 50) {
			return "C";
		}else {
			return "tidak lulus";
		}
		
	}
}
