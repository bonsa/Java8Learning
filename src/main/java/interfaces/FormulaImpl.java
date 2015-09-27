package interfaces;

/**
 * Created by kasia on 27/09/2015.
 */
public class FormulaImpl implements Formula
{
    public double calculate(int a) {
        return sqrt(a * 100);
    }
}
