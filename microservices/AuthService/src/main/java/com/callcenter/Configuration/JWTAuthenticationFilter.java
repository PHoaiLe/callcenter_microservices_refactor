package com.callcenter.Configuration;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.logging.Logger;

@Component
public class JWTAuthenticationFilter extends OncePerRequestFilter
{
    private final String authorizationHeader = "Authorization";
    private final String prefixOfAuthorizationHeader = "Bearer ";

    //check JWT token
    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException
    {
        Logger.getAnonymousLogger().info("inside JWTAuthenticationFilter");
        final String authHeader = request.getHeader(authorizationHeader);
        if(authHeader == null || authHeader.startsWith(prefixOfAuthorizationHeader) == false)
        {
            Logger.getAnonymousLogger().info("no authHeader or Bearer");
            filterChain.doFilter(request, response);
        }

        final String jwtToken = authHeader.substring(prefixOfAuthorizationHeader.length());
        //TODO: extract username (user_phone) from jwtToken

    }


}
