public class MainLingkaran {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 10;

        System.out.println("Jari jari: " + lingkaran.r);
        System.out.println("Luas: " + lingkaran.hitungLuas());
        System.out.println("Keliling: " + lingkaran.hitungKeliling());

        Lingkaran lingkaran2 = new Lingkaran(Math.random() * 50);

        System.out.println("Jari jari: " + lingkaran2.r);
        System.out.println("Luas: " + lingkaran2.hitungLuas());
        System.out.println("Keliling: " + lingkaran2.hitungKeliling());
    }
}
