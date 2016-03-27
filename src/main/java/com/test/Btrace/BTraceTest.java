package com.test.Btrace;

import java.io.*;

/**
 * Created by wklmogujie on 16/3/27.
 */
public class BTraceTest {
    public static void writeFile(String fileName) throws IOException,InterruptedException {
        File f = new File(fileName);
        if(!f.exists()) {
            f.createNewFile();
        }
        DataOutputStream fos = new DataOutputStream(new FileOutputStream(f));
        fos.writeBytes(fileName);
        fos.close();
        Thread.sleep(100);

    }

    public static String readFile(String fileName) throws IOException,InterruptedException {
        File f = new File(fileName);
        DataInputStream fis = new DataInputStream(new FileInputStream(f));
        String re = fis.readLine();
        fis.close();
        f.delete();
        Thread.sleep(100);
        return re;
    }

    public static void main(String[] args) throws IOException,InterruptedException{
        while (true) {
            String fileName = Integer.toString((int) (Math.random()*100));
            writeFile(fileName);
            readFile(fileName);
        }
    }
}
