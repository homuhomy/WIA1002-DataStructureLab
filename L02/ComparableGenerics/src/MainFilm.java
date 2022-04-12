import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainFilm {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("A", 2000));
        films.add(new Film("B", 1999));
        films.add(new Film("C", 2001));
        films.add(new Film("D", 2000));

        /*
            for (type variableName : arrayName) {
                // code block to be executed
            }
        */

        for (Film e: films) {
            System.out.println(e);
        }

        Comparator<Film> comparator = Comparator.comparing(Film::getReleaseYear)
                .thenComparing(Film::getName);

        Collections.sort(films, comparator);

        System.out.println("\n");

        for (Film e: films) {
            System.out.println(e);
        }
    }
}
