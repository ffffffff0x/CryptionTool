package All_Tool_List.Tool.NetTool.PortScan;

import javax.swing.*;

public class PortScan_test {
    public static void main(String[] args) {
        ProtScan_form PF = new ProtScan_form();

        JFrame f = new JFrame();
        f.add(PF);

        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
