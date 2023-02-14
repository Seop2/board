package com.ljs.board.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LogsVO {
    private int logId;
    private String ip;
    private String url;
    private String httpMethod;
    private String createAt;//접속계정

}
