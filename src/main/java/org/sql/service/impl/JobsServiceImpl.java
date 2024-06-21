package org.sql.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.sql.domain.Jobs;
import org.sql.service.JobsService;
import org.sql.dao.JobsMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author SCY12
* @description 针对表【jobs】的数据库操作Service实现
* @createDate 2024-05-29 14:13:15
*/
@Service
public class JobsServiceImpl extends ServiceImpl<JobsMapper, Jobs>
    implements JobsService{

    @Autowired
    private JobsMapper jobsMapper;

    @Override
    public List<Jobs> list() {
        return jobsMapper.list();
    }
}




