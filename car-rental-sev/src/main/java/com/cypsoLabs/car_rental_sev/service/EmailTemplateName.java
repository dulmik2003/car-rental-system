package com.cypsoLabs.car_rental_sev.service;

import lombok.Getter;

@Getter
public enum EmailTemplateName {
//    ACTIVATE_ACCOUNT();
    ACTIVATE_ACCOUNT("activate_account");

    private final String name;

    EmailTemplateName(String name) {
        this.name = name;
    }
}
