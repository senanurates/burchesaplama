import java.util.Scanner;

public class burchesaplama {
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Doğum tarihinizi ay olarak giriniz: ");
        int month =input.nextInt();
        System.out.print("Doğum tarihinizi gün olarak giriniz: ");
        int day =input.nextInt();

        if(month>0 && month<13){
            if(month ==1){
                if(day<=31){
                    if(day<=21){
                    System.out.println("Burcunuz : Oğlak");
                    }
                    else{
                    System.out.println("Burcunuz : Kova");
                    }
                }
               else{
                System.out.println("Hatalı giriş yaptınız.");
               }
            }
            if(month ==2){
                if(day<=29){
                     if(day<=19){
                    System.out.println("Burcunuz : Kova");
                }
                else{
                    System.out.println("Burcunuz : Balık");
                }
                }
               else{
                System.out.println("Hatalı giriş yaptınız.");
               }
            }
            if(month ==3){
                if(day<31){
                     if(day<=20){
                    System.out.println("Burcunuz : Balık");
                }
                else{
                    System.out.println("Burcunuz : Koç");
                }
                }
               else{
                System.out.println("Hatalı giriş yaptınız.");
               }
            }
            if(month ==4){
                if(day<30){
                     if(day<=20){
                    System.out.println("Burcunuz : Koç");
                }
                else{
                    System.out.println("Burcunuz : Boğa");
                }
                }
               else{
                System.out.println("Hatalı giriş yaptınız.");
               }
            }
            if(month ==5){
                if(day<31){
                     if(day<=21){
                    System.out.println("Burcunuz : Boğa");
                }
                else{
                    System.out.println("Burcunuz : İkizler");
                }
                }
               else{
                System.out.println("Hatalı giriş yaptınız.");
               }
            }
            if(month ==6){
                if(day<30){
                     if(day<=22){
                    System.out.println("Burcunuz : İkizler");
                }
                else{
                    System.out.println("Burcunuz : Yengeç");
                }
                }
               else{
                System.out.println("Hatalı giriş yaptınız.");
               }
            }
            if(month ==7){
                if(day<31){
                     if(day<=22){
                    System.out.println("Burcunuz : Yengeç");
                }
                else{
                    System.out.println("Burcunuz : Aslan");
                }
                }
               else{
                System.out.println("Hatalı giriş yaptınız.");
               }
            }
            if(month ==8){
                if(day<31){
                     if(day<=22){
                    System.out.println("Burcunuz : Aslan");
                }
                else{
                    System.out.println("Burcunuz :Başak ");
                }
                }
               else{
                System.out.println("Hatalı giriş yaptınız.");
               }
            }
            if(month ==9){
                if(day<30){
                     if(day<=22){
                    System.out.println("Burcunuz : Başak");
                }
                else{
                    System.out.println("Burcunuz : Terazi");
                }
                }
               else{
                System.out.println("Hatalı giriş yaptınız.");
               }
            }
            if(month ==10){
                if(day<31){
                     if(day<=22){
                    System.out.println("Burcunuz : Terazi");
                }
                else{
                    System.out.println("Burcunuz : Akrep");
                }
                }
               else{
                System.out.println("Hatalı giriş yaptınız.");
               }
            }
            if(month ==11){
                if(day<30){
                     if(day<=21){
                    System.out.println("Burcunuz : Akrep");
                }
                else{
                    System.out.println("Burcunuz : Yay");
                }
                }
               else{
                System.out.println("Hatalı giriş yaptınız.");
               }
            }
            if(month ==12){
                if(day<31){
                     if(day<=21){
                    System.out.println("Burcunuz : Yay");
                }
                else{
                    System.out.println("Burcunuz : Oğlak");
                }
                }
               else{
                System.out.println("Hatalı giriş yaptınız.");
               }
            }

        }
        else{
            System.out.print("Hatalı giriş yaptınız.");
        }
            
        
    }
}