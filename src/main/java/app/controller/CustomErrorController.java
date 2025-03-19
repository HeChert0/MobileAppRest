//package app.controller;
//
//import org.springframework.boot.web.error.ErrorAttributeOptions;
//import org.springframework.boot.web.servlet.error.ErrorAttributes;
//import org.springframework.boot.web.servlet.error.ErrorController;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.context.request.WebRequest;
//
//import java.util.Map;
//
//@Controller
//public class CustomErrorController implements ErrorController {
//
//    private final ErrorAttributes errorAttributes;
//
//    public CustomErrorController(ErrorAttributes errorAttributes) {
//        this.errorAttributes = errorAttributes;
//    }
//
//    @RequestMapping("/error")
//    public ResponseEntity<Map<String, Object>> handleError(WebRequest webRequest) {
//
//        Map<String, Object> errors = errorAttributes.getErrorAttributes(webRequest, ErrorAttributeOptions.defaults());
//        int status = (int) errors.get("status");
//
//        if (status == HttpStatus.NOT_FOUND.value()) {
//            errors.put("status", HttpStatus.BAD_REQUEST.value());
//            errors.put("error", "Bad Request");
//            errors.put("message", "Некорректный URL или запрос");
//            return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
//        }
//
//        return new ResponseEntity<>(errors, HttpStatus.valueOf(status));
//    }
//}
