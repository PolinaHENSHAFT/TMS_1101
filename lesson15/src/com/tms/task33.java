package com.tms;


import java.io.*;


public class task33 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo = new FileOutputStream("poli.text");

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis= new FileInputStream("poli.text");
            fos= new FileOutputStream("poliexample.text");
            int c;
            while ((c = fis.read()) != -1) ;
            {
                fos.write(c);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis!=null) fis.close();
            if (fos!=null) fos.close();
        }
        }

    }