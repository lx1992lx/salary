package top.simuhunluo.salary.controller;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.simuhunluo.salary.dao.model.Company;
import top.simuhunluo.salary.dao.model.ResultObject;
import top.simuhunluo.salary.exception.SalaryErrorCode;
import top.simuhunluo.salary.service.CompanyService;
import top.simuhunluo.salary.utils.PageUtils;
import top.simuhunluo.salary.utils.ResultUtils;

import java.util.List;

@Api(value = "CompanyController", tags = "CompanyController 的一些逻辑接口开发")
@RestController
public class CompanyController {

    @Autowired(required = false)
    private CompanyService companyService;

    @GetMapping("/company")
    public ResultObject getCompanyList(
            @RequestParam(required = false, defaultValue = "1") @ApiParam(value = "页号，从1开始", example = "1") Integer pageNum,
            @RequestParam(required = false, defaultValue = "0") @ApiParam(value = "页大小", example = "10") Integer pageSize,
            @RequestParam(required = false) @ApiParam(value = "排序参数。example:+node_name-node_id") String sort) {
        PageUtils.startPage(pageNum, pageSize, sort);
//        Company company = new Company();
        List<Company> companyList = companyService.getCompanyList();
        try {
            if (companyList.size() > 0) {
                PageInfo<Company> pageInfo = new PageInfo<>(companyList);
                return ResultUtils.out(SalaryErrorCode.SUCCESS, pageInfo);
            } else {
                return ResultUtils.out(SalaryErrorCode.RESULT_NOT_EXIST, "");
            }
        } catch (Exception e) {
            return ResultUtils.out(SalaryErrorCode.RESULT_NOT_EXIST, e.getMessage());
        }


    }
}
