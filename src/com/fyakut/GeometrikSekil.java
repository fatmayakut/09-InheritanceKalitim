package com.fyakut;

public class GeometrikSekil {
    private int en;
    private int boy;

    public GeometrikSekil() {
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    @Override
    public String toString() {
        return "GeometrikSekil{" +
                "en=" + en +
                ", boy=" + boy +
                '}';
    }
}
