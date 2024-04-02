package CandyShop;

class Candy {
    String name;
    int price;
    int quantity;
}





public class CandyShop {
    public static void main(String[] args) {

        Candy lollipop = new Candy();
        lollipop.name = "Lollipop";
        lollipop.price = 12;
        lollipop.quantity = 2;

        Candy licorice = new Candy();
        licorice.name = "Licorice";
        licorice.price = 22;

        System.out.printf("%s, %d x %d = %d%n", lollipop.name, lollipop.quantity, lollipop.price,
                                                lollipop.price * lollipop.quantity);
        System.out.printf("%s, %d x %d = %d%n", licorice.name, licorice.price,
                licorice.quantity * licorice.price);

    }
}
