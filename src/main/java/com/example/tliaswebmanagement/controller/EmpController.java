package com.example.tliaswebmanagement.controller;

import com.example.tliaswebmanagement.pojo.PageBean;
import com.example.tliaswebmanagement.pojo.Result;
import com.example.tliaswebmanagement.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10")Integer pageSize,
                       String name, Short gender,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd")LocalDate end){
        log.info("分页查询，参数： {},{},{},{},{},{}",page,pageSize,name,gender,begin,end);

        PageBean pageBean = empService.page(page,pageSize,name,gender,begin,end);
        return Result.success(pageBean);
    }

    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids){
        log.info("批量删除操作,ids:{}",ids);
        empService.delete(ids);
        return Result.success();
    }
}
