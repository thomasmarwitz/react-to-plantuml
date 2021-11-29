package edu.kit.informatik.generator.dialect;

public enum ConnectionType {

    LINKED("<..>"),
    AGGREGATION("o--"),
    COMPOSITION("*--"),
    CALLBACK("<.."),
    IS_INSTANCE("<|--")
    ;

    private String symbol;

    ConnectionType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

}
