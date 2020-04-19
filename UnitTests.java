/**
 *  Midterm2 UnitTests
 *  Contains main method along with the static methods that
 *  handle Unit Testing
 *  CS108-4
 *  Date 4/18/20
 *  @author  Howen Anthony Fernando
 */

public class UnitTests {

    /**
     * Checks if the correct result is generated from multiplying by 5
     */
   private static void multiplyByFiveTest() {
       MiniCalculator mCalc = new MiniCalculator();
       mCalc.multiply(5);

       if (mCalc.calculate() != 5) {
           System.out.println("FAILED MULTIPLY BY FIVE TEST");
       }

       else {
           System.out.println("PASSED MULTIPLY BY FIVE TEST");
       }
   }

    /**
     * Checks that multiplying by zero returns zero
     */
   private static void multiplyByZero() {
       MiniCalculator mCalc = new MiniCalculator();
       mCalc.multiply(0);

       if (mCalc.calculate() != 0) {
           System.out.println("FAILED MULTIPLY BY ZERO TEST");
       }
       else {
           System.out.println("PASSED MULTIPLY BY ZERO TEST");
       }
   }

    /**
     * Checks that dividing by zero throws an exception
     * @throws ArithmeticException
     */
   private static void divideByZeroTest() throws ArithmeticException {
        MiniCalculator mCalc = new MiniCalculator();
        String exceptionMessage = "No Exception";
        try {
            mCalc.divide(0);
        }
        catch (ArithmeticException exception) {
            exceptionMessage = exception.getMessage();
            System.out.println(exceptionMessage);
        }

        if (exceptionMessage.compareTo("CANNOT DIVIDE BY ZERO") != 0) {
            System.out.println("FAILED DIVIDE BY ZERO TEST");
        }

        else {
            System.out.println("PASSED DIVIDE BY ZERO TEST");
        }
   }

    /**
     * Checks that the result of dividing by 2 is truncated to zero
     */
   private static void divideByTwoTest() {
       MiniCalculator mCalc = new MiniCalculator();
       mCalc.divide(2);

       if (mCalc.calculate() != 0) {
           System.out.println("FAILED DIVIDE BY TWO TEST");
       }

       else {
           System.out.println("PASSED DIVIDE BY TWO TEST");
       }
   }

    /**
     * Checks that 12 times 792 generates the result 9,504
     */
   private static void calculate12Times792Test() {
       MiniCalculator mCalc = new MiniCalculator();
       mCalc.multiply(12);
       mCalc.multiply(792);

       if (mCalc.calculate() != 9504) {
           System.out.println("FAILED CALCULATE 12 TIMES 792 TEST");
       }

       else {
           System.out.println("PASSED CALCULATE 12 TIMES 792 TEST");
       }
   }

    /**
     * Calls the unit test methods
     */
   public static void main(String[] args) {
        multiplyByFiveTest();
        multiplyByZero();
        divideByZeroTest();
        divideByTwoTest();
        calculate12Times792Test();
   }
}
