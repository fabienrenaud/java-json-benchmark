package com.github.fabienrenaud.jjb.data;

import com.jsoniter.JsonIterator;
import com.jsoniter.extra.PreciseFloatSupport;
import com.jsoniter.output.EncodingMode;
import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.DecodingMode;
import com.jsoniter.spi.JsoniterSpi;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public final class JsonSourceInits {

    private JsonSourceInits() {
    }

    public static void jsoniter() {
        JsonIterator.setMode(DecodingMode.DYNAMIC_MODE_AND_MATCH_FIELD_STRICTLY);
        JsonStream.setMode(EncodingMode.DYNAMIC_MODE);
        JsoniterSpi.registerTypeEncoder(UUID.class, (obj, stream) -> stream.writeVal(obj.toString()));
        JsoniterSpi.registerTypeDecoder(UUID.class, iter -> UUID.fromString(iter.readString()));
        JsoniterSpi.registerTypeEncoder(LocalDate.class, (obj, stream) -> stream.writeVal(obj.toString()));
        JsoniterSpi.registerTypeDecoder(LocalDate.class, iter -> LocalDate.parse(iter.readString()));
        JsoniterSpi.registerTypeEncoder(OffsetDateTime.class, (obj, stream) -> stream.writeVal(obj.toString()));
        JsoniterSpi.registerTypeDecoder(OffsetDateTime.class, iter -> OffsetDateTime.parse(iter.readString()));
        PreciseFloatSupport.enable();
    }
}
