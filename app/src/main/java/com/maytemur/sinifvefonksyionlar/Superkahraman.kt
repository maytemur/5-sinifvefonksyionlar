package com.maytemur.sinifvefonksyionlar

class Superkahraman(var isim: String, var yas: Int, var meslek: String) { //(Primary Constructor)

    private var sacininRengi = "Mavi"

    fun testFonksiyonu() {
        println("test")
    }
    //getter ------------- saçının rengini alıp yazdırabilsin ama değişteremesin istersek

    fun sacRenginiAl(): String {
        return this.sacininRengi
    }
    //Setter
    /*
    fun sacRenginiDegistir(){
        this.sacininRengi ="Turuncu"
    }
     */

    // Access Levels - Erişebilirlik Seviyeleri
    // private - protected - internal - public
    //private - sadece yazdığım sınıf içerisinden kullanılabilir başka yerden erişim sağlayamazsın
    //protected - aynı dosya içince olmak kaydıyla başka classdan da erişilebilir
    //internal - sadece kendi modüllerimiz içinden erişilebilir - dış kütüphanelerden ulaşılamaz
    // public- her yerden ulaşılabilir


    /*
    //Property - sınıf elemanlarının özellikleri
    var isim = ""
    var meslek = ""
    var yas = 0

    //Constructor - inşa etmek yapıyı inşa etmek bir sınıftan bir nesne oluşturduğumuzda çağrılan fonksiyondur
    constructor(isim: String, yas: Int, meslek: String){
        this.isim = isim
        this.yas = yas
        this.meslek= meslek

        println("constructor çağrıldı")
    } */
}