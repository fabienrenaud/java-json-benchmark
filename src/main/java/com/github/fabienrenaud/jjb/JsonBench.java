package com.github.fabienrenaud.jjb;

import com.github.fabienrenaud.jjb.data.JsonSource;
import com.github.fabienrenaud.jjb.data.JsonSourceFactory;

/**
 * @author Fabien Renaud
 */
public abstract class JsonBench {

    protected static final JsonSource CLI_JSON_SOURCE = JsonSourceFactory.create();
    public abstract JsonSource JSON_SOURCE();

    public Object gson() throws Exception {
        return null;
    }

    public Object jackson() throws Exception {
        return null;
    }

    public Object jackson_afterburner() throws Exception {
        return null;
    }

    public Object orgjson() throws Exception {
        return null;
    }

    public Object genson() throws Exception {
        return null;
    }

    public Object yasson() throws Exception {
        return null;
    }

    public Object javaxjson() throws Exception {
        return null;
    }

    public Object flexjson() throws Exception {
        return null;
    }

    public Object fastjson() throws Exception {
        return null;
    }

    public Object jsonio() throws Exception {
        return null;
    }

    public Object boon() throws Exception {
        return null;
    }

    public Object johnzon() throws Exception {
        return null;
    }

    public Object jsonsmart() throws Exception {
        return null;
    }

    public Object dsljson() throws Exception {
        return null;
    }

    public Object dsljson_reflection() throws Exception {
        return null;
    }

    public Object logansquare() throws Exception {
        return null;
    }

    public Object jsonsimple() throws Exception {
        return null;
    }

    public Object nanojson() throws Exception {
        return null;
    }

    public Object jodd() throws Exception {
        return null;
    }

    public Object moshi() throws Exception {
        return null;
    }

    public Object tapestry() throws Exception {
        return null;
    }

    public Object jsoniter() throws Exception {
        return null;
    }

    public Object minimaljson() throws Exception {
        return null;
    }

    public Object mjson() throws Exception {
        return null;
    }

    public Object underscore_java() throws Exception {
        return null;
    }
}
