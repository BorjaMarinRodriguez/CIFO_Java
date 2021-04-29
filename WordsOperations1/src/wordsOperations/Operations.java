package wordsOperations;

public class Operations {

	public static void print(String wordtoPrint) {

		System.out.print(wordtoPrint);
	}

	public static void print(char chartoPrint) {

		System.out.print(chartoPrint);
	}

	public static void print(int inttoPrint) {

		System.out.print(inttoPrint);
	}
	public static void linebreak() {
		System.out.print("\n");
	}

	public static void printString(String wordtoPrint) {

		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();
		while (i < sizeWordtoPrint) {
			print("counter: " + (i + 1) + " - " );
			print("loop number: " + (i + 1) + " - " );
			print("letter: " + wordtoPrint.charAt(i));
			linebreak();

			i++; // i = i +1;

		}

	}
	
	public static void printStringH(String wordtoPrint) {
		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();
		
		while (i < sizeWordtoPrint) {
		print(wordtoPrint.charAt(i));
		i++;
		
		}linebreak();
	}
	
	public static void printStringV(String wordtoPrint) {
		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();
		
		while (i < sizeWordtoPrint) {
		print(wordtoPrint.charAt(i));
		i++;
		linebreak();
		}
		
	}
	
	public static void printStringHG(String wordtoPrint) {
		
		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();
		
		while (i < sizeWordtoPrint) {
		print(wordtoPrint.charAt(i) + "-");
		i++;
		
		}
		linebreak();
	}
	
	public static void printStringDiagonal(String wordtoPrint) {
		
		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length(); // Guardem el tamany del String
		
		while (i < sizeWordtoPrint) {	// fem 1 bucle, la condicio i es més petita que el tamany del String
			int j = 0;					// inicialitzem j pel segon bucle
			
			while(j < i) {				// fem el segon bucle 
				print(" ");
				print(" ");
				j++;
			}
		
		print(wordtoPrint.charAt(i));
		linebreak();
		i++;
	
		}
		linebreak();
	}
	
public static void printStringBackwards(String wordtoPrint) {
		
		linebreak();
		int i = wordtoPrint.length() -1;
		
		
		
		while (i > - 1) {
		print(wordtoPrint.charAt(i));
		print (" ");
		i--;
		
		}
		
		linebreak();
	}
	
	
}