package model;

public class Persegi implements Keliling{
    private double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    public double hitungkeliling() {
        return 4 * sisi;
    }
}
