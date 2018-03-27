package com.github.fabienrenaud.jjb.data;

import com.github.fabienrenaud.jjb.data.gen.ClientsGenerator;
import com.github.fabienrenaud.jjb.model.Clients;
import com.github.fabienrenaud.jjb.provider.ClientsJsonProvider;

public class ClientsSource extends JsonSource<Clients> {

    private static final ClientsJsonProvider clientsJsonProvider = new ClientsJsonProvider();

    public ClientsSource(int quantity, int individualSize) {
        super(quantity, individualSize, clientsJsonProvider, new ClientsGenerator(), null, null);
    }

    @Override
    Clients[] newPojoArray(int quantity) {
        return new Clients[quantity];
    }

    @Override
    public Class<Clients> pojoType() {
        return Clients.class;
    }
}
