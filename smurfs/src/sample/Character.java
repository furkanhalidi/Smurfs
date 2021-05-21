
package sample;

public class Character {
    public int oyuncuID;
    public String oyuncuAdi;
    public String oyuncuTur;
    public int locationx;
    public int locationy;
    public int dusmanID;
    public String dusmanAdi;
    public String dusmanTur;

    public Character(int locationx, int locationy, int dusmanID, String dusmanAdi, String dusmanTur) {
        this.locationx = locationx;
        this.locationy = locationy;
        this.dusmanID = dusmanID;
        this.dusmanAdi = dusmanAdi;
        this.dusmanTur = dusmanTur;
    }

    public Character(int oyuncuID, String oyuncuAdi, String oyuncuTur, int locationx, int locationy) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.oyuncuTur = oyuncuTur;
        this.locationx = locationx;
        this.locationy = locationy;
    }

    public void EnKisaYol() {
    }

    public int getOyuncuID() {
        return this.oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return this.oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public String getOyuncuTur() {
        return this.oyuncuTur;
    }

    public void setOyuncuTur(String oyuncuTur) {
        this.oyuncuTur = oyuncuTur;
    }

    public int getLocationx() {
        return this.locationx;
    }

    public void setLocationx(int locationx) {
        this.locationx = locationx;
    }

    public int getLocationy() {
        return this.locationy;
    }

    public void setLocationy(int locationy) {
        this.locationy = locationy;
    }

    public int getDusmanID() {
        return this.dusmanID;
    }

    public void setDusmanID(int dusmanID) {
        this.dusmanID = dusmanID;
    }

    public String getDusmanAdi() {
        return this.dusmanAdi;
    }

    public void setDusmanAdi(String dusmanAdi) {
        this.dusmanAdi = dusmanAdi;
    }

    public String getDusmanTur() {
        return this.dusmanTur;
    }

    public void setDusmanTur(String dusmanTur) {
        this.dusmanTur = dusmanTur;
    }
}
