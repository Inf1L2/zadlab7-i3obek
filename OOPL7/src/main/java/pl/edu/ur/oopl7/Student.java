package pl.edu.ur.oopl7;

public class Student extends Osoba {
    int nrIndeksu,rok;
    String typStudiow,kierunek;

    public Student(String imie, String nazwisko, String dataUrodzenia, String plec, int nrIndeksu, int rok, String typStudiow, String kierunek) {
        super(imie, nazwisko, dataUrodzenia, plec);
        this.nrIndeksu = nrIndeksu;
        this.rok = rok;
        this.typStudiow = typStudiow;
        this.kierunek = kierunek;
    }

    public Student(String imie, String nazwisko, String dataUrodzenia, String plec) {
        super(imie, nazwisko, dataUrodzenia, plec);
    }

    public Student(int nrIndeksu, int rok, String typStudiow, String kierunek) {
        this.nrIndeksu = nrIndeksu;
        this.rok = rok;
        this.typStudiow = typStudiow;
        this.kierunek = kierunek;
    }

    public Student() {
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public int getRok() {
        return rok;
    }

    public String getTypStudiow() {
        return typStudiow;
    }

    public String getKierunek() {
        return kierunek;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nrIndeksu=" + nrIndeksu +
                ", rok=" + rok +
                ", typStudiow='" + typStudiow + '\'' +
                ", kierunek='" + kierunek + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia='" + dataUrodzenia + '\'' +
                ", plec='" + plec + '\'' +
                '}';
    }
}