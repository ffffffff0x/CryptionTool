package All_Tool_List.Tool.NetTool.WebDirectoryScan;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WebDirectoryScan_impl {
    public File file;

    public static void main(String[] args){
    }

    public void DirectoryGet(){
        JFileChooser chooser = new JFileChooser();//文件选择器
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);//选择器选择模式
        chooser.showDialog(new JLabel(), "选择字典文件");
        file = chooser.getSelectedFile();
    }

    public int DirectoryLineGet(){
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
    }

    public ArrayList<String> DirectoryTextGet() throws IOException {
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
    }
}
