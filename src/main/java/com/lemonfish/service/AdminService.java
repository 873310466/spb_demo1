package com.lemonfish.service;

import com.lemonfish.pojo.Admin;

import java.util.List;

/**
 * @author Masics 张超
 * @date 2020/2/5 23:27
 */
public interface AdminService {
    void add(Admin admin);

    int deleteById(int id);

    int updateById(int id);

    Admin selectById(int id);

    List<Admin> selectAll();


}
