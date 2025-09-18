package com.example.tliaswebmanagement.mapper;

import com.example.tliaswebmanagement.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {

    //查询总数
    @Select("select count(*) from tlias.emp;")
    public Long count();

    //分页查询
    @Select("select * from tlias.emp limit #{start},#{pageSize};")
    public List<Emp> page(@Param("start") Integer start,@Param("pageSize") Integer pageSize);
}
