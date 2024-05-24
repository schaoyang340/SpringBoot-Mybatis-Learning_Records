package org.sql.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.sql.domain.Employees1;
import org.sql.service.Employees1Service;
import org.sql.dao.Employees1Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author SCY12
* @description 针对表【employees1】的数据库操作Service实现
* @createDate 2024-05-22 16:07:07
*/
@Service
public class Employees1ServiceImpl extends ServiceImpl<Employees1Mapper, Employees1>
    implements Employees1Service{

    @Override
    public List<Employees1> listCondition(String name) {
        return baseMapper.listCondition(name);
    }

    @Override
    public List<Employees1> listCondition2(String name) {
        return baseMapper.listCondition2(name);
    }
}




