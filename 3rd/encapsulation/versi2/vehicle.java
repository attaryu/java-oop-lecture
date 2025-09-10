package encapsulation.versi2;

public class vehicle {
    private double load;
    private double maxload;

    public vehicle(double maxload){
        this.maxload = maxload;
    }
    
    public double getLoad(){
        return load;
    }

    public double getMaxload(){
        return maxload;
    }

    public boolean addBox(double weight){
        if(load+weight<=maxload){
            load+=weight;
            return true;
        }
        return false;
    }
}
