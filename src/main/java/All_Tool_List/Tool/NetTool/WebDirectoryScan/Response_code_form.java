/*
 * Created by JFormDesigner on Fri Jun 05 16:22:11 CST 2020
 */

package All_Tool_List.Tool.NetTool.WebDirectoryScan;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.html.HTMLEditorKit;

/**
 * @author 1
 */
public class Response_code_form extends JFrame {
    public Response_code_form() {
        initComponents();
        setPage();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        Response_Code_panel = new JEditorPane();

        //======== this ========
        setTitle("Response Code");
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/img/icon/book-2-line.png")).getImage());
        setLayout(null);

        //======== scrollPane1 ========
        {

            //---- Response_Code_panel ----
            Response_Code_panel.setEditable(false);
            scrollPane1.setViewportView(Response_Code_panel);
        }
        add(scrollPane1);
        scrollPane1.setBounds(4, 4, 536, 601);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
        setSize(550, 645);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JEditorPane Response_Code_panel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void setPage() {
        String a = "      <h1 class=\"mume-header\" id=\"%E4%BF%A1%E6%81%AF%E5%93%8D%E5%BA%94100\">&#x4FE1;&#x606F;&#x54CD;&#x5E94;(100)</h1>\n" +
                "\n" +
                "<h2 class=\"mume-header\" id=\"100-continue\">100 Continue</h2>\n" +
                "\n" +
                "<p>&#x8FD9;&#x4E2A;&#x4E34;&#x65F6;&#x54CD;&#x5E94;&#x8868;&#x660E;&#xFF0C;&#x8FC4;&#x4ECA;&#x4E3A;&#x6B62;&#x7684;&#x6240;&#x6709;&#x5185;&#x5BB9;&#x90FD;&#x662F;&#x53EF;&#x884C;&#x7684;&#xFF0C;&#x5BA2;&#x6237;&#x7AEF;&#x5E94;&#x8BE5;&#x7EE7;&#x7EED;&#x8BF7;&#x6C42;&#xFF0C;&#x5982;&#x679C;&#x5DF2;&#x7ECF;&#x5B8C;&#x6210;&#xFF0C;&#x5219;&#x5FFD;&#x7565;&#x5B83;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"101-switching-protocol\">101 Switching Protocol</h2>\n" +
                "\n" +
                "<p>&#x8BE5;&#x4EE3;&#x7801;&#x662F;&#x54CD;&#x5E94;&#x5BA2;&#x6237;&#x7AEF;&#x7684; Upgrade &#x6807;&#x5934;&#x53D1;&#x9001;&#x7684;&#xFF0C;&#x5E76;&#x4E14;&#x6307;&#x793A;&#x670D;&#x52A1;&#x5668;&#x4E5F;&#x6B63;&#x5728;&#x5207;&#x6362;&#x7684;&#x534F;&#x8BAE;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"102-processing-webdav\">102 Processing (WebDAV)</h2>\n" +
                "\n" +
                "<p>&#x6B64;&#x4EE3;&#x7801;&#x8868;&#x793A;&#x670D;&#x52A1;&#x5668;&#x5DF2;&#x6536;&#x5230;&#x5E76;&#x6B63;&#x5728;&#x5904;&#x7406;&#x8BE5;&#x8BF7;&#x6C42;&#xFF0C;&#x4F46;&#x6CA1;&#x6709;&#x54CD;&#x5E94;&#x53EF;&#x7528;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"103-early-hints\">103 Early Hints</h2>\n" +
                "\n" +
                "<p>&#x6B64;&#x72B6;&#x6001;&#x4EE3;&#x7801;&#x4E3B;&#x8981;&#x7528;&#x4E8E;&#x4E0E;Link &#x94FE;&#x63A5;&#x5934;&#x4E00;&#x8D77;&#x4F7F;&#x7528;&#xFF0C;&#x4EE5;&#x5141;&#x8BB8;&#x7528;&#x6237;&#x4EE3;&#x7406;&#x5728;&#x670D;&#x52A1;&#x5668;&#x4ECD;&#x5728;&#x51C6;&#x5907;&#x54CD;&#x5E94;&#x65F6;&#x5F00;&#x59CB;&#x9884;&#x52A0;&#x8F7D;&#x8D44;&#x6E90;&#x3002;</p>\n" +
                "<h1 class=\"mume-header\" id=\"%E6%88%90%E5%8A%9F%E5%93%8D%E5%BA%94200\">&#x6210;&#x529F;&#x54CD;&#x5E94;(200)</h1>\n" +
                "\n" +
                "<h2 class=\"mume-header\" id=\"200-ok\">200 OK</h2>\n" +
                "\n" +
                "<p>&#x8BF7;&#x6C42;&#x6210;&#x529F;&#x3002;&#x6210;&#x529F;&#x7684;&#x542B;&#x4E49;&#x53D6;&#x51B3;&#x4E8E;HTTP&#x65B9;&#x6CD5;&#xFF1A;</p>\n" +
                "<p>GET&#xFF1A;&#x8D44;&#x6E90;&#x5DF2;&#x88AB;&#x63D0;&#x53D6;&#x5E76;&#x5728;&#x6D88;&#x606F;&#x6B63;&#x6587;&#x4E2D;&#x4F20;&#x8F93;&#x3002;<br>\n" +
                "HEAD&#xFF1A;&#x5B9E;&#x4F53;&#x6807;&#x5934;&#x4F4D;&#x4E8E;&#x6D88;&#x606F;&#x6B63;&#x6587;&#x4E2D;&#x3002;<br>\n" +
                "POST&#xFF1A;&#x63CF;&#x8FF0;&#x52A8;&#x4F5C;&#x7ED3;&#x679C;&#x7684;&#x8D44;&#x6E90;&#x5728;&#x6D88;&#x606F;&#x4F53;&#x4E2D;&#x4F20;&#x8F93;&#x3002;<br>\n" +
                "TRACE&#xFF1A;&#x6D88;&#x606F;&#x6B63;&#x6587;&#x5305;&#x542B;&#x670D;&#x52A1;&#x5668;&#x6536;&#x5230;&#x7684;&#x8BF7;&#x6C42;&#x6D88;&#x606F;</p>\n" +
                "<h2 class=\"mume-header\" id=\"201-created\">201 Created</h2>\n" +
                "\n" +
                "<p>&#x8BE5;&#x8BF7;&#x6C42;&#x5DF2;&#x6210;&#x529F;&#xFF0C;&#x5E76;&#x56E0;&#x6B64;&#x521B;&#x5EFA;&#x4E86;&#x4E00;&#x4E2A;&#x65B0;&#x7684;&#x8D44;&#x6E90;&#x3002;&#x8FD9;&#x901A;&#x5E38;&#x662F;&#x5728;POST&#x8BF7;&#x6C42;&#xFF0C;&#x6216;&#x662F;&#x67D0;&#x4E9B;PUT&#x8BF7;&#x6C42;&#x4E4B;&#x540E;&#x8FD4;&#x56DE;&#x7684;&#x54CD;&#x5E94;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"202-accepted\">202 Accepted</h2>\n" +
                "\n" +
                "<p>&#x8BF7;&#x6C42;&#x5DF2;&#x7ECF;&#x63A5;&#x6536;&#x5230;&#xFF0C;&#x4F46;&#x8FD8;&#x672A;&#x54CD;&#x5E94;&#xFF0C;&#x6CA1;&#x6709;&#x7ED3;&#x679C;&#x3002;&#x610F;&#x5473;&#x7740;&#x4E0D;&#x4F1A;&#x6709;&#x4E00;&#x4E2A;&#x5F02;&#x6B65;&#x7684;&#x54CD;&#x5E94;&#x53BB;&#x8868;&#x660E;&#x5F53;&#x524D;&#x8BF7;&#x6C42;&#x7684;&#x7ED3;&#x679C;&#xFF0C;&#x9884;&#x671F;&#x53E6;&#x5916;&#x7684;&#x8FDB;&#x7A0B;&#x548C;&#x670D;&#x52A1;&#x53BB;&#x5904;&#x7406;&#x8BF7;&#x6C42;&#xFF0C;&#x6216;&#x8005;&#x6279;&#x5904;&#x7406;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"203-non-authoritative-information\">203 Non-Authoritative Information</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x5DF2;&#x6210;&#x529F;&#x5904;&#x7406;&#x4E86;&#x8BF7;&#x6C42;&#xFF0C;&#x4F46;&#x8FD4;&#x56DE;&#x7684;&#x5B9E;&#x4F53;&#x5934;&#x90E8;&#x5143;&#x4FE1;&#x606F;&#x4E0D;&#x662F;&#x5728;&#x539F;&#x59CB;&#x670D;&#x52A1;&#x5668;&#x4E0A;&#x6709;&#x6548;&#x7684;&#x786E;&#x5B9A;&#x96C6;&#x5408;&#xFF0C;&#x800C;&#x662F;&#x6765;&#x81EA;&#x672C;&#x5730;&#x6216;&#x8005;&#x7B2C;&#x4E09;&#x65B9;&#x7684;&#x62F7;&#x8D1D;&#x3002;&#x5F53;&#x524D;&#x7684;&#x4FE1;&#x606F;&#x53EF;&#x80FD;&#x662F;&#x539F;&#x59CB;&#x7248;&#x672C;&#x7684;&#x5B50;&#x96C6;&#x6216;&#x8005;&#x8D85;&#x96C6;&#x3002;&#x4F8B;&#x5982;&#xFF0C;&#x5305;&#x542B;&#x8D44;&#x6E90;&#x7684;&#x5143;&#x6570;&#x636E;&#x53EF;&#x80FD;&#x5BFC;&#x81F4;&#x539F;&#x59CB;&#x670D;&#x52A1;&#x5668;&#x77E5;&#x9053;&#x5143;&#x4FE1;&#x606F;&#x7684;&#x8D85;&#x96C6;&#x3002;&#x4F7F;&#x7528;&#x6B64;&#x72B6;&#x6001;&#x7801;&#x4E0D;&#x662F;&#x5FC5;&#x987B;&#x7684;&#xFF0C;&#x800C;&#x4E14;&#x53EA;&#x6709;&#x5728;&#x54CD;&#x5E94;&#x4E0D;&#x4F7F;&#x7528;&#x6B64;&#x72B6;&#x6001;&#x7801;&#x4FBF;&#x4F1A;&#x8FD4;&#x56DE;200 OK&#x7684;&#x60C5;&#x51B5;&#x4E0B;&#x624D;&#x662F;&#x5408;&#x9002;&#x7684;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"204-no-content\">204 No Content</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x6210;&#x529F;&#x5904;&#x7406;&#x4E86;&#x8BF7;&#x6C42;&#xFF0C;&#x4F46;&#x4E0D;&#x9700;&#x8981;&#x8FD4;&#x56DE;&#x4EFB;&#x4F55;&#x5B9E;&#x4F53;&#x5185;&#x5BB9;&#xFF0C;&#x5E76;&#x4E14;&#x5E0C;&#x671B;&#x8FD4;&#x56DE;&#x66F4;&#x65B0;&#x4E86;&#x7684;&#x5143;&#x4FE1;&#x606F;&#x3002;&#x54CD;&#x5E94;&#x53EF;&#x80FD;&#x901A;&#x8FC7;&#x5B9E;&#x4F53;&#x5934;&#x90E8;&#x7684;&#x5F62;&#x5F0F;&#xFF0C;&#x8FD4;&#x56DE;&#x65B0;&#x7684;&#x6216;&#x66F4;&#x65B0;&#x540E;&#x7684;&#x5143;&#x4FE1;&#x606F;&#x3002;&#x5982;&#x679C;&#x5B58;&#x5728;&#x8FD9;&#x4E9B;&#x5934;&#x90E8;&#x4FE1;&#x606F;&#xFF0C;&#x5219;&#x5E94;&#x5F53;&#x4E0E;&#x6240;&#x8BF7;&#x6C42;&#x7684;&#x53D8;&#x91CF;&#x76F8;&#x547C;&#x5E94;&#x3002;&#x5982;&#x679C;&#x5BA2;&#x6237;&#x7AEF;&#x662F;&#x6D4F;&#x89C8;&#x5668;&#x7684;&#x8BDD;&#xFF0C;&#x90A3;&#x4E48;&#x7528;&#x6237;&#x6D4F;&#x89C8;&#x5668;&#x5E94;&#x4FDD;&#x7559;&#x53D1;&#x9001;&#x4E86;&#x8BE5;&#x8BF7;&#x6C42;&#x7684;&#x9875;&#x9762;&#xFF0C;&#x800C;&#x4E0D;&#x4EA7;&#x751F;&#x4EFB;&#x4F55;&#x6587;&#x6863;&#x89C6;&#x56FE;&#x4E0A;&#x7684;&#x53D8;&#x5316;&#xFF0C;&#x5373;&#x4F7F;&#x6309;&#x7167;&#x89C4;&#x8303;&#x65B0;&#x7684;&#x6216;&#x66F4;&#x65B0;&#x540E;&#x7684;&#x5143;&#x4FE1;&#x606F;&#x5E94;&#x5F53;&#x88AB;&#x5E94;&#x7528;&#x5230;&#x7528;&#x6237;&#x6D4F;&#x89C8;&#x5668;&#x6D3B;&#x52A8;&#x89C6;&#x56FE;&#x4E2D;&#x7684;&#x6587;&#x6863;&#x3002;&#x7531;&#x4E8E;204&#x54CD;&#x5E94;&#x88AB;&#x7981;&#x6B62;&#x5305;&#x542B;&#x4EFB;&#x4F55;&#x6D88;&#x606F;&#x4F53;&#xFF0C;&#x56E0;&#x6B64;&#x5B83;&#x59CB;&#x7EC8;&#x4EE5;&#x6D88;&#x606F;&#x5934;&#x540E;&#x7684;&#x7B2C;&#x4E00;&#x4E2A;&#x7A7A;&#x884C;&#x7ED3;&#x5C3E;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"205-reset-content\">205 Reset Content</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x6210;&#x529F;&#x5904;&#x7406;&#x4E86;&#x8BF7;&#x6C42;&#xFF0C;&#x4E14;&#x6CA1;&#x6709;&#x8FD4;&#x56DE;&#x4EFB;&#x4F55;&#x5185;&#x5BB9;&#x3002;&#x4F46;&#x662F;&#x4E0E;204&#x54CD;&#x5E94;&#x4E0D;&#x540C;&#xFF0C;&#x8FD4;&#x56DE;&#x6B64;&#x72B6;&#x6001;&#x7801;&#x7684;&#x54CD;&#x5E94;&#x8981;&#x6C42;&#x8BF7;&#x6C42;&#x8005;&#x91CD;&#x7F6E;&#x6587;&#x6863;&#x89C6;&#x56FE;&#x3002;&#x8BE5;&#x54CD;&#x5E94;&#x4E3B;&#x8981;&#x662F;&#x88AB;&#x7528;&#x4E8E;&#x63A5;&#x53D7;&#x7528;&#x6237;&#x8F93;&#x5165;&#x540E;&#xFF0C;&#x7ACB;&#x5373;&#x91CD;&#x7F6E;&#x8868;&#x5355;&#xFF0C;&#x4EE5;&#x4FBF;&#x7528;&#x6237;&#x80FD;&#x591F;&#x8F7B;&#x677E;&#x5730;&#x5F00;&#x59CB;&#x53E6;&#x4E00;&#x6B21;&#x8F93;&#x5165;&#x3002;&#x4E0E;204&#x54CD;&#x5E94;&#x4E00;&#x6837;&#xFF0C;&#x8BE5;&#x54CD;&#x5E94;&#x4E5F;&#x88AB;&#x7981;&#x6B62;&#x5305;&#x542B;&#x4EFB;&#x4F55;&#x6D88;&#x606F;&#x4F53;&#xFF0C;&#x4E14;&#x4EE5;&#x6D88;&#x606F;&#x5934;&#x540E;&#x7684;&#x7B2C;&#x4E00;&#x4E2A;&#x7A7A;&#x884C;&#x7ED3;&#x675F;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"206-partial-content\">206 Partial Content</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x5DF2;&#x7ECF;&#x6210;&#x529F;&#x5904;&#x7406;&#x4E86;&#x90E8;&#x5206; GET &#x8BF7;&#x6C42;&#x3002;&#x7C7B;&#x4F3C;&#x4E8E; FlashGet &#x6216;&#x8005;&#x8FC5;&#x96F7;&#x8FD9;&#x7C7B;&#x7684; HTTP &#x4E0B;&#x8F7D;&#x5DE5;&#x5177;&#x90FD;&#x662F;&#x4F7F;&#x7528;&#x6B64;&#x7C7B;&#x54CD;&#x5E94;&#x5B9E;&#x73B0;&#x65AD;&#x70B9;&#x7EED;&#x4F20;&#x6216;&#x8005;&#x5C06;&#x4E00;&#x4E2A;&#x5927;&#x6587;&#x6863;&#x5206;&#x89E3;&#x4E3A;&#x591A;&#x4E2A;&#x4E0B;&#x8F7D;&#x6BB5;&#x540C;&#x65F6;&#x4E0B;&#x8F7D;&#x3002;&#x8BE5;&#x8BF7;&#x6C42;&#x5FC5;&#x987B;&#x5305;&#x542B; Range &#x5934;&#x4FE1;&#x606F;&#x6765;&#x6307;&#x793A;&#x5BA2;&#x6237;&#x7AEF;&#x5E0C;&#x671B;&#x5F97;&#x5230;&#x7684;&#x5185;&#x5BB9;&#x8303;&#x56F4;&#xFF0C;&#x5E76;&#x4E14;&#x53EF;&#x80FD;&#x5305;&#x542B; If##Range &#x6765;&#x4F5C;&#x4E3A;&#x8BF7;&#x6C42;&#x6761;&#x4EF6;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"207-multi-status-webdav\">207 Multi-Status (WebDAV)</h2>\n" +
                "\n" +
                "<p>&#x7531;WebDAV(RFC 2518)&#x6269;&#x5C55;&#x7684;&#x72B6;&#x6001;&#x7801;&#xFF0C;&#x4EE3;&#x8868;&#x4E4B;&#x540E;&#x7684;&#x6D88;&#x606F;&#x4F53;&#x5C06;&#x662F;&#x4E00;&#x4E2A;XML&#x6D88;&#x606F;&#xFF0C;&#x5E76;&#x4E14;&#x53EF;&#x80FD;&#x4F9D;&#x7167;&#x4E4B;&#x524D;&#x5B50;&#x8BF7;&#x6C42;&#x6570;&#x91CF;&#x7684;&#x4E0D;&#x540C;&#xFF0C;&#x5305;&#x542B;&#x4E00;&#x7CFB;&#x5217;&#x72EC;&#x7ACB;&#x7684;&#x54CD;&#x5E94;&#x4EE3;&#x7801;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"208-already-reported-webdav\">208 Already Reported (WebDAV)</h2>\n" +
                "\n" +
                "<p>&#x5728; DAV &#x91CC;&#x9762;&#x4F7F;&#x7528;: propstat &#x54CD;&#x5E94;&#x5143;&#x7D20;&#x4EE5;&#x907F;&#x514D;&#x91CD;&#x590D;&#x679A;&#x4E3E;&#x591A;&#x4E2A;&#x7ED1;&#x5B9A;&#x7684;&#x5185;&#x90E8;&#x6210;&#x5458;&#x5230;&#x540C;&#x4E00;&#x4E2A;&#x96C6;&#x5408;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"226-im-used-http-delta-encoding\">226 IM Used (HTTP Delta encoding)</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x5DF2;&#x7ECF;&#x5B8C;&#x6210;&#x4E86;&#x5BF9;&#x8D44;&#x6E90;&#x7684; GET &#x8BF7;&#x6C42;&#xFF0C;&#x5E76;&#x4E14;&#x54CD;&#x5E94;&#x662F;&#x5BF9;&#x5F53;&#x524D;&#x5B9E;&#x4F8B;&#x5E94;&#x7528;&#x7684;&#x4E00;&#x4E2A;&#x6216;&#x591A;&#x4E2A;&#x5B9E;&#x4F8B;&#x64CD;&#x4F5C;&#x7ED3;&#x679C;&#x7684;&#x8868;&#x793A;&#x3002;</p>\n" +
                "<h1 class=\"mume-header\" id=\"%E9%87%8D%E5%AE%9A%E5%90%91300\">&#x91CD;&#x5B9A;&#x5411;(300)</h1>\n" +
                "\n" +
                "<h2 class=\"mume-header\" id=\"300-multiple-choice\">300 Multiple Choice</h2>\n" +
                "\n" +
                "<p>&#x88AB;&#x8BF7;&#x6C42;&#x7684;&#x8D44;&#x6E90;&#x6709;&#x4E00;&#x7CFB;&#x5217;&#x53EF;&#x4F9B;&#x9009;&#x62E9;&#x7684;&#x56DE;&#x9988;&#x4FE1;&#x606F;&#xFF0C;&#x6BCF;&#x4E2A;&#x90FD;&#x6709;&#x81EA;&#x5DF1;&#x7279;&#x5B9A;&#x7684;&#x5730;&#x5740;&#x548C;&#x6D4F;&#x89C8;&#x5668;&#x9A71;&#x52A8;&#x7684;&#x5546;&#x8BAE;&#x4FE1;&#x606F;&#x3002;&#x7528;&#x6237;&#x6216;&#x6D4F;&#x89C8;&#x5668;&#x80FD;&#x591F;&#x81EA;&#x884C;&#x9009;&#x62E9;&#x4E00;&#x4E2A;&#x9996;&#x9009;&#x7684;&#x5730;&#x5740;&#x8FDB;&#x884C;&#x91CD;&#x5B9A;&#x5411;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"301-moved-permanently\">301 Moved Permanently</h2>\n" +
                "\n" +
                "<p>&#x88AB;&#x8BF7;&#x6C42;&#x7684;&#x8D44;&#x6E90;&#x5DF2;&#x6C38;&#x4E45;&#x79FB;&#x52A8;&#x5230;&#x65B0;&#x4F4D;&#x7F6E;&#xFF0C;&#x5E76;&#x4E14;&#x5C06;&#x6765;&#x4EFB;&#x4F55;&#x5BF9;&#x6B64;&#x8D44;&#x6E90;&#x7684;&#x5F15;&#x7528;&#x90FD;&#x5E94;&#x8BE5;&#x4F7F;&#x7528;&#x672C;&#x54CD;&#x5E94;&#x8FD4;&#x56DE;&#x7684;&#x82E5;&#x5E72;&#x4E2A; URI &#x4E4B;&#x4E00;&#x3002;&#x5982;&#x679C;&#x53EF;&#x80FD;&#xFF0C;&#x62E5;&#x6709;&#x94FE;&#x63A5;&#x7F16;&#x8F91;&#x529F;&#x80FD;&#x7684;&#x5BA2;&#x6237;&#x7AEF;&#x5E94;&#x5F53;&#x81EA;&#x52A8;&#x628A;&#x8BF7;&#x6C42;&#x7684;&#x5730;&#x5740;&#x4FEE;&#x6539;&#x4E3A;&#x4ECE;&#x670D;&#x52A1;&#x5668;&#x53CD;&#x9988;&#x56DE;&#x6765;&#x7684;&#x5730;&#x5740;&#x3002;&#x9664;&#x975E;&#x989D;&#x5916;&#x6307;&#x5B9A;&#xFF0C;&#x5426;&#x5219;&#x8FD9;&#x4E2A;&#x54CD;&#x5E94;&#x4E5F;&#x662F;&#x53EF;&#x7F13;&#x5B58;&#x7684;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"302-found\">302 Found</h2>\n" +
                "\n" +
                "<p>&#x8BF7;&#x6C42;&#x7684;&#x8D44;&#x6E90;&#x73B0;&#x5728;&#x4E34;&#x65F6;&#x4ECE;&#x4E0D;&#x540C;&#x7684; URI &#x54CD;&#x5E94;&#x8BF7;&#x6C42;&#x3002;&#x7531;&#x4E8E;&#x8FD9;&#x6837;&#x7684;&#x91CD;&#x5B9A;&#x5411;&#x662F;&#x4E34;&#x65F6;&#x7684;&#xFF0C;&#x5BA2;&#x6237;&#x7AEF;&#x5E94;&#x5F53;&#x7EE7;&#x7EED;&#x5411;&#x539F;&#x6709;&#x5730;&#x5740;&#x53D1;&#x9001;&#x4EE5;&#x540E;&#x7684;&#x8BF7;&#x6C42;&#x3002;&#x53EA;&#x6709;&#x5728;Cache##Control&#x6216;Expires&#x4E2D;&#x8FDB;&#x884C;&#x4E86;&#x6307;&#x5B9A;&#x7684;&#x60C5;&#x51B5;&#x4E0B;&#xFF0C;&#x8FD9;&#x4E2A;&#x54CD;&#x5E94;&#x624D;&#x662F;&#x53EF;&#x7F13;&#x5B58;&#x7684;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"303-see-other\">303 See Other</h2>\n" +
                "\n" +
                "<p>&#x5BF9;&#x5E94;&#x5F53;&#x524D;&#x8BF7;&#x6C42;&#x7684;&#x54CD;&#x5E94;&#x53EF;&#x4EE5;&#x5728;&#x53E6;&#x4E00;&#x4E2A; URI &#x4E0A;&#x88AB;&#x627E;&#x5230;&#xFF0C;&#x800C;&#x4E14;&#x5BA2;&#x6237;&#x7AEF;&#x5E94;&#x5F53;&#x91C7;&#x7528; GET &#x7684;&#x65B9;&#x5F0F;&#x8BBF;&#x95EE;&#x90A3;&#x4E2A;&#x8D44;&#x6E90;&#x3002;&#x8FD9;&#x4E2A;&#x65B9;&#x6CD5;&#x7684;&#x5B58;&#x5728;&#x4E3B;&#x8981;&#x662F;&#x4E3A;&#x4E86;&#x5141;&#x8BB8;&#x7531;&#x811A;&#x672C;&#x6FC0;&#x6D3B;&#x7684;POST&#x8BF7;&#x6C42;&#x8F93;&#x51FA;&#x91CD;&#x5B9A;&#x5411;&#x5230;&#x4E00;&#x4E2A;&#x65B0;&#x7684;&#x8D44;&#x6E90;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"304-not-modified\">304 Not Modified</h2>\n" +
                "\n" +
                "<p>&#x5982;&#x679C;&#x5BA2;&#x6237;&#x7AEF;&#x53D1;&#x9001;&#x4E86;&#x4E00;&#x4E2A;&#x5E26;&#x6761;&#x4EF6;&#x7684; GET &#x8BF7;&#x6C42;&#x4E14;&#x8BE5;&#x8BF7;&#x6C42;&#x5DF2;&#x88AB;&#x5141;&#x8BB8;&#xFF0C;&#x800C;&#x6587;&#x6863;&#x7684;&#x5185;&#x5BB9;&#xFF08;&#x81EA;&#x4E0A;&#x6B21;&#x8BBF;&#x95EE;&#x4EE5;&#x6765;&#x6216;&#x8005;&#x6839;&#x636E;&#x8BF7;&#x6C42;&#x7684;&#x6761;&#x4EF6;&#xFF09;&#x5E76;&#x6CA1;&#x6709;&#x6539;&#x53D8;&#xFF0C;&#x5219;&#x670D;&#x52A1;&#x5668;&#x5E94;&#x5F53;&#x8FD4;&#x56DE;&#x8FD9;&#x4E2A;&#x72B6;&#x6001;&#x7801;&#x3002;304 &#x54CD;&#x5E94;&#x7981;&#x6B62;&#x5305;&#x542B;&#x6D88;&#x606F;&#x4F53;&#xFF0C;&#x56E0;&#x6B64;&#x59CB;&#x7EC8;&#x4EE5;&#x6D88;&#x606F;&#x5934;&#x540E;&#x7684;&#x7B2C;&#x4E00;&#x4E2A;&#x7A7A;&#x884C;&#x7ED3;&#x5C3E;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"305-use-proxy\">305 Use Proxy</h2>\n" +
                "\n" +
                "<p>&#x88AB;&#x8BF7;&#x6C42;&#x7684;&#x8D44;&#x6E90;&#x5FC5;&#x987B;&#x901A;&#x8FC7;&#x6307;&#x5B9A;&#x7684;&#x4EE3;&#x7406;&#x624D;&#x80FD;&#x88AB;&#x8BBF;&#x95EE;&#x3002;Location &#x57DF;&#x4E2D;&#x5C06;&#x7ED9;&#x51FA;&#x6307;&#x5B9A;&#x7684;&#x4EE3;&#x7406;&#x6240;&#x5728;&#x7684; URI &#x4FE1;&#x606F;&#xFF0C;&#x63A5;&#x6536;&#x8005;&#x9700;&#x8981;&#x91CD;&#x590D;&#x53D1;&#x9001;&#x4E00;&#x4E2A;&#x5355;&#x72EC;&#x7684;&#x8BF7;&#x6C42;&#xFF0C;&#x901A;&#x8FC7;&#x8FD9;&#x4E2A;&#x4EE3;&#x7406;&#x624D;&#x80FD;&#x8BBF;&#x95EE;&#x76F8;&#x5E94;&#x8D44;&#x6E90;&#x3002;&#x53EA;&#x6709;&#x539F;&#x59CB;&#x670D;&#x52A1;&#x5668;&#x624D;&#x80FD;&#x5EFA;&#x7ACB;305&#x54CD;&#x5E94;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"306-unused\">306 unused</h2>\n" +
                "\n" +
                "<p>&#x5728;&#x6700;&#x65B0;&#x7248;&#x7684;&#x89C4;&#x8303;&#x4E2D;&#xFF0C;306 &#x72B6;&#x6001;&#x7801;&#x5DF2;&#x7ECF;&#x4E0D;&#x518D;&#x88AB;&#x4F7F;&#x7528;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"307-temporary-redirect\">307 Temporary Redirect</h2>\n" +
                "\n" +
                "<p>&#x8BF7;&#x6C42;&#x7684;&#x8D44;&#x6E90;&#x73B0;&#x5728;&#x4E34;&#x65F6;&#x4ECE;&#x4E0D;&#x540C;&#x7684;URI &#x54CD;&#x5E94;&#x8BF7;&#x6C42;&#x3002;&#x7531;&#x4E8E;&#x8FD9;&#x6837;&#x7684;&#x91CD;&#x5B9A;&#x5411;&#x662F;&#x4E34;&#x65F6;&#x7684;&#xFF0C;&#x5BA2;&#x6237;&#x7AEF;&#x5E94;&#x5F53;&#x7EE7;&#x7EED;&#x5411;&#x539F;&#x6709;&#x5730;&#x5740;&#x53D1;&#x9001;&#x4EE5;&#x540E;&#x7684;&#x8BF7;&#x6C42;&#x3002;&#x53EA;&#x6709;&#x5728;Cache##Control&#x6216;Expires&#x4E2D;&#x8FDB;&#x884C;&#x4E86;&#x6307;&#x5B9A;&#x7684;&#x60C5;&#x51B5;&#x4E0B;&#xFF0C;&#x8FD9;&#x4E2A;&#x54CD;&#x5E94;&#x624D;&#x662F;&#x53EF;&#x7F13;&#x5B58;&#x7684;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"308-permanent-redirect\">308 Permanent Redirect</h2>\n" +
                "\n" +
                "<p>&#x8FD9;&#x610F;&#x5473;&#x7740;&#x8D44;&#x6E90;&#x73B0;&#x5728;&#x6C38;&#x4E45;&#x4F4D;&#x4E8E;&#x7531; Location: HTTP Response &#x6807;&#x5934;&#x6307;&#x5B9A;&#x7684;&#x53E6;&#x4E00;&#x4E2A; URI&#x3002; &#x8FD9;&#x4E0E; 301 Moved Permanently HTTP &#x54CD;&#x5E94;&#x4EE3;&#x7801;&#x5177;&#x6709;&#x76F8;&#x540C;&#x7684;&#x8BED;&#x4E49;&#xFF0C;&#x4F46;&#x7528;&#x6237;&#x4EE3;&#x7406;&#x4E0D;&#x80FD;&#x66F4;&#x6539;&#x6240;&#x4F7F;&#x7528;&#x7684; HTTP &#x65B9;&#x6CD5;&#xFF1A;&#x5982;&#x679C;&#x5728;&#x7B2C;&#x4E00;&#x4E2A;&#x8BF7;&#x6C42;&#x4E2D;&#x4F7F;&#x7528; POST&#xFF0C;&#x5219;&#x5FC5;&#x987B;&#x5728;&#x7B2C;&#x4E8C;&#x4E2A;&#x8BF7;&#x6C42;&#x4E2D;&#x4F7F;&#x7528; POST&#x3002;</p>\n" +
                "<h1 class=\"mume-header\" id=\"%E5%AE%A2%E6%88%B7%E7%AB%AF%E5%93%8D%E5%BA%94400\">&#x5BA2;&#x6237;&#x7AEF;&#x54CD;&#x5E94;(400)</h1>\n" +
                "\n" +
                "<h2 class=\"mume-header\" id=\"400-bad-request\">400 Bad Request</h2>\n" +
                "\n" +
                "<p>1&#x3001;&#x8BED;&#x4E49;&#x6709;&#x8BEF;&#xFF0C;&#x5F53;&#x524D;&#x8BF7;&#x6C42;&#x65E0;&#x6CD5;&#x88AB;&#x670D;&#x52A1;&#x5668;&#x7406;&#x89E3;&#x3002;&#x9664;&#x975E;&#x8FDB;&#x884C;&#x4FEE;&#x6539;&#xFF0C;&#x5426;&#x5219;&#x5BA2;&#x6237;&#x7AEF;&#x4E0D;&#x5E94;&#x8BE5;&#x91CD;&#x590D;&#x63D0;&#x4EA4;&#x8FD9;&#x4E2A;&#x8BF7;&#x6C42;&#x3002;</p>\n" +
                "<p>2&#x3001;&#x8BF7;&#x6C42;&#x53C2;&#x6570;&#x6709;&#x8BEF;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"401-unauthorized\">401 Unauthorized</h2>\n" +
                "\n" +
                "<p>&#x5F53;&#x524D;&#x8BF7;&#x6C42;&#x9700;&#x8981;&#x7528;&#x6237;&#x9A8C;&#x8BC1;&#x3002;&#x8BE5;&#x54CD;&#x5E94;&#x5FC5;&#x987B;&#x5305;&#x542B;&#x4E00;&#x4E2A;&#x9002;&#x7528;&#x4E8E;&#x88AB;&#x8BF7;&#x6C42;&#x8D44;&#x6E90;&#x7684;  WWW-Authenticate &#x4FE1;&#x606F;&#x5934;&#x7528;&#x4EE5;&#x8BE2;&#x95EE;&#x7528;&#x6237;&#x4FE1;&#x606F;&#x3002;&#x5BA2;&#x6237;&#x7AEF;&#x53EF;&#x4EE5;&#x91CD;&#x590D;&#x63D0;&#x4EA4;&#x4E00;&#x4E2A;&#x5305;&#x542B;&#x6070;&#x5F53;&#x7684; Authorization &#x5934;&#x4FE1;&#x606F;&#x7684;&#x8BF7;&#x6C42;&#x3002;&#x5982;&#x679C;&#x5F53;&#x524D;&#x8BF7;&#x6C42;&#x5DF2;&#x7ECF;&#x5305;&#x542B;&#x4E86; Authorization &#x8BC1;&#x4E66;&#xFF0C;&#x90A3;&#x4E48;401&#x54CD;&#x5E94;&#x4EE3;&#x8868;&#x7740;&#x670D;&#x52A1;&#x5668;&#x9A8C;&#x8BC1;&#x5DF2;&#x7ECF;&#x62D2;&#x7EDD;&#x4E86;&#x90A3;&#x4E9B;&#x8BC1;&#x4E66;&#x3002;&#x5982;&#x679C;401&#x54CD;&#x5E94;&#x5305;&#x542B;&#x4E86;&#x4E0E;&#x524D;&#x4E00;&#x4E2A;&#x54CD;&#x5E94;&#x76F8;&#x540C;&#x7684;&#x8EAB;&#x4EFD;&#x9A8C;&#x8BC1;&#x8BE2;&#x95EE;&#xFF0C;&#x4E14;&#x6D4F;&#x89C8;&#x5668;&#x5DF2;&#x7ECF;&#x81F3;&#x5C11;&#x5C1D;&#x8BD5;&#x4E86;&#x4E00;&#x6B21;&#x9A8C;&#x8BC1;&#xFF0C;&#x90A3;&#x4E48;&#x6D4F;&#x89C8;&#x5668;&#x5E94;&#x5F53;&#x5411;&#x7528;&#x6237;&#x5C55;&#x793A;&#x54CD;&#x5E94;&#x4E2D;&#x5305;&#x542B;&#x7684;&#x5B9E;&#x4F53;&#x4FE1;&#x606F;&#xFF0C;&#x56E0;&#x4E3A;&#x8FD9;&#x4E2A;&#x5B9E;&#x4F53;&#x4FE1;&#x606F;&#x4E2D;&#x53EF;&#x80FD;&#x5305;&#x542B;&#x4E86;&#x76F8;&#x5173;&#x8BCA;&#x65AD;&#x4FE1;&#x606F;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"402-payment-required\">402 Payment Required</h2>\n" +
                "\n" +
                "<p>&#x6B64;&#x54CD;&#x5E94;&#x7801;&#x4FDD;&#x7559;&#x4EE5;&#x4FBF;&#x5C06;&#x6765;&#x4F7F;&#x7528;&#xFF0C;&#x521B;&#x9020;&#x6B64;&#x54CD;&#x5E94;&#x7801;&#x7684;&#x6700;&#x521D;&#x76EE;&#x7684;&#x662F;&#x7528;&#x4E8E;&#x6570;&#x5B57;&#x652F;&#x4ED8;&#x7CFB;&#x7EDF;&#xFF0C;&#x7136;&#x800C;&#x73B0;&#x5728;&#x5E76;&#x672A;&#x4F7F;&#x7528;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"403-forbidden\">403 Forbidden</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x5DF2;&#x7ECF;&#x7406;&#x89E3;&#x8BF7;&#x6C42;&#xFF0C;&#x4F46;&#x662F;&#x62D2;&#x7EDD;&#x6267;&#x884C;&#x5B83;&#x3002;&#x4E0E; 401 &#x54CD;&#x5E94;&#x4E0D;&#x540C;&#x7684;&#x662F;&#xFF0C;&#x8EAB;&#x4EFD;&#x9A8C;&#x8BC1;&#x5E76;&#x4E0D;&#x80FD;&#x63D0;&#x4F9B;&#x4EFB;&#x4F55;&#x5E2E;&#x52A9;&#xFF0C;&#x800C;&#x4E14;&#x8FD9;&#x4E2A;&#x8BF7;&#x6C42;&#x4E5F;&#x4E0D;&#x5E94;&#x8BE5;&#x88AB;&#x91CD;&#x590D;&#x63D0;&#x4EA4;&#x3002;&#x5982;&#x679C;&#x8FD9;&#x4E0D;&#x662F;&#x4E00;&#x4E2A; HEAD &#x8BF7;&#x6C42;&#xFF0C;&#x800C;&#x4E14;&#x670D;&#x52A1;&#x5668;&#x5E0C;&#x671B;&#x80FD;&#x591F;&#x8BB2;&#x6E05;&#x695A;&#x4E3A;&#x4F55;&#x8BF7;&#x6C42;&#x4E0D;&#x80FD;&#x88AB;&#x6267;&#x884C;&#xFF0C;&#x90A3;&#x4E48;&#x5C31;&#x5E94;&#x8BE5;&#x5728;&#x5B9E;&#x4F53;&#x5185;&#x63CF;&#x8FF0;&#x62D2;&#x7EDD;&#x7684;&#x539F;&#x56E0;&#x3002;&#x5F53;&#x7136;&#x670D;&#x52A1;&#x5668;&#x4E5F;&#x53EF;&#x4EE5;&#x8FD4;&#x56DE;&#x4E00;&#x4E2A; 404 &#x54CD;&#x5E94;&#xFF0C;&#x5047;&#x5982;&#x5B83;&#x4E0D;&#x5E0C;&#x671B;&#x8BA9;&#x5BA2;&#x6237;&#x7AEF;&#x83B7;&#x5F97;&#x4EFB;&#x4F55;&#x4FE1;&#x606F;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"404-not-found\">404 Not Found</h2>\n" +
                "\n" +
                "<p>&#x8BF7;&#x6C42;&#x5931;&#x8D25;&#xFF0C;&#x8BF7;&#x6C42;&#x6240;&#x5E0C;&#x671B;&#x5F97;&#x5230;&#x7684;&#x8D44;&#x6E90;&#x672A;&#x88AB;&#x5728;&#x670D;&#x52A1;&#x5668;&#x4E0A;&#x53D1;&#x73B0;&#x3002;&#x6CA1;&#x6709;&#x4FE1;&#x606F;&#x80FD;&#x591F;&#x544A;&#x8BC9;&#x7528;&#x6237;&#x8FD9;&#x4E2A;&#x72B6;&#x51B5;&#x5230;&#x5E95;&#x662F;&#x6682;&#x65F6;&#x7684;&#x8FD8;&#x662F;&#x6C38;&#x4E45;&#x7684;&#x3002;&#x5047;&#x5982;&#x670D;&#x52A1;&#x5668;&#x77E5;&#x9053;&#x60C5;&#x51B5;&#x7684;&#x8BDD;&#xFF0C;&#x5E94;&#x5F53;&#x4F7F;&#x7528;410&#x72B6;&#x6001;&#x7801;&#x6765;&#x544A;&#x77E5;&#x65E7;&#x8D44;&#x6E90;&#x56E0;&#x4E3A;&#x67D0;&#x4E9B;&#x5185;&#x90E8;&#x7684;&#x914D;&#x7F6E;&#x673A;&#x5236;&#x95EE;&#x9898;&#xFF0C;&#x5DF2;&#x7ECF;&#x6C38;&#x4E45;&#x7684;&#x4E0D;&#x53EF;&#x7528;&#xFF0C;&#x800C;&#x4E14;&#x6CA1;&#x6709;&#x4EFB;&#x4F55;&#x53EF;&#x4EE5;&#x8DF3;&#x8F6C;&#x7684;&#x5730;&#x5740;&#x3002;404&#x8FD9;&#x4E2A;&#x72B6;&#x6001;&#x7801;&#x88AB;&#x5E7F;&#x6CDB;&#x5E94;&#x7528;&#x4E8E;&#x5F53;&#x670D;&#x52A1;&#x5668;&#x4E0D;&#x60F3;&#x63ED;&#x793A;&#x5230;&#x5E95;&#x4E3A;&#x4F55;&#x8BF7;&#x6C42;&#x88AB;&#x62D2;&#x7EDD;&#x6216;&#x8005;&#x6CA1;&#x6709;&#x5176;&#x4ED6;&#x9002;&#x5408;&#x7684;&#x54CD;&#x5E94;&#x53EF;&#x7528;&#x7684;&#x60C5;&#x51B5;&#x4E0B;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"405-method-not-allowed\">405 Method Not Allowed</h2>\n" +
                "\n" +
                "<p>&#x8BF7;&#x6C42;&#x884C;&#x4E2D;&#x6307;&#x5B9A;&#x7684;&#x8BF7;&#x6C42;&#x65B9;&#x6CD5;&#x4E0D;&#x80FD;&#x88AB;&#x7528;&#x4E8E;&#x8BF7;&#x6C42;&#x76F8;&#x5E94;&#x7684;&#x8D44;&#x6E90;&#x3002;&#x8BE5;&#x54CD;&#x5E94;&#x5FC5;&#x987B;&#x8FD4;&#x56DE;&#x4E00;&#x4E2A;Allow &#x5934;&#x4FE1;&#x606F;&#x7528;&#x4EE5;&#x8868;&#x793A;&#x51FA;&#x5F53;&#x524D;&#x8D44;&#x6E90;&#x80FD;&#x591F;&#x63A5;&#x53D7;&#x7684;&#x8BF7;&#x6C42;&#x65B9;&#x6CD5;&#x7684;&#x5217;&#x8868;&#x3002; &#x9274;&#x4E8E; PUT&#xFF0C;DELETE &#x65B9;&#x6CD5;&#x4F1A;&#x5BF9;&#x670D;&#x52A1;&#x5668;&#x4E0A;&#x7684;&#x8D44;&#x6E90;&#x8FDB;&#x884C;&#x5199;&#x64CD;&#x4F5C;&#xFF0C;&#x56E0;&#x800C;&#x7EDD;&#x5927;&#x90E8;&#x5206;&#x7684;&#x7F51;&#x9875;&#x670D;&#x52A1;&#x5668;&#x90FD;&#x4E0D;&#x652F;&#x6301;&#x6216;&#x8005;&#x5728;&#x9ED8;&#x8BA4;&#x914D;&#x7F6E;&#x4E0B;&#x4E0D;&#x5141;&#x8BB8;&#x4E0A;&#x8FF0;&#x8BF7;&#x6C42;&#x65B9;&#x6CD5;&#xFF0C;&#x5BF9;&#x4E8E;&#x6B64;&#x7C7B;&#x8BF7;&#x6C42;&#x5747;&#x4F1A;&#x8FD4;&#x56DE;405&#x9519;&#x8BEF;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"406-not-acceptable\">406 Not Acceptable</h2>\n" +
                "\n" +
                "<p>&#x8BF7;&#x6C42;&#x7684;&#x8D44;&#x6E90;&#x7684;&#x5185;&#x5BB9;&#x7279;&#x6027;&#x65E0;&#x6CD5;&#x6EE1;&#x8DB3;&#x8BF7;&#x6C42;&#x5934;&#x4E2D;&#x7684;&#x6761;&#x4EF6;&#xFF0C;&#x56E0;&#x800C;&#x65E0;&#x6CD5;&#x751F;&#x6210;&#x54CD;&#x5E94;&#x5B9E;&#x4F53;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"407-proxy-authentication-required\">407 Proxy Authentication Required</h2>\n" +
                "\n" +
                "<p>&#x4E0E;401&#x54CD;&#x5E94;&#x7C7B;&#x4F3C;&#xFF0C;&#x53EA;&#x4E0D;&#x8FC7;&#x5BA2;&#x6237;&#x7AEF;&#x5FC5;&#x987B;&#x5728;&#x4EE3;&#x7406;&#x670D;&#x52A1;&#x5668;&#x4E0A;&#x8FDB;&#x884C;&#x8EAB;&#x4EFD;&#x9A8C;&#x8BC1;&#x3002;&#x4EE3;&#x7406;&#x670D;&#x52A1;&#x5668;&#x5FC5;&#x987B;&#x8FD4;&#x56DE;&#x4E00;&#x4E2A; Proxy-Authenticate &#x7528;&#x4EE5;&#x8FDB;&#x884C;&#x8EAB;&#x4EFD;&#x8BE2;&#x95EE;&#x3002;&#x5BA2;&#x6237;&#x7AEF;&#x53EF;&#x4EE5;&#x8FD4;&#x56DE;&#x4E00;&#x4E2A; Proxy-Authorization &#x4FE1;&#x606F;&#x5934;&#x7528;&#x4EE5;&#x9A8C;&#x8BC1;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"408-request-timeout\">408 Request Timeout</h2>\n" +
                "\n" +
                "<p>&#x8BF7;&#x6C42;&#x8D85;&#x65F6;&#x3002;&#x5BA2;&#x6237;&#x7AEF;&#x6CA1;&#x6709;&#x5728;&#x670D;&#x52A1;&#x5668;&#x9884;&#x5907;&#x7B49;&#x5F85;&#x7684;&#x65F6;&#x95F4;&#x5185;&#x5B8C;&#x6210;&#x4E00;&#x4E2A;&#x8BF7;&#x6C42;&#x7684;&#x53D1;&#x9001;&#x3002;&#x5BA2;&#x6237;&#x7AEF;&#x53EF;&#x4EE5;&#x968F;&#x65F6;&#x518D;&#x6B21;&#x63D0;&#x4EA4;&#x8FD9;&#x4E00;&#x8BF7;&#x6C42;&#x800C;&#x65E0;&#x9700;&#x8FDB;&#x884C;&#x4EFB;&#x4F55;&#x66F4;&#x6539;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"409-conflict\">409 Conflict</h2>\n" +
                "\n" +
                "<p>&#x7531;&#x4E8E;&#x548C;&#x88AB;&#x8BF7;&#x6C42;&#x7684;&#x8D44;&#x6E90;&#x7684;&#x5F53;&#x524D;&#x72B6;&#x6001;&#x4E4B;&#x95F4;&#x5B58;&#x5728;&#x51B2;&#x7A81;&#xFF0C;&#x8BF7;&#x6C42;&#x65E0;&#x6CD5;&#x5B8C;&#x6210;&#x3002;&#x8FD9;&#x4E2A;&#x4EE3;&#x7801;&#x53EA;&#x5141;&#x8BB8;&#x7528;&#x5728;&#x8FD9;&#x6837;&#x7684;&#x60C5;&#x51B5;&#x4E0B;&#x624D;&#x80FD;&#x88AB;&#x4F7F;&#x7528;&#xFF1A;&#x7528;&#x6237;&#x88AB;&#x8BA4;&#x4E3A;&#x80FD;&#x591F;&#x89E3;&#x51B3;&#x51B2;&#x7A81;&#xFF0C;&#x5E76;&#x4E14;&#x4F1A;&#x91CD;&#x65B0;&#x63D0;&#x4EA4;&#x65B0;&#x7684;&#x8BF7;&#x6C42;&#x3002;&#x8BE5;&#x54CD;&#x5E94;&#x5E94;&#x5F53;&#x5305;&#x542B;&#x8DB3;&#x591F;&#x7684;&#x4FE1;&#x606F;&#x4EE5;&#x4FBF;&#x7528;&#x6237;&#x53D1;&#x73B0;&#x51B2;&#x7A81;&#x7684;&#x6E90;&#x5934;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"410-gone\">410 Gone</h2>\n" +
                "\n" +
                "<p>&#x88AB;&#x8BF7;&#x6C42;&#x7684;&#x8D44;&#x6E90;&#x5728;&#x670D;&#x52A1;&#x5668;&#x4E0A;&#x5DF2;&#x7ECF;&#x4E0D;&#x518D;&#x53EF;&#x7528;&#xFF0C;&#x800C;&#x4E14;&#x6CA1;&#x6709;&#x4EFB;&#x4F55;&#x5DF2;&#x77E5;&#x7684;&#x8F6C;&#x53D1;&#x5730;&#x5740;&#x3002;&#x8FD9;&#x6837;&#x7684;&#x72B6;&#x51B5;&#x5E94;&#x5F53;&#x88AB;&#x8BA4;&#x4E3A;&#x662F;&#x6C38;&#x4E45;&#x6027;&#x7684;&#x3002;&#x5982;&#x679C;&#x53EF;&#x80FD;&#xFF0C;&#x62E5;&#x6709;&#x94FE;&#x63A5;&#x7F16;&#x8F91;&#x529F;&#x80FD;&#x7684;&#x5BA2;&#x6237;&#x7AEF;&#x5E94;&#x5F53;&#x5728;&#x83B7;&#x5F97;&#x7528;&#x6237;&#x8BB8;&#x53EF;&#x540E;&#x5220;&#x9664;&#x6240;&#x6709;&#x6307;&#x5411;&#x8FD9;&#x4E2A;&#x5730;&#x5740;&#x7684;&#x5F15;&#x7528;&#x3002;&#x5982;&#x679C;&#x670D;&#x52A1;&#x5668;&#x4E0D;&#x77E5;&#x9053;&#x6216;&#x8005;&#x65E0;&#x6CD5;&#x786E;&#x5B9A;&#x8FD9;&#x4E2A;&#x72B6;&#x51B5;&#x662F;&#x5426;&#x662F;&#x6C38;&#x4E45;&#x7684;&#xFF0C;&#x90A3;&#x4E48;&#x5C31;&#x5E94;&#x8BE5;&#x4F7F;&#x7528; 404 &#x72B6;&#x6001;&#x7801;&#x3002;&#x9664;&#x975E;&#x989D;&#x5916;&#x8BF4;&#x660E;&#xFF0C;&#x5426;&#x5219;&#x8FD9;&#x4E2A;&#x54CD;&#x5E94;&#x662F;&#x53EF;&#x7F13;&#x5B58;&#x7684;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"411-length-required\">411 Length Required</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x62D2;&#x7EDD;&#x5728;&#x6CA1;&#x6709;&#x5B9A;&#x4E49; Content-Length &#x5934;&#x7684;&#x60C5;&#x51B5;&#x4E0B;&#x63A5;&#x53D7;&#x8BF7;&#x6C42;&#x3002;&#x5728;&#x6DFB;&#x52A0;&#x4E86;&#x8868;&#x660E;&#x8BF7;&#x6C42;&#x6D88;&#x606F;&#x4F53;&#x957F;&#x5EA6;&#x7684;&#x6709;&#x6548; Content-Length &#x5934;&#x4E4B;&#x540E;&#xFF0C;&#x5BA2;&#x6237;&#x7AEF;&#x53EF;&#x4EE5;&#x518D;&#x6B21;&#x63D0;&#x4EA4;&#x8BE5;&#x8BF7;&#x6C42;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"412-precondition-failed\">412 Precondition Failed</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x5728;&#x9A8C;&#x8BC1;&#x5728;&#x8BF7;&#x6C42;&#x7684;&#x5934;&#x5B57;&#x6BB5;&#x4E2D;&#x7ED9;&#x51FA;&#x5148;&#x51B3;&#x6761;&#x4EF6;&#x65F6;&#xFF0C;&#x6CA1;&#x80FD;&#x6EE1;&#x8DB3;&#x5176;&#x4E2D;&#x7684;&#x4E00;&#x4E2A;&#x6216;&#x591A;&#x4E2A;&#x3002;&#x8FD9;&#x4E2A;&#x72B6;&#x6001;&#x7801;&#x5141;&#x8BB8;&#x5BA2;&#x6237;&#x7AEF;&#x5728;&#x83B7;&#x53D6;&#x8D44;&#x6E90;&#x65F6;&#x5728;&#x8BF7;&#x6C42;&#x7684;&#x5143;&#x4FE1;&#x606F;&#xFF08;&#x8BF7;&#x6C42;&#x5934;&#x5B57;&#x6BB5;&#x6570;&#x636E;&#xFF09;&#x4E2D;&#x8BBE;&#x7F6E;&#x5148;&#x51B3;&#x6761;&#x4EF6;&#xFF0C;&#x4EE5;&#x6B64;&#x907F;&#x514D;&#x8BE5;&#x8BF7;&#x6C42;&#x65B9;&#x6CD5;&#x88AB;&#x5E94;&#x7528;&#x5230;&#x5176;&#x5E0C;&#x671B;&#x7684;&#x5185;&#x5BB9;&#x4EE5;&#x5916;&#x7684;&#x8D44;&#x6E90;&#x4E0A;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"413-payload-too-large\">413 Payload Too Large</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x62D2;&#x7EDD;&#x5904;&#x7406;&#x5F53;&#x524D;&#x8BF7;&#x6C42;&#xFF0C;&#x56E0;&#x4E3A;&#x8BE5;&#x8BF7;&#x6C42;&#x63D0;&#x4EA4;&#x7684;&#x5B9E;&#x4F53;&#x6570;&#x636E;&#x5927;&#x5C0F;&#x8D85;&#x8FC7;&#x4E86;&#x670D;&#x52A1;&#x5668;&#x613F;&#x610F;&#x6216;&#x8005;&#x80FD;&#x591F;&#x5904;&#x7406;&#x7684;&#x8303;&#x56F4;&#x3002;&#x6B64;&#x79CD;&#x60C5;&#x51B5;&#x4E0B;&#xFF0C;&#x670D;&#x52A1;&#x5668;&#x53EF;&#x4EE5;&#x5173;&#x95ED;&#x8FDE;&#x63A5;&#x4EE5;&#x514D;&#x5BA2;&#x6237;&#x7AEF;&#x7EE7;&#x7EED;&#x53D1;&#x9001;&#x6B64;&#x8BF7;&#x6C42;&#x3002;&#x5982;&#x679C;&#x8FD9;&#x4E2A;&#x72B6;&#x51B5;&#x662F;&#x4E34;&#x65F6;&#x7684;&#xFF0C;&#x670D;&#x52A1;&#x5668;&#x5E94;&#x5F53;&#x8FD4;&#x56DE;&#x4E00;&#x4E2A; Retry-After &#x7684;&#x54CD;&#x5E94;&#x5934;&#xFF0C;&#x4EE5;&#x544A;&#x77E5;&#x5BA2;&#x6237;&#x7AEF;&#x53EF;&#x4EE5;&#x5728;&#x591A;&#x5C11;&#x65F6;&#x95F4;&#x4EE5;&#x540E;&#x91CD;&#x65B0;&#x5C1D;&#x8BD5;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"414-uri-too-long\">414 URI Too Long</h2>\n" +
                "\n" +
                "<p>&#x8BF7;&#x6C42;&#x7684;URI &#x957F;&#x5EA6;&#x8D85;&#x8FC7;&#x4E86;&#x670D;&#x52A1;&#x5668;&#x80FD;&#x591F;&#x89E3;&#x91CA;&#x7684;&#x957F;&#x5EA6;&#xFF0C;&#x56E0;&#x6B64;&#x670D;&#x52A1;&#x5668;&#x62D2;&#x7EDD;&#x5BF9;&#x8BE5;&#x8BF7;&#x6C42;&#x63D0;&#x4F9B;&#x670D;&#x52A1;&#x3002;&#x8FD9;&#x6BD4;&#x8F83;&#x5C11;&#x89C1;&#xFF0C;&#x901A;&#x5E38;&#x7684;&#x60C5;&#x51B5;&#x5305;&#x62EC;&#xFF1A;&#x672C;&#x5E94;&#x4F7F;&#x7528;POST&#x65B9;&#x6CD5;&#x7684;&#x8868;&#x5355;&#x63D0;&#x4EA4;&#x53D8;&#x6210;&#x4E86;GET&#x65B9;&#x6CD5;&#xFF0C;&#x5BFC;&#x81F4;&#x67E5;&#x8BE2;&#x5B57;&#x7B26;&#x4E32;&#xFF08;Query String&#xFF09;&#x8FC7;&#x957F;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"415-unsupported-media-type\">415 Unsupported Media Type</h2>\n" +
                "\n" +
                "<p>&#x5BF9;&#x4E8E;&#x5F53;&#x524D;&#x8BF7;&#x6C42;&#x7684;&#x65B9;&#x6CD5;&#x548C;&#x6240;&#x8BF7;&#x6C42;&#x7684;&#x8D44;&#x6E90;&#xFF0C;&#x8BF7;&#x6C42;&#x4E2D;&#x63D0;&#x4EA4;&#x7684;&#x5B9E;&#x4F53;&#x5E76;&#x4E0D;&#x662F;&#x670D;&#x52A1;&#x5668;&#x4E2D;&#x6240;&#x652F;&#x6301;&#x7684;&#x683C;&#x5F0F;&#xFF0C;&#x56E0;&#x6B64;&#x8BF7;&#x6C42;&#x88AB;&#x62D2;&#x7EDD;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"416-range-not-satisfiable\">416 Range Not Satisfiable</h2>\n" +
                "\n" +
                "<p>&#x5982;&#x679C;&#x8BF7;&#x6C42;&#x4E2D;&#x5305;&#x542B;&#x4E86; Range &#x8BF7;&#x6C42;&#x5934;&#xFF0C;&#x5E76;&#x4E14; Range &#x4E2D;&#x6307;&#x5B9A;&#x7684;&#x4EFB;&#x4F55;&#x6570;&#x636E;&#x8303;&#x56F4;&#x90FD;&#x4E0E;&#x5F53;&#x524D;&#x8D44;&#x6E90;&#x7684;&#x53EF;&#x7528;&#x8303;&#x56F4;&#x4E0D;&#x91CD;&#x5408;&#xFF0C;&#x540C;&#x65F6;&#x8BF7;&#x6C42;&#x4E2D;&#x53C8;&#x6CA1;&#x6709;&#x5B9A;&#x4E49; If-Range &#x8BF7;&#x6C42;&#x5934;&#xFF0C;&#x90A3;&#x4E48;&#x670D;&#x52A1;&#x5668;&#x5C31;&#x5E94;&#x5F53;&#x8FD4;&#x56DE;416&#x72B6;&#x6001;&#x7801;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"417-expectation-failed\">417 Expectation Failed</h2>\n" +
                "\n" +
                "<p>&#x6B64;&#x54CD;&#x5E94;&#x4EE3;&#x7801;&#x610F;&#x5473;&#x7740;&#x670D;&#x52A1;&#x5668;&#x65E0;&#x6CD5;&#x6EE1;&#x8DB3; Expect &#x8BF7;&#x6C42;&#x6807;&#x5934;&#x5B57;&#x6BB5;&#x6307;&#x793A;&#x7684;&#x671F;&#x671B;&#x503C;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"418-im-a-teapot\">418 I&apos;m a teapot</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x62D2;&#x7EDD;&#x5C1D;&#x8BD5;&#x7528; &#x201C;&#x8336;&#x58F6;&#x51B2;&#x6CE1;&#x5496;&#x5561;&#x201D;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"421-misdirected-request\">421 Misdirected Request</h2>\n" +
                "\n" +
                "<p>&#x8BE5;&#x8BF7;&#x6C42;&#x9488;&#x5BF9;&#x7684;&#x662F;&#x65E0;&#x6CD5;&#x4EA7;&#x751F;&#x54CD;&#x5E94;&#x7684;&#x670D;&#x52A1;&#x5668;&#x3002; &#x8FD9;&#x53EF;&#x4EE5;&#x7531;&#x670D;&#x52A1;&#x5668;&#x53D1;&#x9001;&#xFF0C;&#x8BE5;&#x670D;&#x52A1;&#x5668;&#x672A;&#x914D;&#x7F6E;&#x4E3A;&#x9488;&#x5BF9;&#x5305;&#x542B;&#x5728;&#x8BF7;&#x6C42; URI &#x4E2D;&#x7684;&#x65B9;&#x6848;&#x548C;&#x6743;&#x9650;&#x7684;&#x7EC4;&#x5408;&#x4EA7;&#x751F;&#x54CD;&#x5E94;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"422-unprocessable-entity-webdav\">422 Unprocessable Entity (WebDAV)</h2>\n" +
                "\n" +
                "<p>&#x8BF7;&#x6C42;&#x683C;&#x5F0F;&#x826F;&#x597D;&#xFF0C;&#x4F46;&#x7531;&#x4E8E;&#x8BED;&#x4E49;&#x9519;&#x8BEF;&#x800C;&#x65E0;&#x6CD5;&#x9075;&#x5FAA;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"423-locked-webdav\">423 Locked (WebDAV)</h2>\n" +
                "\n" +
                "<p>&#x6B63;&#x5728;&#x8BBF;&#x95EE;&#x7684;&#x8D44;&#x6E90;&#x88AB;&#x9501;&#x5B9A;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"424-failed-dependency-webdav\">424 Failed Dependency (WebDAV)</h2>\n" +
                "\n" +
                "<p>&#x7531;&#x4E8E;&#x5148;&#x524D;&#x7684;&#x8BF7;&#x6C42;&#x5931;&#x8D25;&#xFF0C;&#x6240;&#x4EE5;&#x6B64;&#x6B21;&#x8BF7;&#x6C42;&#x5931;&#x8D25;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"425-too-early\">425 Too Early</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x4E0D;&#x613F;&#x610F;&#x5192;&#x7740;&#x98CE;&#x9669;&#x53BB;&#x5904;&#x7406;&#x53EF;&#x80FD;&#x91CD;&#x64AD;&#x7684;&#x8BF7;&#x6C42;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"426-upgrade-required\">426 Upgrade Required</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x62D2;&#x7EDD;&#x4F7F;&#x7528;&#x5F53;&#x524D;&#x534F;&#x8BAE;&#x6267;&#x884C;&#x8BF7;&#x6C42;&#xFF0C;&#x4F46;&#x53EF;&#x80FD;&#x5728;&#x5BA2;&#x6237;&#x673A;&#x5347;&#x7EA7;&#x5230;&#x5176;&#x4ED6;&#x534F;&#x8BAE;&#x540E;&#x613F;&#x610F;&#x8FD9;&#x6837;&#x505A;&#x3002; &#x670D;&#x52A1;&#x5668;&#x5728; 426 &#x54CD;&#x5E94;&#x4E2D;&#x53D1;&#x9001; Upgrade &#x5934;&#x4EE5;&#x6307;&#x793A;&#x6240;&#x9700;&#x7684;&#x534F;&#x8BAE;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"428-precondition-required\">428 Precondition Required</h2>\n" +
                "\n" +
                "<p>&#x539F;&#x59CB;&#x670D;&#x52A1;&#x5668;&#x8981;&#x6C42;&#x8BE5;&#x8BF7;&#x6C42;&#x662F;&#x6709;&#x6761;&#x4EF6;&#x7684;&#x3002; &#x65E8;&#x5728;&#x9632;&#x6B62;&#x201C;&#x4E22;&#x5931;&#x66F4;&#x65B0;&#x201D;&#x95EE;&#x9898;&#xFF0C;&#x5373;&#x5BA2;&#x6237;&#x7AEF;&#x83B7;&#x53D6;&#x8D44;&#x6E90;&#x72B6;&#x6001;&#xFF0C;&#x4FEE;&#x6539;&#x8BE5;&#x72B6;&#x6001;&#x5E76;&#x5C06;&#x5176;&#x8FD4;&#x56DE;&#x670D;&#x52A1;&#x5668;&#xFF0C;&#x540C;&#x65F6;&#x7B2C;&#x4E09;&#x65B9;&#x4FEE;&#x6539;&#x670D;&#x52A1;&#x5668;&#x4E0A;&#x7684;&#x72B6;&#x6001;&#xFF0C;&#x4ECE;&#x800C;&#x5BFC;&#x81F4;&#x51B2;&#x7A81;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"429-too-many-requests\">429 Too Many Requests</h2>\n" +
                "\n" +
                "<p>&#x7528;&#x6237;&#x5728;&#x7ED9;&#x5B9A;&#x7684;&#x65F6;&#x95F4;&#x5185;&#x53D1;&#x9001;&#x4E86;&#x592A;&#x591A;&#x8BF7;&#x6C42;&#xFF08;&#x201C;&#x9650;&#x5236;&#x8BF7;&#x6C42;&#x901F;&#x7387;&#x201D;&#xFF09;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"431-request-header-fields-too-large\">431 Request Header Fields Too Large</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x4E0D;&#x613F;&#x610F;&#x5904;&#x7406;&#x8BF7;&#x6C42;&#xFF0C;&#x56E0;&#x4E3A;&#x5B83;&#x7684; &#x8BF7;&#x6C42;&#x5934;&#x5B57;&#x6BB5;&#x592A;&#x5927;&#xFF08; Request Header Fields Too Large&#xFF09;&#x3002; &#x8BF7;&#x6C42;&#x53EF;&#x4EE5;&#x5728;&#x51CF;&#x5C0F;&#x8BF7;&#x6C42;&#x5934;&#x5B57;&#x6BB5;&#x7684;&#x5927;&#x5C0F;&#x540E;&#x91CD;&#x65B0;&#x63D0;&#x4EA4;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"451-unavailable-for-legal-reasons\">451 Unavailable For Legal Reasons</h2>\n" +
                "\n" +
                "<p>&#x7528;&#x6237;&#x8BF7;&#x6C42;&#x975E;&#x6CD5;&#x8D44;&#x6E90;&#xFF0C;&#x4F8B;&#x5982;&#xFF1A;&#x7531;&#x653F;&#x5E9C;&#x5BA1;&#x67E5;&#x7684;&#x7F51;&#x9875;&#x3002;</p>\n" +
                "<h1 class=\"mume-header\" id=\"%E6%9C%8D%E5%8A%A1%E7%AB%AF%E5%93%8D%E5%BA%94500\">&#x670D;&#x52A1;&#x7AEF;&#x54CD;&#x5E94;(500)</h1>\n" +
                "\n" +
                "<h2 class=\"mume-header\" id=\"500-internal-server-error\">500 Internal Server Error</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x9047;&#x5230;&#x4E86;&#x4E0D;&#x77E5;&#x9053;&#x5982;&#x4F55;&#x5904;&#x7406;&#x7684;&#x60C5;&#x51B5;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"501-not-implemented\">501 Not Implemented</h2>\n" +
                "\n" +
                "<p>&#x6B64;&#x8BF7;&#x6C42;&#x65B9;&#x6CD5;&#x4E0D;&#x88AB;&#x670D;&#x52A1;&#x5668;&#x652F;&#x6301;&#x4E14;&#x65E0;&#x6CD5;&#x88AB;&#x5904;&#x7406;&#x3002;&#x53EA;&#x6709;GET&#x548C;HEAD&#x662F;&#x8981;&#x6C42;&#x670D;&#x52A1;&#x5668;&#x652F;&#x6301;&#x7684;&#xFF0C;&#x5B83;&#x4EEC;&#x5FC5;&#x5B9A;&#x4E0D;&#x4F1A;&#x8FD4;&#x56DE;&#x6B64;&#x9519;&#x8BEF;&#x4EE3;&#x7801;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"502-bad-gateway\">502 Bad Gateway</h2>\n" +
                "\n" +
                "<p>&#x6B64;&#x9519;&#x8BEF;&#x54CD;&#x5E94;&#x8868;&#x660E;&#x670D;&#x52A1;&#x5668;&#x4F5C;&#x4E3A;&#x7F51;&#x5173;&#x9700;&#x8981;&#x5F97;&#x5230;&#x4E00;&#x4E2A;&#x5904;&#x7406;&#x8FD9;&#x4E2A;&#x8BF7;&#x6C42;&#x7684;&#x54CD;&#x5E94;&#xFF0C;&#x4F46;&#x662F;&#x5F97;&#x5230;&#x4E00;&#x4E2A;&#x9519;&#x8BEF;&#x7684;&#x54CD;&#x5E94;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"503-service-unavailable\">503 Service Unavailable</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x6CA1;&#x6709;&#x51C6;&#x5907;&#x597D;&#x5904;&#x7406;&#x8BF7;&#x6C42;&#x3002; &#x5E38;&#x89C1;&#x539F;&#x56E0;&#x662F;&#x670D;&#x52A1;&#x5668;&#x56E0;&#x7EF4;&#x62A4;&#x6216;&#x91CD;&#x8F7D;&#x800C;&#x505C;&#x673A;&#x3002; &#x8BF7;&#x6CE8;&#x610F;&#xFF0C;&#x4E0E;&#x6B64;&#x54CD;&#x5E94;&#x4E00;&#x8D77;&#xFF0C;&#x5E94;&#x53D1;&#x9001;&#x89E3;&#x91CA;&#x95EE;&#x9898;&#x7684;&#x7528;&#x6237;&#x53CB;&#x597D;&#x9875;&#x9762;&#x3002; &#x8FD9;&#x4E2A;&#x54CD;&#x5E94;&#x5E94;&#x8BE5;&#x7528;&#x4E8E;&#x4E34;&#x65F6;&#x6761;&#x4EF6;&#x548C; Retry-After&#xFF1A;&#x5982;&#x679C;&#x53EF;&#x80FD;&#x7684;&#x8BDD;&#xFF0C;HTTP&#x5934;&#x5E94;&#x8BE5;&#x5305;&#x542B;&#x6062;&#x590D;&#x670D;&#x52A1;&#x4E4B;&#x524D;&#x7684;&#x4F30;&#x8BA1;&#x65F6;&#x95F4;&#x3002; &#x7F51;&#x7AD9;&#x7BA1;&#x7406;&#x5458;&#x8FD8;&#x5FC5;&#x987B;&#x6CE8;&#x610F;&#x4E0E;&#x6B64;&#x54CD;&#x5E94;&#x4E00;&#x8D77;&#x53D1;&#x9001;&#x7684;&#x4E0E;&#x7F13;&#x5B58;&#x76F8;&#x5173;&#x7684;&#x6807;&#x5934;&#xFF0C;&#x56E0;&#x4E3A;&#x8FD9;&#x4E9B;&#x4E34;&#x65F6;&#x6761;&#x4EF6;&#x54CD;&#x5E94;&#x901A;&#x5E38;&#x4E0D;&#x5E94;&#x88AB;&#x7F13;&#x5B58;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"504-gateway-timeout\">504 Gateway Timeout</h2>\n" +
                "\n" +
                "<p>&#x5F53;&#x670D;&#x52A1;&#x5668;&#x4F5C;&#x4E3A;&#x7F51;&#x5173;&#xFF0C;&#x4E0D;&#x80FD;&#x53CA;&#x65F6;&#x5F97;&#x5230;&#x54CD;&#x5E94;&#x65F6;&#x8FD4;&#x56DE;&#x6B64;&#x9519;&#x8BEF;&#x4EE3;&#x7801;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"505-http-version-not-supported\">505 HTTP Version Not Supported</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x4E0D;&#x652F;&#x6301;&#x8BF7;&#x6C42;&#x4E2D;&#x6240;&#x4F7F;&#x7528;&#x7684;HTTP&#x534F;&#x8BAE;&#x7248;&#x672C;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"506-variant-also-negotiates\">506 Variant Also Negotiates</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x6709;&#x4E00;&#x4E2A;&#x5185;&#x90E8;&#x914D;&#x7F6E;&#x9519;&#x8BEF;&#xFF1A;&#x5BF9;&#x8BF7;&#x6C42;&#x7684;&#x900F;&#x660E;&#x5185;&#x5BB9;&#x534F;&#x5546;&#x5BFC;&#x81F4;&#x5FAA;&#x73AF;&#x5F15;&#x7528;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"507-insufficient-storage\">507 Insufficient Storage</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x6709;&#x5185;&#x90E8;&#x914D;&#x7F6E;&#x9519;&#x8BEF;&#xFF1A;&#x6240;&#x9009;&#x7684;&#x53D8;&#x4F53;&#x8D44;&#x6E90;&#x88AB;&#x914D;&#x7F6E;&#x4E3A;&#x53C2;&#x4E0E;&#x900F;&#x660E;&#x5185;&#x5BB9;&#x534F;&#x5546;&#x672C;&#x8EAB;&#xFF0C;&#x56E0;&#x6B64;&#x4E0D;&#x662F;&#x534F;&#x5546;&#x8FC7;&#x7A0B;&#x4E2D;&#x7684;&#x9002;&#x5F53;&#x7AEF;&#x70B9;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"508-loop-detected-webdav\">508 Loop Detected (WebDAV)</h2>\n" +
                "\n" +
                "<p>&#x670D;&#x52A1;&#x5668;&#x5728;&#x5904;&#x7406;&#x8BF7;&#x6C42;&#x65F6;&#x68C0;&#x6D4B;&#x5230;&#x65E0;&#x9650;&#x5FAA;&#x73AF;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"510-not-extended\">510 Not Extended</h2>\n" +
                "\n" +
                "<p>&#x5BA2;&#x6237;&#x7AEF;&#x9700;&#x8981;&#x5BF9;&#x8BF7;&#x6C42;&#x8FDB;&#x4E00;&#x6B65;&#x6269;&#x5C55;&#xFF0C;&#x670D;&#x52A1;&#x5668;&#x624D;&#x80FD;&#x5B9E;&#x73B0;&#x5B83;&#x3002;&#x670D;&#x52A1;&#x5668;&#x4F1A;&#x56DE;&#x590D;&#x5BA2;&#x6237;&#x7AEF;&#x53D1;&#x51FA;&#x6269;&#x5C55;&#x8BF7;&#x6C42;&#x6240;&#x9700;&#x7684;&#x6240;&#x6709;&#x4FE1;&#x606F;&#x3002;</p>\n" +
                "<h2 class=\"mume-header\" id=\"511-network-authentication-required\">511 Network Authentication Required</h2>\n" +
                "\n" +
                "<p>511 &#x72B6;&#x6001;&#x7801;&#x6307;&#x793A;&#x5BA2;&#x6237;&#x7AEF;&#x9700;&#x8981;&#x8FDB;&#x884C;&#x8EAB;&#x4EFD;&#x9A8C;&#x8BC1;&#x624D;&#x80FD;&#x83B7;&#x5F97;&#x7F51;&#x7EDC;&#x8BBF;&#x95EE;&#x6743;&#x9650;&#x3002;</p>\n";
        HTMLEditorKit kit = new HTMLEditorKit();
        Response_Code_panel.setEditorKit(kit);
        Response_Code_panel.setText(a);
        Response_Code_panel.setCaretPosition(0);
    }
}
