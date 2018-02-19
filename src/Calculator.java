public class Calculator {

    private int value;

    Calculator(int initialValue) {
        this.value = initialValue;
    }

    public int getValue() {
        return value;
    }

    public void subtract(int amount) {
        this.value = this.value - amount;
    }

    public void mulitple(int amount) {
        this.value = this.value * amount;
    }

    public void divide(int amount) {
        this.value = this.value / amount;
    }

}
