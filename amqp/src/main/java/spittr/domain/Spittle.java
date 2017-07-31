package spittr.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Spittle implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private Long id;
  private Spitter spitter;
  private String message;
  private LocalDateTime postedTime;

}
