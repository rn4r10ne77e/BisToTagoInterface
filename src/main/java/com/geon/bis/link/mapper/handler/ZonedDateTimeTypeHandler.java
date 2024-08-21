package com.geon.bis.link.mapper.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.*;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeTypeHandler extends BaseTypeHandler<ZonedDateTime> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, ZonedDateTime parameter, JdbcType jdbcType) throws SQLException {
        // Convert ZonedDateTime to OffsetDateTime for PostgreSQL
        OffsetDateTime offsetDateTime = parameter.toOffsetDateTime();
        ps.setObject(i, offsetDateTime, Types.TIMESTAMP_WITH_TIMEZONE);
    }

    @Override
    public ZonedDateTime getNullableResult(ResultSet rs, String columnName) throws SQLException {
        OffsetDateTime offsetDateTime = rs.getObject(columnName, OffsetDateTime.class);
        return offsetDateTime != null ? ZonedDateTime.from(offsetDateTime) : null;
    }

    @Override
    public ZonedDateTime getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        OffsetDateTime offsetDateTime = rs.getObject(columnIndex, OffsetDateTime.class);
        return offsetDateTime != null ? ZonedDateTime.from(offsetDateTime) : null;
    }

    @Override
    public ZonedDateTime getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        OffsetDateTime offsetDateTime = cs.getObject(columnIndex, OffsetDateTime.class);
        return offsetDateTime != null ? ZonedDateTime.from(offsetDateTime) : null;
    }
}
