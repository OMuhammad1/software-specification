public class Cerberus implements Encryption {

    @Override
    public void encrypt(int am[], String in) {
        StringBuilder out = new StringBuilder();
        String use = in.toLowerCase();
        for(char a : use.toCharArray()) {
            out.append((char)(((a + am[0] - CEREBUS_INIT_VALUE) % CEREBUS_ALPH_SIZE) + CEREBUS_INIT_VALUE)+"");
        }
        System.out.println(out.toString());
    }

    @Override
    public void decrypt(int am[], String in) {
        StringBuilder out = new StringBuilder();
        String use = in.toLowerCase();
        for(char a : use.toCharArray()) {
            out.append((char)(((a - am[0]  - CEREBUS_INIT_VALUE + CEREBUS_ALPH_SIZE) % CEREBUS_ALPH_SIZE) + CEREBUS_INIT_VALUE)+"");
        }
        System.out.println(out.toString());
    }

}
