package com.saad.booksocialnetwork.config;

import com.saad.booksocialnetwork.user.User;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

//public class ApplicationAuditAware implements AuditorAware<Integer> {
//    @Override
//    public Optional<Integer> getCurrentAuditor() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        if (authentication == null ||
//                !authentication.isAuthenticated() ||
//                authentication instanceof AnonymousAuthenticationToken) {
//            return Optional.empty();
//        }
//
//        User userPrincipal = (User) authentication.getPrincipal();
//
//        return Optional.ofNullable(userPrincipal.getId());
//    }
//}