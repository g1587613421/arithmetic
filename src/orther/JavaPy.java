package orther;

import org.python.util.PythonInterpreter;

import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class JavaPy {
    public static void main(String arg[]){//main--来自高金磊
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.exec("a=[5,2,3,9,4,0]; ");
        interpreter.exec("print(sorted(a));");  //此处python语句是3.x版本的语法
        //interpreter.exec("print sorted(a);");   //此处是python语句是2.x版本的语法
        new JavaPy().getRes();
    }
    String getRes(){
        String result="";
        try {
            Process process = Runtime.getRuntime().exec("python D:/my.py  32*23--1" );

            InputStreamReader ir = new InputStreamReader(process.getInputStream(),"GBK");
            LineNumberReader input = new LineNumberReader(ir);
            result = input.readLine();
            input.close();
            ir.close();
//            process.waitFor();
        } catch (Exception e) {
            System.out.println("调用python脚本并读取结果时出错：" + e.getMessage());
        }

        System.out.println(result);
return result;
    }

}
