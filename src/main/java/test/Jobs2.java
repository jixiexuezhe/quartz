package test;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Jobs2 {
	Logger logger=LoggerFactory.getLogger(Jobs2.class);
    public Jobs2 (){
        System.out.println("jobs...............");
    }
    public void execute() {
    	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
           String date = format.format(new Date());  
           System.out.println("这是第一个定时任务：" + date);  
           logger.info("任务1：每分钟定时获取当前系统时间");  
    }
    public void auto() {
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();  
        MemoryUsage memoryUsage = memoryMXBean.getHeapMemoryUsage(); //椎内存使用情况  
        long totalMemorySize = memoryUsage.getInit(); //初始的总内存  
        long maxMemorySize = memoryUsage.getMax(); //最大可用内存  
        long usedMemorySize = memoryUsage.getUsed(); //已使用的内存  
        System.out.println("这是第二个定时任务"+"\r"+"椎内存使用情况："+"1.初始的总内存:"+totalMemorySize+"2.最大可用内存:"+maxMemorySize+"3.已使用的内存:"+usedMemorySize);  
        logger.info("任务2：后台监控椎内存使用情况");  
    }
}