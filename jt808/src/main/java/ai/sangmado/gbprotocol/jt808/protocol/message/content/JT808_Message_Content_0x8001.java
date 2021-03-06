package ai.sangmado.gbprotocol.jt808.protocol.message.content;

import ai.sangmado.gbprotocol.jt808.protocol.IVersionedSpecificationContext;
import ai.sangmado.gbprotocol.jt808.protocol.enums.JT808MessageId;
import ai.sangmado.gbprotocol.jt808.protocol.enums.JT808PlatformCommonReplyResult;
import ai.sangmado.gbprotocol.jt808.protocol.serialization.IJT808MessageBufferReader;
import ai.sangmado.gbprotocol.jt808.protocol.serialization.IJT808MessageBufferWriter;
import lombok.*;

/**
 * 平台通用应答
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JT808_Message_Content_0x8001 extends JT808MessageContent {
    public static final JT808MessageId MESSAGE_ID = JT808MessageId.JT808_Message_0x8001;

    @Override
    public JT808MessageId getMessageId() {
        return MESSAGE_ID;
    }

    /**
     * 应答流水号
     * 对应的终端消息的流水号
     */
    private Integer ackSerialNumber;
    /**
     * 应答ID
     * 对应的终端消息的ID
     */
    private JT808MessageId ackId;
    /**
     * 结果
     */
    private JT808PlatformCommonReplyResult result;

    @Override
    public void serialize(IVersionedSpecificationContext ctx, IJT808MessageBufferWriter writer) {
        writer.writeWord(getAckSerialNumber());
        writer.writeWord(getAckId().getValue());
        writer.writeByte(getResult().getValue());
    }

    @Override
    public void deserialize(IVersionedSpecificationContext ctx, IJT808MessageBufferReader reader) {
        setAckSerialNumber(reader.readWord());
        setAckId(JT808MessageId.cast(reader.readWord()));
        JT808PlatformCommonReplyResult replyResult = JT808PlatformCommonReplyResult.cast(reader.readByte());
        setResult(replyResult);
    }

    public static JT808_Message_Content_0x8001 decode(IVersionedSpecificationContext ctx, IJT808MessageBufferReader reader) {
        JT808_Message_Content_0x8001 content = new JT808_Message_Content_0x8001();
        content.deserialize(ctx, reader);
        return content;
    }
}
