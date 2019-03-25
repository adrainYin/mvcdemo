package netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;

public class NettyTelentServer {

    public static final int PORT = 55112;
    private ServerBootstrap bootstrap;

    public void connect() {

        Channel channel = new NioServerSocketChannel();
        ChannelFuture future = channel.connect(new InetSocketAddress("192.168.0.1", 55112));
        //注册监听器
        future.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture future) throws Exception {
                if (future.isSuccess()) {
                    System.out.println("连接已经建立");
                }
            }
        });
        ChannelInboundHandlerAdapter adapter;
    }


}
