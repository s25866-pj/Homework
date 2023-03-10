import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        zad11();

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
        int tab [] = new int[3];
        int temp;
        for (int i = 0; i < tab.length; i++) {
            tab[i]=scanner.nextInt();
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j = 1; j < tab.length; j++) {
                if(tab[j-1]>tab[j]){
                    temp = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j]=temp;
                }
            }

        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]+", ");
        }
        System.out.println();
        for (int i = tab.length-1; i >=0 ; i--) {
            System.out.print(tab[i]+", ");
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
        for (int i = 0; i < x; i++) {
            for (int j = x-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 3; i >0 ; i--) {
            for (int j = x-i; j >0 ; j--){
                System.out.print(" ");
            }
            for (int j = i; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < x; i++) {
            for (int j = (x-i)-1; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void zad9(){
        Scanner scanner = new Scanner(System.in);
        String palindrom = scanner.nextLine();
        int miss = 0;
        for (int i =0;i<(palindrom.length()/2);i++){
            if(!(palindrom.charAt(i)==palindrom.charAt((palindrom.length()-i)-1))){
                miss++;
            }
        }
        if(miss>0){
            System.out.println("NIE");
        }else {
            System.out.println("TAK");
        }
    }
    public static void zad10(){
        Scanner scanner = new Scanner(System.in);
        int wymiarA = scanner.nextInt();
        int wymiarB = scanner.nextInt();
        int macierz [][]=new int[wymiarA][wymiarB];
        int macierz2 [][]=new int[wymiarB][wymiarA];
        for (int i = 0; i < wymiarA; i++) {
            for (int j = 0; j < wymiarB; j++) {
                macierz[i][j]=scanner.nextInt();
            }
        }
        for (int i = 0; i < wymiarB; i++) {
            for (int j = 0; j < wymiarA; j++) {
                System.out.print(macierz[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void zad11(){
//        97-122 a-z
        Scanner scanner = new Scanner(System.in);
        String panagram = scanner.nextLine();
        panagram = panagram.toLowerCase();
        panagram=panagram.replaceAll(" ","");
        char [] alphabeth= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char arr[]= panagram.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j-1]>arr[j]){
                    char temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int exist=0;
        int tempExist = 0;
        for (int i = 0; i < alphabeth.length; i++) {
            for (int j = 0; j < arr.length; j++) {
//                System.out.println(i+":"+alphabeth[i]+" ? "+j+":"+arr[j]);
                if(alphabeth[i]==arr[j]){
                    tempExist++;
                }
            }
            if(tempExist>0){
                exist++;
            }
            tempExist = 0;
        }
        if(exist == alphabeth.length){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
//        System.out.println(arr);
//        System.out.println(alphabeth);


    }
    public static void zad12(){}
    public static void zad13(){}
}
