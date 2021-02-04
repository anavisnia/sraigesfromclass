package sraigesfromclass;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<Sraige> sraiges = new ArrayList();
        for (int i = 0; i < 8; i++) {
            sraiges.add(new Sraige("Sraige" + (i + 1)));
        }

        for(Sraige sraige : sraiges) {
            sraige.start();
        }

        for(Sraige sraige : sraiges) {
            try {
                sraige.join();
            } catch (InterruptedException ex) {
                // ignored
            }
        }

        sraiges.sort((s1, s2) -> (int) (s1.getRunTime() - s2.getRunTime()));

        System.out.println("Turnyrine lentele:");
        for(Sraige sraige : sraiges) {
            System.out.println(sraige);
        }
    }
}
