package com.oreilly.springdata.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * @ClassName ReadBookDTO
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 2.0
 * @Create 2022-10-13 20:57
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/

@JsonIgnoreProperties(ignoreUnknown = true)
public class HiveSqlEntity implements Serializable
{
    private static final long serialVersionUID = 6648416741847674063L;

    private String id;
    //库名
    private String theme_name;
    //表名
    private String table_name;
    //sql语句
    private String sql_statement;
    //查询时间
    private String date;

    public HiveSqlEntity(String id)
    {
        super();
        this.id = id;
    }

    public HiveSqlEntity()
    {
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTheme_name()
    {
        return theme_name;
    }

    public void setTheme_name(String theme_name)
    {
        this.theme_name = theme_name;
    }

    public String getTable_name()
    {
        return table_name;
    }

    public void setTable_name(String table_name)
    {
        this.table_name = table_name;
    }

    public String getSql_statement()
    {
        return sql_statement;
    }

    public void setSql_statement(String sql_statement)
    {
        this.sql_statement = sql_statement;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }
}