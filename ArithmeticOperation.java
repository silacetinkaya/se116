public class ArithmeticOperation {
    private int operand1;
    private int operand2;

    public ArithmeticOperation(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public int getOperand2() {
        return operand2;
    }

    public int add() {
        return operand1 + operand2;
    }

    public int subtract() {
        return operand1 - operand2;
    }

    public int multiply() {
        if (operand1 == 0 || operand2 == 0) {
            throw new ArithmeticException("Multiplication cannot be performed with zero operand.");
        }
        return operand1 * operand2;
    }

    public double divide() {
        if (operand1 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) operand2 / operand1;
    }
}
