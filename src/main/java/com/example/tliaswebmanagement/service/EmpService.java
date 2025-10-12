package com.example.tliaswebmanagement.service;

import com.example.tliaswebmanagement.pojo.Emp;
import com.example.tliaswebmanagement.pojo.PageBean;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {
    PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);

    void delete(List<Integer> ids);

    void save(Emp emp);
}
