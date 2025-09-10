package bank;

public class Nasabah {
    private String nama;
    private Tabungan tabungan;

    public Nasabah(String nama, Tabungan tabungan){
        this.nama=nama;
        this.tabungan=tabungan;
    }

    public String getNama() {
        return nama;
    }

    public Tabungan getTabungan() {
        return tabungan;
    }

    @Override
    public String toString() {
        return "Nama: "+nama+"\nTabungan: "+tabungan;

    }    
}
