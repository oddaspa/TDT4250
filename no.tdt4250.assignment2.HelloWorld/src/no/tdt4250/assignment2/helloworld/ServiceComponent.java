package no.tdt4250.assignment2.helloworld;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

import org.osgi.service.component.annotations.*;

@Component
public class ServiceComponent implements CommandProvider {
	
	private DictionaryService dictionary;
	
	public void _dict(CommandInterpreter ci) {
		String arg = ci.nextArgument();
		String word = ci.nextArgument();
		if(arg == null) {
			return;
		}
		if (arg.equalsIgnoreCase("check")) {
			if(word != null && dictionary.check(word)) {
				ci.println(word + ": exists in the dictionary");
			} else {
				ci.println(word + ": doesn't exist in the dictionary");
			}
		}
		if (arg.equalsIgnoreCase("languages")) {
			String[] langs = dictionary.getLanguages();
			for(int i = 0; i < langs.length; i++) {
				ci.println("Languages available:");
				ci.println("\t " + langs[i]);
			}
		}
	}

	@Override
	public String getHelp() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("---Generated by PDE---\n");
		buffer.append("\tdict check <word> - check for the existence of a word\n");
		buffer.append("\tdict languages - list the languages available\n");
		return buffer.toString();
	}
	
	@Reference
	public void setDictionary(DictionaryService d) {
		dictionary = d;
	}
	
	public void unsetDictionary(DictionaryService d) {
		dictionary = null;
	}
	
}