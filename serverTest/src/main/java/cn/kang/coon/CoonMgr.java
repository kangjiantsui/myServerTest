package cn.kang.coon;

import cn.kang.netty.codec.GateWayPBMessageDecoder;
import cn.kang.netty.codec.PBMessageEncoder;
import cn.kang.netty.handler.client.GateWay2CilentInboundHandler;
import cn.kang.netty.handler.client.GateWayt2ClientOutboundHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class CoonMgr {

    public void init() {
        ThreadServer server = new ThreadServer();
        server.start();
    }


    public class ThreadServer extends Thread {
        @Override
        public void run() {
            loadClientCoons();
        }
    }

    private void loadClientCoons() {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workerGroup);
            b.channel(NioServerSocketChannel.class);
            b.childHandler(new ChannelInitializer<SocketChannel>() {
                @Override
                public void initChannel(SocketChannel ch) throws Exception {

                    ChannelHandlerAdapter decoder = new GateWayPBMessageDecoder();
                    ChannelHandlerAdapter encoder = new PBMessageEncoder();
                    ChannelInboundHandlerAdapter inBoundHandler = new GateWay2CilentInboundHandler();
                    ChannelOutboundHandlerAdapter outBoundHandler = new GateWayt2ClientOutboundHandler();

                    ch.pipeline().addLast(decoder);
                    ch.pipeline().addLast(inBoundHandler);
                    ch.pipeline().addLast(outBoundHandler);
                    ch.pipeline().addLast(encoder);
                }
            });
            b.option(ChannelOption.SO_BACKLOG, 20000);
            b.childOption(ChannelOption.SO_KEEPALIVE, false);
            b.option(ChannelOption.ALLOCATOR, PooledByteBufAllocator.DEFAULT);
            b.childOption(ChannelOption.ALLOCATOR, PooledByteBufAllocator.DEFAULT);
            b.option(ChannelOption.WRITE_BUFFER_WATER_MARK, WriteBufferWaterMark.DEFAULT);
            // 绑定端口，开始接收进来的连接
            ChannelFuture f = b.bind(9999).sync();
            f.channel().closeFuture().sync();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }
}
