package question2;

public class LeafExpression implements Expression {
    private int value;

    public LeafExpression(int value) {
        this.value = value;
    }


    @Override
    public int interpreter() {
        return value;
    }

    public int getValue() {
        return value;
    }
}
