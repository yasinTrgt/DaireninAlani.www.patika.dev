import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi = 3.14 , a ,r;

        Scanner sc = new Scanner(System.in);
        System.out.print("Dairenin Yarı Çapını Giriniz : ");
        r = sc.nextDouble();
        System.out.print("Alanını Öğrenmek İstediğiniz Dilimi Giriniz : ");
        a = sc.nextDouble();
        double alan = pi * r * r ;
        double cevre = 2 * pi * r ;
        double dilimAlani = (alan*a)/360;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
        System.out.println("Dilim Alanı : " + dilimAlani );
    }
}
