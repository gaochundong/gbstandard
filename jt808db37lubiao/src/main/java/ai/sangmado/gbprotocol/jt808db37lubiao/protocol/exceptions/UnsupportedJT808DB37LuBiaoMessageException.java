package ai.sangmado.gbprotocol.jt808db37lubiao.protocol.exceptions;

import ai.sangmado.gbprotocol.gbcommon.enums.IMessageId;
import ai.sangmado.gbprotocol.jt808.protocol.exceptions.UnsupportedJT808MessageException;

/**
 * 不支持协议消息异常
 */
public class UnsupportedJT808DB37LuBiaoMessageException extends UnsupportedJT808MessageException {
    static final long serialVersionUID = -3780609898848634088L;

    public UnsupportedJT808DB37LuBiaoMessageException() {
        this("暂不支持该协议消息");
    }

    public UnsupportedJT808DB37LuBiaoMessageException(IMessageId messageId) {
        this("暂不支持该协议消息: " + messageId.getName());
    }

    public UnsupportedJT808DB37LuBiaoMessageException(String message) {
        super(message);
    }

    public UnsupportedJT808DB37LuBiaoMessageException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedJT808DB37LuBiaoMessageException(Throwable cause) {
        super(cause);
    }
}