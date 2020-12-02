package Management;

import User.*;

import java.util.List;

public class UserManagement
{
  public List<User> allUsers;

  public UserManagement(List<User> allUsers){
    this.allUsers = allUsers;
  }

  public void newProfessor(String name, String pswd){
    Professor professor = new Professor(name, pswd);
    allUsers.add(professor);
  }

  public void newStudent(String name, String pswd){
    Student student = new Student();
  }
}
