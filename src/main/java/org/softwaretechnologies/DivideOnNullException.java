package org.softwaretechnologies;

public class DivideOnNullException extends Exception {
    public  DivideOnNullException(String s) {
        super(s);
    }

    public DivideOnNullException(Throwable cause) {
        super(cause);
    }
}
