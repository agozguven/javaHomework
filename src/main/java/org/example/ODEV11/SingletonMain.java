package org.example.ODEV11;

public class SingletonMain {

    public static void main(String[] args) {
        SingletonOrnegi ornek1 = SingletonOrnegi.getInstance();
        SingletonOrnegi ornek2 = SingletonOrnegi.getInstance();

        ornek1.degerArttir(1);
        ornek2.degerArttir(3);

        System.out.println(ornek1.getDeger());
    }
}
