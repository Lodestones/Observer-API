package to.lodestone.observerapi.api.exception;

public class PedestalAddException extends Exception {
    private final Type type;

    public PedestalAddException(String message, Type type) {
        super(message);
        this.type = type;
    }

    public Type type() {
        return type;
    }

    public enum Type {
        ID_ALREADY_USED;
    }
}
