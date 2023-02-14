package com.ljs.board.service;

import com.github.pagehelper.PageHelper;
import com.ljs.board.mapper.LogsMapper;
import com.ljs.board.vo.LogsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LogsService {
    @Autowired
    private LogsMapper logsMapper;

    public List<Map<String,Object>>getAllLogs(int page){
        int pageSize = 10;//한페이지에 보여줄 게시물 수
        PageHelper.startPage(page, pageSize);
        return logsMapper.selectLogs();
    }
    public LogsVO getLogs(int logId){
        return logsMapper.selectLogsByLogId(logId);
    }
}
