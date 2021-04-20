package question2;

public class Substraction implements Expression {
    Expression op1;
    Expression op2;

    public Substraction(Expression op1, Expression op2) {
        this.op1 = op1;
        this.op2 = op2;
    }


    @Override
    public int interpreter() {
        return this.op1.interpreter() - this.op2.interpreter();
    }
}
