package org.example.ODEV10;

public class GenericSinif {
    public static void main(String[] args) {
        Integer[] sayilarDizisi = {1,2,3,4,5};
        String[] stringDizisi= {"gokce","ozguven","umut"};

        DiziYazdir <String> StringYazdir = new DiziYazdir<String>();
        StringYazdir.yazdir(stringDizisi);

        DiziYazdir <Integer> sayiYazdir = new DiziYazdir<Integer>();
        sayiYazdir.yazdir(sayilarDizisi);

    }
}
