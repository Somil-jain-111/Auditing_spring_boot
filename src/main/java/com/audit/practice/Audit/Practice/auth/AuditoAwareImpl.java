package com.audit.practice.Audit.Practice.auth;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditoAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("somil jain");
    }
}
