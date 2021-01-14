class Mahasiswa{
    private String nim;
    private String nama;
    private String alamat;

    public Mahasiswa(){
        this.nim= "N/A";
        this.nama = "noname";
        this.alamat = "unknown";
    }

    public Mahasiswa(String nim){
        this.nim= nim;
    }

    public Mahasiswa(String nim, String nama){
        this.nim= nim;
        this.nama = nama;
    }

    public Mahasiswa(String nim, String nama, String alamat){
        this.nim= nim;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setNim(String pNim){
        nim = pNim;
    }

    public void setNama(String pNama){
        nama = pNama;
    }

    public void setAlamat(String pAlamat){
        alamat = pAlamat;
    }

    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }
}

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa("01");
        Mahasiswa mhs3 = new Mahasiswa("02", "Budi");
        Mahasiswa mhs4 = new Mahasiswa("03", "Abdul", "Sleman");

        // mhs1.setNim("01");
        // mhs1.setNama("Ahmad");
        // mhs1.setAlamat("Bantul");

        System.out.println("Nim dari mhs1 = " + mhs1.getNim());
        System.out.println("Nama dari mhs1 = " + mhs1.getNama());
        System.out.println("Alamat dari mhs1 = " + mhs1.getAlamat());
        System.out.println();

        // mhs2.setNim("02");
        // mhs2.setNama("Umar");
        // mhs2.setAlamat("Sleman");

        System.out.println("Nim dari mhs2 = " + mhs2.getNim());
        System.out.println("Nama dari mhs2 = " + mhs2.getNama());
        System.out.println("Alamat dari mhs2 = " + mhs2.getAlamat());
        System.out.println();
        System.out.println("Nim dari mhs3 = " + mhs3.getNim());
        System.out.println("Nama dari mhs3 = " + mhs3.getNama());
        System.out.println("Alamat dari mhs3 = " + mhs3.getAlamat());
        System.out.println();
        System.out.println("Nim dari mhs4 = " + mhs4.getNim());
        System.out.println("Nama dari mhs4 = " + mhs4.getNama());
        System.out.println("Alamat dari mhs4 = " + mhs4.getAlamat());
    }
}
