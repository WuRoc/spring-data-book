package com.oreilly.springdata.domain;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HiveSqlEntityRowMapper implements RowMapper<HiveSqlEntity>
{
    @Override
    public HiveSqlEntity mapRow(ResultSet rs, int rowNum)
            throws SQLException
    {
        HiveSqlEntity hiveSqlEntity = new HiveSqlEntity();
        hiveSqlEntity.setId(rs.getString("id"));
        hiveSqlEntity.setTheme_name(rs.getString("theme_name"));
        hiveSqlEntity.setTable_name(rs.getString("table_name"));
        hiveSqlEntity.setSql_statement(rs.getString("sql_statement"));
        hiveSqlEntity.setDate(rs.getString("date"));
        return hiveSqlEntity;
    }
}
