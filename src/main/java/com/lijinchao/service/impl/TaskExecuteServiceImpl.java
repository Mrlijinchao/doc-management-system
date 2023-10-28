package com.lijinchao.service.impl;

import com.lijinchao.entity.FileDocument;
import com.lijinchao.service.TaskExecuteService;
import com.lijinchao.task.thread.MainTask;
import com.lijinchao.task.thread.TaskThreadPool;
import org.springframework.stereotype.Service;

/**
 * @Author Jarrett Luo
 * @Date 2022/10/20 18:04
 * @Version 1.0
 */
@Service
public class TaskExecuteServiceImpl implements TaskExecuteService {

    @Override
    public void execute(FileDocument fileDocument) {
        MainTask mainTask = new MainTask(fileDocument);
        TaskThreadPool.getInstance().submit(mainTask);
    }
}
