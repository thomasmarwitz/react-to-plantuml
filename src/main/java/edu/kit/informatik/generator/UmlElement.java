package edu.kit.informatik.generator;

import java.util.HashSet;
import java.util.Set;

public class UmlElement {

    private final String name;
    private final ElementSettings settings;
    private final Set<String> connections; // connections from this component to others

    public UmlElement(String name, ElementSettings settings) {
        this.name = name;
        this.settings = settings;
        connections = new HashSet<>();
    }

    private String generateSignature() {

    }

}
