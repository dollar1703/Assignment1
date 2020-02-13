

public class InvalidSequenceException extends Exception {

    

    /**

     * This no-arg constructor defines the exception message for invalid sequence.

     */

    public InvalidSequenceException() {

        super("The password may not have more than "

                + "two of the same character in sequence");

    }

}