package ai.sangmado.gbprotocol.gb19056.protocol.message.content.reply;

import ai.sangmado.gbprotocol.gb19056.protocol.enums.GB19056ReplyMessageId;
import ai.sangmado.gbprotocol.gb19056.protocol.message.content.GB19056MessageBlock;
import ai.sangmado.gbprotocol.jt808.protocol.IVersionedSpecificationContext;
import ai.sangmado.gbprotocol.jt808.protocol.serialization.IJT808MessageBufferReader;
import ai.sangmado.gbprotocol.jt808.protocol.serialization.IJT808MessageBufferWriter;
import lombok.Getter;
import lombok.Setter;

/**
 * 采集累计行驶里程
 */
@Getter
@Setter
public class GB19056_Reply_Message_Block_0x03 extends GB19056MessageBlock<GB19056ReplyMessageId> {
    public static final GB19056ReplyMessageId MESSAGE_ID = GB19056ReplyMessageId.GB19056_Message_Reply_0x03;

    @Override
    public GB19056ReplyMessageId getMessageId() {
        return MESSAGE_ID;
    }

    @Override
    public void serialize(IVersionedSpecificationContext ctx, IJT808MessageBufferWriter writer) {

    }

    @Override
    public void deserialize(IVersionedSpecificationContext ctx, IJT808MessageBufferReader reader) {

    }

    public static GB19056_Reply_Message_Block_0x03 decode(IVersionedSpecificationContext ctx, IJT808MessageBufferReader reader) {
        GB19056_Reply_Message_Block_0x03 content = new GB19056_Reply_Message_Block_0x03();
        content.deserialize(ctx, reader);
        return content;
    }
}
