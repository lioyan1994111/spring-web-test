package tomcat.connector;

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
}
