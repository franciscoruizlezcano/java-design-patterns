package com.laikacode.patterns.creation.prototype;

public final class Client extends Person{
    private String clientNumber;

    public Client() {
    }

    public Client(
            int    id,
            String name,
            String lastname,
            String clientNumber
    ) {
        super(
                id,
                name,
                lastname
        );

        this.clientNumber = clientNumber;
    }

    public String getClientNumber() {
        return clientNumber;
    }
}
