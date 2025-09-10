package IT;

// revisi 2
public class Lingkaran {
    double r;

    public Lingkaran() { // <--- constructor 1
        r = 5;
    }

    public Lingkaran(double r) { // <--- constructor 2
        this.r = r;
    }

    // tambahan, untuk mengakses nilai r
    public double getR() {
        return r;
    }

    // tambahan, untuk mengubah nilai r
    public void setR(double r) {
        this.r = r;
    }
    
    public double hitungLuas() {
        return Math.PI * r * r;
    }

    public double hitungKeliling() {
        return Math.PI * 2 * r;
    }
}

