/**
 * A collection of utility methods for validating ages, withdrawing funds,
 * retrieving array elements, and validating email formatting.
 *
 * @author Akash K
 */
public class PracticeProblem {

    public static void main(String[] args) {}

    /**
     * Validates that an age is within a realistic human range.
     *
     * @param age the age value to validate
     * @return true if the age is valid
     * @throws IllegalArgumentException if the age is negative or greater than 150
     */
    public static boolean validateAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (age > 150) {
            throw new IllegalArgumentException("Age must be realistic");
        }
        return true;
    }

    /**
     * Withdraws an amount from the given balance.
     *
     * @param amount  the amount to withdraw
     * @param balance the current account balance
     * @return the remaining balance after withdrawal
     * @throws IllegalArgumentException if the withdrawal amount is zero or negative
     * @throws IllegalStateException if the withdrawal amount exceeds the current balance
     */
    public static double withdraw(double amount, double balance)
            throws IllegalArgumentException, IllegalStateException {

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (balance - amount <= 0) {
            throw new IllegalStateException("Insufficient funds: balance too low");
        }
        return balance - amount;
    }

    /**
     * Returns the element at the specified index of an integer array.
     *
     * @param array the array to access
     * @param index the index of the desired element
     * @return the array element at the given index
     * @throws NullPointerException if the array is null
     * @throws IndexOutOfBoundsException if the index is negative or beyond array bounds
     */
    public static int getElement(int[] array, int index)
            throws NullPointerException, IndexOutOfBoundsException {

        if (array == null) {
            throw new NullPointerException("Array cannot be null");
        }
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    /**
     * Validates an email string and returns a trimmed version if valid.
     *
     * @param email the email string to validate
     * @return the trimmed email if valid
     * @throws IllegalArgumentException if the email is null, empty,
     *         missing the '@' symbol, or missing a '.' following the '@'
     */
    public static String validateEmail(String email) throws IllegalArgumentException {

        if (email == null || email.length() == 0) {
            throw new IllegalArgumentException("Email cannot be empty");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (email.contains("@") && !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        return email.trim();
    }
}
