package ExceptionHandling;

public class CustomException extends Exception {
    public String getMessage() {
        return "Invalid Age Passed";
    }
}
