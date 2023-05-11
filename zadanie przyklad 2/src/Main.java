import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj luczbę pierwsza: ");

        int firstNumber = scanner.nextInt();

        System.out.println("Podaj luczbę druga: ");

        int secondNumber = scanner.nextInt();

        System.out.println("Wartości przed: ");
        System.out.println(firstNumber + " " + secondNumber);

        //zadanie polega na tym aby zamienić te liczby miejscami
        // 1 opcja jest taka żeby na dole zamienić zmienne wyświetlane i po problemie
        // 2 opcja jest taka aby utworzyć 1 zmienną pomocniczą
        // 3 opcja jest matematyka

        // opcja 3
        // do 1 dodaj obie 2 od drugiej odejmij 3 od pierwszej odejmij
        // fajny sposób bo nie trzeba żadnych zmiennych pomocniczych.

        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        // opcja 2

//        int pom;
//        pom = firstNumber;
//        firstNumber = secondNumber;
//        secondNumber = pom;


        System.out.println("Wartości po zamianie: ");
        System.out.println(firstNumber + " " + secondNumber);





    }
}