package ai.sangmado.gbprotocol.gb32960.protocol.serialization;

import com.google.common.primitives.UnsignedLong;

import java.nio.ByteBuffer;

/**
 * GB32960 消息Buffer写入器
 */
public interface IGB32960MessageBufferWriter {

    /**
     * 写入 BYTE 无符号单字节整型 (字节，8位)
     *
     * @param x 写入数据
     */
    void writeByte(byte x);

    /**
     * 写入 BYTE 无符号单字节整型 (字节，8位)
     *
     * @param x 写入数据
     */
    void writeByte(int x);

    /**
     * 写入 WORD 无符号双字节整型 (字节，16位)
     *
     * @param x 写入数据
     */
    void writeWord(int x);

    /**
     * 写入 DWORD 无符号四字节整型 (字节，32位)
     *
     * @param x 写入数据
     */
    void writeDWord(long x);

    /**
     * 写入 n 字节数据
     *
     * @param x 写入数据
     */
    void writeBytes(byte[] x);

    /**
     * 写入 n 字节数据
     *
     * @param x      写入数据
     * @param offset 开始位置
     * @param length 写入长度
     */
    void writeBytes(byte[] x, int offset, int length);

    /**
     * 写入 n 字节数据
     *
     * @param x 写入数据
     */
    void writeBytes(ByteBuffer x);

    /**
     * 写入 GBK 编码字符串数据，若无数据，置空
     *
     * @param x 写入数据
     */
    void writeString(String x);
}
