package sumOfAWord;

public class sumOfAWord {
	/* Curtis Kunkle Assignment1
	------------------------------------------
	This program calculates the integer values
	of the ASCII characters within a word 
	------------------------------------------*/
	public static void main(String[] args) {
	
	//Variable declaration
	int sum = 0;
	char character;
	String word = "Encapsulation";
	
	//Every iteration pulls the next character,
	//displays it, displays its value, then adds
	//its value to the sum
	for(int i = 0; i < word.length(); i++){
		character = word.charAt(i);
		System.out.println(character + " value: " + (int)character);
		sum = sum + (int)character;
	}
	
	//Display result.
	System.out.println("The total ASCII value of Encapsulation is " + sum +".");
	}

}
