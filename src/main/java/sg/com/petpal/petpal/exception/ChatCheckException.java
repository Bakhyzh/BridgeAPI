package sg.com.petpal.petpal.exception;

public class ChatCheckException extends RuntimeException{
    public ChatCheckException(Long id) {
        super("Owner with id '" + id + "' is not a chat room owner.");
    }
}
