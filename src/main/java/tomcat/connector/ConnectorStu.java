package tomcat.connector;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.connector.CoyoteAdapter;
import org.apache.catalina.util.LifecycleMBeanBase;
import org.apache.coyote.http11.Http11NioProtocol;

/**
 * {@linkplain Connector}
 * <p>
 * 继承 {@linkplain LifecycleMBeanBase}复合生命周期。
 * 会执行初始化方法： initInternal
 * start 方法： startInternal
 * <p>
 * 一个 Connector可以与一个 Service 关联
 * 通过 Tomcat t = new Tomcat();  t.getService().addConnector(connector);
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/20 7:47 下午
 */
public class ConnectorStu {


    /***
     * 设置
     *  protocolHandler
     *  默认为 HTTP/1.1新建内容为
     *  {@linkplain Http11NioProtocol}
     *
     *
     */
    public void ConnectorNew() {

    }


    /***
     * {@linkplain Connector#initInternal()}
     * 1、创建 {@linkplain CoyoteAdapter} 对象
     * 2、在 protocolHandler 中设置 CoyoteAdapter
     * 3、执行 protocolHandler 的init见：{@linkplain Http11NioProtocolStu#init()}
     *
     *
     *
     */
    public void initInternal() {


    }

    /**
     *
     * {@linkplain Connector#startInternal()}
     * 执行 protocolHandler 的init见：{@linkplain Http11NioProtocolStu#start()}
     * protocolHandler
     *
     */
    public void startInternal() {


    }

}
