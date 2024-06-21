package org.sql.dao;

import org.sql.domain.Departments1;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author SCY12
* @description 针对表【departments1】的数据库操作Mapper
* @createDate 2024-05-29 14:27:15
* @Entity org.sql.domain.Departments1
*/
public interface Departments1Mapper extends BaseMapper<Departments1> {

    List<Departments1> list();
}




