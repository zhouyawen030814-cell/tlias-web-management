package com.example.tliaswebmanagement.controller;

import com.example.tliaswebmanagement.pojo.Dept;
import com.example.tliaswebmanagement.pojo.Emp;
import com.example.tliaswebmanagement.pojo.Result;
import com.example.tliaswebmanagement.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");

        List<Dept> deptList = deptService.list();

        return Result.success(deptList);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门：{}",id);
        deptService.delete(id);
        return Result.success();
    }

    @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("新增部门: {}",dept);
        deptService.add(dept);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result search(@PathVariable Integer id){
        log.info("根据id查询部门数据:id = {}",id);
        Dept dept = deptService.getById(id);
        if (dept == null){
            return Result.error("部门不存在");
        }
        return Result.success(dept);
    }

    @PutMapping
    public Result update(@RequestBody Dept dept){
        deptService.update(dept);
        return Result.success();
    }





}
