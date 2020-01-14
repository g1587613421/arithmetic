package orther.词库优化;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class readTxtFileIntoStringArrList {

    public readTxtFileIntoStringArrList() {
    }

    public static List<String> readTxtFileIntoStringArrList(String filePath) {
        ArrayList list = new ArrayList();

        try {
            String encoding = "utf-8";
            File file = new File(filePath);
            if (file.isFile() && file.exists()) {
                InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                int n=0;
                while((lineTxt = bufferedReader.readLine()) != null) {
                    list.add(lineTxt);
                   
                    if (n++%3==0) {
                    	System.out.println(lineTxt);
					}
                   
                }

                bufferedReader.close();
                read.close();
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception var7) {
            System.out.println("读取文件内容出错");
            var7.printStackTrace();
        }

        return list;
    }

}
