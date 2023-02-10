public class Jiguli extends Technique {


    public Jiguli(String brand, double yearOfMade, String color, int price) {
        super(brand, yearOfMade, color, price);
    }

    public int SkolkoKoles(){
        return 4;
    }

    @Override
    public String helpToStart() {
        return " Otkryt' zamok, zavodit' dvigatel. ";
    }

    @Override
    public String helpToStop() {
        return " Zakryt' zamok, tormoznit'. ";
    }
}
