package ai.sangmado.jt808.protocol.message.content.JT808_Message_Content_0x8103_Parameter;

import ai.sangmado.jt808.protocol.ISpecificationContext;
import ai.sangmado.jt808.protocol.encoding.IJT808MessageBufferReader;
import ai.sangmado.jt808.protocol.encoding.IJT808MessageBufferWriter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 平台设置终端参数 - 参数项 - SMS消息重传次数
 */
@NoArgsConstructor
public class JT808_Message_Content_0x8103_PI_0x0007 extends JT808_Message_Content_0x8103_ParameterItem {
    public static final JT808_Message_Content_0x8103_ParameterItemId PARAMETER_ITEM_ID =
            JT808_Message_Content_0x8103_ParameterItemId.JT808_0x8103_0x0007;

    @Override
    public JT808_Message_Content_0x8103_ParameterItemId getParameterItemId() {
        return PARAMETER_ITEM_ID;
    }

    @Override
    public Integer getParameterItemLength() {
        return 4;
    }

    /**
     * SMS消息重传次数
     */
    @Getter
    @Setter
    private Long smsRetransmissionTimes;

    @Override
    public void serialize(ISpecificationContext ctx, IJT808MessageBufferWriter writer) {
        writer.writeDWord(getParameterItemId().getValue());
        writer.writeByte(getParameterItemLength());
        writer.writeDWord(getSmsRetransmissionTimes());
    }

    @Override
    public void deserialize(ISpecificationContext ctx, IJT808MessageBufferReader reader) {
        reader.readDWord();
        reader.readByte();
        setSmsRetransmissionTimes(reader.readDWord());
    }

    public static JT808_Message_Content_0x8103_PI_0x0007 decode(ISpecificationContext ctx, IJT808MessageBufferReader reader) {
        JT808_Message_Content_0x8103_PI_0x0007 content = new JT808_Message_Content_0x8103_PI_0x0007();
        content.deserialize(ctx, reader);
        return content;
    }
}
