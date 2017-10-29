package java8lambdasExercises.exercises.chapter3;

import java.util.List;
import java.util.Optional;

/**
 * Created by kasia on 29/10/2017.
 */
public class StringExercises {

    // Question 7
    public static int countLowercaseLetters(String string) {
        return (int) string.chars()
                .filter(Character::isLowerCase)
                .count();
    }

    // Question 8
    public static Optional<String> mostLowercaseString(List<String> strings) {
        return strings.stream()
                .reduce((x, y) -> countLowercaseLetters(x) >= countLowercaseLetters(y) ? x : y);
    }

}
