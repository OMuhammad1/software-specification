import java.util.ArrayList;

public class CaiWebsite {
    ArrayList<Sites> sites = new ArrayList<Sites>();

    void addWebsite(Sites site) {
        sites.add(site);
    }

    void rmWebsite(Sites site) {
        for (Sites x : sites) {
            if (site.name == x.name) {
                sites.remove(site);
                return;
            }
        }
    }

    void notiWebsite() {
        for (Sites site : sites) {
            site.update();
        }
    }

    public static void main(String[] args) {
        CaiWebsite mine = new CaiWebsite();
        Sites x = new Sites("Google");
        mine.addWebsite(x);
        for (int i = 0; i < 1; i ++) {
           // x.receive("Poo");
            x.send("hell");
            x.receive("zw~~+");
            x.update();
            mine.notiWebsite();
            mine.rmWebsite(x);
        }

    }

}

