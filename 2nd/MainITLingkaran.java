import IT.Lingkaran;

public class MainITLingkaran {
    public static void main(String[] args) {
        // Lingkaran lingkaran = new Lingkaran(5);

        // System.out.println("Jari jari: " + lingkaran.getR());
        // System.out.println("Luas: " + lingkaran.hitungLuas());
        // System.out.println("Keliling: " + lingkaran.hitungKeliling());

        // Lingkaran lingkaran2 = new Lingkaran(Math.random() * 50);

        // System.out.println("Jari jari: " + lingkaran2.getR());
        // System.out.println("Luas: " + lingkaran2.hitungLuas());
        // System.out.println("Keliling: " + lingkaran2.hitungKeliling());
        
        Lingkaran[] dataLink = new Lingkaran[5];
        
        for (int i = 0; i < dataLink.length; i++) {
            dataLink[i] = new Lingkaran(Math.random() * 20);
        }
        
        for (int i = 0; i < dataLink.length; i++) {
            System.out.println("Lingkaran ke-" + i);
            System.out.println("Jari jari: " + dataLink[i].getR());
            System.out.println("Luas: " + dataLink[i].hitungLuas());
            System.out.println("Keliling: " + dataLink[i].hitungKeliling());
        }
    }
}
