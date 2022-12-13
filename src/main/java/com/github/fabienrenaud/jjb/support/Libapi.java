package com.github.fabienrenaud.jjb.support;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public record Libapi(boolean active, Library lib, List<Api> api) {
    public Libapi(Library lib, Api... api) {
        this(true, lib, api);
    }

    public Libapi(boolean active, Library lib, Api... api) {
        this(active, lib, Arrays.asList(api));
    }
}
