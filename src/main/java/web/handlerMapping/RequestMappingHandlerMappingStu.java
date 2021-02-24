package web.handlerMapping;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.AbstractHandlerMapping;
import org.springframework.web.servlet.handler.AbstractHandlerMethodMapping;
import org.springframework.web.servlet.handler.MatchableHandlerMapping;
import org.springframework.web.servlet.handler.RequestMatchResult;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMapping;
import org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMethodMappingNamingStrategy;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

/**
 * {@linkplain RequestMappingHandlerMapping}
 *
 * 初始化：{@linkplain WebMvcAutoConfiguration.EnableWebMvcConfiguration#requestMappingHandlerMapping(ContentNegotiationManager, FormattingConversionService, ResourceUrlProvider)}
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/23 4:41 下午
 */
public class RequestMappingHandlerMappingStu {

    /**
     * {@linkplain HandlerMapping}
     *
     * 定义 getHandler 方法 获取 HandlerExecutionChain 对象
     *
     *
     */
    public static class  HandlerMappingStu{


    }


    /**
     * {@linkplain MatchableHandlerMapping}
     *
     *
     * getPatternParser 返回url匹配规则
     * match url匹配但返回对象不明{@linkplain RequestMatchResult}
     *
     */
    public static class MatchableHandlerMappingStu{

    }


    /**
     * {@linkplain AbstractHandlerMapping}
     *
     * 父类只有 HandlerMapping
     *
     * getHandler
     *
     * 1、定义 Object handler = getHandlerInternal(request);
     * 2、当为null时赋值 默认handler；
     * 3、当handler为string时，通过上下文返回bean；
     * 3、调用 getHandlerExecutionChain 返回{@linkplain HandlerExecutionChain}
     * 4、关于Cors 判断是否替代HandlerExecutionChain //TODO
     *
     *
     *
     */
    public static class AbstractHandlerMappingStu{
        /**
         * {@linkplain AbstractHandlerMapping#getHandlerExecutionChain(Object, HttpServletRequest)}
         * 1、当Object 为HandlerExecutionChain 时直接赋值，否则新建 其中 handler根据子类有不同比如：{@linkplain HandlerMethod} 对象
         * 2、将List<HandlerInterceptor> adaptedInterceptors 添加到 chain对象中 //TODO
         *
         *
         */
        public void getHandlerExecutionChain(){

        }


    }

    /**
     * {@linkplain AbstractHandlerMethodMapping}
     *
     * getHandlerInternal 方法
     *
     * 1、调用initLookupPath 获取请求路径 方法在{@linkplain AbstractHandlerMapping#initLookupPath(HttpServletRequest)}
     * 2、{@linkplain AbstractHandlerMethodMapping#lookupHandlerMethod(String, HttpServletRequest)} 通过url查找到对应的{@linkplain HandlerMethod}

     */
    public static class AbstractHandlerMethodMappingStu{

        /***
         * 1、从 MappingRegistry 对象中通过url 直接获取。方法 getMappingsByDirectPath 解析见：{@linkplain MappingRegistryStu#getMappingsByDirectPath()}
         * 2、通过getMatchingMapping 方法获取复合要要求的解析对象，将其保存在 List<Match> matches中，getMatchingMapping子类实现
         *  解析见：{@linkplain RequestMappingInfoStu#getMatchingCondition()}
         *  当第一步返回为空时，匹配所有路径
         * 3、当复合要求的只有一个时，直接返回
         *    当有多个时通过 getMappingComparator方法返回比较器，返回优先级最高的
         *    当没有时：
         *      调用handleNoMatch 方法，当前返回null
         *
         */
        public void lookupHandlerMethod(){



        }

    }

    /**
     * {@linkplain RequestMappingInfoHandlerMapping}
     *
     *
     */
    public static class RequestMappingInfoHandlerMappingStu{

        /***
         * 调用 {@linkplain RequestMappingInfo} 的 getDirectPaths 方法
         * 见：{@linkplain RequestMappingInfoStu#getDirectPaths()}
         * 解析注解与url的对照关系
         *
         */
        public void getDirectPaths(){


        }

        /**
         * 使用{@linkplain RequestMappingInfo}的 compareTo 方法
         * 见：{@linkplain RequestMappingInfoStu#compareTo()}
         *
         * 多个方法时 的比较方法
         */
        public void compareTo(){

        }
    }

    /**
     * {@linkplain RequestMappingHandlerMapping}
     *
     *
     * 构造函数
     * 注入 {@linkplain RequestMappingInfoHandlerMethodMappingNamingStrategy}解析见：
     * 使用见：{@linkplain MappingRegistryStu#register()}
     *
     * 初始化
     * 其中有 afterPropertiesSet 方法。在bean 创建时调用。
     * 逻辑如下：
     * 设置成员变量RequestMappingInfo.BuilderConfiguration config   //TODO
     * 调用父类：
     * 1、通过子类 isHandler 方法判断是否为handler ，RequestMappingHandlerMapping中 有{@linkplain Controller}和{@linkplain RequestMapping}注解的方法
     * 2、调用 detectHandlerMethods 方法
     *  通过{@linkplain AbstractHandlerMethodMapping#getMappingForMethod(Method, Class)} 方法获取复合要求的方法，子类实现
     *  //TODO Method invocableMethod = AopUtils.selectInvocableMethod(method, userType);
     *  将复合要求的类通过 registerHandlerMethod 方法注册到MappingRegistry 中。{@linkplain AbstractHandlerMethodMapping.MappingRegistry#register(Object, Object, Method)}注册 解析见：{@linkplain MappingRegistryStu#register()}
     *  RequestMappingHandlerMapping 子类有附件内容：
     *
     */
    public static class RequestMappingHandlerMappingStuClass{

        /**
         * 1、获取方法 {@linkplain RequestMapping} 的注解
         * 2、获取calss的{@linkplain RequestMapping} 的注解
         *      创建 RequestMappingInfo 对象见：{@linkplain RequestMappingHandlerMapping#createRequestMappingInfo(AnnotatedElement)}
         * 3、通过{@linkplain RequestMappingInfo#combine(RequestMappingInfo)} 组合两个注解 解析见：{@linkplain RequestMappingInfoStu#combine()}
         * 4、
         *
         * //TODO
         * String prefix = getPathPrefix(handlerType);
         * 			if (prefix != null) {
         * 				info = RequestMappingInfo.paths(prefix).options(this.config).build().combine(info);
         *                        }
         */
        public void getMappingForMethod(){


        }

        /**
         * 如果包含  {@linkplain RequestBody}
         * condition.setBodyRequired(annot.getBoolean("required"));
         * TODO
         *
         */
        public void registerHandlerMethod(){


        }


    }


}
