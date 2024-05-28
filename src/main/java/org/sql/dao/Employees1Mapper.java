package org.sql.dao;

import org.sql.domain.Employees1;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
* @author SCY12
* @description 针对表【employees1】的数据库操作Mapper
* @createDate 2024-05-22 16:07:07
* @Entity org.sql.domain.Employees1
*/
public interface Employees1Mapper extends BaseMapper<Employees1> {

    List<Employees1> listCondition(String name);

    List<Employees1> listCondition2(String name);

    int add(Employees1 employees1);

    List<Map<String,Object>> listAll(Map<String,Object> parse);

    int update(Employees1 employees1);

    int del(Integer employeeId);
}




