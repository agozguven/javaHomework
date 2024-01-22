package org.example;

public enum EnumPlanets {
    MARS(4, 227.9, 3389.5, 687),
    EARTH(3, 149.6, 6371, 365),
    VENUS(2, 108.2, 6051.8, 225),
    MERCURY(1, 57.9, 2439.7, 88),
    SATURN(5, 267.8, 3588.5, 890);

    private final int siralama;
    private final double uzaklik;
    private final double yaricap;
    private final int donmeSuresi;

    EnumPlanets(int siralama, double uzaklik, double yaricap, int donmeSuresi) {
        this.siralama = siralama;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    public int getSiralama() {
        return siralama;
    }

    public double getUzaklik() {
        return uzaklik;
    }

    public double getYaricap() {
        return yaricap;
    }

    public int getDonmeSuresi() {
        return donmeSuresi;
    }

    public String toString() {
        return this.name() + " - Sıralama: " + siralama +
                ", Uzaklık: " + uzaklik + " milyon km" +
                ", Yarıçap: " + yaricap + " km" +
                ", Dönme Süresi: " + donmeSuresi + " gün";
    }

    

    public static void main(String[] args) {
        // Örnek gezegenlerin bilgilerini yazdırma
        System.out.println(EnumPlanets.MERCURY);
        System.out.println(EnumPlanets.VENUS);
        System.out.println(EnumPlanets.EARTH);
        System.out.println(EnumPlanets.MARS);
        System.out.println(EnumPlanets.SATURN);
    }
}
