package stringexample;
import java.util.regex.*;

public class regularExpnAssisted {

public static void main(String[] args) {

	String pattern = "[a-z]+";
	String check = "Regular Expressions";
	//creating a pattern to be serached
	Pattern p = Pattern.compile(pattern);
	//Searching pattern in words
	Matcher c = p.matcher(check);
	
	while (c.find())
		//printing the starting and end the pattern in text using methods
      	System.out.println( check.substring( c.start(), c.end() ) );
	}
}

//011- 45678901
//+91 5678 789 890