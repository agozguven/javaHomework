package org.example.ODEV9;

import java.io.IOException;



public class HataIsleme {

    public static void YasKontrol(int yas) throws ArithmeticException, IOException {
        if (yas < 18) {
            throw new IOException("Invalid age: " + yas);
        } else if (yas == 0) {
            throw new ArithmeticException("Age cannot be zero.");
        } else {
            System.out.println("Uygun yaş girdiniz. Teşekkürler. İşlemlere devam edebilirsiniz.");
        }
    }

    public static void main(String[] args) {
        try {
            YasKontrol(17);
        } catch (IOException e) {
            System.out.println("18 yaşından küçük girdiniz. " + e.getMessage());
        }

        try {
            YasKontrol(0);
        } catch (ArithmeticException | IOException e) {
            System.out.println("Yaş sıfır olamaz. " + e.getMessage());
        }

        try {
            YasKontrol(20);
        } catch (IOException e) {
            System.out.println("Düzgün yaş giriniz.");
        }
    }
}