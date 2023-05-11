import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Poznań");
        lista.add("Warszawa");
        lista.add("Kraków");
        lista.add("Gdańsk");

        System.out.println("------------");
        for(String e : lista){
            System.out.println(e);
        }

        Collections.sort(lista);


        System.out.println("------------");
        for(String e : lista){
            System.out.println(e);
        }
        System.out.println("------------");

        System.out.println(Collections.min(lista));
        System.out.println("------------");

    Collections.reverse(lista);
        for(String e : lista){
            System.out.println(e);
        }
        System.out.println("------------");

        Collections.shuffle(lista);
        for(String e : lista){
            System.out.println(e);
        }System.out.println("------------");System.out.println("------------");


        ArrayList<Animal> koty = new ArrayList<Animal>();
        Animal kot1 = new Animal("jj");
        Animal kot3 = new Animal("tag");
        Animal kot5 = new Animal("tag");
        Animal kot2 = new Animal("ff");
        Animal kot4 = new Animal("lol");
        kot5.wiek = 10;


        koty.add(kot1);
        koty.add(kot2);
        koty.add(kot3);
        koty.add(kot4);
        koty.add(kot5);

        Collections.sort(koty);

        for (Animal kot : koty){
            System.out.println(kot.name + " " + kot.wiek + " lat." );
        }




    }
}