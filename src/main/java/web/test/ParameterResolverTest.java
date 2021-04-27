package web.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.RequestParamMapMethodArgumentResolver;
import org.springframework.web.method.annotation.RequestParamMethodArgumentResolver;
import org.springframework.web.servlet.mvc.method.annotation.PathVariableMethodArgumentResolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * zai spring mvc中 参数的解析测试用例
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/4/15 10:56 上午
 */
@RestController
@RequestMapping("/pr")
public class ParameterResolverTest {


    /**
     * {@linkplain RequestParamMethodArgumentResolver}
     * <p>
     * 可解析内容：
     * 1、有{@linkplain RequestParam} 注解的参数。要求 为map类型时必须有name属性
     * 2、MultipartFile 类型的参数
     * <p>
     * <p>
     * 解析过程
     * 1、默认值，转换等交给父类来做，子类实现request的获取
     */
    @GetMapping("/id")
    public List<String> RequestParamMethodArgumentResolverFalse(@RequestParam String id) {

        List<String> a = new ArrayList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add(id);
        return a;
    }

    /**
     * {@linkplain RequestParamMapMethodArgumentResolver}
     * <p>
     * 与{@linkplain RequestParamMethodArgumentResolver} 相同
     * 不同点在这个是解析map的，会将所有参数都封装到map里
     *
     * @param map
     */
    @GetMapping("/map")
    public void RequestParamMapMethodArgumentResolver(@RequestParam Map<String, Object> map) {

        System.out.println(1111);

    }


    /**
     * {@linkplain PathVariableMethodArgumentResolver}
     * {@linkplain PathVariable}
     *
     * @param map
     */
    @GetMapping("/pathVariable/{id}/{aw}/{ada}/{asd}")
    public Map<String, Object> PathVariableMethodArgumentResolver(@PathVariable String id, @PathVariable Map<String, Object> map) {

        return map;

    }


}
