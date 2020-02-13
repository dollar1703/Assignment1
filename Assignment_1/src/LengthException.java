public class LengthException extends Exception {

    

    /**

     * This no-arg constructor defines the exception message for length.

     */

    public LengthException() {

        super("The password's length must be at least 6");

    }

}