package com.github.fabienrenaud.jjb;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

import java.io.File;

public final class Config {

    private static final String COMMAND_FILE = ".cli.params.json";

    private Config() {
    }

    public static File save(Cli.AbstractCommand cmd) {
        File f = new File(COMMAND_FILE);
        try {
            new ObjectMapper().writeValue(f, cmd);
        } catch (JacksonException ex) {
            throw new RuntimeException(ex);
        }
        return f;
    }

    public static Cli.AbstractCommand load() {
        File f = new File(COMMAND_FILE);
        try {
            return new ObjectMapper().readValue(f, Cli.AbstractCommand.class);
        } catch (JacksonException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
