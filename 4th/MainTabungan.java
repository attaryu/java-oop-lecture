
import bank.Tabungan;

//import bank.Tabungan;
public class MainTabungan {
    
    public static void main(String[] args) {
        Tabungan tabungan1 = new Tabungan(9000);
        System.out.println("Tabungan 1: "+tabungan1);
        tabungan1.simpanUang(500);
        System.out.println("Tabungan 1: "+tabungan1);

        tabungan1.ambilUang(100);
        System.out.println("Tabungan 1: "+tabungan1);

        Tabungan tabungan2 = new Tabungan(10000);
        System.out.println("Tabungan 2: "+tabungan2);
        tabungan2.transfer(tabungan1, 700);
        System.out.println("Tabungan 2: "+tabungan2);
        System.out.println("Tabungan 1: "+tabungan1);



    }
}
