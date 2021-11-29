package edu.kit.informatik.generator;

import edu.kit.informatik.generator.dialect.ConnectionType;

public class Connection {

    private ConnectionType type;
    private UmlElement base;
    private UmlElement to;

    public Connection(UmlElement base, ConnectionType type, UmlElement to) {
        this.type = type;
        this.base = base;
        this.to = to;
    }

    public ConnectionType getType() {
        return type;
    }

    public UmlElement getBase() {
        return base;
    }

    public UmlElement getTo() {
        return to;
    }
}
