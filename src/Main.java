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
    private static TrueTable trueTable;
    public static void main(String[] args) {
        zad12();
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
    public static void zad5(){
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
        int o =10;
        System.out.println("m = "+m);
        System.out.println("n = "+n);
        System.out.println("o = "+o);
        System.out.println("m < n = " + (m<n));
        System.out.println("m > o = " + (m>o));
        System.out.println("n <= o = " + (n<=o));
        System.out.println("m >= n = " + (m>=n));
        System.out.println("n == o = " + (n==o));
        System.out.println("m != o = " + (m!=o));
        System.out.println("~~~~~~~~~~~~~~~~~");

    }
    public void zad6(){}
    public static void zad7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień walca");
        int promien = scanner.nextInt();
        System.out.println("Podaj wysokość walca");
        int h = scanner.nextInt();
        System.out.println("pojemość walca wynosi:"+Math.PI*h*(promien*promien));
    }
    public static void zad8(){
        System.out.println("P    |    Q    |  AND  |   OR   |   XOR   |    NOT");
        System.out.println(TrueTable.ListOfTabel(true,true));
        System.out.println(TrueTable.ListOfTabel(true,false));
        System.out.println(TrueTable.ListOfTabel(false,true));
        System.out.println(TrueTable.ListOfTabel(false,false));

    }
    public void zad9(){

    }
    public void zad10(){}
    public static void zad11(){
        Vehicle miniVan = new Vehicle(6,35,8);
        Vehicle sportsCar = new Vehicle(4,61,19);
        System.out.println("Zasięg minivan: "+ (miniVan.fuelcap/miniVan.fuelUse)*100+"km");
        System.out.println("Zasięg sportCar: "+ (sportsCar.fuelcap/sportsCar.fuelUse)*100+"km");
    }
    public static void zad12(){
        Vehicle miniVan = new Vehicle(6,35,8);
        Vehicle sportsCar = new Vehicle(4,61,19);
        System.out.println("Przewozi: "+miniVan.getPassenger()+"osób\n"+miniVan.range1());
        System.out.println("Przewozi: "+sportsCar.getPassenger()+"osób\n"+sportsCar.range1());

    }
    public void zad13(){
        Vehicle miniVan = new Vehicle(6,35,8);
        Vehicle sportsCar = new Vehicle(4,61,19);
        System.out.println("MiniVan "+miniVan.range2());
        System.out.println("SportCar "+sportsCar.range1());

    }
    public void zad14(){
        Vehicle miniVan = new Vehicle(6,35,8);
        Vehicle sportsCar = new Vehicle(4,61,19);
        System.out.println("MiniVan "+miniVan.range2());
        System.out.println("SportCar "+sportsCar.range1());
    }
    public void zad15(){}

}
