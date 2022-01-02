package com.manning.tutorial.notification.NotificationPreferencesService.controllers;

import com.manning.tutorial.notification.NotificationPreferencesService.model.NotificationRequest;
import com.manning.tutorial.notification.NotificationPreferencesService.model.NotificationResponse;
import com.manning.tutorial.notification.NotificationPreferencesService.services.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.manning.tutorial.notification.NotificationPreferencesService.formatters.NotificationFormatter.mapResponse;


@RestController
@RequiredArgsConstructor
class NotificationController {

    private final NotificationService notificationService;

    @PostMapping(path = "/api/notification/preferences",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public NotificationResponse getUserNotificationPreferences(@RequestBody NotificationRequest notificationRequest) {
        return mapResponse(notificationService.getNotificationPreferences(notificationRequest.getCustomerId()));
    }
}
