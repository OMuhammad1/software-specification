package Q1Code.ArmourTypes;
import Q1Code.*;
import Q1Code.Mods.Intelligence;
import Q1Code.Mods.Strength;
import Q1Code.Rarities.*;
import Q1Code.Slots.*;

import java.util.Random;

public class normalArmour implements Armour {    //Normal armour that usually gives common rarity drops
    Random random = new Random();
    Slot slot;
    Rarity rarity;

    public normalArmour(){
        this.slot = this.generateSlot();
        this.rarity = this.generateRarity();
        Rarity test = new Rare();
        if (rarity.getClass().equals(test.getClass())) {  //Common mods
            getRandomAttribute();
            getRandomAttribute();
        }
        else {
            getRandomAttribute();
        }
    }

    @Override
    public Slot generateSlot() {
        int gearSlot = random.nextInt(2);
        if (gearSlot == 0) {
            Slot helm = new Helm("Helm");
            slot = helm;
            return helm;
        } else {
            Slot gloves = new Gloves("Gloves");
            slot = gloves;
            return gloves;
        }

    }


    @Override
    public Rarity generateRarity() {

        int rarityNum = random.nextInt(10);
        if (rarityNum <= 8) {   //more likely to be common
            Rarity common = new Common();
            rarity = common;
            return common;

        } else {
            Rarity rare = new Rare();
            rarity = rare;
            return rare;
        }
    }



    public Rarity getRandomAttribute() {
        int mod = random.nextInt(10);
        if (mod <= 4) {
            Rarity strength = new Strength(rarity);
            rarity = strength;
            return strength;
        } else {
            Rarity intelligence = new Intelligence(rarity);
            rarity = intelligence;
            return intelligence;
        }
    }


    public String getDescription() {
        return slot.getSlot() + rarity.getRarityDescription();
    }





}

