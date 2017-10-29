package java8lambdasExercises.exercises.chapter3;

import java8lambdasExercises.examples.chapter1.Artist;

import java.util.List;

/**
 * Created by kasia on 29/10/2017.
 */
public class Question2 {

    public static int countBandMembersInternal(List<Artist> artists) {
        return (int) artists.stream()
                .flatMap(artist -> artist.getMembers())
                .count();
    }

}
