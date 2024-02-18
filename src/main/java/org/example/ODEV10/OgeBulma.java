package org.example.ODEV10;

import java.util.Optional;
import java.util.stream.Stream;

public class OgeBulma {

    public static <T> Object ogeBulma(T[] array, T bulunacakOge) {
        Optional<T> optionalItem = Stream.of(array)
                .filter(item -> item.equals(bulunacakOge))
                .findFirst();
        return optionalItem.isPresent() ? optionalItem.get() : -1;
    }

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5};
        Object bulunanOge = ogeBulma(numbers, 5);
        System.out.println("Bulunan öğe: " + bulunanOge);
        Object bulunanOge2 = ogeBulma(numbers, 7);
        System.out.println("Bulunan öğe: " + bulunanOge2);
    }
}

