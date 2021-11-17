package com.nti.nbi.springwebjpa;

import com.nti.nbi.springwebjpa.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public String getUserByUsername(@RequestParam String username){
        return username;
    }
    @GetMapping("/{id}")
    public String getUser(@PathVariable String id){
        return id;
    }

    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody User user){
        user.setPassword("secret");
        System.out.println(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @GetMapping("/error")
    public String errorNpe(){
        Optional<User> userOptional = null;
        System.out.println(userOptional.get());
        return "not reach here";
    }

    @GetMapping("/error-npe")
    public String errorNpeAgain(){
        Optional<String> strOptional = null;
        System.out.println(strOptional.get());
        return "not reach here";
    }
}
