package com.maytemur.sinifvefonksyionlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.maytemur.sinifvefonksyionlar.databinding.ActivityMainBinding
import java.lang.NullPointerException

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var j = 5

        if(j==0){

            ilkFonksiyon()
        } else {
            ikinciFonksiyon()
        }

        cikarma (320,20)
        var x= toplama (70,20)
        binding.textView.text = "Sonuç : ${x}"
        println(x)

        binding.button.setOnClickListener {
            val toplamaSonucu = toplama (10,50)
            binding.textView.text ="Sonuç : ${toplamaSonucu}"
        }

        sinifCalismasi()
        nullGuvenligi()

    }
    fun ilkFonksiyon() {
        println ("ilk fonksiyon çalıştırıldı")
    }
    fun ikinciFonksiyon(){
        println("ikinci fonksiyon çalıştırıldı")
    }
    //Girdi Almak
    fun cikarma (x: Int,y: Int){
        binding.textView.text= "Sonuç : ${x-y}"
    }
    //Çıktı Vermek --- Döndürmek (Return)

    fun toplama (a: Int, b:Int) : Int {
        return a+b
    }
    /*
    fun degistir (view : View){
        val toplamaSonucu = toplama (40,50)
        textView.text = "Sonuç : ${toplamaSonucu}"
    } */

    fun sinifCalismasi(){

        var superman = Superkahraman("Superman",50,"Gazeteci")
        binding.textView.text = "Yaş : ${superman.yas}"
        println(superman.yas)
        println(superman.meslek)
        superman.testFonksiyonu()
        println(superman.sacRenginiAl())
    }
    fun nullGuvenligi(){
        //Null , nullability,null safety diye geçiyor- boş değer sahip değil
        // defining-tanımlama
        var benimString: String

        //initialization
        benimString ="Mustafa"
        var benimYasim : Int? = null
        println(benimYasim)
        //benimYasim=2

        // 1 nci yöntem null olduğunu anlamak için
        if (benimYasim != null){
            println(benimYasim*2)
        } else {
            println("null geldi")
        }

        //2
        // !! - null değil kendimden eminim demek ? - null olabilir demek programı çökmekten kurtarır
        println(benimYasim?.minus(2))

        //3 -elvis operatörü
        //benimYasim =10
        val sonuc=benimYasim?.minus(2) ?: 10
        println(sonuc)

        //4 -LET
        //benimYasim=5
        benimYasim?.let {
            println(it*5)
        }

    }
}