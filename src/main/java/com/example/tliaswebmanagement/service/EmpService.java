package com.example.tliaswebmanagement.service;

import com.example.tliaswebmanagement.pojo.PageBean;

public interface EmpService {
    PageBean page(Integer page, Integer pageSize);
}
