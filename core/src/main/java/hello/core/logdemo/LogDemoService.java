package hello.core.logdemo;


import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {

    private final MyLogger myLogger; //여기

    public void logic(String id) {
        //MyLogger myLogger = myLoggerProvider.getObject(); //여기
        myLogger.log("service id = " + id);
        System.out.println("myLogger = " + myLogger.getClass());
    }
}
