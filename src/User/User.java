package User;

public interface User
{

  public String getUsername();
  public String getPassword();
  public Group searchGroup();
  public void createGroup();
  public void postInGroup();
}
