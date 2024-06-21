package org.sql.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName departments1
 */
@TableName(value ="departments1")
public class Departments1 implements Serializable {
    /**
     * 
     */
    @TableId(value = "department_id", type = IdType.AUTO)
    private Integer departmentId;

    /**
     * 
     */
    @TableField(value = "department_name")
    private String departmentName;

    /**
     * 
     */
    @TableField(value = "manager_id")
    private Integer managerId;

    /**
     * 
     */
    @TableField(value = "location_id")
    private Integer locationId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * 
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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
    public Integer getLocationId() {
        return locationId;
    }

    /**
     * 
     */
    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
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
        Departments1 other = (Departments1) that;
        return (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getDepartmentName() == null ? other.getDepartmentName() == null : this.getDepartmentName().equals(other.getDepartmentName()))
            && (this.getManagerId() == null ? other.getManagerId() == null : this.getManagerId().equals(other.getManagerId()))
            && (this.getLocationId() == null ? other.getLocationId() == null : this.getLocationId().equals(other.getLocationId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getDepartmentName() == null) ? 0 : getDepartmentName().hashCode());
        result = prime * result + ((getManagerId() == null) ? 0 : getManagerId().hashCode());
        result = prime * result + ((getLocationId() == null) ? 0 : getLocationId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", departmentId=").append(departmentId);
        sb.append(", departmentName=").append(departmentName);
        sb.append(", managerId=").append(managerId);
        sb.append(", locationId=").append(locationId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}