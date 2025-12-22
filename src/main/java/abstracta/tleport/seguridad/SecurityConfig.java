//4bstr4ct Ms 
package abstracta.tleport.seguridad;

/**
 *
 * @author n4th
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        // BCrypt es el algoritmo recomendado para hashear contraseñas
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            // 1. Deshabilitar CSRF (para APIs REST sin vistas)
            .csrf(csrf -> csrf.disable())
            
            // 2. Definir las reglas de autorización
            .authorizeHttpRequests(auth -> auth
                // Permite el acceso a estas rutas sin autenticación (públicas)
                .requestMatchers("/teleport/usuarix/crearUsuaria","/actuator/env","/teleport/usuarix/checkNombreUsuaria","/teleport/usuarix/loginUsuaria").permitAll()
                
                // Las rutas que requieren un ROL específico
                .requestMatchers("/api/admin/**").hasRole("ADMIN")
                .requestMatchers("/api/user/**").hasAnyRole("USER", "ADMIN")

                // Cualquier otra petición debe estar autenticada
                .anyRequest().authenticated()
            )
            
            // 3. Configurar la autenticación (login)
            .httpBasic(httpBasic -> {}) // Usar autenticación Basic (para Postman)
            // O
            // .formLogin(formLogin -> formLogin.permitAll()) // Usar formulario de login estándar
        ;
        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService(PasswordEncoder passwordEncoder) {
        
        // Creamos un usuario de ejemplo con rol USER
        UserDetails user = User.builder()
            .username("user")
            // IMPORTANTE: la contraseña debe estar encriptada
            .password(passwordEncoder.encode("password"))
            .roles("USER")
            .build();

        // Creamos un usuario de ejemplo con rol ADMIN
        UserDetails admin = User.builder()
            .username("admin")
            .password(passwordEncoder.encode("adminpass"))
            .roles("ADMIN", "USER") // Puede tener múltiples roles
            .build();

        return new InMemoryUserDetailsManager(user, admin);
    }
}