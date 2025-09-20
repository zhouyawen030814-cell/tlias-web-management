package com.example.tliaswebmanagement.mapper;

import com.example.tliaswebmanagement.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {



    //@Select("select * from tlias.emp")
    List<Emp> list(@Param("name") String name,
                   @Param("gender") Short gender,
                   @Param("begin") LocalDate begin,
                   @Param("end") LocalDate end);


    void delete(@Param("ids") List<Integer> ids);
}
