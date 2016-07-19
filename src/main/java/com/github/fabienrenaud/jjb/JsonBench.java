package com.github.fabienrenaud.jjb;

/**
 *
 * @author Fabien Renaud
 */
public interface JsonBench {

    Object gson() throws Exception;

    Object jackson() throws Exception;

    Object jackson_afterburner() throws Exception;

    Object orgjson() throws Exception;

    Object genson() throws Exception;

    Object jsonp() throws Exception;

    Object flexjson() throws Exception;

    Object fastjson() throws Exception;

    Object jsonio() throws Exception;

    Object boon() throws Exception;

    Object johnson() throws Exception;

    Object jsonsmart() throws Exception;

}
