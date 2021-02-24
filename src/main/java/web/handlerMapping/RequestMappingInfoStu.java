package web.handlerMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.condition.PathPatternsRequestCondition;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;

import javax.servlet.http.HttpServletRequest;

/**
 * {@linkplain RequestMappingInfo}
 * 这个是关于 {@linkplain RequestMapping} 注解的解析类
 * 创建见：{@linkplain RequestMappingHandlerMappingStu.RequestMappingHandlerMappingStuClass#getMappingForMethod()}
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/24 2:40 下午
 */
public class RequestMappingInfoStu {
    /**
     *{@linkplain RequestMappingInfo#getDirectPaths()}
     * 1、判断成员变量 pathPatternsCondition 和 patternsCondition 返回为 RequestCondition对象
     *  根据 conf 的 patternParser 来判断 {@linkplain PathPatternsRequestCondition} 或者 {@linkplain PatternsRequestCondition} 默认第二个
     *      其中paths 为 RequestMapping注解的路径
     * 2、调用其方法 getDirectPaths或者 getDirectPaths
     *见{@linkplain PatternsRequestConditionStu#getDirectPaths()}
     *
     *
     *
     *
     */
    public void getDirectPaths() {

    }

    /**
     * {@linkplain RequestMappingInfo#compareTo(RequestMappingInfo, HttpServletRequest)}
     * 对RequestMappingInfo 进行排序
     * //TODO
     *
     */
    public void compareTo() {

    }
    /**
     * {@linkplain RequestMappingInfo#combine(RequestMappingInfo)}
     * 融合2个注解
     * 
     *
     */
    public void combine() {

    }

    /**
     * 通过 url获取复合要求 
     * {@linkplain RequestMappingInfo#getMatchingCondition(HttpServletRequest)}
     *
     * 1、先判断 请求类型
     * 2、PatternsRequestCondition 的  getMatchingCondition方法
     * 见{@linkplain PatternsRequestConditionStu#getMatchingCondition()}
     *
     *
     */
    public void getMatchingCondition(){
        
    }
}
