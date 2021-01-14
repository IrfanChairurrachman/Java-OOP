class Balok{
    // deklarasi atribut
    int panjang = 5;
    int lebar = 3;
    int tinggi = 2;
    static int banyakBalok = 0;
    // konstruktor
    Balok(){
        banyakBalok++;
    }

    Balok(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        banyakBalok++;
    }

    Balok(int panjang, int lebar, int tinggi){
        this(panjang, lebar);
        this.tinggi = tinggi;
    }

    // deklarasi method
    void setLebar(int lb){
        lebar = lb;
    }

    void setPanjang(int pj){
        panjang = pj;
    }

    void setTinggi(int tg){
        tinggi = tg;
    }

    double hitungVolume(){
        double v = panjang * lebar * tinggi;
        return v;
    }

    double luasPermukaan(){
        double luas = (2 * panjang * lebar) + (2 * panjang * tinggi) + (2 * lebar * tinggi);
        return luas;
    }

    static int getBanyakBalok(){
        return banyakBalok;
    }

}
public class TestBalok {
    public static void main(String[] args) {
        Balok balok1 = new Balok();
        Balok balok2 = new Balok(15, 10);
        Balok balok3 = new Balok(10, 5, 5);

        System.out.println("Vol balok1 = " + balok1.hitungVolume());
        System.out.println("Vol balok2 = " + balok2.hitungVolume());
        System.out.println("Vol balok3 = " + balok3.hitungVolume());

        System.out.println("Luas balok1 = " + balok1.luasPermukaan());
        System.out.println("Luas balok2 = " + balok2.luasPermukaan());
        System.out.println("Luas balok3 = " + balok3.luasPermukaan());

        System.out.println("Banyak objek balok = " + Balok.banyakBalok);
        System.out.println("Banyak objek balok = " + Balok.getBanyakBalok());
    }
}
