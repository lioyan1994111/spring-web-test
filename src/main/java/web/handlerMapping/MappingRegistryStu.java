package web.handlerMapping;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.AbstractHandlerMethodMapping;
import org.springframework.web.servlet.handler.HandlerMethodMappingNamingStrategy;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;

import java.lang.reflect.Method;

/**
 * {@linkplain AbstractHandlerMethodMapping.MappingRegistry}
 * 
 * 
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/24 1:53 下午
 */
public class MappingRegistryStu {

    /**
     * {@linkplain AbstractHandlerMethodMapping.MappingRegistry#getMappingsByDirectPath(String)}
     * 
     * 通过成员变量 pathLookup 获取
     * 
     * 
     */
    public void getMappingsByDirectPath(){
        
        
    }
    /**
     * {@linkplain AbstractHandlerMethodMapping.MappingRegistry#register(Object, Object, Method)}
     *
     * 参数：
     * T mapping  注解的解析
     * Object handler 类，可以能string
     * Method method 当前方法
     * 1、创建 {@linkplain HandlerMethod} 对象   (注册的所有内容都是这个)
     * 2、通过 {@linkplain RequestMappingInfo#getDirectPaths()} 获取url 如果有将其注册。
     * 3、通过 成员变量 {@linkplain HandlerMethodMappingNamingStrategy} 获取name 将其注册
     * 4、initCorsConfiguration 注册 //TODO
     *
     */
    public void register(){
        
    }
    
}
