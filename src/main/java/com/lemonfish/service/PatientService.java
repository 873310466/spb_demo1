package com.lemonfish.service;


import com.lemonfish.pojo.Patient;

import java.util.List;

/**
 * @author Masics 张超
 * @date 2020/2/7 18:24
 */
public interface PatientService {
    void add(Patient patient);

    int deleteById(int id);

    int updateById(int id);

    Patient  selectById(int id);

    List<Patient> selectAll();
}
