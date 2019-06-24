package com.devilwwj.kata;

public class ArgsParser {
    private ArgsSchema schema;

    public ArgsParser(ArgsSchema schema) {
        this.schema = schema;
    }

    public void parseArgs(Args args) {
        if (schema.getType().equals("bool")) {
            args.setValue(Boolean.valueOf(schema.getDefaultValue()));
        }
    }
}
