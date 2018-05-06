package pl.edu.ur.oopl7;

public class Wykladowca extends Student {
    String stopienNaukowy,wydzial;
    int lataPracy;

    public Wykladowca(String imie, String nazwisko, String dataUrodzenia, String plec, int nrIndeksu, int rok, String typStudiow, String kierunek, String stopienNaukowy, String wydzial, int lataPracy) {
        super(imie, nazwisko, dataUrodzenia, plec, nrIndeksu, rok, typStudiow, kierunek);
        this.stopienNaukowy = stopienNaukowy;
        this.wydzial = wydzial;
        this.lataPracy = lataPracy;
    }

    public Wykladowca(int nrIndeksu, int rok, String typStudiow, String kierunek, String stopienNaukowy, String wydzial, int lataPracy) {
        super(nrIndeksu, rok, typStudiow, kierunek);
        this.stopienNaukowy = stopienNaukowy;
        this.wydzial = wydzial;
        this.lataPracy = lataPracy;
    }

    public Wykladowca(String imie, String nazwisko, String dataUrodzenia, String plec, String stopienNaukowy, String wydzial, int lataPracy){
        super(imie ,nazwisko, dataUrodzenia, plec);
        this.stopienNaukowy = stopienNaukowy;
        this.wydzial = wydzial;
        this.lataPracy = lataPracy;
    }

    public Wykladowca(String stopienNaukowy, String wydzial, int lataPracy){
        this.stopienNaukowy = stopienNaukowy;
        this.wydzial = wydzial;
        this.lataPracy = lataPracy;
    }

    public Wykladowca() {
    }

    public String getStopienNaukowy() {
        return stopienNaukowy;
    }

    public String getWydzial() {
        return wydzial;
    }

    public int getLataPracy() {
        return lataPracy;
    }

    @Override
    public String toString() {
        return "Wykladowca{" +
                "stopienNaukowy='" + stopienNaukowy + '\'' +
                ", wydzial='" + wydzial + '\'' +
                ", lataPracy=" + lataPracy +
                ", nrIndeksu=" + nrIndeksu +
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
