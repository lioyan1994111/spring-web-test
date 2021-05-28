package web.test.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/5/26 5:43 下午
 */
@RestController
@RequestMapping("requestParam")
public class RequestParamTest {
    @GetMapping("get/test")
    private  List<String> getTest(@RequestParam String name){
        System.out.println(name);
        return new ArrayList<>();
    }

    @PostMapping("post/test")
    private  List<String> postTest(@RequestParam String name){
        System.out.println(name);
        return new ArrayList<>();
    }

}
