package com.company.chapter3;

public class Gear {

    private int chainRing;
    private int cog;
    private Wheel wheel;

    public Gear(int chainRing, int cog, Wheel wheel) {
        this.chainRing = chainRing;
        this.cog = cog;
        this.wheel = wheel;
    }

    public Gear(int chainRing,int cog,int rim,int tire) {
        this.chainRing = chainRing;
        this.cog = cog;
        wheel = new Wheel(rim,tire);
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

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public float ratio() {
        return chainRing/(1f * cog);
    }

    public float getGearInches() {
        return ratio() * wheel.diameter();
    }

}

