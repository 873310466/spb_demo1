package com.lemonfish.service.Impl;

import com.lemonfish.mapper.AdminMapper;
import com.lemonfish.pojo.Admin;
import com.lemonfish.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Masics 张超
 * @date 2020/2/5 23:27
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public void add(Admin admin) {
        adminMapper.insert(admin);
    }

    @Override
    public int deleteById(int id) {
        return adminMapper.deleteById(id);
    }

    @Override
    public int updateById(int id) {
        return adminMapper.updateById(new Admin(3, "admin", "654321", 3));
    }

    @Override
    public Admin selectById(int id) {
        return adminMapper.selectById(id);
    }

    @Override
    public List<Admin> selectAll() {
        return adminMapper.selectList(null);
    }
}
