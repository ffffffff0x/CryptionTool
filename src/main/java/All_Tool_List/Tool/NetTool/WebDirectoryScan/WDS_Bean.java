package All_Tool_List.Tool.NetTool.WebDirectoryScan;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class WDS_Bean {
    private WebDirectoryScan_impl webDirectoryScan_impl = new WebDirectoryScan_impl();

    private String ResultOut = "";

    public String getResultOut() {
        return ResultOut;
    }

    public void setResultOut(String resultOut) {
        ResultOut = resultOut;
    }

    private String URL;
    private String[] matchNumList;
    private ArrayList<String> directoryText;
    private File directoryFile;
    private int directoryTextNum;
    private int PBMaxNum;
    private int PBMinNum = 1;
    private int threadNum;
    private int timeOut;

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String[] getMatchNumList() {
        return matchNumList;
    }

    public void setMatchNumList(String[] matchNum) {
        this.matchNumList = matchNum;
    }

    public ArrayList<String> getDirectoryText() {
        return directoryText;
    }

    public void setDirectoryText(ArrayList<String> directoryText) {
        this.directoryText = directoryText;
    }

    public File getDirectoryFile() {
        return directoryFile;
    }

    public void setDirectoryFile(File directoryFile) {
        this.directoryFile = directoryFile;//字典文件
        try {
            this.setDirectoryText(webDirectoryScan_impl.DirectoryTextGet(directoryFile));//字典文本
            this.setDirectoryTextNum(webDirectoryScan_impl.DirectoryLineGet(directoryFile));//字典行数
            this.setPBMaxNum(webDirectoryScan_impl.DirectoryLineGet(directoryFile));//ProgressBar最大值
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getDirectoryTextNum() {
        return directoryTextNum;
    }

    public void setDirectoryTextNum(int directoryTextNum) {
        this.directoryTextNum = directoryTextNum;
    }

    public int getPBMaxNum() {
        return PBMaxNum;
    }

    public void setPBMaxNum(int PBMaxNum) {
        this.PBMaxNum = PBMaxNum;
    }

    public int getPBMinNum() {
        return PBMinNum;
    }

    public int getThreadNum() {
        return threadNum;
    }

    public void setThreadNum(int threadNum) {
        this.threadNum = threadNum;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }
}
