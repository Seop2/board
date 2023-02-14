package com.ljs.board.mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ljs.board.vo.DeptVO;
import com.ljs.board.vo.EmpVO;

@Mapper
public interface DeptMapper {

    //부서 추가
    public int InsertDept(DeptVO vo);
    //부서 수정
    public int UpdateDept(DeptVO vo);
    //부서삭제
    public int deleteDept(int deptno);
    //부서조회
    public List <Map<String,Object>> SelectDeptJoin();
    //특정 부서...
    public DeptVO selectdeptBydeptno(int deptno);
}