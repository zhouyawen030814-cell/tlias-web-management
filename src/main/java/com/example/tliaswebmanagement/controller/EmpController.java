package com.example.tliaswebmanagement.controller;

import com.example.tliaswebmanagement.pojo.PageBean;
import com.example.tliaswebmanagement.pojo.Result;
import com.example.tliaswebmanagement.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10")Integer pageSize){
        log.info("分页查询，参数： {} {}",page,pageSize);
        PageBean pageBean = empService.page(page,pageSize);
        return Result.success(pageBean);
    }

}
