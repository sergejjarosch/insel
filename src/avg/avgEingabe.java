package avg;

public class avgEingabe {
    public static void avg_input(){

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print(" Enter numbers seperated by comas: ");
        String input = scanner.nextLine();
        String[] numbersAsString = input.split(",");
        double [] numbers = new double[numbersAsString.length];

        for ( int i =0; i < numbersAsString.length; i++)
            numbers[i] = Double.parseDouble(numbersAsString[i].trim());

        double average = avg.avgClass.avg_out(numbers);
        System.out.print("Avg: " + average);

    }
}
