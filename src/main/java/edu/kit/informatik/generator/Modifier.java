package edu.kit.informatik.generator;

public enum Modifier {
    METHOD("+", "==method=="),
    STATE("#", "==state=="),
    PROP("#", "==props=="),
    STORE("~", null),

    ;

    private String sign;
    private String delimiter;

    Modifier(String sign, String delimiter) {
        this.sign = sign;
        this.delimiter = delimiter;
    }
}
