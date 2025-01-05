/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author long
 */
public class AccountDAO extends MyDAO{
    public Account auth(String username,String userpassword){
        xSql="Select * from useraccount where username=? AND userpassword=?";
        Account ac = null;
        int id,roleid;String user,pwd;
        try {
            ps=con.prepareStatement(xSql);
            ps.setString(1, username);
            ps.setString(2,  userpassword);
            rs=ps.executeQuery();
            while(rs.next()){
                id=rs.getInt("id");
                roleid=rs.getInt("roleid");
                user=rs.getString("username");
                pwd=rs.getString("userpassword");
                ac=new Account(id, roleid, user, pwd);
                return ac;
            }
        } catch (Exception e) {
        }
        return ac;
    }
    public Account checkUserExist(String username){
        xSql="Select * from useraccount where username=?";
        Account ac = null;
        int id,roleid;String user,pwd;
        try {
            ps=con.prepareStatement(xSql);
            ps.setString(1, username);
            
            rs=ps.executeQuery();
            while(rs.next()){
                id=rs.getInt("id");
                roleid=rs.getInt("roleid");
                user=rs.getString("username");
                pwd=rs.getString("userpassword");
                ac=new Account(id, roleid, user, pwd);
                return ac;
            }
        } catch (Exception e) {
        }
        return ac;
    }
    public void insert(Account x) {
     xSql = "insert into useraccount (username,password,roleid) values (?,?,1)"; 
     try {
      ps = con.prepareStatement(xSql);
      ps.setString(1, x.getUsername());
      ps.setString(2, x.getPassword() );
    
      ps.executeUpdate();
      ps.close();
     }     
     catch(Exception e) {
        e.printStackTrace();
     }
  }
   
}
