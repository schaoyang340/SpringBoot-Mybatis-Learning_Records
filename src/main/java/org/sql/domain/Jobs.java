package org.sql.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;

/**
 * 
 * @TableName jobs
 */
@Setter
@Getter
@TableName(value ="jobs")
public class Jobs implements Serializable {
    /**
     *
     * -- GETTER --
     * <p>
     * -- SETTER --
     *


     */
    @TableId(value = "job_id")
    private String jobId;

    /**
     *
     * -- GETTER --
     * <p>
     * -- SETTER --
     *


     */
    @TableField(value = "job_title")
    private String jobTitle;

    /**
     *
     * -- GETTER --
     * <p>
     * -- SETTER --
     *


     */
    @TableField(value = "min_salary")
    private Integer minSalary;

    /**
     *
     * -- GETTER --
     * <p>
     * -- SETTER --
     *


     */
    @TableField(value = "max_salary")
    private Integer maxSalary;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", jobId=" + jobId +
                ", jobTitle=" + jobTitle +
                ", minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}