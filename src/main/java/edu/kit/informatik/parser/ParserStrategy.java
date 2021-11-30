package edu.kit.informatik.parser;

public interface ParserStrategy {
    void parseImports(String s);
    void parseReactComponent(String s);
    void parseProps(String s);
    void parseState(String s);
    void parseRedux(String s);
}
