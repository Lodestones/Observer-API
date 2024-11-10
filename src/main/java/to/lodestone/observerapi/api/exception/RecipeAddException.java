package to.lodestone.observerapi.api.exception;

public class RecipeAddException extends Exception {
    private final Type type;

    public RecipeAddException(String message, Type type) {
        super(message);
        this.type = type;
    }

    public Type type() {
        return type;
    }

    public enum Type {
        INVALID_NAMESPACED_KEY,
        ID_ALREADY_USED,
        SERVER_REFUSED_RECIPE,
    }
}
