public class Main {
    public static void main(String[] args) {

        int[] numbers = {4,6,2,3,7,8,1,9,0};
    int pom=0;

//  sortowanie bombelkowe
//
//
//        for(int i=0;i<=numbers.length;i++){
//            for(int j=0;j< numbers.length-1;j++){
//                if(numbers[j] > numbers[j+1]){
//                    pom = numbers[j];
//                    numbers[j] = numbers[j+1];
//                    numbers[j+1] = pom;
//
//                }
//            }
//        }


        int min;

        for (int i = 0; i < numbers.length; i++) {
            min = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[j] < min){
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }

            }
        }










        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }




    }
}