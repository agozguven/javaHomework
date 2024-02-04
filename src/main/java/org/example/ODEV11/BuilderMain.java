package org.example.ODEV11;

public class BuilderMain {

    public static void main(String[] args) {
        Ev ev = Ev.EvBuilder.anEv()
                .withBalkonSayisi(3)
                .withBinaYili(10)
                .withIl("Ankara")
                .withIlce("Çankaya")
                .withMahalle("Mutluköy")
                .withTuvaletSayisi(3)
                .withOdaSayisi(4)
                .build();

        System.out.println(ev.toString());


    }






}
