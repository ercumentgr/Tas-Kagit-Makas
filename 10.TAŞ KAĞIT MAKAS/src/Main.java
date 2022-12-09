//TAŞ KAĞIT MAKAS OYUNU

import java.util.Scanner;

public class Main {
    public  static void main(String args []){
        System.out.println("Taş Kağıt Makas Oyununa Hoşgeldiniz...");
        int kul_puan=0;
        int pc_puan=0;
        Scanner girdi=new Scanner(System.in);
        while (true) {
            System.out.println("Lütfen Seçim Yapınız:(1-Taş 2-Kağıt 3-Makas)");
            int secim = girdi.nextInt();
            int bil_secim=(int)(Math.random()*3);
            if(secim==1){//TAŞ
                if(bil_secim==1){
                    System.out.println("Bilgisayarın Seçimi:Taş, Sonuç:Berabere");
                    kul_puan+=1;
                    pc_puan+=1;
                    System.out.println("Puanınız:"+kul_puan+"\nBilgisayar:"+pc_puan);
                }
                else if(bil_secim==2){
                    System.out.println("Bilgisayarın Seçimi:Kağıt, Sonuç:Bilgisayar Kazandı!");
                    pc_puan+=1;
                    System.out.println("Puanınız:"+kul_puan+"\nBilgisayar:"+pc_puan);
                }
                else{
                    System.out.println("Bilgisayarın Seçimi:Makas, Sonuç:Kazandın!");
                    kul_puan+=1;
                    System.out.println("Puanınız:"+kul_puan+"\nBilgisayar:"+pc_puan);
                }
            }
            else if (secim==2){//Kağıt
                if(bil_secim==1){
                    System.out.println("Bilgisayarın Seçimi:Taş, Sonuç:Kazandın!");
                    kul_puan+=1;
                    System.out.println("Puanınız:"+kul_puan+"\nBilgisayar:"+pc_puan);
                }
                else if(bil_secim==2){
                    System.out.println("Bilgisayarın Seçimi:Kağıt, Sonuç:Berabere");
                    System.out.println("Puanınız:"+kul_puan+"\nBilgisayar:"+pc_puan);
                }
                else {
                    System.out.println("Bilgisayarın Seçimi:Makas, Sonuç:Bilgisayar Kazandı!");
                    pc_puan+=1;
                    System.out.println("Puanınız:"+kul_puan+"\nBilgisayar:"+pc_puan);
                }
            }
            else{//MAKAS
                if(bil_secim==1){
                    System.out.println("Bilgisayarın Seçimi:Taş, Sonuç:Bilgisayar Kazandı!");
                    pc_puan+=1;
                    System.out.println("Puanınız:"+kul_puan+"\nBilgisayar:"+pc_puan);
                }
                if(bil_secim==2){
                    System.out.println("Bilgisayarın Seçimi:Kağıt, Sonuç:Kazandın!");
                    kul_puan+=1;
                    System.out.println("Puanınız:"+kul_puan+"\nBilgisayar:"+pc_puan);
                }
                if(bil_secim==3){
                    System.out.println("Bilgisayarın Seçimi:Makas, Sonuç:Berabere");
                    System.out.println("Puanınız:"+kul_puan+"\nBilgisayar:"+pc_puan);
                }
            }
        }
    }
}