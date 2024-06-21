package org.sql.service;

import org.sql.domain.Departments1;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author SCY12
* @description 针对表【departments1】的数据库操作Service
* @createDate 2024-05-29 14:27:15
*/
public interface Departments1Service extends IService<Departments1> {
    List<Departments1> list();
}
