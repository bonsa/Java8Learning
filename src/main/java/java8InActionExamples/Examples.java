package java8InActionExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;


public class Examples {
    List<Transaction> transactions;

    public void prepareData() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }

    public void example1() {
        transactions.stream().filter(transaction->transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(toList());
    }

    public void example2() {
        transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());

    }

    public void example3() {
        transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(toList());

    }

    public void example4() {
        transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (n1, n2) -> n1 + n2);

    }

    public void example5() {
        transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getName().equals("Milan"));
    }

    public void example6() {
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(transaction -> transaction.getValue())
                .forEach(System.out::println);
    }

    public void example7() {
        transactions.stream()
                .map(transaction -> transaction.getValue())
                .reduce((v1, v2) -> Integer.max(v1, v2));
    }

    public void example8() {
        transactions.stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
    }

}
