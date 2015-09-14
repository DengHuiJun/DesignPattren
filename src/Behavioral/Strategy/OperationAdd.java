package Behavioral.Strategy;

/**
 * Created by zero on 15-9-14.
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
