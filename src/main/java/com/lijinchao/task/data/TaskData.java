package com.lijinchao.task.data;

import com.lijinchao.entity.FileDocument;
import com.lijinchao.enums.DocType;
import lombok.Data;

/**
 * @Author Jarrett Luo
 * @Date 2022/10/26 17:30
 * @Version 1.0
 */
@Data
public class TaskData {

    FileDocument fileDocument;

    String txtFilePath;

    String thumbFilePath;

    String previewFilePath;

    DocType docType;


}
