package web.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


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


}
