package com.example.tliaswebmanagement.controller;

import com.example.tliaswebmanagement.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Slf4j
@RestController
public class UploadController {

    @PostMapping("/upload")
    public Result upload(String username, Integer age, MultipartFile image) throws IOException {
        log.info("文件上传：{}，{},{}",username,age,image);
        String originalFilename = image.getOriginalFilename();

        image.transferTo(new File("E:\\images\\"+originalFilename));

        return Result.success();
    }


}
