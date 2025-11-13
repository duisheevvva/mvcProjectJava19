package peaksoft;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("greeting")
public class MyController {

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("bye")
    public String bye() {
        return "bye";
    }
}
