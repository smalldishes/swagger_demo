package com.lora.controller;

import com.lora.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")

@Api(tags = "用户相关接口", description = "提供用户相关的 Rest API")
public class UserController {
    @ApiOperation("新增用户接口")
    @PostMapping("/add")
    public boolean addUser(@RequestBody User user){
        return false;
    }
    @GetMapping("/find/{id}")
    public User findById(@PathVariable int id){
        return new User();
    }
    @PutMapping("/update")
    public boolean update(@RequestBody User user){
        return true;
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id){
        return true;
    }



}
