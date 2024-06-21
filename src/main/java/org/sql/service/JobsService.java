package org.sql.service;

import org.sql.domain.Jobs;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author SCY12
* @description 针对表【jobs】的数据库操作Service
* @createDate 2024-05-29 14:13:15
*/
public interface JobsService extends IService<Jobs> {

    List<Jobs> list();
}
