package practice1;

public class Rooms {
    int deluxeDouble;
    int deluxeTwin;
    int boutiqueKing;
    int jrSuite;
    int suite;
    int presidentialSuite;

    public Rooms(){
        deluxeDouble = 120;
        deluxeTwin = 30;
        boutiqueKing = 40;
        jrSuite = 15;
        suite = 10;
        presidentialSuite = 1;
    }

    public int getDeluxeDouble() {
        return deluxeDouble;
    }

    public void setDeluxeDouble(int deluxeDouble) {
        this.deluxeDouble = deluxeDouble;
    }

    public int getDeluxeTwin() {
        return deluxeTwin;
    }

    public void setDeluxeTwin(int deluxeTwin) {
        this.deluxeTwin = deluxeTwin;
    }

    public int getBoutiqueKing() {
        return boutiqueKing;
    }

    public void setBoutiqueKing(int boutiqueKing) {
        this.boutiqueKing = boutiqueKing;
    }

    public int getJrSuite() {
        return jrSuite;
    }

    public void setJrSuite(int jrSuite) {
        this.jrSuite = jrSuite;
    }

    public int getSuite() {
        return suite;
    }

    public void setSuite(int suite) {
        this.suite = suite;
    }

    public int getPresidentialSuite() {
        return presidentialSuite;
    }

    public void setPresidentialSuite(int presidentialSuite) {
        this.presidentialSuite = presidentialSuite;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "deluxeDouble=" + deluxeDouble +
                ", deluxeTwin=" + deluxeTwin +
                ", boutiqueKing=" + boutiqueKing +
                ", jrSuite=" + jrSuite +
                ", suite=" + suite +
                ", presidentialSuite=" + presidentialSuite +
                '}';
    }
}
