package edu.kit.informatik.parsing;

import java.io.File;

public class ParserController {

    private ParserStrategy parserStrategy;

    public ParserController(ParserStrategy parserStrategy) {
        this.parserStrategy = parserStrategy;
    }

    public void parseFile(File file) {
    }
}
