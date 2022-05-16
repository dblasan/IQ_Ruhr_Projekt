package com.example.transactapp.db;

public class KatalogData {

    //private variables
    String fragnum;
    String Themenber;
    String Inhaltder;
    String Antwortbut;
    String AntwortWAHR;
    String AntwortNICHTWAHR;

    // Empty constructor
    public KatalogData(){

    }

    // constructor
    public KatalogData(String fragnum, String Themenber, String Inhaltder, String Antwortbut, String AntwortWAHR, String AntwortNICHTWAHR){
        this.fragnum = fragnum;
        this.Themenber = Themenber;
        this.Inhaltder = Inhaltder;
        this.Antwortbut = Antwortbut;
        this.AntwortWAHR = AntwortWAHR;
        this.AntwortNICHTWAHR = AntwortNICHTWAHR;

    }

    public String getFragnum() {
        return fragnum;
    }

    public void setFragnum(String fragnum) {
        this.fragnum = fragnum;
    }

    public String getThemenber() {
        return Themenber;
    }

    public void setThemenber(String themenber) {
        Themenber = themenber;
    }

    public String getInhaltder() {
        return Inhaltder;
    }

    public void setInhaltder(String inhaltder) {
        Inhaltder = inhaltder;
    }

    public String getAntwortbut() {
        return Antwortbut;
    }

    public void setAntwortbut(String antwortbut) {
        Antwortbut = antwortbut;
    }

    public String getAntwortWAHR() {
        return AntwortWAHR;
    }

    public void setAntwortWAHR(String antwortWAHR) {
        AntwortWAHR = antwortWAHR;
    }

    public String getAntwortNICHTWAHR() {
        return AntwortNICHTWAHR;
    }

    public void setAntwortNICHTWAHR(String antwortNICHTWAHR) {
        AntwortNICHTWAHR = antwortNICHTWAHR;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "KatalogInfo [fragnummer=" + fragnum + ", Themenbereich=" + Themenber + ", Inhalt=" + Inhaltder +
                ", Antwortbut=" + Antwortbut + ", AntwortWahr= " + AntwortWAHR + ", AntwortNICHTWAHR=" + AntwortNICHTWAHR + "]";
    }
}
