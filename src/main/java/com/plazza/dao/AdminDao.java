package com.plazza.dao;

public interface AdminDao {

      boolean userLogin(String UEmailid,String Upassword);
      boolean userChangePassword(String UEmailid,String newUpassword);
      boolean AdminLogin(String Emailid,String password);
      boolean AdminChangePassword(String Emailid,String newpassword);
}
