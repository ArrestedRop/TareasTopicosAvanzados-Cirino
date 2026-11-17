package Tarea64;

import java.util.EventObject;


public class MagicEvent extends EventObject {
    private final String message;

    public MagicEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

