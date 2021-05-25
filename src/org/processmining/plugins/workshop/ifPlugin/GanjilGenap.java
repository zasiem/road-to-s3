package org.processmining.plugins.workshop.ifPlugin;

import org.processmining.contexts.uitopia.annotations.UITopiaVariant;
import org.processmining.framework.plugin.PluginContext;
import org.processmining.framework.plugin.annotations.Plugin;

public class GanjilGenap {
	@Plugin(
			name = "Ganjil Genap Plugin",
			parameterLabels = {"Integer"},
            returnLabels = { "Hasil Indentifikasi"}, 
            returnTypes = { String.class }, 
            userAccessible = true, 
            help = "Identifikasi integer termasuk dalam kategori ganjil atau genap"
	)
	@UITopiaVariant(
			affiliation = "Seika Academy",
			author = "Erza Putra",
			email = "erzaputra@seika.id"
	)
	public static String ganjilGenap(PluginContext context, Integer input) {
		
//		input --> ganjil / genap 
		
//		modulus:
//			genap -> habis dibagi 2 (genap % 2 = 0)
//			ganjil -> tidak habis dibagi 2 (ganjil % 2 != 0)
		
		if(input % 2 == 0) {
			return "Genap";
		}else {
			return "Ganjil";
		}
		
	}
}
