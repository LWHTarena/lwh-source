package com.lwhtarena.quartz.demo01;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

import static org.quartz.DateBuilder.evenMinuteDate;
import static org.quartz.JobBuilder.newJob;

/**
 * @author liwenhao
 * 本示例将演示如何启动和关闭Quartz调度程序以及如何计划在Quartz中运行的作业。
 */
public class SimpleExample {

    Logger logger = LoggerFactory.getLogger(SimpleExample.class);


    public void run() throws Exception{
        logger.info("-------------------初始化------------------");

        /*获得调度*/
        SchedulerFactory sf =new StdSchedulerFactory();
        Scheduler scheduler =sf.getScheduler();

        logger.info("-------------------初始化完成------------------");
        Date runTime =evenMinuteDate(new Date());

        JobDetail job = newJob(HelloJob.class).
                withIdentity("job1", "group1").build();


    }
}
