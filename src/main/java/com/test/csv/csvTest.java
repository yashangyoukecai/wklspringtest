package com.test.csv;

/**
 * Created by wklmogujie on 15/11/9.
 */

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.test.csv.*;

/**
 * CSV操作(导出和导入)
 *
 * @author 林计钦
 * @version 1.0 Jan 27, 2014 4:17:02 PM
 */
public class csvTest {

    /**
     * CSV导出
     *
     * @throws Exception
     */
    public static void exportCsv() {
        List<String> dataList=new ArrayList<String>();
        dataList.add("1,张三,男");
        dataList.add("2,李四,男");
        dataList.add("3,小红,女");
        boolean isSuccess=csvBasic.exportCsv(new File("/Users/wklmogujie/Desktop/ljq.csv"), dataList);
        System.out.println(isSuccess);
    }

    /**
     * CSV导出
     *
     * @throws Exception
     */
    public static void importCsv()  {
        List<String> dataList=csvBasic.importCsv(new File("/Users/wklmogujie/Desktop/ljq.csv"));
        if(dataList!=null && !dataList.isEmpty()){
            for(String data : dataList){
                System.out.println(data);
            }
        }
    }

    public static void main(String[] args){
        exportCsv();
    }
}