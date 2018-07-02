package top.simuhunluo.salary.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.simuhunluo.salary.dao.model.ResultObject;
import top.simuhunluo.salary.dao.model.User;
import top.simuhunluo.salary.exception.CommonErrorCode;
import top.simuhunluo.salary.utils.JsonUtils;
import top.simuhunluo.salary.utils.ResultUtils;

import java.util.ArrayList;
import java.util.List;

@Api(value = "IndexController", tags = "IndexController的一些逻辑接口开发")
@RestController
public class IndexController {

    @ApiOperation(value = "index", notes = "index接口开发")
    @GetMapping("/index/{id}")
    public String index(@PathVariable(value = "id") Integer id) {
        System.out.println(id);
        return "你好";
    }

    @ApiOperation(value = "person",notes = "测试类接口")
    @GetMapping("/person")
    public List<User> person(@RequestParam String uid){
        User user=new User();
        user.setUid("1234");
        user.setName("scc");
        user.setAge(23);

        User user1=new User();
        user1.setUid("1234");
        user1.setName("scc");
        user1.setAge(213);
        List<User> list=new ArrayList<>();
        list.add(user);
        list.add(user1);
        return list;
    }

    @ApiOperation(value = "person2",notes = "测试类接口")
    @GetMapping("/person2")
    public ResultObject person2(@RequestParam String uid){
        User user=new User();
        user.setUid("1234");
        user.setName("scc");
        user.setAge(23);
        return ResultUtils.out(CommonErrorCode.SUCCESS,user);
    }
}
