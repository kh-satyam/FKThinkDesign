package com.company.chapter2;

public class Gear {

    private int chainRing;
    private int cog;
    private int tyre;
    private int rim;

    public Gear(int chainRing, int cog, int tyre, int rim) {
        this.chainRing = chainRing;
        this.cog = cog;
        this.tyre = tyre;
        this.rim = rim;
    }

    public int getChainRing() {
        return chainRing;
    }

    public void setChainRing(int chainRing) {
        this.chainRing = chainRing;
    }

    public int getCog() {
        return cog;
    }

    public void setCog(int cog) {
        this.cog = cog;
    }

    public int getTyre() {
        return tyre;
    }

    public void setTyre(int tyre) {
        this.tyre = tyre;
    }

    public int getRim() {
        return rim;
    }

    public void setRim(int rim) {
        this.rim = rim;
    }

    public float ratio() {
        return chainRing/(1f * cog);
    }

    public float getGearInches() {
        return ratio() * (rim + (tyre*2));
    }

}
