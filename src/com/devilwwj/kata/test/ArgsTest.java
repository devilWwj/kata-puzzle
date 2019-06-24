package com.devilwwj.kata.test;

import com.devilwwj.kata.Args;
import com.devilwwj.kata.ArgsSchema;
import com.devilwwj.kata.ArgsParser;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for args.
 *
 * @author wenjiewu
 */
public class ArgsTest {

    ArgsSchema schema;

    @Test
    public void testBoolean() {
        Args args = new Args("-l");
        schema = new ArgsSchema();
        schema.setArgument("-l", "bool", "false");
        ArgsParser parser = new ArgsParser(schema);
        parser.parseArgs(args);
        Assert.assertEquals(false, args.getValue());
    }

}
