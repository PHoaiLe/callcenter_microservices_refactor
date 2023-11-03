package com.callcenter.Services;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Base64;


@Service
public class JWTService
{
    private final String SECRET = "Crt5CAp+uo1UpJHzbbcLH5dIM7BvPZaauZavN9eMcTx0qfn5tMFpjTBoW/wQspdV9XQZYxjN1tFNu3GJElYRMOuNLodaHnN/7JYjktWh6fw=";
    public String extractUsername(String jwtToken)
    {

        return "";
    }



    ///private functions////////////////////////////////////////////////////
    private Claims extractAllClaims(String jwtToken)
    {
        return Jwts.parserBuilder()
                .setSigningKey(getSignInKey(SECRET))
                .build()
                .parseClaimsJws(jwtToken)
                .getBody();
    }

    private Key getSignInKey(String secret)
    {
        byte[] keyBytes = Decoders.BASE64.decode(secret);
        return Keys.hmacShaKeyFor(keyBytes);
    }

}
