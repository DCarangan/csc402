//Multiplication.java
public class Multiplication implements Expression {
    private final Expression left, right;

    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        return getLeft().evaluate() * getRight().evaluate();
    }

    @Override
    public String print() {
        return "(" + getLeft().print() + " * " + getRight().print() + ")";
    }
	
	public Expression getLeft() {
		return left;
	}
	
	public Expression getRight() {
		return right;
	}
}
