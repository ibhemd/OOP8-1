public class Chiffre {

    public static String decode(String coded, char a, char b) {

        // switch to upper case letters
        coded = coded.toUpperCase();
        a = Character.toUpperCase(a);
        b = Character.toUpperCase(b);

        // init new variables
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String newalphabet = "";
        String result = "";

        for (int i = 0; i < 26; i++) {
            int temp = (alphabet.indexOf(alphabet.charAt(i)) + (b-a));

            if (temp >= 26) {
                temp -= 26;
            } else if (temp < 0) {
                temp += 26;
            }

            newalphabet += alphabet.charAt(temp);
        }

        // decode
        for (int i = 0; i < coded.length(); i++) {
            result += newalphabet.charAt(alphabet.indexOf(coded.charAt(i)));
        }

        // print
        System.out.println("Input: " + coded + " || Output: " + result);

        return result;
    }

    public static void main(String[] args) {
        decode("HGXBO",'W','Z');
    }

}
