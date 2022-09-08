public interface Encryption {

    static final int CEREBUS_INIT_VALUE = 32;
    static final int CEREBUS_ALPH_SIZE = 128;


    void encrypt(int[] am, String in);
    void decrypt(int[] am, String in);

}
