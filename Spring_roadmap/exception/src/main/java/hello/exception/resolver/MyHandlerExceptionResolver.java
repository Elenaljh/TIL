package hello.exception.resolver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        try {
            if (ex instanceof IllegalArgumentException) {
                log.info("IllegalArgumentException resolver to 400");
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, ex.getMessage());
                return new ModelAndView();
                //이 modelandview는 WAS까지 정상적으로 전달된다.
                //WAS는 위의 SC_BAD_REQUEST를 보고 오류코드 400이 왔다고 판단한다.
            }
        } catch (IOException e) {
            log.error("resolver ex");
            //sendError이 IOException을 보낼수도 있어서 에러를 잡아줘야 한다.
        }

        return null; //null로 리턴하면 예외가 터져서 날라간다(?)
    }
}
