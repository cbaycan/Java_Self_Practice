package day04_selection_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        int num=6;

        if (num==1) {
        System.out.println("Hello, thank you for your call");
        } else if (num==2) {
            System.out.println("Hola, gracias por llamar");
        } else if (num==3) {
            System.out.println("Merhaba, aradığınız için teşekkürler");
        } else if (num==4) {
            System.out.println("Привет, спасибо за ваш звонок");
        } else if (num==5) {
            System.out.println("Merci, pour votre appel");
    }else System.out.println("invalid");
}
}
