package org.sql.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.sql.domain.Departments1;
import org.sql.service.Departments1Service;
import org.sql.dao.Departments1Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author SCY12
* @description 针对表【departments1】的数据库操作Service实现
* @createDate 2024-05-29 14:27:15
*/
@Service
public class Departments1ServiceImpl extends ServiceImpl<Departments1Mapper, Departments1>
    implements Departments1Service{

    @Autowired
    private Departments1Mapper departments1Mapper;

    @Override
    public List<Departments1> list() {
        return departments1Mapper.list();
    }
}




