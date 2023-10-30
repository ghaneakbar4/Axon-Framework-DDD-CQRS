package com.github.axonmulti.core.event;

import lombok.Value;

@Value
public class PrivateAddressValidatedEvent {

    private final String addressId;

    private final String personId;

}
