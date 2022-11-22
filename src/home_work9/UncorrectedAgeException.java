package home_work9;

public class UncorrectedAgeException extends Exception{
    public UncorrectedAgeException() {
    }

    public UncorrectedAgeException(String message) {
        super(message);
    }

    public UncorrectedAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UncorrectedAgeException(Throwable cause) {
        super(cause);
    }

    public UncorrectedAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
