package nio.nettyinaction.SimpleSample;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

@Sharable   //1
public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {

  @Override
  public void channelActive(ChannelHandlerContext ctx) {
    ctx.writeAndFlush(Unpooled.copiedBuffer("Netty rocks!", CharsetUtil.UTF_8)); //2
  }


  @Override
  protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf in) throws Exception {
    System.out.println("Client received: " + in.toString(CharsetUtil.UTF_8)); //3
  }

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx,
                              Throwable cause) {                    //4
    cause.printStackTrace();
    ctx.close();
  }
}
