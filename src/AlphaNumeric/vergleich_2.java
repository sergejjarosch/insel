package AlphaNumeric;

public class vergleich_2 {
    public static void vergleich_2_inout(){
        System.out.println("Gib bitte ien Wort ein: ");
        String str = new java.util.Scanner(System.in).nextLine();
        System.out.println("Ist es gleich mit dem wort? :");
        String verg_1 = new java.util.Scanner(System.in).nextLine();
        boolean result1 = str.equals( verg_1 );
        boolean result2 = str.equalsIgnoreCase( verg_1);
        System.out.println("Vergleich mit der Methode equals = " + result1);
        System.out.println("Vergleich mit der Methode equalsIgnoreCase = " + result2);
    }
}
