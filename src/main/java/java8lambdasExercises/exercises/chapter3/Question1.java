package java8lambdasExercises.exercises.chapter3;

import java8lambdasExercises.examples.chapter1.Album;
import java8lambdasExercises.examples.chapter1.Artist;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by kasia on 29/10/2017.
 */
public class Question1 {

    public static int addUp(Stream<Integer> numbers) {
        return numbers.reduce((x, y) -> x + y).orElse(0);
    }

    public static List<String> getNamesAndOrigins(List<Artist> artists) {
        return artists.stream()
                .map(artist -> artist.getName() + ", " + artist.getNationality())
                .collect(toList());
    }

    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> input) {
        return input.stream()
                .filter(album -> album.getTrackList().size() <= 3)
                .collect(toList());
    }
}
