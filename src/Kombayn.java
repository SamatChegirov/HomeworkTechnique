public class Kombayn extends Technique {


    public Kombayn(String brand, double yearOfMade, String color, int price) {
        super(brand, yearOfMade, color, price);
    }

    public int SkolkoKoles(){
        return 4;
    }

    @Override
    public String helpToStart() {
        return " Tros, start dvigatelya. ";
    }

    @Override
    public String helpToStop() {
        return " Otkluchaem zajigania, tormoz. ";
    }
}
