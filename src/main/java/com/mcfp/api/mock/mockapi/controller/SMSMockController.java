package com.mcfp.api.mock.mockapi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/sms")
public class SMSMockController {
    //기본 정보 갖고오기
    //1. 보내는 사원, 2. 보내는 사원의 담당 직원, 3. 저장해놓은 문자 메시지 형식, 4. 회사 전체로 남은 갯수

    //문자메시지 발송 요청
    //date 있으면 예약 문자 없으면 당장 발송
    //Response Code - Success, Bad Request(문자 갯수 부족) 등 여기선 이것저것 고려할게 좀 있을 듯

    //문자메시지 발송 내역 확인
    //pagination 확인
}
