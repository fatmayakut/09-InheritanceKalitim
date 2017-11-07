package com.fyakut;

public class Kare extends GeometrikSekil {
    //anne ve babada olmayan özelliğin çocukta olması

    private int yukseklik;

    //private int en,boy; yazmama gerek kalmadı GeometrikSekil den miras aldı
    //override: bir sınıfın kendisinden bir üst sınıf olan metodu aynı ifadeyi
    // aynı değişkenler ile kendi içerisinde gerçekleştirmesi demektir


   /**   //aynı metot(toString) bir üst sınıfta olduğu için onu ezer ovirrede eder.
    * Ekranda üst sınıf toString değil bu toString verilir
    *
    * @Override
   public String toString() {
        return "Kare nin boyu"+this.getBoy(); // çocuğun baba ya da anneden uzun olması
    }*/



}
