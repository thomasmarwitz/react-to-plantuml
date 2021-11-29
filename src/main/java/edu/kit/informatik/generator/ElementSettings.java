package edu.kit.informatik.generator;

public enum ElementSettings {
    COMPONENT("component", "C", "blue"),
    CONTAINER("container", "C", "red"),
    PROVIDER("provider", "P", "yellow"),
    INSTANCE("instance", "C", "lightblue"),
    ;
    private String type;
    private String sign;
    private String color;

    ElementSettings(String type, String sign, String color) {
        this.type = type;
        this.sign = sign;
        this.color = color;
    }
}
