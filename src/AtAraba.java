public class AtAraba extends Technique {


    public AtAraba(String brand, double yearOfMade, String color, int price) {
        super(brand, yearOfMade, color, price);
    }


    public int SkolkoKoles(){
        return 4;
    }

    @Override
    public String helpToStart() {
        return " Tyanet' loshad'. ";
    }

    @Override
    public String helpToStop() {
        return " Ostanavlivaet' loshad'. ";
    }
}
