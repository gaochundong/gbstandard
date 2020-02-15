package ai.sangmado.jt1078.protocol.message.content;

import ai.sangmado.jt1078.protocol.enums.JT1078MessageId;
import ai.sangmado.jt1078.protocol.enums.JT1078ProtocolVersion;
import ai.sangmado.jt808.protocol.ISpecificationContext;
import ai.sangmado.jt808.protocol.encoding.IJT808MessageBufferReader;
import ai.sangmado.jt808.protocol.encoding.IJT808MessageBufferWriter;
import ai.sangmado.jt808.protocol.message.content.JT808MessageContent;
import lombok.*;

/**
 * 终端上传乘客流量
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JT1078_Message_Content_0x1005 extends JT808MessageContent<JT1078MessageId, JT1078ProtocolVersion> {
    public static final JT1078MessageId MESSAGE_ID = JT1078MessageId.JT1078_Message_0x1005;

    @Override
    public JT1078MessageId getMessageId() {
        return MESSAGE_ID;
    }

    /**
     * 起始时间
     */
    private Integer beginTime;
    /**
     * 结束时间
     */
    private Integer endTime;
    /**
     * 上车人数
     */
    private String numberOfPeopleGettingOn;
    /**
     * 下车人数
     */
    private String numberOfPeopleGettingOff;

    @Override
    public void serialize(ISpecificationContext<JT1078ProtocolVersion> ctx, IJT808MessageBufferWriter writer) {

    }

    @Override
    public void deserialize(ISpecificationContext<JT1078ProtocolVersion> ctx, IJT808MessageBufferReader reader) {

    }

    public static JT1078_Message_Content_0x1005 decode(ISpecificationContext<JT1078ProtocolVersion> ctx, IJT808MessageBufferReader reader) {
        JT1078_Message_Content_0x1005 content = new JT1078_Message_Content_0x1005();
        content.deserialize(ctx, reader);
        return content;
    }
}
