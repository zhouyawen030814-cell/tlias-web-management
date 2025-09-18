package com.example.tliaswebmanagement.mapper;

import com.example.tliaswebmanagement.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface  DeptMapper {

    @Select("select * from dept")
    List<Dept> list();


    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    @Insert("insert into dept (name, create_time, update_time) VALUES (#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);

    @Select("select * from dept where id = #{id}")
    Dept getById(@Param("id") Integer id);

    @Update("UPDATE dept SET name = #{name} WHERE id = #{id}")
    void update(Dept dept);
}
