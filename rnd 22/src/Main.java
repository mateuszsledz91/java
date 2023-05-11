import org.omg.CORBA.Object;

import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {

        kot nn = new kot();
        nn.dajGlos();

        System.out.println(nn.toString());
        System.out.println("---------------------");


        System.out.println("---------------------");

        try {

            Animal asd = new pies("");
            asd.dajGlos();
            ((pies) asd).dajGlos();
            int a = 5/0;
        }catch(ClassCastException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("nie dziel przez 0");
        }catch (Exception e){
            System.out.println("masz błęda");
        }
        finally {
            System.out.println(";?");
        }


    }
}