package question3;

public class LeafExpression implements Expression {
    private int value;

    public LeafExpression(int value) {
        this.value = value;
    }


    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }

    public int getValue() {
        return value;
    }
}
