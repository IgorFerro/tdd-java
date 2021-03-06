package tdd.java;

public interface Expression {
    Money reduce(Bank bank, String to);

    public Expression plus(Expression addend);
}
