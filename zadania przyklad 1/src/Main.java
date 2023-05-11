public class Main {
    public static void main(String[] args) {

        //1+2+....+n

        int[] liczby = {1,5,3,4,6,7,4,6,4};

        int n=10;
        int suma=0;
//         1 10
//         2 9
//         3 8
//         4 7
//         5 6
//        można zrobić sumę za pomocą pętli for bądź wzoru na sumę ciagu arytmetycznego!!!!!!!!!

         suma = (n+1)*n/2;

//        pamiętaj że pętla musi się zaczynać od 1 a nie od 0

//        for (int i = 1; i <= n; i++) {
//            suma += i;
//        }
//
        // lepszy jest wzór na sumę ponieważ program wykonuje mniejszą liczbę operacji dla komputera
        // przy pętli for program wykona tyle obiegów pętli ile równe jest n co przy dużych n'ach może prowadzić
        // do dużych obciążeń dla komputera przy okazji jeśli dali byśmy większe wartości dla n
        // program może działać źle ponieważ n jest na zmiennej int jeśli przypisli byśmy n'owi wartość
        // np. 1 000 000 to wartość ta mieści się w int ale suma tych wartości już raczej nie
        // poza tym dla tak dużych wartości n komputer zostanie bardzo obciążony przez taką pętle.

        // for wykonuje n operacji
        // suma wykonujemy dodawanie mnożenie i dzielenie tylko 3 operacje
        // przy sumie trzeba uważać bo pomnożenie może przekoroczyć int więc trzeba dać if

//
//        if(n%2==0){                           // tak jest git
//            suma = (n/2)*(n+1);               //
//        }else{                                // najlepszy sposób
//            suma = (n+1)/2*n;                 //
//        }                                     // tak jest git
//
        // dzięki temu nie przekroczymy wartości int podobnie jak przy pętli ale wykonamy jedno sprawdzenie więcej
        // tak jest najlepiej żeby mieć pewnośc 



        System.out.println(suma);




    }
}