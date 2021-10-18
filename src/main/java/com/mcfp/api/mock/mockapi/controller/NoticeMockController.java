package com.mcfp.api.mock.mockapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin (origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/notice")
public class NoticeMockController {

    @GetMapping
    ResponseEntity<String> getAllNotice(){
        String notice = "{[" +
                "{\"noticeId\":\"0\", \"noticeTitle\":\"시스템 변경 건\", \"noticeContents\":\"시스템 변경건입니다. 모두 주목해주시기 바랍니다.\", \"noticeDate\":\"2021-09-20T03:03:40.186595\"}," +
                "{\"noticeId\":\"1\", \"noticeTitle\":\"시스템 변경 건\", \"noticeContents\":\"시스템 변경건입니다. 모두 주목해주시기 바랍니다.\", \"noticeDate\":\"2021-09-22T03:03:40.186595\"}," +
                "{\"noticeId\":\"2\", \"noticeTitle\":\"시스템 변경 건\", \"noticeContents\":\"시스템 변경건입니다. 모두 주목해주시기 바랍니다.\", \"noticeDate\":\"2021-09-23T03:03:40.186595\"}," +
                "{\"noticeId\":\"3\", \"noticeTitle\":\"시스템 변경 건\", \"noticeContents\":\"시스템 변경건입니다. 모두 주목해주시기 바랍니다.\", \"noticeDate\":\"2021-09-24T03:03:40.186595\"}," +
                "{\"noticeId\":\"4\", \"noticeTitle\":\"시스템 변경 건\", \"noticeContents\":\"시스템 변경건입니다. 모두 주목해주시기 바랍니다.\", \"noticeDate\":\"2021-09-25T03:03:40.186595\"}," +
                "{\"noticeId\":\"5\", \"noticeTitle\":\"시스템 변경 건\", \"noticeContents\":\"시스템 변경건입니다. 모두 주목해주시기 바랍니다.\", \"noticeDate\":\"2021-09-26T03:03:40.186595\"}"  +
                "]}";
        return new ResponseEntity<String>(notice,HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<String> createNotice(){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    ResponseEntity<String> getNotice(@PathVariable String id){
        String notice = "{\"noticeId\":\""+id+"\", \"noticeTitle\":\"시스템 변경 건\", \"noticeContents\":\"시스템 변경건입니다. 모두 주목해주시기 바랍니다.\", \"noticeDate\":\"2021-09-20T03:03:40.186595\"}";
        return new ResponseEntity<String>(notice, HttpStatus.OK);
    }
}
