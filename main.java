import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanici Adiniz :");
        userName = input.nextLine();

        System.out.println("Şifreniz :");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız.");
         }else if (userName.equals("patika")){
            int select;
            String newPassword;
            System.out.println("Hatalı giriş yaptınız.Şifrenizi sıfırlamak ister misiniz?\n1-Evet\n2-Hayır");
            System.out.println("Seçiminiz:");
            select = input.nextInt();
            input.nextLine();

            switch (select){
                case 1:
                    System.out.println("Yeni Sifrenizi giriniz ?");
                    newPassword = input.nextLine();

                    if(newPassword.equals("java123") && newPassword.equals("password")){
                        System.out.println("Sifre olusturulamadi. Lutfen baska bir sifre olusturun.");
                    }
                    else{
                        System.out.println("Sifre olusturuldu");

                    }
                    break;
                case 2:
                    System.out.println("Şifre Sıfırlanmadı");
                    break;
                default:
                    System.out.println("Hata olustu !");
            }
        }else{
            System.out.println("Bilgileriniz Yanlış !");

            }
         }
}
