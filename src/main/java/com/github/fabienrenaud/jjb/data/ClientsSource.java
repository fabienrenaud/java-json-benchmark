package com.github.fabienrenaud.jjb.data;

import com.github.fabienrenaud.jjb.data.gen.ClientsGenerator;
import com.github.fabienrenaud.jjb.model.Clients;
import com.github.fabienrenaud.jjb.provider.ClientsJsonProvider;

public class ClientsSource extends JsonSource<Clients> {

    public ClientsSource(int quantity, int individualSize) {
        super(quantity, individualSize, new ClientsJsonProvider(), new ClientsGenerator(), null, null);
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
