package All_Tool_List.ToolView;

import javax.swing.tree.DefaultMutableTreeNode;

class NodeAdd {
    //创建根节点
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

    //创建二级节点
    //private DefaultMutableTreeNode index = new DefaultMutableTreeNode("Index");
    private DefaultMutableTreeNode tools = new DefaultMutableTreeNode("Tools");
    private DefaultMutableTreeNode code = new DefaultMutableTreeNode("Encryption");

    //tools下的三级节点
    private DefaultMutableTreeNode Mail = new DefaultMutableTreeNode("Mail");

    //邮箱下的节点
    private DefaultMutableTreeNode MailOnceCheck = new DefaultMutableTreeNode("Disposable Email Check");

    //code下的三级节点
    private DefaultMutableTreeNode Modern = new DefaultMutableTreeNode("Modern");
    private DefaultMutableTreeNode Classical = new DefaultMutableTreeNode("Classical");
    private DefaultMutableTreeNode Coding = new DefaultMutableTreeNode("Coding");

    //现代下的节点
    private DefaultMutableTreeNode AES = new DefaultMutableTreeNode("AES");
    private DefaultMutableTreeNode HASH = new DefaultMutableTreeNode("Hash");
    private DefaultMutableTreeNode SM3 = new DefaultMutableTreeNode("SM3");
    private DefaultMutableTreeNode NTLM = new DefaultMutableTreeNode("NTLM");

    //古典下的节点
    private DefaultMutableTreeNode ROT13 = new DefaultMutableTreeNode("ROT13");
    private DefaultMutableTreeNode Rail_fence = new DefaultMutableTreeNode("Rail fence(栅栏密码)");
    private DefaultMutableTreeNode Atbash = new DefaultMutableTreeNode("Atbash(埃特巴什码)");
    private DefaultMutableTreeNode Hill = new DefaultMutableTreeNode("Hill(希尔密码)");
    private DefaultMutableTreeNode Polybius_Square = new DefaultMutableTreeNode("Polybius Square(波利比奥斯方阵)");
    private DefaultMutableTreeNode Playfair = new DefaultMutableTreeNode("Playfair(普莱菲尔密码)");
    private DefaultMutableTreeNode Vigenere = new DefaultMutableTreeNode("Vigenere(维吉尼亚密码)");
    private DefaultMutableTreeNode Autokey = new DefaultMutableTreeNode("Autokey(自动密钥密码)");
    private DefaultMutableTreeNode Beaufort = new DefaultMutableTreeNode("Beaufort(博福特密码)");
    private DefaultMutableTreeNode Running_Key = new DefaultMutableTreeNode("Running Key(滚动密钥密码)");
    private DefaultMutableTreeNode Porta = new DefaultMutableTreeNode("Porta(Porta 密码)");
    private DefaultMutableTreeNode Affine = new DefaultMutableTreeNode("Affine(仿射密码)");
    private DefaultMutableTreeNode Baconian = new DefaultMutableTreeNode("Baconian(培根密码)");
    private DefaultMutableTreeNode ADFGX = new DefaultMutableTreeNode("ADFGX(ADFGX 密码)");
    private DefaultMutableTreeNode ADFGVX = new DefaultMutableTreeNode("ADFGVX(ADFGVX 密码)");
    private DefaultMutableTreeNode Bifid = new DefaultMutableTreeNode("Bifid(双密码)");
    private DefaultMutableTreeNode Four_Square = new DefaultMutableTreeNode("Porta(Porta 密码)");
    private DefaultMutableTreeNode Straddle_Checkerboard = new DefaultMutableTreeNode("Straddle Checkerboard(跨棋盘)");

    //编码下的节点
    private DefaultMutableTreeNode URL = new DefaultMutableTreeNode("URL");
    private DefaultMutableTreeNode Base64 = new DefaultMutableTreeNode("Base64");
    private DefaultMutableTreeNode Morse_Code = new DefaultMutableTreeNode("Morse Code");
    private DefaultMutableTreeNode ASCII = new DefaultMutableTreeNode("ASCII");
    private DefaultMutableTreeNode HEX = new DefaultMutableTreeNode("HEX");
    private DefaultMutableTreeNode Unicode = new DefaultMutableTreeNode("Unicode");
    private DefaultMutableTreeNode Tap_Code = new DefaultMutableTreeNode("Tap Code");
    private DefaultMutableTreeNode Shell_Code = new DefaultMutableTreeNode("Shell Code");
    private DefaultMutableTreeNode Uuencode = new DefaultMutableTreeNode("Uuencode");
    private DefaultMutableTreeNode Xxencode = new DefaultMutableTreeNode("Xxencode");
    private DefaultMutableTreeNode Conversion = new DefaultMutableTreeNode("Base Conversion");

    void setnode(){
        //--------

        //往根节点添加二级节点
        //root.add(index);
        root.add(tools);
        root.add(code);

        //--------
        tools.add(Mail);

        ///-------
        Mail.add(MailOnceCheck);

        //--------

        //往code下添加节点
        code.add(Modern);
        code.add(Classical);
        code.add(Coding);
        //--------

        //往现代节点下添加节点
        Modern.add(AES);
        Modern.add(HASH);
        Modern.add(NTLM);
        Modern.add(SM3);
        //--------

        //往古典节点下添加节点
        Classical.add(Atbash);
        Classical.add(ROT13);
        Classical.add(Rail_fence);
        //Classical.add(Vigenere);
        //cs1.add(Hill);
        //cs1.add(Polybius_Square);
        //cs1.add(Playfair);
        //cs1.add(Autokey);
        //cs1.add(Beaufort);
        //cs1.add(Running_Key);
        //cs1.add(Porta);
        //cs1.add(Affine);
        //cs1.add(Baconian);
        //cs1.add(ADFGX);
        //cs1.add(ADFGVX);
        //cs1.add(Bifid);
        //cs1.add(Four_Square);
        //cs1.add(Straddle_Checkerboard);

        //--------

        //往编码节点下添加节点
        Coding.add(ASCII);
        Coding.add(Base64);
        Coding.add(Conversion);
        Coding.add(HEX);
        Coding.add(Morse_Code);
        Coding.add(URL);
        Coding.add(Unicode);
        //cs2.add(Tap_Code);
        //cs2.add(Shell_Code);
        //cs2.add(Uuencode);
        //cs2.add(Xxencode);
    }
}
