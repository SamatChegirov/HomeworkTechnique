public class Velosiped extends Technique {


    public Velosiped(String brand, double yearOfMade, String color, int price) {
        super(brand, yearOfMade, color, price);
    }

    public int SkolkoKoles(){
        return 2;
    }

    @Override
    public String helpToStart() {
        return " Krutit' pedal'. ";
    }

    @Override
    public String helpToStop() {
        return " Najat' tormoz na rule. ";
    }
}
