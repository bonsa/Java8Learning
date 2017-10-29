package java8lambdasExercises.examples.chapter1;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.concat;

public interface Performance {

    public String getName();

    public Stream<Artist> getMusicians();

    public default Stream<Artist> getAllMusicians() {
        return getMusicians()
                .flatMap(artist -> Stream.concat(Stream.of(artist), artist.getMembers()));
    }
}
