package All_Tool_List.Coding;

public class ASCII {
    public String EnCode(String a,String s)
    {
        s = CheckSelectItem(s);
        String out;
        StringBuilder ASCIIL = new StringBuilder();
        StringBuilder ssvb = new StringBuilder();
        String[] ss = a.split(s);
        for (String ik : ss) {
            ssvb.append(ik);
        }
        String ika = ssvb.toString();
        char[] chars = ika.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i != chars.length - 1)
            {
                ASCIIL.append((int)chars[i]).append(s);
            }
            else {
                ASCIIL.append((int)chars[i]);
            }
        }
        out = ASCIIL.toString();
        return out;
    }

    public String DeCode(String a,String s)
    {
        s = CheckSelectItem(s);
        String out;
        if(s.equals(""))
        {
            out = "解密请选择空格分割或换行分割";
        }
        else
            {
        StringBuilder sbu = new StringBuilder();
        String[] chars = a.split(s);
        for (String aChar : chars) {
            sbu.append((char) Integer.parseInt(aChar));
        }
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
    }
}
