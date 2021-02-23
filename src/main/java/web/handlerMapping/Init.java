package web.handlerMapping;

import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerExecutionChain;

/**
 *
 * {@linkplain org.springframework.web.servlet.HandlerMapping}
 * 根据不同的req请求方法该请求对应的 {@linkplain HandlerExecutionChain}
 *
 * handlerMappings 加载
 * 1、对于所有都是通过从bean上下文中加载，其中方法为{@linkplain DispatcherServlet#initHandlerMappings(ApplicationContext)}
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/23 4:37 下午
 */
public class Init {
}
