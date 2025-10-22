class Main {
    public static void main(String[] args) {
        int saniye=3665,dakika,saat,ilksaniye;
        ilksaniye=saniye; //ilk saniyeyi bir değişkene atıyoruz

        saat= saniye / 3600; // saniyenin içinde kaç saat var diye bakıyoruz.
        saniye = saniye-(saat*3600); // saniyenin içindeki saati çıkartıyoz

        dakika= saniye / 60; // saniyenin içinde kaç dakika var diye bakıyoruz.
        saniye = saniye-(dakika*60); // saniyenin içindeki dakikayı çıkartıyoz
      //saniye değişkeninde kalanda saniye oluyor

        System.out.println(ilksaniye+" saniye = "+saat+" saat "+dakika+" dakika "+saniye+" saniyeye eşittir."); // düzenli ve güzel bir şekilde yazdırıyoruz
    }
}
