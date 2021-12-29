package com.manning.tutorial.notification.NotificationPreferencesService.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "notification_preferences")
public class NotificationPreferenceEntity {
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Column(name = "CUSTOMERID", nullable = false)
    private String customerId;
    @Column(name = "SMSPREFERENCEFLAG", nullable = false)
    private boolean smsPreferenceFlag;
    @Column(name = "EMAILPREFERENCEFLAG", nullable = false)
    private boolean emailPreferenceFlag;
    @Column(name = "PHONENUMBER", nullable = false)
    private String phoneNumber;
    @Column(name = "EMAILADDRESS", nullable = false)
    private String emailAddress;
}

