package spittr.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Spittle {

  private final Long id;
  private final Spitter spitter;
  private final String message;
  private final Date postedTime;

}
