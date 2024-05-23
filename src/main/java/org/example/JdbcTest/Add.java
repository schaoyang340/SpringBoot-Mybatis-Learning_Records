package org.example.JdbcTest;

import org.example.WebMvc.vo.Employees;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Add{
    public static void main(String[] args) {
        // 1.加载驱动
        // 获取反射，加载某个类
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2.创建链接
            conn = DriverManager.getConnection("jdbc:mysql://192.168.10.141:3306/myemployees1", "root", "123456");

            // 开启事务
            conn.setAutoCommit(false);

            // 模拟网页添加信息
            Employees empcondition = new Employees();
            empcondition.setFirstName("张");
            empcondition.setLastName("三");
            empcondition.setEmail("dsad22333@163.com");
            empcondition.setDepartmentId(90);
            empcondition.setHiredate(new SimpleDateFormat("yyyy-MM-dd").parse("2023-10-09"));

            // 3.创建执行器
            StringBuilder sb = new StringBuilder();
            // SQL语法
            sb.append("\n" +
                    "INSERT INTO employees1 (first_name, last_name, email, phone_number, job_id, salary, commission_pct, manager_id, department_id, hiredate)\n" +
                    "values (?, ?, ?, '12321312', 'AD_PRES', 4000, null, 100, ?, ?)");

            PreparedStatement ps = conn.prepareStatement(sb.toString());

            int index = 1;
            ps.setString(index++, empcondition.getFirstName());
            ps.setString(index++, empcondition.getLastName());
            ps.setString(index++, empcondition.getEmail());
            ps.setInt(index++, empcondition.getDepartmentId());
            ps.setDate(index++, new java.sql.Date(empcondition.getHiredate().getTime()));

            // 4.执行SQL
            int rows = ps.executeUpdate();
            System.out.println(rows);

            if (rows == 1) {
                conn.commit();
            } else {
                conn.rollback();
            }

        } catch (SQLException | ClassNotFoundException | ParseException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    // 5.释放资源
                    conn.close();
                } catch (SQLException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
