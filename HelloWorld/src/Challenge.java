public class Challenge {

    public static void main(String[] args) {

        // create a double variable with a value of 20.00
        double myFirstValue = 20.00d;

        // create a second variable of type double with a value 80.00
        double mySecondValue = 80.00d;

        // add both numbers together, then multiply bt 100.00
        double myValuesTotal = myFirstValue + mySecondValue * 100.00d;
        System.out.println("myValuesTotal = " + myValuesTotal);

        // use the remainder operator, to figure out what the remainder from the
        // result of the operation in step three and 40.00 will be.
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);

        // create a boolean variable that assigns the value true, if the remainder
        // in step four is 0.00 or false if it's not zero.
        boolean isNoRemainder = (theRemainder == 0) ? true: false;

        // output the boolean variable just ti see what the result is.
        System.out.println("isNoRemainder = " + isNoRemainder);

        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }
    }
}
