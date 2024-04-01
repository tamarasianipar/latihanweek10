package model;

public class Lingkaran implements Keliling{
    private double jarijari;
    
    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }
    
    public double hitungkeliling() {
        return 2 * Math.PI * jarijari;
    }
}
