package web.test.controllerAdvice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/5/25 11:14 下午
 */
@RestController
public class TestColltroller {
    @GetMapping("/hello")
    public String hello(Model model) {
        Map<String, Object> map = model.asMap();
        System.out.println(map);

        return "hello controller advice";
    }

    @GetMapping("/InitBinder")
    public String initBinderTest(@RequestParam Date date) {
        System.out.println(date);

        return "hello controller advice";
    }
}
