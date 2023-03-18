package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        Boolean checkVar = checkAlpha(symbol);
	if (checkVar == true) {
	    System.out.println("English");
	}
	else if (checkVar == false) {
	    System.out.println("Non English");
	}
    }
    public static Boolean checkAlpha(char symbol) {
	char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	boolean boolVar = false;
	for (char tempChar:alpha) {
	    if (tempChar == symbol) {
		boolVar = true;
	    }
	}
	return boolVar;
    }
}
