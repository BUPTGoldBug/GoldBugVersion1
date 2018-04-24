package com.debugger.service.imp;

import com.debugger.dao.BugDao;
import com.debugger.model.Buginfo;
import com.debugger.model.Buginfo2;
import com.debugger.pojo.*;
import com.debugger.service.BugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
public class BugServiceImp implements BugService {

    @Autowired
    private BugDao bugDao;

    @Override
    public Content getSpecBug(int bugId) {
        return null;
    }

    @Override
    public List<BugBasic> getBugs(Coordinate coordinate) {

        return bugDao.getBugsAround(coordinate);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class,RuntimeException.class}, timeout = 1, isolation = Isolation.DEFAULT)
    public Result inserBug(BugContent bugContent) {
        Buginfo buginfo = new Buginfo();
        buginfo.transfromBugInfo(bugContent.getBugInfo());
         int num1 = bugDao.insertBugInfo(buginfo);
         Long bugId=  buginfo.getId();
         Buginfo2 buginfo2 = new Buginfo2();
         buginfo2.transfromBugInfo(bugContent.getBugInfo(),bugId);
         int num2 =bugDao.insertBugInfo2(buginfo2);
        com.debugger.model.Content content = new com.debugger.model.Content();
        content.transfromBugInfo(bugContent.getContent(),bugId);
         int num3 = bugDao.insertContent(content);
         Result result = new Result();
         if(num1 + num2 + num3>2){
             result.setDes("添加成功!");
             result.setSuccess(true);
             result.setStatus(1);
         }else {
             result.setDes("添加失敗!");
             result.setSuccess(true);
             result.setStatus(0);

         }
         return  result;

    }

    @Override
    public int cronJob() {
        return 0;
    }
    @Override
    public BugSpecOne getOneSpecBug(int bugId) {
        BugSpecOne bugSpecOne = new BugSpecOne();
      try {
          com.debugger.model.Content content = bugDao.getOneBugContent(bugId);

          List<String> answers = new ArrayList<String>();
          answers.add(content.getAns_1());
          answers.add(content.getAns_2());
          answers.add(content.getAns_3());
          answers.add(content.getAns_4());
          bugSpecOne.setAnswer(answers);
          bugSpecOne.setBugId(bugId);
          bugSpecOne.setQuestion(content.getQuestion());
          bugSpecOne.setArIndex(content.getArIndex());
          bugSpecOne.setSuccess(true);
          return bugSpecOne;
      }catch (Exception e){
          bugSpecOne.setSuccess(false);
      }
      return bugSpecOne;
    }

    @Override
    public boolean vaildContent(int bid, String nums) {
        try {
            com.debugger.model.Content content = bugDao.getOneBugContent(bid);
            boolean i =  content.getKey_().equals(nums);
            if(i){
                bugDao.updateLifeCount(bid);
            }
            return i;
        }catch (Exception e){
            return false;


        }
    }
}
