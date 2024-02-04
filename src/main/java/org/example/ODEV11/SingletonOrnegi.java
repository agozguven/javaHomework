package org.example.ODEV11;

public class SingletonOrnegi {

    private static SingletonOrnegi benzersizOrnek = null;
    private static int deger=0;

    private SingletonOrnegi() {
    }


    public  static SingletonOrnegi getInstance(){
        if(benzersizOrnek==null){
            benzersizOrnek = new SingletonOrnegi();
        }
        return benzersizOrnek;
    }

    public int degerArttir(int i){
        return deger =deger + i;
    }

    public int getDeger(){
        return deger;
    }
}
