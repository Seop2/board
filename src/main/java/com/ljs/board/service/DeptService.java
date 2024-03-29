package com.ljs.board.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ljs.board.mapper.DeptMapper;
import com.ljs.board.vo.DeptVO;
import com.ljs.board.vo.EmpVO;
import com.github.pagehelper.PageHelper;

@Service
//서비스는 로직을 구현하는 곳
public class DeptService {
    @Autowired
    private DeptMapper mapper;

    //부서 추가
    public int DeptInsert(DeptVO vo) {
        return mapper.InsertDept(vo);
    }
    //부서 삭제
    public int getDeleteDept(int deptno) {
        // TODO Auto-generated method stub
        return mapper.deleteDept(deptno);
    }
    //부서 수정
    public int getDeptByUpdate(DeptVO vo)
    {
        return mapper.UpdateDept(vo);
    }
    //부서 조회
    public List<Map<String, Object>>getDeptAll()
    {
        return mapper.SelectDeptJoin();
    }
    //특정 부서...
    public DeptVO getDeptByDeptno(int deptno)
    {
        return mapper.selectdeptBydeptno(deptno);
    }
//	public List <Map<String, Object>> getDeptPageList(int page){
//		int pageSize = 5;
//		PageHelper.startPage(page, pageSize);
//		return mapper.SelectDeptJoin();
//
//	}
//	public List<Map<String, Object>> getEmpPageList(int page){
//		int pageSize = 10;//한페이지에 보여줄 게시물 수
//		PageHelper.startPage(page, pageSize);
//		return mapper.selectEmp();
//	}
}