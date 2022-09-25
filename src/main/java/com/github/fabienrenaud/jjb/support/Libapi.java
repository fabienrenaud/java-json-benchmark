package com.github.fabienrenaud.jjb.support;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Libapi {

    private final boolean active;
    private final Library lib;
    private final List<Api> api;

    public Libapi(Library lib, Api... api) {
        this(true, lib, api);
    }

    public Libapi(boolean active, Library lib, Api... api) {
        this.active = active;
        this.lib = lib;
        this.api = Arrays.asList(api);
    }

    public boolean active() {
        return active;
    }

    public Library lib() {
        return lib;
    }

    public List<Api> api() {
        return api;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Libapi)) {
            return false;
        }

        Libapi libapi = (Libapi) o;

        return active == libapi.active &&
                lib == libapi.lib &&
                Objects.equals(api, libapi.api);
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, lib, api);
    }
}
