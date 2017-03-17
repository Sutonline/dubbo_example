package com.skyon.pms.serviceImpl;

import com.skyon.pms.entity.Activity;
import com.skyon.pms.service.ActivityService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sut on 2017/3/17.
 */
@Service("activityService")
public class ActivityServiceImpl implements ActivityService {


    @Override
    public List<Activity> getActivity() {
        List<Activity> list = new ArrayList<Activity>();
        Activity activity = new Activity();
        activity.setActivityCode("fffff");
        list.add(activity);
        return list;
    }
}
