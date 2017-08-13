package edu.tongji.comm.spittr.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Spittle implements Serializable {
    private static final long serialVersionUID = 1L;
    private final Long id;
    private final Spitter spitter;
    private final String message;
    private final Date postedTime;
}
