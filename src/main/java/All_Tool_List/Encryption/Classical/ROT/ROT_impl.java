package All_Tool_List.Encryption.Classical.ROT;

public class ROT_impl {
    public String ROTEncode(String in,String rotnum)
    {
        rotnum = rotnum.replace("ROT","");
        StringBuilder s = new StringBuilder();//定义空String值
        for (int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);//获取String字符中某一个位置的字符并赋值给c
            if ((c >= 'A') && (c <= 'Z')) {
                c += Integer.parseInt(rotnum)+1;
                if (c > 'Z')
                    c -= 26;
            } else if ((c >= 'a') && (c <= 'z')) {
                c += Integer.parseInt(rotnum)+1;
                if (c > 'z')
                    c -= 26;
            } else if ((c >= '0') && (c <= '9')) {
                c += Integer.parseInt(rotnum)-8;
                if (c > '9')
                    c -= 10;
            }
            s.append(c);
        }//ROT算法，类似凯撒加密
        return s.toString();
    }
}
