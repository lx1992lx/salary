package top.simuhunluo.salary.dao.model;

import java.util.Date;

public class Salary extends SalaryKey {
    private String companyname;

    private String jobname;

    private String place;

    private String salary;

    private Integer education;

    private Date createtime;

    private String welfare;

    private Integer pv;

    private Integer uv;

    private Integer authentic;

    private Integer unauthentic;

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare == null ? null : welfare.trim();
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    public Integer getAuthentic() {
        return authentic;
    }

    public void setAuthentic(Integer authentic) {
        this.authentic = authentic;
    }

    public Integer getUnauthentic() {
        return unauthentic;
    }

    public void setUnauthentic(Integer unauthentic) {
        this.unauthentic = unauthentic;
    }
}