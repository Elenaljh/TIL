package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //첫번째 import
public class HelloController {
    @GetMapping("/hello") //두번째 importC
    public String hello(@RequestParam(name = "data", required = false, defaultValue = "유저") String name, Model model) { //세번째 import
        model.addAttribute("data", name);
        return "hello";
    }

    @GetMapping("/hello-mvc") //주소창 뒤에 붙음
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template"; //연결하는 html 파일 이름
    }

    @GetMapping("/hello-string") //API방식
    @ResponseBody //http <body>에 직접 내용을 넣어주겠다
    public String helloString(@RequestParam("name") String name, Model model) {
        return "hello " + name; //템플릿엔진과의 차이: html 파일을 따로 만들지 않음. view 이런게 없고 그냥 데이터 자체를 클라이언트에 보내버림
    }

    @GetMapping("/hello-api") //api방식
    @ResponseBody //기본으로 json으로 반환함 (xml방식은 이제 사장됨)
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello { //Hello 객체 만들기
        private String name;

        public String getName() { //getter
            return name;
        }

        public void setName(String name) { //setter
            this.name = name;
        }
    }
}


