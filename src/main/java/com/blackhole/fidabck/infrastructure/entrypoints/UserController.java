package com.blackhole.fidabck.infrastructure.entrypoints;

import com.blackhole.fidabck.domain.model.UserApp;
import com.blackhole.fidabck.domain.usecase.user.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")

    public UserApp login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
        //BCryptPasswordEncoder -> Cifrar contraseña
        UserApp userApp = new UserApp();
        userApp.setUsername(username);
        String token = getJWTToken(userApp);
        userApp.setToken(token);
        return userApp;

    }

    private String getJWTToken(UserApp user) {
        String secretKey = "mySecretKey";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");

        String token = Jwts
                .builder()
                .setId(user.getUsername())
                .setSubject(user.toString())
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS512,
                        secretKey.getBytes()).compact();

        return "Bearer " + token;
    }

    @GetMapping("/getAll")
    public List<UserApp> getAllUsers(){
        return userService.getUser();
    }
}
