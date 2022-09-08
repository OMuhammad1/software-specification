package Q1Code.Mods;

import Q1Code.Rarity;
import Q1Code.RarityDecorator;

public class Intelligence extends RarityDecorator {


    public Intelligence(Rarity rarity) {
        super(rarity);
    }

    @Override
    public String getRarityDescription() {
        return  rarity.getRarityDescription() + "Intelligence + 5 " ;
    }

}
