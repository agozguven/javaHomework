package org.example;

import org.w3c.dom.ls.LSOutput;

public class BenzerKarakterBulma {
    public static void main(String[] args) {

        String birlesikMetin = "";
        boolean benzerKarakterBulundu = false;

        String[] metinler = {"izlem", "deniz", "iz"};
        //System.out.println(metinler[0].charAt(4));

        for (int y = 0; y < metinler.length - 1; y++) {
            for (int i = 0; i < metinler[y].length(); i++) {
                char j = metinler[y].charAt(i);
                for (int x = 0; x < metinler[y + 1].length(); x++) {
                    if (j == metinler[y + 1].charAt(x)) {
                        System.out.println(metinler[y + 1] + "deki " + metinler[y + 1].charAt(x) +" harfi ile " +  metinler[y]+ " deki " + j + " harfi aynıdır");
                        benzerKarakterBulundu = true;
                        birlesikMetin += j;

                    }
                }



            }
            if (benzerKarakterBulundu) {
                break;
            }

            }

        System.out.println("Yeni Metin: " + birlesikMetin);

        }
    }
