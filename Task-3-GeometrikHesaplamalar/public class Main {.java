import javax.swing.plaf.synth.SynthDesktopIconUI;

class Main {
    public static void main(String[] args) {

        double r = 5.5;
        double pi = 3.14159;
        double Dairealan = pi * r * r ;
        double Dairecevre = 2 * pi * r ;
        System . out . println (" Yaricap : " + r ) ;
        System . out . println (" Alan : " + Dairealan ) ;
        System . out . println (" Cevre : " + Dairecevre ) ;

        System.out.println("");

        double KısaKenar=4.5;
        double UzunKenar = 7.9;
        double Dikdörtgenalan = KısaKenar*UzunKenar;
        double cevre = 2 *(KısaKenar+UzunKenar) ;
        System.out.println("Dikdörtgenin Alanı :"+Dikdörtgenalan);
        System.out.println("Dikdörtgenin Çevresi :"+cevre);

         System.out.println("");
         
         int a=3,b=4,c=5;
         double s;
         s=(a+b+c)/2;
         double alan=Math.sqrt(s*(s-a)*(s-b)*(s-c));


         System.out.println("Üçgenin Çevresi : "+s*2 );
         System.out.println("Üçgenin Alanı : "+alan);
    }
}
