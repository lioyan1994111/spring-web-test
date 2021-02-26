package web.test;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/kgReportImage")
public class TestRest {


    /**
     * 查看所有的员工信息
     *
     * @return
     */
    @GetMapping("/id/{id}")
    public List<String> list(@PathVariable String id) {
        List<String> a = new ArrayList<>();
        a.add("1");
         a.add("2");
        a.add("3");
        a.add("4");
        a.add(id);
        return a;
    }


    /**
     * 查看所有的员工信息
     *
     * @return
     */
    @GetMapping("/param")
    public List<String> param1(@RequestParam("test") Map<String,Object> test) {
        List<String> a = new ArrayList<>();
        a.add("test");
        return a;
    }
    @GetMapping("/param2")
    public List<String> param(@RequestParam Map<String,Object> test) {
        List<String> a = new ArrayList<>();
        a.add("test");
        return a;
    }



    @PostMapping("/param3")
    public BodyBean param3(@RequestBody BodyBean test) {
        return test;
    }

}
