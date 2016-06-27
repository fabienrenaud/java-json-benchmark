package com.github.fabienrenaud.jjb;

/**
 *
 * @author Fabien Renaud
 */
public interface JsonBench {

    void gson() throws Exception;

    void jackson() throws Exception;

    void jackson_afterburner() throws Exception;

    void orgjson() throws Exception;

    void genson() throws Exception;

    void jsonp() throws Exception;

    void flexjson() throws Exception;

    void fastjson() throws Exception;

}
