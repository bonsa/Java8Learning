package java8lambdasExercises.exercises.chapter4;

import java8lambdasExercises.examples.chapter1.Artist;

import java.util.List;
import java.util.Optional;

/**
 * Created by kasia on 29/10/2017.
 */
public class Artists {

    private List<Artist> artists;

    public Artists(List<Artist> artists) {
        this.artists = artists;
    }

    public Optional<Artist> getArtist(int index) {
        if (index < 0 || index >= artists.size()) {
            Optional.empty();
        }
        return Optional.of(artists.get(index));
    }

    public String getArtistName(int index) {
        Optional<Artist> artist = getArtist(index);
        return artist.map(Artist::getName)
                .orElse("unknown");
    }
}
