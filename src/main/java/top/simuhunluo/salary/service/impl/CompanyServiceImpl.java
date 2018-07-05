package top.simuhunluo.salary.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.simuhunluo.salary.dao.mapper.CompanyMapper;
import top.simuhunluo.salary.dao.model.Company;
import top.simuhunluo.salary.service.CompanyService;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyMapper companyMapper;

    @Override
    public List<Company> getCompanyList() {
        return companyMapper.selectAll();
    }
}
