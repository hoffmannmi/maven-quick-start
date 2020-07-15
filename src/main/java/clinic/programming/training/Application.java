package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

	public int countWords(String words) {
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null ? 0 : separateWords.length);
	}

    private void doSomeMagicStuff() {
		List<String> aList = new ArrayList<String>();
        aList.add("Greetings");
		for (int i=0;i<aList.size();i++) {
			System.out.println (aList.get(i));
		}
	}
	
    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.doSomeMagicStuff();
		app.countWords("Here u are");
    }
}