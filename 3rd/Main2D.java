import IT.Lingkaran2D;

public class Main2D {

    public static void main(String[] args) {
        Lingkaran2D ling1 = new Lingkaran2D();
        System.out.println(ling1);
        Lingkaran2D ling2 = new Lingkaran2D(5,4,5);
        System.out.println(ling2);
        System.out.println("Bersinggungan antara ling1 dan ling2: "+ling1.intersect(ling2));
        Lingkaran2D ling3 = new Lingkaran2D(5,20,9);
        System.out.println(ling3);
        System.out.println("Bersinggungan antara ling2 dan ling3: "+ling3.intersect(ling2));
    }
}