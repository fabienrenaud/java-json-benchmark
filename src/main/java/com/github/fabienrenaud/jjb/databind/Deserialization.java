package com.github.fabienrenaud.jjb.databind;

import com.alibaba.fastjson2.JSON;
import com.bluelinelabs.logansquare.LoganSquare;
import com.github.fabienrenaud.jjb.JsonBench;
import com.github.fabienrenaud.jjb.data.JsonSource;
import com.google.gson.JsonSyntaxException;
import io.github.wycst.wast.json.options.ReadOption;
import org.openjdk.jmh.annotations.Benchmark;

import java.io.IOException;


/**
 * @author Fabien Renaud
 */
public class Deserialization extends JsonBench {

    public JsonSource JSON_SOURCE() {
        return CLI_JSON_SOURCE;
    }

    @Benchmark
    @Override
    public Object gson() throws Exception {
        return JSON_SOURCE().provider().gson().fromJson(JSON_SOURCE().nextReader(), JSON_SOURCE().pojoType());
    }

    @Benchmark
    @Override
    public Object jackson() throws Exception {
        return JSON_SOURCE().provider().jackson().readValue(JSON_SOURCE().nextByteArray(), JSON_SOURCE().pojoType());
    }

    @Benchmark
    @Override
    public Object jackson_afterburner() throws IOException {
        return JSON_SOURCE().provider().jacksonAfterburner().readValue(JSON_SOURCE().nextByteArray(), JSON_SOURCE().pojoType());
    }

    @Benchmark
    @Override
    public Object jackson_blackbird() throws IOException {
        return JSON_SOURCE().provider().jacksonBlackbird().readValue(JSON_SOURCE().nextByteArray(), JSON_SOURCE().pojoType());
    }

    @Benchmark
    @Override
    public Object genson() throws JsonSyntaxException {
        return JSON_SOURCE().provider().genson().deserialize(JSON_SOURCE().nextByteArray(), JSON_SOURCE().pojoType());
    }

    @Benchmark
    @Override
    public Object yasson() throws JsonSyntaxException {
        return JSON_SOURCE().provider().yasson().fromJson(JSON_SOURCE().nextReader(), JSON_SOURCE().pojoType());
    }

    @Benchmark
    @Override
    public Object fastjson() {
        return JSON.parseObject(JSON_SOURCE().nextByteArray(), JSON_SOURCE().pojoType());
    }

    @Benchmark
    @Override
    public Object flexjson() throws JsonSyntaxException {
        return JSON_SOURCE().provider().flexjsonDeser().deserialize(JSON_SOURCE().nextReader(), JSON_SOURCE().pojoType());
    }

    @Benchmark
    @Override
    public Object boon() throws Exception {
        return JSON_SOURCE().provider().boon().readValue(JSON_SOURCE().nextByteArray(), JSON_SOURCE().pojoType());
    }

    @Benchmark
    @Override
    public Object johnzon() throws Exception {
        return JSON_SOURCE().provider().johnzon().readObject(JSON_SOURCE().nextInputStream(), JSON_SOURCE().pojoType());
    }

    @Benchmark
    @Override
    public Object jsonsmart() throws Exception {
        return net.minidev.json.JSONValue.parse(JSON_SOURCE().nextByteArray(), JSON_SOURCE().pojoType());
    }

    @Benchmark
    @Override
    public Object dsljson() throws Exception {
        byte[] buffer = JSON_SOURCE().nextByteArray();
        return JSON_SOURCE().provider().dsljson().deserialize(JSON_SOURCE().pojoType(), buffer, buffer.length);
    }

    @Benchmark
    @Override
    public Object dsljson_reflection() throws Exception {
        byte[] buffer = JSON_SOURCE().nextByteArray();
        return JSON_SOURCE().provider().dsljson_reflection().deserialize(JSON_SOURCE().pojoType(), buffer, buffer.length);
    }

    @Benchmark
    @Override
    public Object avajejsonb_jackson() throws Exception {
        byte[] buffer = JSON_SOURCE().nextByteArray();
        return JSON_SOURCE().provider().avajeJsonb_jackson().fromJson(buffer);
    }

    @Benchmark
    @Override
    public Object avajejsonb() throws Exception {
        byte[] buffer = JSON_SOURCE().nextByteArray();
        return JSON_SOURCE().provider().avajeJsonb_default().fromJson(buffer);
    }

    @Benchmark
    @Override
    public Object logansquare() throws Exception {
        return LoganSquare.parse(JSON_SOURCE().nextInputStream(), JSON_SOURCE().pojoType());
    }

    @Benchmark
    @Override
    public Object jodd() throws Exception {
        return JSON_SOURCE().provider().joddDeser().parse(JSON_SOURCE().nextString(), JSON_SOURCE().pojoType());
    }

    @Benchmark
    @Override
    public Object moshi() throws Exception {
        return JSON_SOURCE().provider().moshi().fromJson(JSON_SOURCE().nextOkioBufferedSource());
    }

    @Benchmark
    @Override
    public Object qson() throws Exception {
        return JSON_SOURCE().provider().qson().read(JSON_SOURCE().nextByteArray(), JSON_SOURCE().pojoType());
    }

    @Benchmark
    @Override
    public Object quickbuf_json() throws Exception {
        return JSON_SOURCE().provider().quickbufPojo().clearQuick()
                .mergeFrom(us.hebi.quickbuf.JsonSource.newInstance(JSON_SOURCE().nextByteArray()));
    }

    @Benchmark
    @Override
    public Object wast() throws Exception {
        return io.github.wycst.wast.json.JSON.parseObject(JSON_SOURCE().nextString(), JSON_SOURCE().pojoType(), ReadOption.UseJDKDoubleParser);
    }
}
