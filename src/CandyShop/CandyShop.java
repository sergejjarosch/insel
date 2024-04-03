package CandyShop;

class Candy {
    String name;
    int price;

    Candy name(String name){
        this.name = name;
        return this;
    }
    String name (){
        return name;
    }
    Candy price(int price){
        this.price = price;
        return this;
    }
    int price() {
        return price;
    }


}





public class CandyShop {
    public static void main(String[] args) {

     Candy candy_1 = new Candy().name("Nerd Candy" ).price( 80 );
        System.out.printf("%s %d%n", candy_1.name, candy_1.price());

    }
}
