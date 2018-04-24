package com.debugger.service;

import com.debugger.pojo.*;

import java.util.List;

public interface BugService {
    public Content getSpecBug(int bugId);
    public List<BugBasic> getBugs(Coordinate coordinate);
    public Result inserBug(BugContent bugContent);
    public int cronJob();//更新任务
    public BugSpecOne getOneSpecBug(int bugId);
    public  boolean vaildContent(int bid ,String nums);
}
