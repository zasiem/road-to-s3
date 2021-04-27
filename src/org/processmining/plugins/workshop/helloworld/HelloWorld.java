package org.processmining.plugins.workshop.helloworld;

import org.processmining.contexts.uitopia.annotations.UITopiaVariant;
import org.processmining.framework.plugin.PluginContext;
import org.processmining.framework.plugin.annotations.Plugin;


public class HelloWorld {
        @Plugin(
                name = "My First Plugin", 
                parameterLabels = {},
                returnLabels = { "Hello world string" }, 
                returnTypes = { String.class }, 
                userAccessible = true, 
                help = "Produces the string: 'Hello world'"
        )
        @UITopiaVariant(
                affiliation = "University of Mannheim", 
                author = "Erza Putra", 
                email = "olivermeier92@t-online.de"
        )
        public static String helloWorld(PluginContext context) {
        		System.out.println("Seika Academy");
                return "Hello World";
        }
        
        public static void main(String[] args) {
        	
        }
        
        public String buatMobil() {
        	return "Mobil";
        }
}
