package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		for (char tempChar:alpha) {
			if (character == tempChar) {
				checkCharacter(character);
				return character;
			} else {
				System.out.println("Wrong alphabet!");
			}
        }
    }
    
    
    public static Object checkCharacter(char character) {
        char[] vowel = {'a','e','i','o','u','y'};
		char[] consonant = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','z'};
				
		for (char tempChar:vowel) {
			if (character == tempChar) {
				System.out.println("Vowel");
				return character;
			}
		}
		for (char tempChar:consonant) {
			if (character == tempChar) {
				System.out.println("Consonant");
				return character;
			}
		}
    }
}

