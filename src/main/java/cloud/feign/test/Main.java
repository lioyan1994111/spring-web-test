package cloud.feign.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/22 3:50 下午
 */
@SpringBootApplication
@EnableFeignClients
public class Main {

    public static void main(String[] args) {
        try {
            final ConfigurableApplicationContext run = SpringApplication.run(Main.class, "----spring.profiles.active=pro");
            final FeignTest bean = run.getBean(FeignTest.class);

            final List<String> stringObjectMap = bean.requestParamMethodArgumentResolverFalse("123");


            TestBean testBean = new TestBean();
            testBean.setA("a");
            testBean.setId(23);
            final List<String> stringObjectMap2 = bean.requestParamMethodArgumentResolverFalse2(testBean);
            System.out.println(stringObjectMap);
        }catch (Exception e){
         e.printStackTrace();
        }finally {
            System.exit(0);
        }
    }
}
