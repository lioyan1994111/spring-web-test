package tomcat.test;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/20 3:19 下午
 */
public class Run {

    public static void main(String[] args) throws LifecycleException {

        //构建tomcat对象,此对象为启动tomcat服务的入口对象
        Tomcat t = new Tomcat();
        //构建Connector对象,此对象负责与客户端的连接.
        Connector con = new Connector();
        //设置服务端的监听端口
        con.setPort(8080);
        //将Connector注册到service中
        t.getService().addConnector(con);
        //注册servlet
        Context ctx = t.addContext("/", null);
        Tomcat.addServlet(
                ctx,
                "helloServlet",
                new HelloServlet());
        //映射servlet
        ctx.addServletMappingDecoded("/hello", "helloServlet");
        //启动tomcat
        t.start();
        //阻塞当前线程
        System.out.println(Thread.currentThread().getName());
        t.getServer().await();


    }
}
