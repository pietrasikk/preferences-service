package com.manning.tutorial.notification.NotificationPreferencesService.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value
public class NotificationRequest {
     String customerId;

    @JsonCreator
    NotificationRequest(@JsonProperty("customerId") String customerId) {
        this.customerId = customerId;
    }
}
