package spittr.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Spitter {
  
  private Long id;
  private String username;
  private String password;
  private String fullName;
  private String email;
  private boolean updateByEmail;

}
