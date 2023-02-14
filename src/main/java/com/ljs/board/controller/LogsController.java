package com.ljs.board.controller;

import com.github.pagehelper.PageInfo;
import com.ljs.board.service.LogsService;
import com.ljs.board.vo.LogsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RequestMapping("/api/v1")
@RestController
public class LogsController {
    @Autowired
    private LogsService logsService;
    @GetMapping("/logs")
    public PageInfo<Map<String, Object>>CallLogs(@RequestParam int page){
        List<Map<String, Object>>list = logsService.getAllLogs(page);
        int navigatePages = 5;
        return new PageInfo<Map<String, Object>>(list, navigatePages);
    }
    @GetMapping ("/logs/{logId}")
    public LogsVO callLogs(@PathVariable int logId){
        return logsService.getLogs(logId);
    }
}
