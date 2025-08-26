public class VowelConsonantCheck {
    public static void main(String[] args) {
        char ch = 'a';  // you can change this to any character to test
        
        // Convert character to lowercase for uniform checking
        ch = Character.toLowerCase(ch);
        
        if ((ch >= 'a' && ch <= 'z')) { // check if it is an alphabet
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}
