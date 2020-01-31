package com.company.chapter2;

public class Wheel {

    private float rim;
    private float tyre;

    public Wheel(float rim, float tyre) {
        this.rim = rim;
        this.tyre = tyre;
    }

    public float getRim() {
        return rim;
    }

    public void setRim(float rim) {
        this.rim = rim;
    }

    public float getTyre() {
        return tyre;
    }

    public void setTyre(float tyre) {
        this.tyre = tyre;
    }

    public float diameter() {
        return rim + (tyre*2);
    }

    public float circumference() {
        return (float) (Math.PI * diameter());
    }
}
