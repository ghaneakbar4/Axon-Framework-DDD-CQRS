package com.github.axonmulti.core.event;

import lombok.Value;

@Value
public class PersonCreatedEvent {

    private final String personId;

    private final String fullName;

}
