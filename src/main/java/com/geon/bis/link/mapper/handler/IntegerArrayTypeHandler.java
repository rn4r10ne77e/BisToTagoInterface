package com.geon.bis.link.mapper.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

public class IntegerArrayTypeHandler extends BaseTypeHandler<List<Integer>> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, List<Integer> parameter, JdbcType jdbcType) throws SQLException {
        Connection connection = ps.getConnection();
        Array array = connection.createArrayOf("integer", parameter.toArray());
        ps.setArray(i, array);
    }

    @Override
    public List<Integer> getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Array array = rs.getArray(columnName);
        if (array != null) {
            return Arrays.asList((Integer[]) array.getArray());
        }
        return List.of();
    }

    @Override
    public List<Integer> getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Array array = rs.getArray(columnIndex);
        if (array != null) {
            return Arrays.asList((Integer[]) array.getArray());
        }

        return List.of();
    }

    @Override
    public List<Integer> getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Array array = cs.getArray(columnIndex);
        if (array != null) {
            return Arrays.asList((Integer[]) array.getArray());
        }
        return List.of();
    }
}
