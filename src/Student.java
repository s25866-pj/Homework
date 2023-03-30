public class Student {
    String imie;
    String nazwisko;
    int grupa;
    String kierunek;

    public Student(String imie,String nazwisko,int grupa,String kierunek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.grupa = grupa;
        this. kierunek = kierunek;
    }
//    public dwa.Student(){}
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getGrupa() {
        return grupa;
    }

    public void setGrupa(int grupa) {
        this.grupa = grupa;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }
}
