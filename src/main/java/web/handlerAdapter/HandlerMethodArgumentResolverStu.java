package web.handlerAdapter;

import org.springframework.beans.factory.config.BeanExpressionResolver;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.bind.support.WebRequestDataBinder;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.annotation.AbstractNamedValueMethodArgumentResolver;
import org.springframework.web.method.annotation.RequestParamMapMethodArgumentResolver;
import org.springframework.web.method.annotation.RequestParamMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Part;

/**
 * {@linkplain HandlerMethodArgumentResolver}
 * 参数解析器，根据用户请求，解析参数。
 * supportsParameter
 * 判断当前class是否支持该参数
 * resolveArgument
 * 解析
 * MethodParameter parameter   方法参数
 * ModelAndViewContainer mavContainer
 * NativeWebRequest webRequest   请求的request
 * WebDataBinderFactory binderFactory
 * <p>
 * <p>
 * 一下为默认的一些解析器
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/25 9:57 上午
 */
public class HandlerMethodArgumentResolverStu {


    /**
     * {@linkplain AbstractNamedValueMethodArgumentResolver}
     */
    public static class AbstractNamedValueMethodArgumentResolverStu {


        /**
         * 模版方法部分子类实现
         * {@linkplain AbstractNamedValueMethodArgumentResolver#resolveArgument(MethodParameter, ModelAndViewContainer, NativeWebRequest, WebDataBinderFactory)} ()}
         * 1、根据参数对象解析出对应的NamedValueInfo，并进行缓存
         *      其中定义{@linkplain AbstractNamedValueMethodArgumentResolver#createNamedValueInfo(MethodParameter)} 初步创建
         *      {@linkplain AbstractNamedValueMethodArgumentResolver#updateNamedValueInfo(MethodParameter, AbstractNamedValueMethodArgumentResolver.NamedValueInfo)} 完善对象
         * 2、根据对于name 通过 beanFactory中解析一遍参数，并且有{@linkplain BeanExpressionResolver} 解析 //TODO
         * 3、解析值{@linkplain AbstractNamedValueMethodArgumentResolver#resolveName(String, MethodParameter, NativeWebRequest)}
         *      子类实现
         * 4、无解析到时，返回默认值。 根据 required 和没有默认值保存。子类可覆盖{@linkplain AbstractNamedValueMethodArgumentResolver#handleMissingValue(String, MethodParameter)}
         * 5、允许为空时，处理boolean，其他基本类型报错
         * 6、对于 空字符串也是也是返回默认值
         * 7、通过{@linkplain WebRequestDataBinder}对象 转换返回值 //TODO
         * 8、预留子类方法做最后处理{@linkplain AbstractNamedValueMethodArgumentResolver#handleResolvedValue(Object, String, MethodParameter, ModelAndViewContainer, NativeWebRequest)}
         *
         *
         *
         * 
         * 
         */
        public void resolveArgument(){
            
        }
        
        
        /**
         *{@linkplain RequestParamMethodArgumentResolver}
         * 
         * 
         * 
         */
        public static class RequestParamMethodArgumentResolverStu {
            /**
             * {@linkplain RequestParamMethodArgumentResolver#supportsParameter(MethodParameter)}
             * 1、以{@linkplain RequestParam} 修饰时，如果时Map类型，必须有name，不需要
             * 2、被{@linkplain RequestPart} 修饰时，不可以解析
             * 3、{@linkplain MultipartFile}类型或者 这个类型的 集合或者数组
             * 4、{@linkplain Part}同上
             * 5、useDefaultResolution 为true 将解析基本类型数据，与器集合
             *
             * 
             */
            public void supportsParameter(){
                
            }

            /**
             * {@linkplain RequestParamMethodArgumentResolver#createNamedValueInfo(MethodParameter)}
             * 针对 RequestParam 注解解析
             *
             */
            public void createNamedValueInfo(){


            }
            /**
             * {@linkplain RequestParamMethodArgumentResolver#updateNamedValueInfo(MethodParameter, AbstractNamedValueMethodArgumentResolver.NamedValueInfo)}
             *
             * 注解中没有name时， 使用字段名
             *
             */
            public void updateNamedValueInfo(){

            }
            /**
             * {@linkplain RequestParamMethodArgumentResolver#resolveName(String, MethodParameter, NativeWebRequest)}
             * //TODO
             *
             */
            public void resolveName(){

            }
        }

    }

    /***
     * {@linkplain RequestParamMapMethodArgumentResolver}
     *
     *
     */
    public static class RequestParamMapMethodArgumentResolverStu{

        /**
         * {@linkplain RequestParamMethodArgumentResolver#supportsParameter(MethodParameter)}
         *  被 {@linkplain RequestParam} 修饰, 而且是map类型，同时name 没有
         *
         *
         */
        public void supportsParameter(){

        }


        /**
         * {@linkplain RequestParamMapMethodArgumentResolver#resolveArgument(MethodParameter, ModelAndViewContainer, NativeWebRequest, WebDataBinderFactory)}
         *
         *
         */
        public void resolveArgument(){

        }

    }


}
