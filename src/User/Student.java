package User;

public class Student implements User
{
  private String name;
  private String pswd;
  public Student(String name, String pswd){
    this.name = name;
    this.pswd = pswd;
  }

  public String getName(){
    return name;
  }

  public String getPswd(){
    return pswd;
  }
  @Override
  public String getUsername(){
    return "";
  }

  @Override
  public String getPassword(){
    return "";
  }

  @Override
  public Group searchGroup(){
    return null;
  }

  @Override
  public void createGroup(){

  }

  @Override
  public void postInGroup(){

  }
}
