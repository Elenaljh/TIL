package hello.springmvc.basic;

import org.slf4j.Logger;  //패키지 주의!!!
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Controller와 다르게 return값이 그대로 html body에 찍힘. RESTAPI만들때 핵심적임
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("log-test")
    public String logTest() {
        String name = "Spring";
        System.out.println("=====log start========");
        log.info("info log={}", name);
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);
        System.out.println("======log end========");

        return "ok";
    }
}
