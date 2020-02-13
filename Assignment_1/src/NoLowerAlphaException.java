public class NoLowerAlphaException extends Exception {

    

    /**

     * This no-arg constructor defines the exception message for no lower alpha.

     */

    public NoLowerAlphaException() {

        super("The password must contain one lowercase alphabet character");

    }

}