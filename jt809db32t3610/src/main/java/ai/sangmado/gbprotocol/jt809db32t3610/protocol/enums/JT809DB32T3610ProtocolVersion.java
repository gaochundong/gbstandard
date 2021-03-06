package ai.sangmado.gbprotocol.jt809db32t3610.protocol.enums;

import ai.sangmado.gbprotocol.gbcommon.enums.IProtocolVersion;
import ai.sangmado.gbprotocol.jt809db32t3610.protocol.exceptions.UnsupportedJT809DB32T3610ProtocolVersionException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * DB32/T3610 协议版本
 */
@Getter
@Setter
public class JT809DB32T3610ProtocolVersion implements IProtocolVersion {
    public static final JT809DB32T3610ProtocolVersion V2019 = new JT809DB32T3610ProtocolVersion("V2019", 2019, "DB32/T3610 2019 版本");

    @JsonIgnore
    private String name;

    @JsonInclude
    private Integer value;

    @JsonIgnore
    private String description;

    public JT809DB32T3610ProtocolVersion(String name, int value, String description) {
        this.name = name;
        this.value = value;
        this.description = description;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof JT809DB32T3610ProtocolVersion)) {
            return false;
        }
        return this.getValue().equals(((JT809DB32T3610ProtocolVersion) obj).getValue());
    }

    @Override
    public int compareTo(IProtocolVersion o) {
        return this.getValue().compareTo(o.getValue());
    }

    private static final Map<Integer, JT809DB32T3610ProtocolVersion> mapping = new HashMap<>();

    static {
        mapping.put(V2019.getValue(), V2019);
    }

    public static JT809DB32T3610ProtocolVersion cast(int value) {
        JT809DB32T3610ProtocolVersion item = mapping.get(value);
        if (item == null) {
            throw new UnsupportedJT809DB32T3610ProtocolVersionException(String.format(
                    "Cannot cast integer [%s] to [%s] enum.",
                    value, JT809DB32T3610ProtocolVersion.class.getSimpleName()));
        }
        return item;
    }

    public static JT809DB32T3610ProtocolVersion tryCast(int value) {
        return mapping.get(value);
    }

    public static boolean isInstanceOf(int value) {
        return tryCast(value) != null;
    }
}
