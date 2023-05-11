import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int k=0;
        int liczba;
        int odp;

        Random rnd = new Random();

        liczba = rnd.nextInt(10)+1;

        Scanner odpp = new Scanner(System.in);

        System.out.println("Zgadnij liczbę od 1 do 10!");

        do{
            k++;
            System.out.print("podaj liczbę: ");
            odp = odpp.nextInt();
            if(odp>liczba){
                System.out.println("Za dużo");
            }else {
                System.out.println("Za mało");
            }

        }while(odp != liczba);
        System.out.println("Brawo odgadłeś za " + k + " razem!");





    }
}