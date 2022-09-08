package Q1Code;

public abstract class RarityDecorator extends Rarity {

    protected Rarity rarity;
    public RarityDecorator(Rarity rarity) {
        this.rarity = rarity;
    }


}
