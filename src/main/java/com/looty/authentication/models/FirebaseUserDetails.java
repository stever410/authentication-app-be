package com.looty.authentication.models;

import com.google.firebase.auth.FirebaseToken;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Getter
public class FirebaseUserDetails implements UserDetails {

    private final String uid;
    private final String userName;
    private final String email;
    private final String picture;

    public FirebaseUserDetails(FirebaseToken firebaseToken) {
        this.uid = firebaseToken.getUid();
        this.userName = firebaseToken.getName();
        this.email = firebaseToken.getEmail();
        this.picture = firebaseToken.getPicture();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO: will implement later
        return true;
    }
}
