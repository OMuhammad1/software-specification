package Q1Code.Mods;

import Q1Code.Rarity;
import Q1Code.RarityDecorator;

public class Strength extends RarityDecorator {


    public Strength(Rarity rarity) {
        super(rarity);
    }
    @Override
    public String getRarityDescription() {
        return  rarity.getRarityDescription() + "Strength + 5 " ;
    }

}
