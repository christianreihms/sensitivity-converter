package com.christianreihms.sensitivityconverter.model;

public class ConverterModel {

    private float sens;
    private float cm;
    private float dpi;
    private float multiplier;

    public ConverterModel() {
    }

    public float getSens() {
        return sens;
    }

    public void setSens(float sens) {
        this.sens = sens;
    }

    public float getCm() {
        return cm;
    }

    public void setCm(float cm) {
        this.cm = cm;
    }

    public float getDpi() {
        return dpi;
    }

    public void setDpi(float dpi) {
        this.dpi = dpi;
    }

    public void setMultiplier(float multiplier) { this.multiplier = multiplier; }
    public float getMultiplier() {
        return multiplier;
    }
}
