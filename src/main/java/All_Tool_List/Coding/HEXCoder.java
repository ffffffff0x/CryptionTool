package All_Tool_List.Coding;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class HEXCoder {
    public String Encode(String i,String d)
    {
        d = CheckSelectItem(d);
        //接收转换结果
        String hexString;
        //java特殊转义字符
        String[] escapeArray = {"\b","\t","\n","\f","\r"};
        //校验参数是否包含特殊转义字符
        boolean flag = false;
        //迭代
        for(String escapeStr : escapeArray)
        {
            i = i.replace(escapeStr,"");
        }
        //16进制字符
        char[] hexArray = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F',};
        StringBuilder sb = new StringBuilder();
        //String ---> byte[]
        byte[] bs = i.getBytes();
        int bit;
        if(d.equals("0x"))
        {
            sb.append(d);
        }
        for (byte b : bs) {
            if (d.equals("\\x")) {
                sb.append(d);
                bit = (b & 0x0f0) >> 4;
                sb.append(hexArray[bit]);
                bit = b & 0x0f;
                sb.append(hexArray[bit]);
            } else if (Objects.equals(d, "0x")) {
                bit = (b & 0x0f0) >> 4;
                sb.append(hexArray[bit]);
                bit = b & 0x0f;
                sb.append(hexArray[bit]);
            } else {
                bit = (b & 0x0f0) >> 4;
                sb.append(hexArray[bit]);
                bit = b & 0x0f;
                sb.append(hexArray[bit]);
                sb.append(d);
            }
        }
        if(d.equals(",")||d.equals(";")||d.equals(":")||d.equals("\n")||d.equals(" "))
        {
            sb.deleteCharAt(sb.length() - 1);
        }
        hexString = sb.toString();
        return hexString;
    }

    public String Decode(String i,String d)
    {
        d = CheckSelectItem(d);
        //接收结果
        String result;
        //转换大写
        i = i.toUpperCase();
        //16进制字符
        String hexDigital = "0123456789ABCDEF";
        String ika;

        if(Objects.equals(d, "0x"))
        {
            ika = i.replace("0X", "");
        }
        else if(Objects.equals(d, "\\x"))
        {
            ika = i.replace("\\X","");
        }
        else
        {
            StringBuilder ssvb = new StringBuilder();
            String[] ss = i.split(d);
            for (String ik : ss) {
                ssvb.append(ik);
            }
            ika = ssvb.toString();
        }

        char[] hexs = ika.toCharArray();
        //能被16整除一定可以被2整除
        byte[] bytes = new byte[ika.length()/2];
        int n;

        for (int j = 0; j < bytes.length; j++) {
        n = hexDigital.indexOf(hexs[2 * j]) * 16 + hexDigital.indexOf(hexs[2 * j + 1]);
        bytes[j] = (byte)(n & 0xff);
        }

        result = new String(bytes, StandardCharsets.UTF_8);

        return result;
    }

    private String CheckSelectItem(String i)
    {
        String delc;
        switch (i)
        {
            case "0x": delc = "0x";break;
            case "\\x": delc = "\\x";break;
            case "无": delc = "";break;
            case "空格  ": delc = " ";break;
            case "逗号 ,": delc = ",";break;
            case "分号 ;": delc = ";";break;
            case "冒号 :": delc = ":";break;
            case "回车 \\n": delc = "\n";break;
            default: delc = i;
        }
        return delc;
    }
}
