package web.handlerAdapter;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * {@linkplain RequestMappingHandlerAdapter}
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/24 5:46 下午
 */
public class RequestMappingHandlerAdapterStu {

    /**
     *
     * {@linkplain org.springframework.web.servlet.HandlerAdapter}
     *
     * supports 判断是否使用当前类
     * handle 执行请求
     * getLastModified 返回上传时间
     *
     *
     */
    public static class HandlerAdapterStu{



    }

    /**
     * {@linkplain AbstractHandlerMethodAdapter}
     *
     * {@linkplain AbstractHandlerMethodAdapter#supports(Object)}
     *  判断参数是否为{@linkplain HandlerMethod}子类。并且{@linkplain AbstractHandlerMethodAdapter#supportsInternal(HandlerMethod)}由子类判断
     *
     *
     *  {@linkplain AbstractHandlerMethodAdapter#handle(HttpServletRequest, HttpServletResponse, Object)}
     * 子类实现{@linkplain AbstractHandlerMethodAdapter#handleInternal(HttpServletRequest, HttpServletResponse, HandlerMethod)}
     *
     * {@linkplain AbstractHandlerMethodAdapter#getLastModified(HttpServletRequest, Object)}
     * 子类实现{@linkplain AbstractHandlerMethodAdapter#getLastModifiedInternal(HttpServletRequest, HandlerMethod)}
     *
     *
     *
     *
     *
     */
    public static class AbstractHandlerMethodAdapterStu{



    }

    /**
     * {@linkplain RequestMappingHandlerAdapter}
     *
     * 初始化
     *  {@linkplain RequestMappingHandlerAdapter#afterPropertiesSet()}
     *  通过 {@linkplain RequestMappingHandlerAdapter#getDefaultArgumentResolvers()}方法设置参数解析其
     *  赋值给 argumentResolvers 解析见{@linkplain HandlerMethodArgumentResolverStu}
     *
     */
    public static class RequestMappingHandlerAdapterClassStu{

        /**
         * {@linkplain RequestMappingHandlerAdapter#handleInternal(HttpServletRequest, HttpServletResponse, HandlerMethod)}
         *
         *
         */
        public void handleInternal(){


        }




    }


}
