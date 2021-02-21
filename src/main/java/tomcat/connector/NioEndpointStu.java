package tomcat.connector;

import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.apache.tomcat.util.net.NioEndpoint;

/**
 *
 * {@linkplain NioEndpoint}
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/20 8:44 下午
 */
public class NioEndpointStu {

    /**
     * {@linkplain NioEndpoint#init()}
     *
     * 之后会被调用到 {@linkplain NioEndpoint#bind()}方法上
     * 新建一个 ServerSocketChannel 对象并绑定8080端口
     * 对象为：{@linkplain NioEndpoint#serverSock}
     *
     */
    public void  init(){

    }

    /**
     * {@linkplain NioEndpoint#startInternal()}
     * 1、创建线程池 {@linkplain NioEndpoint#createExecutor()}
     * 2、创建 {@linkplain NioEndpoint.Poller}并异步执行 {@linkplain NioEndpoint.Poller#run()}
     *
     *
     */
    public void start(){

    }

    /**
     * {@linkplain NioEndpoint.Poller}
     * 构造函数 this.selector = Selector.open();
     *
     *
     *
     *
     */
    public static class Poller{

    }
}
