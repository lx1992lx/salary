package top.simuhunluo.salary.dao.model;

import java.util.Date;

public class HotCompany extends HotCompanyKey {
    private String companyname;

    private Integer pv;

    private Date createtime;

    private String hotjobs;

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getHotjobs() {
        return hotjobs;
    }

    public void setHotjobs(String hotjobs) {
        this.hotjobs = hotjobs == null ? null : hotjobs.trim();
    }
}