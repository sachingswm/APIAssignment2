package com.assignment.registration;

import com.assignment.appuser.AppUser;
import com.assignment.appuser.AppUserRole;
import com.assignment.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RegistrationService {

    @Autowired
    private final AppUserService appUserService;

    public String register(RegistrationRequest request)
    {
        return appUserService.signUpUser(
            new AppUser(request.getFirstName(),request.getLastName(),
                    request.getEmail(),request.getPassword()
                    , AppUserRole.USER
            )
        );
    }
}
