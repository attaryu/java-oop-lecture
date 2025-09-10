import bank.Bank;
import bank.Nasabah;
import bank.Tabungan;

public class MainBank {
    public static void main(String[] args) {
        Bank bankIT = new Bank();
        Nasabah nas1 = new Nasabah("Andi", new Tabungan(10000));
        Nasabah nas2 = new Nasabah("Budi", new Tabungan(20000));
        bankIT.tambahNasabah(nas1);
        bankIT.tambahNasabah(nas2);
        bankIT.tambahNasabah("Fandra", 30000);
        bankIT.tambahNasabah("Andi", 30000);
        System.out.println(bankIT.getNasabah(2));
        System.out.println("Search Andi");
        bankIT.searchNasabah("Andi");
        System.out.println(bankIT);
    }
}
