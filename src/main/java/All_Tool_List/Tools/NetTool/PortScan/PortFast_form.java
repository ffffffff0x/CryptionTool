/*
 * Created by JFormDesigner on Fri Apr 10 15:12:08 CST 2020
 */

package All_Tool_List.Tools.NetTool.PortScan;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.html.HTMLEditorKit;

/**
 * @author 1
 */
public class PortFast_form extends JFrame {
    public PortFast_form(){
        initComponents();
        setPage();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        PortFast = new JEditorPane();

        //======== this ========
        setTitle("PortFast");
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/img/icon/book-2-line.png")).getImage());
        setLayout(null);

        //======== scrollPane1 ========
        {

            //---- PortFast ----
            PortFast.setEditable(false);
            scrollPane1.setViewportView(PortFast);
        }
        add(scrollPane1);
        scrollPane1.setBounds(4, 4, 536, 610);

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
        setSize(550, 655);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JEditorPane PortFast;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void setPage() {
        String a = "<table>\n" +
                "<thead>\n" +
                "<tr><th>端口</th><th>服务</th><th>方式</th></tr>\n" +
                "</thead>\n" +
                "<tbody>\n" +
                "<tr><td>21</td><td>ftp/tftp/vsftpd文件传输协议</td><td>爆破/嗅探/溢出/后门</td></tr>\n" +
                "<tr><td>22</td><td>ssh远程连接</td><td>爆破/openssh漏洞</td></tr>\n" +
                "<tr><td>23</td><td>Telnet远程连接</td><td>爆破/嗅探/弱口令</td></tr>\n" +
                "<tr><td>25</td><td>SMTP邮件服务</td><td>邮件伪造</td></tr>\n" +
                "<tr><td>53</td><td>DNS域名解析系统</td><td>域传送/劫持/缓存投毒/欺骗</td></tr>\n" +
                "<tr><td>67/68</td><td>dhcp服务</td><td>劫持/欺骗</td></tr>\n" +
                "<tr><td>110</td><td>pop3</td><td>爆破/嗅探</td></tr>\n" +
                "<tr><td>139</td><td>Samba服务</td><td>爆破/未授权访问/远程命令执行</td></tr>\n" +
                "<tr><td>143</td><td>Imap协议</td><td>爆破</td></tr>\n" +
                "<tr><td>161</td><td>SNMP协议</td><td>爆破/搜集目标内网信息</td></tr>\n" +
                "<tr><td>389</td><td>Ldap目录访问协议</td><td>注入/未授权访问/弱口令</td></tr>\n" +
                "<tr><td>445</td><td>smb</td><td>ms17-010/端口溢出</td></tr>\n" +
                "<tr><td>512/513/514</td><td>Linux Rexec服务</td><td>爆破/Rlogin登陆</td></tr>\n" +
                "<tr><td>873</td><td>Rsync服务</td><td>文件上传/未授权访问</td></tr>\n" +
                "<tr><td>1080</td><td>socket</td><td>爆破</td></tr>\n" +
                "<tr><td>1352</td><td>Lotus domino邮件服务</td><td>爆破/信息泄漏</td></tr>\n" +
                "<tr><td>1433</td><td>mssql</td><td>爆破/注入/SA弱口令</td></tr>\n" +
                "<tr><td>1521</td><td>oracle</td><td>爆破/注入/TNS爆破/反弹shell</td></tr>\n" +
                "<tr><td>2049</td><td>Nfs服务</td><td>配置不当</td></tr>\n" +
                "<tr><td>2181</td><td>zookeeper服务</td><td>未授权访问</td></tr>\n" +
                "<tr><td>2375</td><td>docker remote api</td><td>未授权访问</td></tr>\n" +
                "<tr><td>3306</td><td>mysql</td><td>爆破/注入</td></tr>\n" +
                "<tr><td>3389</td><td>Rdp远程桌面链接</td><td>爆破/shift后门</td></tr>\n" +
                "<tr><td>4848</td><td>GlassFish控制台</td><td>爆破/认证绕过</td></tr>\n" +
                "<tr><td>5000</td><td>sybase/DB2数据库</td><td>爆破/注入/提权</td></tr>\n" +
                "<tr><td>5432</td><td>postgresql</td><td>爆破/注入/缓冲区溢出</td></tr>\n" +
                "<tr><td>5632</td><td>pcanywhere服务</td><td>抓密码/代码执行</td></tr>\n" +
                "<tr><td>5900</td><td>vnc</td><td>爆破/认证绕过</td></tr>\n" +
                "<tr><td>6379</td><td>Redis数据库</td><td>未授权访问/爆破</td></tr>\n" +
                "<tr><td>7001/7002</td><td>weblogic</td><td>java反序列化/控制台弱口令</td></tr>\n" +
                "<tr><td>80/443</td><td>http/https</td><td>web应用漏洞/心脏滴血</td></tr>\n" +
                "<tr><td>8069</td><td>zabbix服务</td><td>远程命令执行/注入</td></tr>\n" +
                "<tr><td>8161</td><td>activemq</td><td>弱口令/写文件</td></tr>\n" +
                "<tr><td>8080/8089</td><td>Jboss/Tomcat/Resin</td><td>破/PUT文件上传/反序列化</td></tr>\n" +
                "<tr><td>8083/8086</td><td>influxDB</td><td>未授权访问</td></tr>\n" +
                "<tr><td>9000</td><td>fastcgi</td><td>远程命令执行</td></tr>\n" +
                "<tr><td>9090</td><td>Websphere控制台</td><td>爆破/java反序列化/弱口令</td></tr>\n" +
                "<tr><td>9200/9300</td><td>elasticsearch</td><td>远程代码执行</td></tr>\n" +
                "<tr><td>11211</td><td>memcached</td><td>未授权访问</td></tr>\n" +
                "<tr><td>27017/27018</td><td>mongodb</td><td>未授权访问/爆破</td></tr>\n" +
                "</tbody>\n" +
                "</table>\n";
        HTMLEditorKit kit = new HTMLEditorKit();
        PortFast.setEditorKit(kit);
        PortFast.setText(a);
        PortFast.setCaretPosition(0);
    }
}
