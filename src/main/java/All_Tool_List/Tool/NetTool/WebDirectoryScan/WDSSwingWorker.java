package All_Tool_List.Tool.NetTool.WebDirectoryScan;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import javax.swing.*;
import java.io.IOException;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WDSSwingWorker extends SwingWorker<Void, Integer>{
    ExecutorService pool;
    int threadNum;
    int timeOut;
    int directoryTextNum;
    String URL;
    String[] MatchNumList;
    ArrayList<String> directoryText;
    WDS_Bean bean;
    JTextArea ResultArea;
    JProgressBar PB;
    JButton StartBT;
    JButton CanelBT;
    JTextField RuntimeFD;

    public WDSSwingWorker(WDS_Bean bean, JTextArea ResultArea, JProgressBar pb, JButton StartBT, JButton CanelBT, JTextField RuntimeFD){
        this.URL = bean.getURL();
        this.MatchNumList = bean.getMatchNumList();
        this.timeOut = bean.getTimeOut();
        this.threadNum = bean.getThreadNum();
        this.directoryText = bean.getDirectoryText();
        this.directoryTextNum = bean.getDirectoryTextNum();
        this.ResultArea = ResultArea;
        this.PB = pb;
        this.StartBT = StartBT;
        this.CanelBT = CanelBT;
        this.RuntimeFD = RuntimeFD;
        this.bean = bean;
    }

    @Override
    protected Void doInBackground() throws Exception {
        pool = Executors.newFixedThreadPool(threadNum);
        //System.out.println("threadNum:"+threadNum);
        for (int i = 0; i < directoryTextNum; i++) {
            pool.submit(new WDS_Runnable(directoryText,i));
        }
        // 关闭线程池。
        pool.shutdown();

        while(true){
            System.out.println("000");
            if(pool.isTerminated()){
                publish(1);//将当前进度信息加入chunks中
                break;
            }
            Thread.sleep(3000);
        }
        return null;
    }

    @Override
    protected void process(List chunks) {
        super.process(chunks);
        StartBT.setEnabled(true);
        //CanelBT.setVisible(false);
        PB.setValue(PB.getMaximum());
        RuntimeFD.setText("Complete");
    }

    @Override
    protected void done() {
        super.done();
    }

    public void stop(){
        pool.shutdownNow();
        System.gc();
    }

    class WDS_Runnable implements Runnable {
        private ArrayList<String> DirURL;
        private int PBnumber;

        public WDS_Runnable(ArrayList<String> DirURL, int PBnumber) {
            this.DirURL = DirURL;
            this.PBnumber = PBnumber;
        }

        @Override
        public void run() {
            //String ResultNumber = this.ResponseNumGet(URL.replace("{dir}",DirURL.get(PBnumber)), timeOut);
            String ResultNumber = this.NewResponseNumGet(URL.replace("{dir}",DirURL.get(PBnumber)), timeOut);
                    String Result = ResultNumber + "::" + DirURL.get(PBnumber) + "\n";
            for (String a : MatchNumList) {
                if (a.equals(ResultNumber)) {
                    ResultArea.append(Result);
                    bean.setResultOut(bean.getResultOut()+Result);
                    break;
                }
            }
            PB.setValue(PBnumber);
        }

        public String NewResponseNumGet(String url, int timeOut){
            HttpClient client = new HttpClient();
            GetMethod getMethod = new GetMethod(url);
            getMethod.setFollowRedirects(false);//取消跟随300段跳转
            client.setTimeout(timeOut);
            client.setConnectionTimeout(timeOut+10000);
            //client.getHttpConnectionManager().getParams().setConnectionTimeout(5000);
            int code = 0;
            try {
                code = client.executeMethod(getMethod);
                //if (code == 200) {
                //    String res = getMethod.getResponseBodyAsString();
                //    System.out.println(res);
                //}
            } catch (IOException e) {
                e.printStackTrace();
            }
            String Result = Integer.toString(code);
            return Result;
        }

        public String ResponseNumGet(String url, int timeOut) {
            // 忽略Cookie
            CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
            // 将string转成url对象
            java.net.URL realUrl = null;
            try {
                realUrl = new URL(url);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            // 初始化一个链接到那个url的连接
            HttpURLConnection connection = null;
            try {
                connection = (HttpURLConnection) realUrl.openConnection();
            } catch (IOException e) {
                e.printStackTrace();
            }
            // 设置超时时间
            connection.setConnectTimeout(timeOut);
            connection.setReadTimeout(timeOut);
            // 设置请求编码
            connection.setRequestProperty("Charsert", "UTF-8");
            // 设置USER-Agent
            connection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            // 开始实际的连接
            try {
                connection.connect();
                connection.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String Result = null;
            try {
                Result = Integer.toString(connection.getResponseCode());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return Result;
        }//目标返回值获取
    }
}
