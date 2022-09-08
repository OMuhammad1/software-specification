public class Ourboros implements Encryption {

    @Override
    public void encrypt(int[] am, String in) {
        StringBuilder out = new StringBuilder();
        String use = in + new String(new char[am.length - (in.length() % am.length)]).replace("\0", " ");
        for(int i = 0; i < use.length(); i += am.length) {
            char[] next = new char[am.length];
            for(int j = 0; j < am.length; j++) {
                next[j] = use.charAt(i + am[j]);
            }
            out.append(new String(next));
        }
        System.out.println(out.toString());
    }
    @Override
    public void decrypt(int[] am, String in) {
        StringBuilder out = new StringBuilder();
        String use = in+"";
        for(int i = 0; i < use.length(); i += am.length) {
            char[] next = new char[am.length];
            for(int j = 0; j < am.length - 1; j++) {
                next[am[j]] = use.charAt(i + j);
            }
            out.append(new String(next));
        }
        System.out.println(out.toString());
    }


    }




