package interfaces;

/*
 * Created by kasia on 27/09/2015.
 */
interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}