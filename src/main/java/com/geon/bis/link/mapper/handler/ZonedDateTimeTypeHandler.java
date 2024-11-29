package com.geon.bis.link.mapper.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.*;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeTypeHandler extends BaseTypeHandler<ZonedDateTime> {

    private static final ZoneId KST_ZONE_ID = ZoneId.of("Asia/Seoul");

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, ZonedDateTime parameter, JdbcType jdbcType) throws SQLException {
        // Convert ZonedDateTime to OffsetDateTime for PostgreSQL
        ZonedDateTime ksDateTime= parameter.withZoneSameInstant(KST_ZONE_ID);
        OffsetDateTime offsetDateTime = ksDateTime.toOffsetDateTime();
        ps.setObject(i, offsetDateTime, Types.TIMESTAMP_WITH_TIMEZONE);
    }
    @Override
    public ZonedDateTime getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Timestamp timestamp = rs.getTimestamp(columnName);
        if (timestamp != null) {
            return timestamp.toInstant().atZone(KST_ZONE_ID); // KST로 변환
        }
        return null;
    }

    @Override
    public ZonedDateTime getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Timestamp timestamp = rs.getTimestamp(columnIndex);
        if (timestamp != null) {
            return timestamp.toInstant().atZone(KST_ZONE_ID); // KST로 변환
        }
        return null;
    }

    @Override
    public ZonedDateTime getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Timestamp timestamp = cs.getTimestamp(columnIndex);
        if (timestamp != null) {
            return timestamp.toInstant().atZone(KST_ZONE_ID); // KST로 변환
        }
        return null;
    }
}
