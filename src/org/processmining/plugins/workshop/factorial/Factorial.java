package org.processmining.plugins.workshop.factorial;

import org.processmining.contexts.uitopia.annotations.UITopiaVariant;
import org.processmining.framework.plugin.PluginContext;
import org.processmining.framework.plugin.annotations.Plugin;

public class Factorial {
	@Plugin(
			name = "Factorial Plugin",
			parameterLabels = {"Integer"},
            returnLabels = { "Factorial"}, 
            returnTypes = { Integer.class }, 
            userAccessible = true, 
            help = "Mencari nilai faktorial dari sebuah integer"
	)
	@UITopiaVariant(
			affiliation = "Seika Academy",
			author = "Erza Putra",
			email = "erzaputra@seika.id"
	)
	public static Integer erzaganteng(PluginContext context, Integer input) {
		
		//algoritma
		
		//5! = 5*4*3*2*1
		//10! = 1*2*3 ... *10
		
		//while - do
		//do - while
		//for <--
		//foreach
		
		int hasil = 1;
		for(int i = 1; i <= input; i++) { // hasil = 1 * 2 * 3 .. * input
			hasil = hasil * i;
			// System.out.println(i+" "+hasil); debuging di looping
		}
		System.out.println("Hasil dari faktorial "+input+" adalah "+hasil);
		
		return hasil;
	}
}
