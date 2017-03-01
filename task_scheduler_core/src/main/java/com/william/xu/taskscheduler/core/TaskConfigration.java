package com.william.xu.taskscheduler.core;


import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Logger;

/**
 * Created by william on 2017/2/28.
 */
public class TaskConfigration {

    Logger logger = Logger.getLogger("TaskConfigration");
    private String filepath = "/tasks";
    private Map tasks = new ConcurrentHashMap();
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    private TaskConfigration(){

    }

    public void loadFormXml(){
        //DocumentHelper.
        File file = new File(TaskConfigration.class.getClassLoader().getResource(filepath).getPath());

        SAXReader reader = new SAXReader();
        try {
            reader.read(file);
        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }
}
