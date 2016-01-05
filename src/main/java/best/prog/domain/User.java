package best.prog.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "USER")
public class User extends BaseEntity {
  
  @Column(name = "USER_ID", nullable = false, length = 50, unique = true)
  private String userId;

  @Column(name = "NAME", nullable = false, length = 50)
  private String name;

  @Column(name = "PASSWD", nullable = false, length = 255)
  private String passwd;

  @Column(name = "EMAIL", length = 50)
  private String email;

  @Column(name = "TEL", length = 20)
  private String tel;
  
  @OneToMany(mappedBy = "user")
  private List<GroupUser> groupUsers = new ArrayList<GroupUser>();
  

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPasswd() {
    return passwd;
  }

  public void setPasswd(String passwd) {
    this.passwd = passwd;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public List<GroupUser> getGroupUsers() {
    return groupUsers;
  }

  public void setGroupUsers(List<GroupUser> groupUsers) {
    this.groupUsers = groupUsers;
  }

}
