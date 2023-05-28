package session24;

//public class UserNotFoundException extends RuntimeException{
public class UserNotFoundException extends Exception{//checked exception

    private final String userId;

    public UserNotFoundException(String userId,Throwable cause) {
        super(cause);
        this.userId = userId;
    }
    public UserNotFoundException(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
}
