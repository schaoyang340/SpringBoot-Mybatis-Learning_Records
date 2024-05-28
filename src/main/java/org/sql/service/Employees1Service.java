package org.sql.service;

import org.sql.domain.Employees1;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
* @author SCY12
* @description 针对表【employees1】的数据库操作Service
* @createDate 2024-05-22 16:07:07
*/
public interface Employees1Service extends IService<Employees1> {

    List<Employees1> listCondition(String name);

    List<Employees1> listCondition2(String name);

    int add(Employees1 employees1);

    List<Map<String,Object>> listAll(Map<String,Object> parse);

    boolean update(Employees1 employees1);

    boolean del(Integer employeeId);
}
