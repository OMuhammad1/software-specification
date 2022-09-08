package Q1Code;

import Q1Code.ArmourTypes.normalArmour;

public class Runner {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Armour mine = new normalArmour();
            System.out.println(mine.getDescription());
        }



    }

}
