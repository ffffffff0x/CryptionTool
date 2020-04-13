package All_Tool_List.ToolView.Test;

import All_Tool_List.Encryption.Coding.MorseCoder.MorseCoder_Form;

import javax.swing.*;

public class Form_Test {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new MorseCoder_Form());

        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
