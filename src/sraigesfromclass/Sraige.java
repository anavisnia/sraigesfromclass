package sraigesfromclass;

import java.util.Date;

public class Sraige extends Thread{

    private String vardas;
    private Date startTime;
    private Date finishTime;
    private int distance;

    public Sraige(String vardas) {
        this.vardas = vardas;
        this.startTime = null;
        this.finishTime = null;
        this.distance = 0;
    }
    public long getRunTime() {
        if(this.startTime == null || this.finishTime == null) {
            return -1;
        }
        // kiek laiko sraige sliauze
        return this.finishTime.getTime() - this.startTime.getTime();
    }
    // pradeda sliauzti
    public void run() {
        this.startTime = new Date();
        int passed = 0;
        while (this.distance < 100) {
            try {
                Thread.sleep((int) (Math.random() * 5 + 1));
            } catch (InterruptedException e) {
//                e.printStackTrace();
                // ignored
            }
            this.distance += (int) (Math.random() * 5 + 1);
            if(passed < this.distance / 10) {
                System.out.println("Sraige " + this.vardas + " nusliauze " + this.distance);
                passed++;
            }
        }
        this.finishTime = new Date();
    }

    @Override
    public String toString() {
        return "Sraige{" +
                "vardas='" + vardas + '\'' +
                ", distance=" + distance +
                '}';
    }
}
