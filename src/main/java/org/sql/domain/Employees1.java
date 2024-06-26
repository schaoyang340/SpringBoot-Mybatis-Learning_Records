package org.sql.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @TableName employees1
 */
@TableName(value ="employees1")
public class Employees1 implements Serializable {
    /**
     *
     */
    @TableId(value = "employee_id", type = IdType.AUTO)
    private Integer employeeId;

    /**
     *
     */
    @TableField(value = "first_name")
    private String firstName;

    /**
     *
     */
    @TableField(value = "last_name")
    private String lastName;

    /**
     *
     */
    @TableField(value = "email")
    private String email;

    /**
     *
     */
    @TableField(value = "phone_number")
    private String phoneNumber;

    /**
     *
     */
    @TableField(value = "job_id")
    private String jobId;

    /**
     *
     */
    @TableField(value = "salary")
    private Double salary;

    /**
     *
     */
    @TableField(value = "commission_pct")
    private Double commissionPct;

    /**
     *
     */
    @TableField(value = "manager_id")
    private Integer managerId;

    /**
     *
     */
    @TableField(value = "department_id")
    private Integer departmentId;

    /**
     *
     */
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai")
    @TableField(value = "hiredate")
    private Date hiredate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * 
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * 
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * 
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * 
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * 
     */
    public Double getCommissionPct() {
        return commissionPct;
    }

    /**
     * 
     */
    public void setCommissionPct(Double commissionPct) {
        this.commissionPct = commissionPct;
    }

    /**
     * 
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * 
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /**
     * 
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * 
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 
     */
    public Date getHiredate() {
        return hiredate;
    }

    /**
     * 
     */
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Employees1 other = (Employees1) that;
        return (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
            && (this.getFirstName() == null ? other.getFirstName() == null : this.getFirstName().equals(other.getFirstName()))
            && (this.getLastName() == null ? other.getLastName() == null : this.getLastName().equals(other.getLastName()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getJobId() == null ? other.getJobId() == null : this.getJobId().equals(other.getJobId()))
            && (this.getSalary() == null ? other.getSalary() == null : this.getSalary().equals(other.getSalary()))
            && (this.getCommissionPct() == null ? other.getCommissionPct() == null : this.getCommissionPct().equals(other.getCommissionPct()))
            && (this.getManagerId() == null ? other.getManagerId() == null : this.getManagerId().equals(other.getManagerId()))
            && (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getHiredate() == null ? other.getHiredate() == null : this.getHiredate().equals(other.getHiredate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmployeeId() == null) ? 0 : getEmployeeId().hashCode());
        result = prime * result + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        result = prime * result + ((getLastName() == null) ? 0 : getLastName().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getJobId() == null) ? 0 : getJobId().hashCode());
        result = prime * result + ((getSalary() == null) ? 0 : getSalary().hashCode());
        result = prime * result + ((getCommissionPct() == null) ? 0 : getCommissionPct().hashCode());
        result = prime * result + ((getManagerId() == null) ? 0 : getManagerId().hashCode());
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getHiredate() == null) ? 0 : getHiredate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", employeeId=").append(employeeId);
        sb.append(", firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", email=").append(email);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", jobId=").append(jobId);
        sb.append(", salary=").append(salary);
        sb.append(", commissionPct=").append(commissionPct);
        sb.append(", managerId=").append(managerId);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", hiredate=").append(hiredate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}