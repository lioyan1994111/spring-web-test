package web.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 容器，可能涉及重定向
 * @author top.lioyan
 * @version 1.0
 * @date 2021/4/17 8:14 下午
 */
@Controller
@RequestMapping("modelAndView")
public class ModelAndViewContainerTest {

    @GetMapping("/test1/{id}")
    public List<String> list(Model model,@PathVariable String id) {
        List<String> a = new ArrayList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add(id);
        return a;
    }

//    @InitBinder
    public void  InitBinderTest(Model model){
        model.addAttribute("InitBinderTest","asdas");
    }


    @ModelAttribute
    public void getUser(@PathVariable(value="id",required=false) String id, Model model){

        model.addAttribute("user", id);
    }
}
