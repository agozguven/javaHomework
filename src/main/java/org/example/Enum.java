package org.example;

public class Enum {

    public enum Gunler{
        PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESIİ, PAZAR
    }

    public static void main(String[] args) {
        System.out.println("Bugün günlerden " + Gunler.PERSEMBE);

        for(Gunler gun : Gunler.values()){
            System.out.println(gun);
        }

        for(int i =0; i< Gunler.values().length; i++){
            System.out.println(Gunler.valueOf("CUMA"));
        }
    }
}
