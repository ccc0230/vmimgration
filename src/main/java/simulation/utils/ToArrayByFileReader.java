package simulation.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ToArrayByFileReader {
    public static ArrayList<String[]> readerByFile(String name) {
        ArrayList<String> dataSet = new ArrayList<String>();
        try {
            FileReader fr = new FileReader(name);
            BufferedReader bf = new BufferedReader(fr);
            String str;
            //按行读取字符串
            while ((str = bf.readLine()) != null) {
                dataSet.add(str);
            }
            bf.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //对ArrayList中存储的字符串进行处理
        int length = dataSet.size();
        ArrayList<String[]> arrayList = new ArrayList<String[]>();

        //9 10 11 12
        for (int i = 0; i < length; i++) {
            String[] s = dataSet.get(i).split(",");
            String[] resource = new String[6];
            resource[0] = s[2];
            resource[1] = s[9];
            resource[2] = s[10];
            resource[3] = s[11];
            resource[4] = s[12];
            resource[5] = s[8];
            arrayList.add(resource);
        }
        return arrayList;
    }
}