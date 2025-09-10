package encapsulation;

public class vehicle {
    public double load;
    public double maxload;

    public vehicle(double maxload) {
        this.maxload = maxload;
    }

    public double getLoad() {
        return load;
    }

    public double getMaxload() {
        return maxload;
    }
}
