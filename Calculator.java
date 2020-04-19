/**
 *  Midterm2 UnitTests
 *  Abstract class that implements the Divider and Multiplier Interfaces.
 *  Specifies how the multiply and divide methods operate
 *  CS108-4
 *  Date 4/18/20
 *  @author  Howen Anthony Fernando
 */

public abstract class Calculator implements Divider, Multiplier {
    protected int total;

    public Calculator() {
        total = 1;
    }

    /**
     * Stores the product of the parameter y and the total as
     * the new total
     * @param y - int value to multiply the total
     */
    @Override
    public void multiply(int y) {
        total *= y;
    }

    /**
     * Stores the quotient of the the total divided by the parameter y
     * as the new total
     * @param y - int value to divide the total by
     * @throws ArithmeticException
     */
    @Override
    public void divide(int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("CANNOT DIVIDE BY ZERO");
        }
        else {
            total /= y;
        }
    }

    protected abstract int calculate();     // Implemented in MiniCalculator

}

