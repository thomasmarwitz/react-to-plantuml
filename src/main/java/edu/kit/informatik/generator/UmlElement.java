package edu.kit.informatik.generator;

import edu.kit.informatik.core.Tuple;
import edu.kit.informatik.generator.dialect.ConnectionType;
import edu.kit.informatik.generator.dialect.ElementSettings;
import edu.kit.informatik.generator.dialect.Modifier;

import java.util.HashSet;
import java.util.Set;

public class UmlElement {

    private final String name;
    private final ElementSettings settings;
    private final Set<Connection> connections; // connections from this component to others

    public UmlElement(String name, ElementSettings settings) {
        this.name = name;
        this.settings = settings;
        connections = new HashSet<>();
    }

    public void addItem(Modifier modifier, String ) { // modifier characterizes element

    }

    public void addConnection(ConnectionType connectionType, UmlElement to) {
        connections.add(new Connection(this, connectionType, to));
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
