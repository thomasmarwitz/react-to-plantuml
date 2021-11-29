package edu.kit.informatik.generator;

import edu.kit.informatik.generator.dialect.ElementSettings;

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

    public void addConnection() {

    }

    private String generateSignature() {
        return String.format(
                "class %s << (%s,%s) %s>>",
                name,
                settings.getSign(),
                settings.getColor(),
                settings.getType()
        );
    }

    private String generateBody() {
        return String.format(
                "{\n%s\n}",
                "#body#"
        );
    }

}
