/*
 * Created by JFormDesigner on Fri Apr 03 10:50:45 CST 2020
 */

package All_Tool_List.ToolView.RootView;

import All_Tool_List.Encryption.Classical.Atbash.Atbash_Form;
import All_Tool_List.Encryption.Classical.ROT.ROT_Form;
import All_Tool_List.Encryption.Classical.Rail_fence.Rail_fence_Form;
import All_Tool_List.Encryption.Classical.Vigenere.Vigenere_Form;
import All_Tool_List.Encryption.Coding.ASCII.ASCII_Form;
import All_Tool_List.Encryption.Coding.Base64.Base64_Form;
import All_Tool_List.Encryption.Coding.Conversion.Conversion_Form;
import All_Tool_List.Encryption.Coding.HEXCoder.HEXCoder_Form;
import All_Tool_List.Encryption.Coding.MorseCoder.MorseCoder_Form;
import All_Tool_List.Encryption.Coding.URL.URL_Form;
import All_Tool_List.Encryption.Coding.Unicode.Unicode_Form;
import All_Tool_List.Encryption.Modern.AES.AES_Form;
import All_Tool_List.Encryption.Modern.Authentication.JWT.JWT_Form;
import All_Tool_List.Encryption.Modern.Authentication.NTLM.NTLM_Form;
import All_Tool_List.Encryption.Modern.Hash.Hash_Form;
import All_Tool_List.Encryption.Modern.SM3.SM3_Form;
import All_Tool_List.Tool.NetTool.PortScan.ProtScan_form;
import All_Tool_List.Tool.TextModify.Case_conversion.Case_conversion_form;
import All_Tool_List.Tool.TextModify.Text_substitution.Text_substitution_form;
import All_Tool_List.ToolView.Index.Index_Form;
import All_Tool_List.ToolView.NodeAdd.NodeAdd;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @author 1
 */
public class RootView extends JFrame {
    private static NodeAdd na = new NodeAdd();
    private static JTree ta = new JTree(na.root);// 使用根节点创建树组件

    private Index_Form Index_Form = new Index_Form();
    //private Setting_From Setting_From = new Setting_From();

    //Coding
    private All_Tool_List.Encryption.Coding.ASCII.ASCII_Form ASCII_Form = new ASCII_Form();
    private Base64_Form Base64_Form = new Base64_Form();
    private All_Tool_List.Encryption.Coding.Conversion.Conversion_Form Conversion_Form = new Conversion_Form();
    private HEXCoder_Form HEXCoder_Form = new HEXCoder_Form();
    private MorseCoder_Form MorseCoder_Form = new MorseCoder_Form();
    private Unicode_Form Unicode_Form = new Unicode_Form();
    private URL_Form URL_Form = new URL_Form();

    //Classical
    private Atbash_Form Atbash_Form = new Atbash_Form();
    private Rail_fence_Form Rail_fence_Form = new Rail_fence_Form();
    private ROT_Form ROT_Form = new ROT_Form();
    private Vigenere_Form Vigenere_Form = new Vigenere_Form();

    //Modern
    private AES_Form AES_Form = new AES_Form();
    private JWT_Form JWT_Form = new JWT_Form();
    private NTLM_Form NTLM_Form = new NTLM_Form();
    private Hash_Form Hash_Form = new Hash_Form();
    private SM3_Form SM3_Form = new SM3_Form();

    //Tools
    //NetTool
    private ProtScan_form ProtScan_form = new ProtScan_form();
    //TextModify
    private Case_conversion_form Case_conversion_form = new Case_conversion_form();
    private Text_substitution_form Text_substitution_form = new Text_substitution_form();

    public RootView() {
        initComponents();
        SetJtree();
        SetPanel();
        NodeSelect();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        RP = new JPanel();
        JTREE = new JScrollPane();

        //======== this ========
        setBackground(Color.pink);
        setTitle(" CryptiontTool-Ver D\u2642A\u2642R\u2642K");
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/img/ffffffff0x_ico.png")).getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== RP ========
        {
            RP.setForeground(new Color(60, 63, 65));
            RP.setBackground(Color.gray);
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
        RP.setBounds(276, 5, 620, 590);
        contentPane.add(JTREE);
        JTREE.setBounds(4, 5, 265, 595);

        contentPane.setPreferredSize(new Dimension(905, 635));
        setSize(905, 635);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel RP;
    private JScrollPane JTREE;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public void run(){
        this.setSize(905,630);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void SetJtree(){
        na.setnode();
        //NodeSelect();
        JTREE.add(ta);
        ta.setShowsRootHandles(true);// 设置树显示根节点句柄
        ta.expandRow(0);//展开根节点
        JTREE.setViewportView(ta);//创建一个视口并设置其视图
    }

    private void SetPanel(){
        RP.add(Index_Form);
        Index_Form.setBounds(0, 0, 620, 590);

        //this.SetPanelSetting(Setting_From);
        //Coding
        this.SetPanelSetting(ASCII_Form);
        this.SetPanelSetting(Base64_Form);
        this.SetPanelSetting(Conversion_Form);
        this.SetPanelSetting(Unicode_Form);
        this.SetPanelSetting(MorseCoder_Form);
        this.SetPanelSetting(HEXCoder_Form);
        this.SetPanelSetting(URL_Form);
        //Classical
        this.SetPanelSetting(Atbash_Form );
        this.SetPanelSetting(Rail_fence_Form);
        this.SetPanelSetting(ROT_Form);
        this.SetPanelSetting(Vigenere_Form);
        //Modern
        this.SetPanelSetting(AES_Form);
        this.SetPanelSetting(JWT_Form);
        this.SetPanelSetting(NTLM_Form);
        this.SetPanelSetting(Hash_Form);
        this.SetPanelSetting(SM3_Form);
        //tools
        this.SetPanelSetting(ProtScan_form);
        this.SetPanelSetting(Case_conversion_form);
        this.SetPanelSetting(Text_substitution_form);

    }

    private void SetPanelSetting(JPanel set){
        RP.add(set);
        set.setBounds(0, 0, 620, 590);
        set.setVisible(false);
    }

    private void NodeSelect() {
        ta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //super.mouseClicked(e);
                DefaultMutableTreeNode dmt = (DefaultMutableTreeNode) ta.getLastSelectedPathComponent();
                // 如果是叶子结点
                if (dmt.isLeaf()) {
                    // 判断
                    switch(dmt.toString())// 叶子结点的字符串
                    {
                        //case "Setting": PanelHide();Setting_From.setVisible(true);break;
                        //case "Disposable Email Check":PanelHide();MailOnceCheck.setVisible(true);break;
                        ////Modern
                        case "JWT":PanelHide();JWT_Form.setVisible(true);break;
                        case "AES":PanelHide();AES_Form.setVisible(true);break;
                        case "Hash": PanelHide();Hash_Form.setVisible(true);break;//显示单个需要的panel
                        case "NTLM":PanelHide();NTLM_Form.setVisible(true);break;
                        case "SM3":PanelHide();SM3_Form.setVisible(true);break;
                        ////Classical
                        case "ROT13": PanelHide();ROT_Form.setVisible(true);break;
                        case "Rail fence(栅栏密码)": PanelHide();Rail_fence_Form.setVisible(true);break;
                        case "Atbash(埃特巴什码)":PanelHide();Atbash_Form.setVisible(true);break;
                        case "Vigenere(维吉尼亚密码)":PanelHide();Vigenere_Form.setVisible(true);break;
                        ////Coding
                        case "Base64": PanelHide();Base64_Form.setVisible(true);break;
                        case "Morse Code": PanelHide();MorseCoder_Form.setVisible(true);break;
                        case "URL": PanelHide();URL_Form.setVisible(true);break;
                        case "HEX": PanelHide();HEXCoder_Form.setVisible(true);break;
                        case "ASCII": PanelHide();ASCII_Form.setVisible(true);break;
                        case "Base Conversion": PanelHide();Conversion_Form.setVisible(true);break;
                        case "Unicode":PanelHide();Unicode_Form.setVisible(true);break;
                        ////Tools
                        case "Case Conversion":PanelHide();Case_conversion_form.setVisible(true);break;
                        case "Text Substitution":PanelHide();Text_substitution_form.setVisible(true);break;
                        case "Port Scan":PanelHide();ProtScan_form.setVisible(true);break;
                        default: break;
                    }
                }//pannel切换
            }
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
