package edu.kit.informatik.generator.dialect;

public enum Connection {

    LINKED("<..>"),
    AGGREGATION("o--"),
    COMPOSITION("*--"),
    CALLBACK("<.."),
    IS_INSTANCE("<|--")
    ;

    private String symbol;

    Connection(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

}
