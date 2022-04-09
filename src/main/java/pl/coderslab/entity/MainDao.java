package pl.coderslab.entity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class MainDao {
    public static void main(String[] args) throws SQLException {

//        User user1 = new User();
//        user1.setUserName("juliak");
//        user1.setEmail("julia.kisielewska@gmail.com");
//        user1.setPassword("koniczynka123");
//
//        UserDao uDao1 = new UserDao();
//
//        uDao1.create(user1);
//
//        User user2 = new User();
//        user2.setUserName("marekmarkiewski");
//        user2.setEmail("mmar@gmail.com");
//        user2.setPassword("mma234k9&");
//
//        UserDao uDao2 = new UserDao();
//
//        uDao2.create(user2);
//
//        User user3 = new User();
//        user3.setUserName("niarolska");
//        user3.setEmail("niarolska@gmail.com");
//        user3.setPassword("aniania");
//
//        UserDao uDao3 = new UserDao();
//
//        uDao3.create(user3);
//
//        User user4 = new User();
//        user4.setUserName("19niarolska");
//        user4.setEmail("nirolki@gmail.com");
//        user4.setPassword("anianfsdgia");
//
//        UserDao uDao4 = new UserDao();
//
//        uDao4.create(user4);

//        ------------------READ TEST--------------------

//        UserDao userDao = new UserDao();
//
//        User user = userDao.read(9);
//
//        System.out.println(user.getUserName());


//        ------------------READ TEST-------------------

//        ------------------UPDATE TEST--------------------
//
//        UserDao userDao1 = new UserDao();
//        User user1 = new User();
//        user1.setId(9);
//        user1.setUserName("ania");
//        user1.setEmail("ania.bania@gmail.com");
//        user1.setPassword("koniczynka123");
//
//        userDao1.update(user1);
//
//        ------------------UPDATE TEST--------------------

//        ------------------DELETE TEST--------------------
//        UserDao uDaodel = new UserDao();
//        uDaodel.delete(9);
//        ------------------DELETE TEST--------------------

//        ------------------FIND ALL TEST--------------------
        User secondUser = new User();
        UserDao udao = new UserDao();
//        secondUser.setUserName("janusz");
//        secondUser.setEmail("janusz@coderslab.pl");
//        secondUser.setPassword("pass");
//        udao.create(secondUser);

        User[] all = udao.findAll();
        for (User u : all) {
            System.out.println(u.toString());
        }
    }
}


//TODO 1. JAK ZROBIĆ TO STRING?
// 2. O CO CHODZIŁO Z RETURN_GENERATED_KEYS