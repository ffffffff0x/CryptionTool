package All_Tool_List.Coding;

public class ASCII {
    public String EnCode(String a,String s)
    {
        s = CheckSelectItem(s);//分隔符获取
        StringBuilder ASCIIL = new StringBuilder();//结果保存
        StringBuilder ssvb = new StringBuilder();//输入值
        String[] ss = a.split("");
        for (String ik : ss) {
            ssvb.append(ik);
        }
        char[] chars = ssvb.toString().toCharArray();//输入值保存为char数组
        for (int i = 0; i < chars.length; i++) {
            if(i != chars.length - 1)
            {
                ASCIIL.append((int)chars[i]).append(s);
            }
            else {
                ASCIIL.append((int)chars[i]);
            }
        }//ASCII转换
        return ASCIIL.toString();
    }

    public String DeCode(String a,String s)
    {
        s = CheckSelectItem(s);//分隔符获取
        String out;//输出
        if(s.equals(""))
        {
            out = "解密请选择空格分割或换行分割";
        }
        else
            {
        StringBuilder sbu = new StringBuilder();
        String[] chars = a.split(s);//输入值切片
        for (String aChar : chars) {
            sbu.append((char) Integer.parseInt(aChar));
        }//ASCII转换
        out = sbu.toString();
        }
        return out;
    }

    private String CheckSelectItem(String i)
    {
        String delc = "";
        switch (i)
        {
            case "无": delc = "";break;
            case "空格  ": delc = " ";break;
            case "回车 \\n": delc = "\n";break;
            default: break;
        }
        return delc;
    }//返回分隔符
}
