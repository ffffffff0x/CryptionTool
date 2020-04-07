package All_Tool_List.Encryption.Coding.ASCII;

public class ASCII_impl {
    public String EnCode(String Source,String Split,int PMNumber)
    {
        Split = CheckSelectItem(Split);//分隔符获取
        StringBuilder ASCIIL = new StringBuilder();//结果保存
        StringBuilder ssvb = new StringBuilder();//输入值
        String[] ss = Source.split("");
        for (String ik : ss) {
            ssvb.append(ik);
        }
        char[] chars = ssvb.toString().toCharArray();//输入值保存为char数组
        for (int i = 0; i < chars.length; i++) {
            if(i != chars.length - 1)
            {
                ASCIIL.append(Integer.valueOf(chars[i])+PMNumber).append(Split);
            }
            else {
                ASCIIL.append(Integer.valueOf(chars[i])+PMNumber);
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
        String delc;
        if ("NULL".equals(i)) {
            delc = "";
        } else if ("    Space".equals(i)) {
            delc = " ";
        } else if ("\\n Newline".equals(i)) {
            delc = "\n";
        } else {
            delc = i;
        }
        return delc;
    }//返回分隔符
}
