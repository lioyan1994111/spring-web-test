package tomcat.connector;

import org.apache.tomcat.util.net.*;

import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;

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
     * 3、执行 startAcceptorThread 方法 {@linkplain AbstractEndpoint#startAcceptorThread()}
     *   创建 Acceptor 并 异步执行
     *
     */
    public void start(){

    }

    /**
     * 接受到请求后处理
     * 将器封装，并 注册到{@linkplain NioEndpoint.Poller} 中
     * {@linkplain NioEndpoint.Poller#register(NioChannel, NioEndpoint.NioSocketWrapper)}
     *
     */
    public void setSocketOptions(){

    }

    /**
     * {@linkplain NioEndpoint.Poller}
     * 构造函数 this.selector = Selector.open();
     *
     *
     *
     *
     */
    public static class PollerStu{

        /**
         *
         *  {@linkplain NioEndpoint.Poller#run()}
         * 1、调用events，当队列中有请求事件时，将该事件注册到selector 中 以 OP_READ 事件。并出站
         * 2、当selector 有事件时调用 {@linkplain NioEndpoint.Poller#processKey(SelectionKey, NioEndpoint.NioSocketWrapper)}处理
         * 3、调用{@linkplain AbstractEndpoint#processSocket(SocketWrapperBase, SocketEvent, boolean)} 处理
         *      封装为{@linkplain SocketProcessorBase}
         *      开启新的线程 Executor executor = getExecutor();
         *      处理请求
         *
         *
         */
        public void run(){

        }

        /**
         * {@linkplain NioEndpoint.Poller#register(NioChannel, NioEndpoint.NioSocketWrapper)}
         * 将请求保存在一个队列中，请求 run方法消费 {@linkplain NioEndpoint.Poller#events}
         *
         */
        public void register(){


        }

    }

    /**
     * {@linkplain Acceptor}
     * 构造函数： NioEndpoint 对象
     *
     */
    public static class  AcceptorStu{
        /**
         * 1、调用 serverSock.accept() 等待请求，当有请求时继续
         * 2、将处理交给 {@linkplain NioEndpoint#setSocketOptions(SocketChannel)}处理
         *
         *
         *
         *
         */
        public void run(){

        }
    }
}
