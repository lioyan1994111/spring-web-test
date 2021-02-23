package web.handlerMapping;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.AbstractHandlerMapping;
import org.springframework.web.servlet.handler.MatchableHandlerMapping;
import org.springframework.web.servlet.handler.RequestMatchResult;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

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
     */
    public static class AbstractHandlerMappingStu{

    }


    public static class AbstractHandlerMethodMappingStu{

    }


    public static class RequestMappingInfoHandlerMappingStu{

    }


    public static class RequestMappingHandlerMappingStuClass{

    }


}
