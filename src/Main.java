/*TEXНИКА ДЕГЕН КЛАСС ТУЗУНУЗ,АНЫ 5КЛАСС МУРАСТАСЫН(ОЗУНУЗДОР 5КЛАСС ОЙЛОП ЖАЗЫНЫЗДАР,
        МИСАЛЫ"КОМБАЙН, ТРАКТОР")КЛАССТЫН ПОЛЯЛАРЫ(MARKA,YEAROFMADE,COLOR,PRICE)
        OVERRIDE МЕТОДЫ START(),STOP(),ЖАНА 5КЛАССТЫН ОЗУНУН 1ДЕН МЕТОДДОРУ БОЛСУН.*/

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Tractor tractor = new Tractor("Beloruss ", 2020.05, "Blue ", 10000);
        System.out.println("Tractor: " + tractor + tractor.helpToStart() + tractor.helpToStop());
        Kombayn kombayn = new Kombayn("Niva ", 2015.06, "Red ", 25000);
        System.out.println("Kombayn: " + kombayn + kombayn.helpToStart() + kombayn.helpToStop());
        Jiguli jiguli = new Jiguli("VAZ ", 2012.02, "White ", 3000);
        System.out.println("Jiguli: " + jiguli + jiguli.helpToStart() + jiguli.helpToStop());
        Velosiped velosiped = new Velosiped("Pioner ", 1985.04, "Black ", 500);
        System.out.println("Velosiped: " + velosiped + velosiped.helpToStart() + velosiped.helpToStop());
        AtAraba atAraba = new AtAraba("Araba ", 1980.01, "Wooden ", 1000);
        System.out.println("Araba: " + atAraba + atAraba.helpToStart() + atAraba.helpToStop());

    }
}