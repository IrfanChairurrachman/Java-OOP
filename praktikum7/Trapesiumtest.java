class Trapesium{
    private double sisiAtas = 6l;
    private double sisiBawah = 10l;
    private double tinggi = 4l;
    private static int jumlahTrapesium = 0;

    Trapesium(){
        jumlahTrapesium++;
    }

    Trapesium(double sisiAtas, double sisiBawah){
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        jumlahTrapesium++;
    }

    Trapesium(double sisiAtas, double sisiBawah, double tinggi){
        this(sisiAtas, sisiBawah);
        this.tinggi = tinggi;
    }

    void setSisiAtas(double sisiAtas){
        this.sisiAtas = sisiAtas;
    }

    void setSisiBawah(double sisiBawah){
        this.sisiBawah = sisiBawah;
    }

    void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    double getSisiAtas(){
        return this.sisiAtas;
    }

    double getSisiBawah(){
        return this.sisiBawah;
    }

    double getTinggi(){
        return this.tinggi;
    }

    double hitungLuas(){
        return ((sisiAtas + sisiBawah) * tinggi) / 2;
    }

    static int getJmlTrapesium(){
        return jumlahTrapesium;
    }
}

public class Trapesiumtest {
    public static void main(String[] args) {
        // Trapesium trapesium1 = new Trapesium();
        Trapesium []arrTrap = new Trapesium[3];
        arrTrap[0] = new Trapesium();
        arrTrap[1] = new Trapesium(7, 11);
        arrTrap[1].setTinggi(5);
        arrTrap[2] = new Trapesium(8, 12, 6);

        for(int i = 0; i < arrTrap.length; i++){
            System.out.println(arrTrap[i].hitungLuas());
        }
        
        System.out.println(Trapesium.getJmlTrapesium());
    }
}
