package com.company;

public class Main {

    public static void main(String[] args) {
        //--------------------------------------------
        int a = 1;    //целочисленные
        long b = 2;
        short c = 3;
        byte d = 4;

        float e = 5.1f;    //с плав. точкой
        double f = 6.1d;

        char g = 0;  //символ

        boolean h = true;  //логическое
        //--------------------------------------------
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        System.out.println("Вес двух боксеров: " + boxer1+boxer2);
        //--------------------------------------------
        int banana = 80;
        int milk = 105;
        int icecream = 100;
        int egg = 70;

        int blender =((banana*5)+(milk*2)+(icecream*2)+(egg*4));

        float shake;
        shake = ((float) blender /1000);
        System.out.println("Вес завтрака в кг: " + shake);
        //-----------------------------------------------
        float lowgramm = 0.25f;
        float highgram = 0.5f;
        float fastweightloss = 7/highgram;
        float slowweightloss = 7/lowgramm;
        float medweightloss = slowweightloss+ fastweightloss/2;
        System.out.println("Дней на потерю веса 250г/д: " + slowweightloss);
        System.out.println("Дней на потерю веса 500г/д: " + fastweightloss);
        System.out.println("Дней на потерю веса в среднем: " + medweightloss);
        //-------------------------------------------------
        int Masha = 67760;
        int Denis = 83690;
        int Cris = 76230;

        float Masha10 = (float) (Masha*0.1);
        float Denis10 = (float) (Denis*0.1);
        float Cris10 = (float) (Cris*0.1);
        System.out.format("Маша теперь получает %f рублей. Годовой доход вырос на %f рублей.\n", Masha+Masha10, Masha10*12);
        System.out.format("Денис теперь получает %f рублей. Годовой доход вырос на %f рублей.\n", Denis+Denis10, Denis10*12);
        System.out.format("Кристина теперь получает %f рублей. Годовой доход вырос на %f рублей.\n", Cris+Cris10, Cris10*12);
        //done
    }
}
