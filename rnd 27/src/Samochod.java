public class Samochod extends Pojazd implements Poruszanie{

    Samochod(String nazwa, int ilosc_kol) {
        super(nazwa);
        this.ilosc_kol = ilosc_kol;
    }
    int ilosc_kol;

    @Override
    public void jedz_do_przodu() {
        System.out.println("jadę");
    }

    @Override
    public void skrecaj() {
        System.out.println("skręcam");
    }
}
