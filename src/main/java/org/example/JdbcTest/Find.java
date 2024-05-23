package org.example.JdbcTest;

import java.sql.*;

public class Find {
    public static void main(String[] args) {
        // 1.加载驱动
        // 获取反射，加载某个类
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2.创建链接
            conn = DriverManager.getConnection("jdbc:mysql://192.168.10.141:3306/myemployees1", "root", "123456");

            // 3.创建执行器
            StringBuilder sb = new StringBuilder();
            // SQL语法
            sb.append("\n" +
                    "SELECT e.employee_id,\n" +
                    "       e.first_name,\n" +
                    "       e.last_name,\n" +
                    "       e.email,\n" +
                    "       e.phone_number,\n" +
                    "       e.job_id,\n" +
                    "       e.salary,\n" +
                    "       e.commission_pct,\n" +
                    "       e.manager_id,\n" +
                    "       e.department_id,\n" +
                    "       e.hiredate\n" +
                    "FROM employees1 e");

            PreparedStatement ps = conn.prepareStatement(sb.toString());

            // 4.执行SQL
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int employee_id = rs.getInt("employee_id");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                System.out.println(rs.getInt(1) + "\t" + first_name + "\t" + last_name);

            }
        } catch (SQLException | ClassNotFoundException e) {
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
