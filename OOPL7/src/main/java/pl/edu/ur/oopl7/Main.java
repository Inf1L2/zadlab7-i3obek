package pl.edu.ur.oopl7;

public class Main {

    public static void main(String[] args) {
        Osoba os = new Osoba("Albert","Wielki","5.V.1980","Gender");
        Student st = new Student("Wojo","Maly","2.I.1994","Mężczyzna",25801,2,"Inżynierskie","Mechatronika");
        Wykladowca wyk = new Wykladowca("Człowiek","Mądry","1.II.1973","Kobieta","Doktor","Przyrodniczy",7);

        System.out.println("Hello World!");

        System.out.println(os);
        System.out.println(st);
        System.out.println(wyk);
    }
}
