package com.geon.bis.link.mapper.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

public class StringArrayTypeHandler extends BaseTypeHandler<List<String>> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, List<String> parameter, JdbcType jdbcType) throws SQLException {
        Connection connection = ps.getConnection();
        Array array = connection.createArrayOf("text", parameter.toArray());
        ps.setArray(i, array);
    }

    @Override
    public List<String> getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Array array = rs.getArray(columnName);
        if (array != null) {
            return Arrays.asList((String[]) array.getArray());
        }
        return List.of();
    }

    @Override
    public List<String> getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Array array = rs.getArray(columnIndex);
        if (array != null) {
            return Arrays.asList((String[]) array.getArray());
        }

        return List.of();
    }

    @Override
    public List<String> getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Array array = cs.getArray(columnIndex);
        if (array != null) {
            return Arrays.asList((String[]) array.getArray());
        }
        return List.of();
    }
}
