class Main {
    public static void main(String[] args) {
         int a=3,b=4,c=5;
         double s;
         s=(a+b+c)/2;
         double alan=Math.sqrt(s*(s-a)*(s-b)*(s-c));


         System.out.println("Üçgenin Çevresi : "+s*2 );
         System.out.println("Üçgenin Alanı : "+alan);
    }
}
