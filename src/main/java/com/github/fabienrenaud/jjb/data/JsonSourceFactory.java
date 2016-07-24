package com.github.fabienrenaud.jjb.data;

import com.github.fabienrenaud.jjb.Cli;
import com.github.fabienrenaud.jjb.Config;
import com.github.fabienrenaud.jjb.support.BenchSuport;

/**
 * Created by frenaud on 7/23/16.
 */
public final class JsonSourceFactory {

    private JsonSourceFactory() {
    }

    public static JsonSource<?> create() {
        Cli.AbstractCommand cmd = Config.load();
        return create(cmd.dataType, cmd.numberOfPayloads, cmd.sizeOfEachPayloadInKb * 1000);
    }

    public static JsonSource<?> create(final String dataType, final int quantity, final int size) {
        BenchSuport bs = BenchSuport.valueOf(dataType.toUpperCase());
        switch (bs) {
            case USERS:
                return new UsersSource(quantity, size);
            default:
                throw new RuntimeException();
        }
    }
}
