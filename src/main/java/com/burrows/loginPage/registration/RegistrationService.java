package com.burrows.loginPage.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Service
public class RegistrationService {
    private final String firstName;
    private final String lastName;
    private final String emailName;
    private final String password;

    public String register(RegistrationRequest request) {
        return null;
    }
}
