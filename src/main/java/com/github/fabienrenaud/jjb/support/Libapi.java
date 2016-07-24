package com.github.fabienrenaud.jjb.support;

import java.util.Arrays;
import java.util.List;

/**
 * Created by frenaud on 7/24/16.
 */
public class Libapi {

    private final Library lib;
    private final List<Api> api;

    public Libapi(Library lib, Api... api) {
        this.lib = lib;
        this.api = Arrays.asList(api);
    }

    public Library lib() {
        return lib;
    }

    public List<Api> api() {
        return api;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libapi)) return false;

        Libapi libapi = (Libapi) o;

        if (lib != libapi.lib) return false;
        return api == libapi.api;

    }

    @Override
    public int hashCode() {
        int result = lib != null ? lib.hashCode() : 0;
        result = 31 * result + (api != null ? api.hashCode() : 0);
        return result;
    }
}
