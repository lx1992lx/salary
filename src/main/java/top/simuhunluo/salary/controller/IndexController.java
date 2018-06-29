package top.simuhunluo.salary.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "IndexController", tags = "IndexController的一些逻辑接口开发")
@RestController
public class IndexController {

    @ApiOperation(value = "index", notes = "index接口开发")
    @GetMapping("/index/{id}")
    public String index(@PathVariable(value = "id") Integer id) {
        System.out.println(id);
        return "你好";
    }
}
