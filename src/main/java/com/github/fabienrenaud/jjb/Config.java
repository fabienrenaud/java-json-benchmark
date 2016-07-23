package com.github.fabienrenaud.jjb;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by frenaud on 7/23/16.
 */
public final class Config {

    private static final String COMMAND_FILE = ".cli.params.json";

    private Config() {
    }

    public static File save(final Cli.AbstractCommand cmd) {
        File f = new File(COMMAND_FILE);
        try {
            new ObjectMapper().writeValue(f, cmd);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return f;
    }

    public static Cli.AbstractCommand load() {
        File f = new File(COMMAND_FILE);
        try {
            return new ObjectMapper().readValue(f, Cli.AbstractCommand.class);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
