package org.sql.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName jobs
 */
@TableName(value ="jobs")
public class Jobs implements Serializable {
    /**
     * 
     */
    @TableId(value = "job_id")
    private String jobId;

    /**
     * 
     */
    @TableField(value = "job_title")
    private String jobTitle;

    /**
     * 
     */
    @TableField(value = "min_salary")
    private Integer minSalary;

    /**
     * 
     */
    @TableField(value = "max_salary")
    private Integer maxSalary;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * 
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * 
     */
    public Integer getMinSalary() {
        return minSalary;
    }

    /**
     * 
     */
    public void setMinSalary(Integer minSalary) {
        this.minSalary = minSalary;
    }

    /**
     * 
     */
    public Integer getMaxSalary() {
        return maxSalary;
    }

    /**
     * 
     */
    public void setMaxSalary(Integer maxSalary) {
        this.maxSalary = maxSalary;
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
        Jobs other = (Jobs) that;
        return (this.getJobId() == null ? other.getJobId() == null : this.getJobId().equals(other.getJobId()))
            && (this.getJobTitle() == null ? other.getJobTitle() == null : this.getJobTitle().equals(other.getJobTitle()))
            && (this.getMinSalary() == null ? other.getMinSalary() == null : this.getMinSalary().equals(other.getMinSalary()))
            && (this.getMaxSalary() == null ? other.getMaxSalary() == null : this.getMaxSalary().equals(other.getMaxSalary()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getJobId() == null) ? 0 : getJobId().hashCode());
        result = prime * result + ((getJobTitle() == null) ? 0 : getJobTitle().hashCode());
        result = prime * result + ((getMinSalary() == null) ? 0 : getMinSalary().hashCode());
        result = prime * result + ((getMaxSalary() == null) ? 0 : getMaxSalary().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jobId=").append(jobId);
        sb.append(", jobTitle=").append(jobTitle);
        sb.append(", minSalary=").append(minSalary);
        sb.append(", maxSalary=").append(maxSalary);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}