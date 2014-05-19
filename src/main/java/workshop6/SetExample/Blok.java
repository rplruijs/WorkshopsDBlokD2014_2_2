package workshop6.SetExample;

/**
 * Created by remcoruijsenaars on 19/05/14.
 */
public class Blok {

    private int periode;
    private String naam;

    public Blok(int periode, String naam) {
        this.periode = periode;
        this.naam = naam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Blok)) return false;

        Blok blok = (Blok) o;

        if (periode != blok.periode) return false;
        if (naam != null ? !naam.equals(blok.naam) : blok.naam != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = periode;
        result = 31 * result + (naam != null ? naam.hashCode() : 0);
        return result;
    }
}
