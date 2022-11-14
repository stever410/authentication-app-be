package com.looty.authentication.auth;

import com.looty.authentication.models.FirebaseUserDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @GetMapping(path = "")
    public ResponseEntity test(Authentication authentication) {
        FirebaseUserDetails userDetails = (FirebaseUserDetails) authentication.getPrincipal();
        return ResponseEntity.ok().body(userDetails);
    }
}
