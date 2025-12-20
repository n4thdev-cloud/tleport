//4bstr4ct Ms 
package abstracta.tleport.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.util.Date;
import org.springframework.stereotype.Service;

import abstracta.tleport.modelo.UsuariaModel;

/**
 *
 * @author n4th
 */
@Service
public class JwtUtil {

    private final String SECRET_KEY = "Kj8sL2P0x9Aq7ZRmNfE4wT6UoYH5c1Bv";

    public String generateTokenNewUser(UsuariaModel usuariaModel) {
        return Jwts.builder()
                .setSubject(usuariaModel.getUserName())
                .claim("id", usuariaModel.getId().toString())
                .claim("name", usuariaModel.getUserName())
                .claim("email", usuariaModel.getEmail())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .signWith(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()), SignatureAlgorithm.HS256)
                .compact();
    }

        public String generateTokenErrorNew(String mensaje) {
        return Jwts.builder()
                .setSubject(mensaje)
                .claim("id", mensaje)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .signWith(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()), SignatureAlgorithm.HS256)
                .compact();
    }

    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .signWith(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()), SignatureAlgorithm.HS256)
                .compact();
    }

    public String extractUsername(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(SECRET_KEY.getBytes())
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
}
