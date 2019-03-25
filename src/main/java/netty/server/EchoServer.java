package netty.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.internal.logging.InternalLoggerFactory;
import netty.handler.EchoServerHandler;
import org.apache.log4j.Logger;

import java.net.InetSocketAddress;
import java.util.Scanner;

public class EchoServer {

    private final int PORT ;

    public EchoServer(int PORT) {
        this.PORT = PORT;
    }

    public void start() {
        final EchoServerHandler handler = new EchoServerHandler();
        //定义事件循环类型,这里应该使用的是nio的通信模型
        EventLoopGroup group = new NioEventLoopGroup();
        //定义服务器启动类
        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(group);
        bootstrap.channel(NioServerSocketChannel.class);
        bootstrap.localAddress(new InetSocketAddress(PORT));
        //定义子处理器
        bootstrap.childHandler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel ch) throws Exception {
                ch.pipeline().addLast(handler);
            }
        });
        try {
            //同步绑定服务器，阻塞直到绑定成功
            ChannelFuture channelFuture = bootstrap.bind().sync();
            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            try {
                group.shutdownGracefully().sync();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }

    //定义启动函数
    public static void main(String[] args) {
        new EchoServer(55112).start();
    }
}
