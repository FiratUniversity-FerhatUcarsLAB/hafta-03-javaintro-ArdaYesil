import java.io.Console;

class Main {
    public static void main(String[] args) {

        int ToplamPara=278,İlkPara,Yüz=100,Elli=50,Yirmi=20,Beş=5,Bir;
        İlkPara=ToplamPara;

        Yüz = ToplamPara / Yüz; //Kaç tane 100tl olduğunu bulduk
        ToplamPara=ToplamPara-(Yüz*100); // içinde olan 100tlleri çıkardık

        Elli = ToplamPara / Elli; //Kaç tane 50tl olduğunu bulduk
        ToplamPara=ToplamPara-(Elli*50); // içinde olan 50tlleri çıkardık

        Yirmi = ToplamPara / Yirmi; //Kaç tane 20tl olduğunu bulduk
        ToplamPara = ToplamPara-(Yirmi*20); // içinde olan 20tlleri çıkardık

        Beş=ToplamPara / Beş; //Kaç tane 5tl olduğunu bulduk
        ToplamPara=ToplamPara-(Beş*5); // içinde olan 5tlleri çıkardık

        Bir=ToplamPara; // kalan parayı 1tl olarak atatık

        System.out.println(İlkPara+"TL = "+Yüz+"x100 "+Elli+"x50 "+Yirmi+"x20 "+Beş+"x5 "+Bir+"x1 "); // düzgün bir şekilde yazdırdık
    }
}
