public class Main {
    public static void main(String[] args) {

        String sentence = "Mowa jest srebrem a milczenie złotem";

//        String mateusz = "Mateusz";
//        String name = "Mateusz";


//         == porównanie miejsca w pamięci
//         equals porównanie wartości

//        System.out.println(mateusz == name);                //zwróci true V
//        System.out.println(mateusz.equals(name));           //zwróci true V

        // == jest tą samą wartością stringa
        //nawet jak zmienisz w 1 stringu wartości z mateusz na coś innego to oba wtedy będą false !!!!

        String name = new String("Mateusz");
        String mateusz = new String("Mateusz");

        System.out.println(name == mateusz);                  //zwróci false X
        System.out.println(name.equals(mateusz));             //zwróci True V

        //equals porównuje wartości czyli napisy "Mateusz"
        //natomiast == porównuje miejsce w pamięci a przy tworzeniu nowej (new) jest to inne


        System.out.println(name.toUpperCase());     //wyświetli MATEUSZ
        System.out.println(name);                   //wyświetli Mateusz ^ to na górze nie zmienia stringa !!!

        StringBuilder tekst = new StringBuilder("Mateusz");         //StringBuilder - jak dasz coś po kropce tekst.cośtam
        // to od razu ten tekst tym sie stanie nie to co w zwykłym stringu
        tekst.reverse();                            //odwrócenie stringa
        System.out.println(tekst);                  //zwróci zsuetaM

        tekst.reverse();
        tekst.deleteCharAt(1);           //usunięcie litery na indeksie 1
        System.out.println(tekst);              //zwróci Mteusz


        tekst.insert(3,"f");        //insert doda litere jaką wpiszemy w tym wypadku "f" i wstawi ją w
        // indeks który podamy w tym wypadku w indek 3      !!!! pamiętaj indeksujemy od 0  !!!!
        System.out.println(tekst);             // zwróci Mtefusz





    }
}