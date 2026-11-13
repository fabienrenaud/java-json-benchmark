package com.github.fabienrenaud.jjb.provider;

import com.github.fabienrenaud.jjb.model.Clients;
import com.github.fabienrenaud.jjb.model.Users;
import org.sjf4j.CompiledInstances;
import org.sjf4j.annotation.binding.Backend;
import org.sjf4j.annotation.binding.CompiledBinder;
import org.sjf4j.annotation.binding.Read;
import org.sjf4j.annotation.binding.Write;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;

public interface Sjf4jBinders {

    // Simple
    SimpleBinder SIMPLE = CompiledInstances.create(SimpleBinder.class);

    @CompiledBinder(backend = Backend.SIMPLE)
    interface SimpleBinder {
        @Read
        Users readUsers(byte[] bytes) throws IOException;
        @Write
        void writeUsers(Users users, OutputStream out) throws IOException;

        @Read
        Clients readClients(byte[] bytes) throws IOException;
        @Write
        void writeClients(Clients clients, OutputStream out) throws IOException;
    }

    // Jackson2
    Jackson3Binder JACKSON3 = CompiledInstances.create(Jackson3Binder.class);

    @CompiledBinder(backend = Backend.JACKSON3)
    interface Jackson3Binder {
        @Read
        Users readUsers(byte[] bytes) throws IOException;
        @Write
        void writeUsers(Users users, OutputStream out) throws IOException;

        @Read
        Clients readClients(byte[] bytes) throws IOException;
        @Write
        void writeClients(Clients clients, OutputStream out) throws IOException;
    }

    // Fastjson2
    Fastjson2Binder FASTJSON2 = CompiledInstances.create(Fastjson2Binder.class);

    @CompiledBinder(backend = Backend.FASTJSON2)
    interface Fastjson2Binder {
        @Read
        Users readUsers(byte[] bytes) throws IOException;
        @Write
        void writeUsers(Users users, OutputStream out) throws IOException;

        @Read
        Clients readClients(byte[] bytes) throws IOException;
        @Write
        void writeClients(Clients clients, OutputStream out) throws IOException;
    }

    // Gson
    GsonBinder GSON = CompiledInstances.create(GsonBinder.class);

    @CompiledBinder(backend = Backend.GSON)
    interface GsonBinder {
        @Read
        Users readUsers(Reader input) throws IOException;
        @Write
        String writeUsers(Users users) throws IOException;

        @Read
        Clients readClients(Reader input) throws IOException;
        @Write
        String writeClients(Clients clients) throws IOException;
    }

}
