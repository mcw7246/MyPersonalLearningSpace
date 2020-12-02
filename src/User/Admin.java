package User;

public class Admin implements User
{
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
