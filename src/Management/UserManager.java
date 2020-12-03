package Management;

import User.*;

import java.util.List;

public class UserManager
{
  public List<User> allUsers;

  public UserManager(List<User> allUsers){
    this.allUsers = allUsers;
  }

  public List<User> getAllUsers(){
    return allUsers;
  }

  public void newProfessor(String name, String pswd){
    Professor professor = new Professor(name, pswd);
    allUsers.add(professor);
  }

  public void newStudent(String name, String pswd){
    Student student = new Student(name, pswd);
  }
}
