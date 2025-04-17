//Number.java
public class Number implements Expression {
    private final int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return getValue();
    }

    @Override
    public String print() {
        return String.valueOf(getValue());
    }
	
	public int getValue() {
		return value;
	}
}
