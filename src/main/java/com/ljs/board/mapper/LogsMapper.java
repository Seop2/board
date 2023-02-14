package com.ljs.board.mapper;

import com.ljs.board.vo.LogsVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface LogsMapper {

    public int InsertLogs(LogsVO vo);
    public List<Map<String, Object>>selectLogs();//조회
    public LogsVO selectLogsByLogId(int logId);
}
