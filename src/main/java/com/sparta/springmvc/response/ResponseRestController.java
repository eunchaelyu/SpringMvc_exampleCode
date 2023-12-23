package com.sparta.springmvc.response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/response/rest") //response에 rest까지 잡힘
public class ResponseRestController {
    // [Response header]
    //   Content-Type: text/html
    // [Response body]
    //   {"name":"Robbie","age":95}
    @GetMapping("/json/string")
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }

    // [Response header]
    //   Content-Type: application/json
    // [Response body]
    //   {"name":"Robbie","age":95}
    @GetMapping("/json/class")
    public Star helloClassJson() {
        return new Star("Robbie", 95);
    }
}

//클래스 내에서 최초로 html을 반환할 때는 @controller를 붙인다.
//데이터를 반환해야 하는 경우 클래스내에 @ResoponseBody를 붙인다
//하지만 html을 반환하는 것이 아니라 json 형태의 데이터를 반환한다면 @RestController를 달아서
//모든 메서드에 @ResponseBody가 자동으로 적용되게 만든다