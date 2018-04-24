package com.debugger.dao;

import com.debugger.model.Buginfo;
import com.debugger.model.Buginfo2;
import com.debugger.model.Content;
import com.debugger.pojo.BugBasic;
import com.debugger.pojo.Coordinate;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface BugDao {
     int insertBugInfo(Buginfo buginfo);
     int insertBugInfo2(Buginfo2 buginfo2);
     int insertContent(Content content);
     Content getOneBugContent(int bugId);
     Buginfo getBugInfo(int bugId);
     Buginfo2 getBugInfo2(int bugId);
     List<BugBasic> getBugsAround(Coordinate coordinate);
     int updateBug(Buginfo2 buginfo2);
     int updateLifeCount(int bid);
}
