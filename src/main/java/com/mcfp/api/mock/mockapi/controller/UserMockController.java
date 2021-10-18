package com.mcfp.api.mock.mockapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;
@CrossOrigin (origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/users")
public class UserMockController {

    @GetMapping("/health-check")
    ResponseEntity<String> healthCheck(){
        return new ResponseEntity<String>("user health-check",HttpStatus.OK);
    }
    @PostMapping("/signup")
    ResponseEntity<String> userSignup(@RequestBody String user){
        if(user.isEmpty()){
            return new ResponseEntity<String>("필수 내용이 누락되어 있습니다.", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>( HttpStatus.CREATED);
    }

    @PostMapping("/signin")
    ResponseEntity<String> userSignin(@RequestParam("username") String username,
                                      @RequestParam("password") String password){
        if(username.equals("test")&&password.equals("123123")) return new ResponseEntity<>(HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }

    @GetMapping()
    ResponseEntity<String> getUsers(){
        String users = "{[ {\"username\":\"test\",\"name\":\"테스트\"}," +
                "{\"username\":\"test2\",\"name\":\"테스트2\"}," +
                "{\"username\":\"test3\",\"name\":\"테스트3\"}," +
                "{\"username\":\"test4\",\"name\":\"테스트4\"}" +
                "]}";
        return ResponseEntity.ok().body(users);
    }

    //동사형 맞는가? user search할 때 query param 사용 가능?
    @GetMapping("/search")
    ResponseEntity<String> searchUser(@Nullable @RequestParam("username") String username,
                                      @Nullable @RequestParam("name") String name,
                                      @Nullable @RequestParam("role") String role){
        return new ResponseEntity<String>(username+name+role, HttpStatus.OK);
    }

    @PutMapping()
    ResponseEntity<String> updateUser(@RequestBody String user){
        if(user.isEmpty()) return new ResponseEntity<>("수정할 내용이 없습니다.", HttpStatus.BAD_REQUEST);
        return ResponseEntity.ok().body("");
    }


}
