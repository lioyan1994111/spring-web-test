package web;

import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletRegistrationBean;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * spring-web 的启动
 *{@linkplain ServletWebServerApplicationContext#onRefresh()} createWebServer
 * 初次加载 tomcat 内容
 *
 * 1、createWebServer 方法
 *  创建 ServletWebServerFactory 对象。从上下文中检索。使用@Bean 注入
 *  调用getWebServer 方法， 在其中有初始化TOmcat的相关内容。
 *  并且将 ServletContextInitializer 对象添加到 centext中，在tomcat 启动的时候调用onStartup方法
 *  其中通过 {@linkplain DispatcherServletRegistrationBean} 将{@linkplain DispatcherServlet}添加到上下文
 *
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/23 3:47 下午
 */
public class Start {
}
