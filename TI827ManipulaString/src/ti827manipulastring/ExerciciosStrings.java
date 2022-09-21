package ti827manipulastring;

class ExerciciosStrings {

    static String s, s1;

    static void leString(String texto) {
        System.out.println(texto);
        s = TI827ManipulaString.ler.next();
        s1 = TI827ManipulaString.ler.nextLine();
        s = s + s1;
    }

    static int contaCaracteres() {
        leString("Insira um texto");
        return s.length();
    }

    static void soletraString() {
        int x, y;
        leString("Insira uma palavra");
        for (x = 0; x < s.length(); x++) {
            for (y = 0; y <= x; y++) {

                System.out.print(s.charAt(y));
            }
            System.out.println();
        }
         for (x = s.length()-1; x >=0; x--) {
            for (y = 0; y < x; y++) {

                System.out.print(s.charAt(y));
            }
            System.out.println();
        }
    }
}
