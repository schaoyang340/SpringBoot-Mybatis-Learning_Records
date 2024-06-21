package org.sql.dao;

import org.sql.domain.Jobs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author SCY12
* @description 针对表【jobs】的数据库操作Mapper
* @createDate 2024-05-29 14:13:15
* @Entity org.sql.domain.Jobs
*/
public interface JobsMapper extends BaseMapper<Jobs> {

    List<Jobs> list();
}




