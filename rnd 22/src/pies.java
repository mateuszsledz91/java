public class pies extends Animal{
    pies(String imie) throws BLAD {
        if(imie.length() == 0) {
            throw new BLAD();
        }
        this.imie = imie;
    }
    String imie;
    @Override
    public void dajGlos() {
        System.out.println("HAU HAU HAU HAU HAU HAU");
    }

    public void razraz(){
        System.out.println("razrazraz");
    }



}
