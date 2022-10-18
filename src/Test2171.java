public class Test2171 {

    public static void main(String[] args) {
        System.out.print("Entrez un nombre : ");
        int e = Clavier.lireInt();
        int l = String.valueOf(e).length();
        if (l % 2 == 0) {
            String s = String.valueOf(e);
            int i = 0;
            int j = l - 1;
            boolean b = true;
            while (i < (l / 2 - 1) && j > (l / 2 + 1) && b) {
                b = s.charAt(i++) == s.charAt(j--);
            }
            if (b) {
                System.out.println(e + " est un palindrome !");
            } else
                System.out.println(e + " n'est pas un palindrome.");
        } else
            System.out.println(e + " n'est pas un palindrome.");





    }
}
