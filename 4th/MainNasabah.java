import bank.Nasabah;
import bank.Tabungan;

public class MainNasabah {
    public static void main(String[] args) {
        Nasabah nas1 = new Nasabah("Andi", new Tabungan(10000));
        Nasabah nas2 = new Nasabah("Budi", new Tabungan(20000));

        System.out.println("Nasabah 1: " + nas1);
        System.out.println("Nasabah 2: " + nas2);

        nas1.getTabungan().simpanUang(500);

        System.out.println("Nasabah 1: " + nas1);

        nas2.getTabungan().ambilUang(3000);

        System.out.println("Nasabah 2: " + nas2);

        nas2.getTabungan().transfer(nas1.getTabungan(), 1000);

        System.out.println("Nasabah 1: " + nas1);
        System.out.println("Nasabah 2: " + nas2);
    }
}
