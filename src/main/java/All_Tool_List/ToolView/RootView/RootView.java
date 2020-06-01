/*
 * Created by JFormDesigner on Fri Apr 03 10:50:45 CST 2020
 */

package All_Tool_List.ToolView.RootView;

import java.awt.event.*;
import All_Tool_List.ToolView.Index.Index_Form;
import All_Tool_List.ToolView.Node.NodeAdd;
import All_Tool_List.ToolView.Node.NodeMap;

import java.awt.*;
import java.util.Map;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

/**
 * @author 1
 */
public class RootView extends JFrame {
    public RootView() {
        initComponents();
        SetJtree();
        SetPanel();
        NodeSelect();
    }

    private void menuItemActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void exitActionPerformed() {
        // TODO add your code here
    }

    private void restoreFont() {
        // TODO add your code here
    }

    private void incrFont() {
        // TODO add your code here
    }

    private void decrFont() {
        // TODO add your code here
    }

    private void aboutActionPerformed() {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        RP = new JPanel();
        JTREE = new JScrollPane();

        //======== this ========
        setBackground(Color.pink);
        setTitle(" CryptionTool-Ver D\u2642A\u2642R\u2642K");
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/img/ffffffff0x_ico.png")).getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== RP ========
        {
            RP.setForeground(new Color(60, 63, 65));
            RP.setBackground(null);
            RP.setLayout(null);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < RP.getComponentCount(); i++) {
                    Rectangle bounds = RP.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = RP.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                RP.setMinimumSize(preferredSize);
                RP.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(RP);
        RP.setBounds(270, 5, 625, 590);
        contentPane.add(JTREE);
        JTREE.setBounds(4, 5, 260, 595);

        contentPane.setPreferredSize(new Dimension(905, 640));
        setSize(905, 640);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel RP;
    private JScrollPane JTREE;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public void run(){
        this.setSize(905,633);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void SetJtree(){
        na.setnode();
        //NodeSelect();
        JTREE.add(ta);
        ta.setShowsRootHandles(true);// 设置树显示根节点句柄
        ta.expandRow(0);//展开根节点
        ta.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);//一次只能选择一个节点，多节点为 TreeSelectionModel.DISCONTIGUOUS_TREE_SELECTION
        JTREE.setViewportView(ta);//创建一个视口并设置其视图
    }

    private final static NodeAdd na = new NodeAdd();
    private final static JTree ta = new JTree(na.root);// 使用根节点创建树组件

    private final static NodeMap Nodemap = new NodeMap();

    private final Index_Form Index_Form = new Index_Form();
    //private ThemeSelect_form ThemeSelect_form = new ThemeSelect_form();
    //private Setting_From Setting_From = new Setting_From();

    private void SetPanel(){
        RP.add(Index_Form);
        Index_Form.setBounds(0, 0, 620, 590);
        //this.SetPanelSetting(ThemeSelect_form);

        for (Map.Entry<String, JPanel> entry : Nodemap.nodemap.entrySet()) {
            this.SetPanelSetting(entry.getValue());
        }//循环遍历NodeMap
    }//放置Panel

    private void SetPanelSetting(JPanel set){
        RP.add(set);
        set.setBounds(0, 0, 620, 590);
        set.setVisible(false);
    }//设置Panel

    private void NodeSelect() {
        ta.addTreeSelectionListener(e -> {
            DefaultMutableTreeNode dmt = (DefaultMutableTreeNode) ta.getLastSelectedPathComponent();
            // 如果是叶子结点
            if (dmt.isLeaf()) {
                // 判断
                if (Nodemap.nodemap.get(dmt.toString())!= null){
                    PanelHide();
                    Nodemap.nodemap.get(dmt.toString()).setVisible(true);
                }
            }//pannel切换
        });
    }

    private void PanelHide() {
        int count = RP.getComponentCount();//获取这个panel内的所有控件
        for (int i = 0; i < count; i++) {
            Object obj = RP.getComponent(i);
            if (obj instanceof JPanel) {
                ((JPanel) obj).setVisible(false);//隐藏全部panel
            }
        }
    }
}
