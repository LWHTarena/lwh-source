package com.lwhtarena.quartz.demo01;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author liwenhao
 * @Description：
 */
public class HelloJob implements Job {
    private static Logger logger = LoggerFactory.getLogger(HelloJob.class);

    public void execute(JobExecutionContext context) throws JobExecutionException {
        logger.info("say 您好:"+new Date());
    }
}
