import java.util.Scanner;
//anprus@pjwstk.edu.pl
//pczapiewski@pjwstk.edu.pl
public class Main {
    public static void main(String[] args) {
zad8();

    }
    public static void zad1(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a+b);
    }
    public static void zad2(){

        System.out.println(String.format("%.2f",Math.sqrt(Math.PI)));
    }
    public static void zad3(){
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        String [] splited = temp.split(" ");
        System.out.println("\"%"+splited[1]+" "+splited[0]+"%\"");
    }
    public static void zad4(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a<=0 || b<=0 ||c<=0){
            System.out.println("BŁĄD");
        }else if(a+c>b && a+b>c && b+c>a){
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }
    }
    public static void zad5(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch(number){
            case 1: System.out.println("Styczeń 31");break;
            case 2: System.out.println("Luty 28");break;
            case 3: System.out.println("Marzec 31");break;
            case 4: System.out.println("Kwiecień 30");break;
            case 5: System.out.println("Maj 31");break;
            case 6: System.out.println("Czerwiec 30");break;
            case 7: System.out.println("Lipiec 31");break;
            case 8: System.out.println("Sierpień 30");break;
            case 9: System.out.println("Wrzesień 31");break;
            case 10: System.out.println("Październik 30");break;
            case 11: System.out.println("Listopad 31");break;
            case 12: System.out.println("Grudzień 30");break;
            default: System.out.println("BŁĄD");break;
        }
    }
    public static void zad6(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a>b && a>c){
            System.out.println(a);
            if(b>c){
                System.out.println(b);
                System.out.println(c);
            }else{
                System.out.println(c);
                System.out.println(b);
            }
        } else if (b>a &&b>c) {
            System.out.println(b);
            if(a>c){
                System.out.println(a);
                System.out.println(c);
            }else{
                System.out.println(c);
                System.out.println(a);
            }
        }else{
            System.out.println(c);
            if(a>b){
                System.out.println(a);
                System.out.println(b);
            }else {
                System.out.println(b);
                System.out.println(a);
            }
        }
        if(a>b && a>c){
            System.out.println(a);
            if(b>c){
                System.out.println(b);
                System.out.println(c);
            }else{
                System.out.println(c);
                System.out.println(b);
            }
        } else if (b>a &&b>c) {
            System.out.println(b);
            if(a>c){
                System.out.println(a);
                System.out.println(c);
            }else{
                System.out.println(c);
                System.out.println(a);
            }
        }else{
            System.out.println(c);
            if(a>b){
                System.out.println(a);
                System.out.println(b);
            }else {
                System.out.println(b);
                System.out.println(a);
            }
        }



        if(a<b && a<c){
            System.out.println(a);
            if(b<c){
                System.out.println(b);
                System.out.println(c);
            }else{
                System.out.println(c);
                System.out.println(b);
            }
        } else if (b<a &&b<c) {
            System.out.println(b);
            if(a<c){
                System.out.println(a);
                System.out.println(c);
            }else{
                System.out.println(c);
                System.out.println(a);
            }
        }else{
            System.out.println(c);
            if(a<b){
                System.out.println(a);
                System.out.println(b);
            }else {
                System.out.println(b);
                System.out.println(a);
            }
        }

    }
    public static void zad7(){}
    public static void zad8(){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 1; i < x+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = x; i > 1 ; i--) {
            for (int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = x; i >0; i--) {
            for (int j = 0; j < ; j++) {
                
            }
            System.out.print("*");
        }
    }
    public static void zad9(){}
    public static void zad10(){}
    public static void zad11(){}
    public static void zad12(){}
    public static void zad13(){}
    public static void zad14(){}
    public static void zad15(){}
}