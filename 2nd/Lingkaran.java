public class Lingkaran {
    double r;

    public Lingkaran() {
        r = 5;
    }

    public Lingkaran(double r) {
        this.r = r;
    }

    public double hitungLuas() {
        return Math.PI * r * r;
    }

    public double hitungKeliling() {
        return Math.PI * 2 * r;
    }
}
