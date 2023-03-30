import java.util.Scanner;

public class Main {
    static String str;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean b;
    public static void main(String[] args) {
        zad4();
    }
    public static void zad1(){
        Student ja = new Student("Damian","Grzesiak",5,"informatyka");
        System.out.println(
                "imie: "+ ja.getImie()
                +"\nnazwisko: "+ ja.getNazwisko()
                +"\ngrupa: "+ ja.getGrupa()
                +"\nkierunek: "+ ja.getKierunek()
        );
    }
    public static void zad2(){
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student("","",0,"");
        System.out.println("Podaj Imie");
        student1.setImie(scanner.nextLine());
        System.out.println("Podaj Nazwisko");
        student1.setNazwisko(scanner.nextLine());
        System.out.println("Podaj Kierunek");
        student1.setKierunek(scanner.nextLine());
        System.out.println("Podaj Grupę");
        student1.setGrupa(scanner.nextInt());

        System.out.println(
                "nowy student:\nimie: "+ student1.getImie()
                +"\nnazwisko: "+ student1.getNazwisko()
                +"\ngrupa: "+ student1.getGrupa()
                +"\nkierunek: "+ student1.getKierunek()
        );

    }
    public static void zad3(){
        System.out.println("short s = "+s);
        System.out.println("int i = "+i);
        System.out.println("long l = "+l);
        System.out.println("float f = "+f);
        System.out.println("double d = "+d);
        System.out.println("char c = "+c);
        System.out.println("String str = "+str);
        System.out.println("boolean b = "+b);
    }
    public static void zad4(){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        boolean wynik =str1 == str2;
        System.out.println(str1+" == "+ str2+"\n"+ wynik);
        wynik = str1.equals(str2);
        System.out.println(str1+".equals("+ str2+"): "+ wynik);
    }
    public void zad5(){
        int x = 5;
        int y = 10;
        System.out.println("x = " +x);
        System.out.println("y = " +y);
        System.out.println("++x = "+ ++x);
        System.out.println("y++ = "+ y++);
        System.out.println("x = " +x);
        System.out.println("y = " +y);
        System.out.println("~~~~~~~~~~~~~~~~~");
        double w= 33.5;
        double z= 17.3;
        System.out.println("w = "+w);
        System.out.println("z = "+z);
        System.out.println("w + z = "+ (w+z));
        System.out.println("w - z = "+ (w-z));
        System.out.println("w * z = "+(w*z));
        System.out.println("w / z = "+(w/z));
        System.out.println("w % z = "+(w%z));
        System.out.println("~~~~~~~~~~~~~~~~~");
        int m =3;
        int n =17;
        int o =0;

    }
    public void zad6(){}
    public void zad7(){}
    public void zad8(){}
    public void zad9(){}
    public void zad10(){}
    public void zad11(){}
    public void zad12(){}
    public void zad13(){}
    public void zad14(){}
    public void zad15(){}

}
