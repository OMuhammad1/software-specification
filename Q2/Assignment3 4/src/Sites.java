import java.util.Random;

public class Sites {
    String name;
    Encryption type;
    int protocol;
    Random rand = new Random();

    /** Number of distinct protocols for each encryption type*/
    int SIZE_OUROBOROS_KEYS = 2;
    int SIZE_CEREBUS_KEYS = 2;
    int numProtocols = 2;

    static final int[] CEREBUS_ONE = new int[] {18};
    static final int[] CEREBUS_TWO = new int[] {31};

    static final int[] OUROBOROS_ONE = new int[] {3, 1, 0, 2};
    static final int[] OUROBOROS_TWO = new int[] {2, 5, 4, 1, 3, 0};


    public Sites(String name) {
        this.name = name;
        getRandomEncrpytion();
    }

    void getRandomEncrpytion() {
        int x = rand.nextInt(numProtocols);
        if (x == 0) { //Cerberus + # chosen
            type = new Cerberus();
            protocol = 1;

        }
        else if (x == 1) {
            type = new Ourboros();
            protocol = 2;

        }

    }

    void receive(String word) {
        Encryption x = new Cerberus();
        Encryption z = new Ourboros();

        if (type.getClass().equals(x.getClass())) {
            if (protocol == 1)
                type.decrypt(CEREBUS_ONE, word);
            else if (protocol == 2)
                type.decrypt(CEREBUS_TWO, word);

        }

        else if (type.getClass().equals(z.getClass())) {
            if (protocol == 1)
                type.decrypt(OUROBOROS_ONE, word);
            else if (protocol == 2)
                type.decrypt(OUROBOROS_TWO, word);
        }


    }
    void send(String word) {
        Encryption x = new Cerberus();
        Encryption z = new Ourboros();

        if (type.getClass().equals(x.getClass())) {
            if (protocol == 1) {
                type.encrypt(CEREBUS_ONE, word);

            }
            else if (protocol == 2) {
                type.encrypt(CEREBUS_TWO, word);
            }


        }

        else if (type.getClass().equals(z.getClass())) {
            if (protocol == 1) {
                type.encrypt(OUROBOROS_ONE, word);


            }
            else if (protocol == 2) {
                type.encrypt(OUROBOROS_TWO, word);

            }
        }


    }
    void update() {
        int a = rand.nextInt(numProtocols);
        if (a == 0) { //Cerberus + # chosen
            protocol = 1;

        }
        else if (a == 1) {
            type = new Ourboros();
            protocol = 2;

        }

    }

}
