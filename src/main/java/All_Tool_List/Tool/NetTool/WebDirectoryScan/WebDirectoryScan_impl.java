package All_Tool_List.Tool.NetTool.WebDirectoryScan;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WebDirectoryScan_impl {

    public static void main(String[] args) throws IOException {
    }

    public File DirectoryGet(){
        JFileChooser chooser = new JFileChooser();//文件选择器
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);//选择器选择模式
        chooser.showDialog(new JLabel(), "选择字典文件");
        return chooser.getSelectedFile();
    }//字典获取

    public int DirectoryLineGet(File file){
        int count = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(scanner.hasNextLine()){
            scanner.nextLine();
            count++;
        }
        return count;
    }//字典行数获取

    public ArrayList<String> DirectoryTextGet(File file) throws IOException {
        ArrayList<String> out = new ArrayList<>();
        String line;
        FileInputStream fis = new FileInputStream(file);//Input流
        InputStreamReader isr = new InputStreamReader(fis);//读取流
        BufferedReader br = new BufferedReader(isr);//缓冲区
        while ((line=br.readLine())!=null) {
            out.add(line);
        }
        br.close();
        isr.close();
        fis.close();
        return out;
    }//字典内容获取

    public String[] MatchNumListGet(JTextArea Area) {
        return Area.getText().split("\n");
    }//需要匹配的返回值获取
}
