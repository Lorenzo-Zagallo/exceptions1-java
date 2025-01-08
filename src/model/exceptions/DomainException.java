package model.exceptions;

// RuntimeException é uma exceção que o compilador não obriga você a tratar
// Exception faz com que o compilador obrigue você a tratar

import java.io.Serial;

public class DomainException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
