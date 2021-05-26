package cloud.feign.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/4/26 2:13 下午
 */
@FeignClient(name = "feignTest", url = "${feign.test.path}")
public interface FeignTest {


    @GetMapping("pr/id")
    public List<String> requestParamMethodArgumentResolverFalse(@RequestParam String id);

    @GetMapping("pr/id")
    public List<String> requestParamMethodArgumentResolverFalse2(@RequestBody TestBean id);



}
