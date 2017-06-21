package com.worldrunner.dao;

import com.worldrunner.model.step.Day;
import com.worldrunner.model.step.Step;
import com.worldrunner.model.User;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by vuta on 16/06/2017.
 */
public interface StepDao {

    HashMap<User, HashMap<Integer, List<Integer>>> findById(int id, int page, int limit) throws  Exception;
    List<Step> findByDate(String datetime, int page, int limit) throws  Exception;
    Step insertStep(Step step) throws Exception;
    Step updateStep(Step step) throws  Exception;
    void deleteStep(Step step) throws  Exception;
}
