package com.lemonfish;

import com.lemonfish.pojo.Admin;
import com.lemonfish.service.AdminService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.lemonfish.mapper")
class Rusult2SpbApplicationTests {
    /*    @Autowired
        private UserMapper userMapper;*/
    @Autowired
    AdminService adminService;


    @Test
    public void testSelect() {
//        System.out.println(("----- selectAll method test ------"));

/*//        User user = new User( "男", 1, "8@");
//        userMapper.insert(user);
//        userMapper.deleteById(1225047487899152389L);
//        List<User> userList = userMapper.selectList(null);
        QueryWrapper queryWrapper = new QueryWrapper();
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Jone");
        map.put("age", null);
        queryWrapper.allEq(map,false);
        Page page1 = userMapper.selectPage(new Page<User>(1, 3), queryWrapper);
//        userList.forEach(System.out::println);
        System.out.println(page1.getPages());
        System.out.println(page1.getTotal());
        System.out.println(page1.getSize()+"当前size");
        System.out.println(page1.getRecords());*/
    }


    @Test
    public void test() {
//        adminMapper.addAdmin("root1", "123456", 5);
//        adminMapper.insert(new Admin(null, "root2", "123456", 1));
        adminService.deleteById(3);
        List<Admin> admins = adminService.selectAll();
        for (Admin admin : admins) {
            System.out.println(admin);
        }
    }
}
