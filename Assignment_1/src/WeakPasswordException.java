public class WeakPasswordException extends Exception {

    

    /**

     * This no-arg constructor defines the exception message for weak password.

     */

    public WeakPasswordException() {

        super("The password is OK but weak");

    }

}