package ExceptionHandling;

public class InvalidAgeException extends Exception {
    public String getMessage() {
        return "Invalid Age Passed";
    }
}
