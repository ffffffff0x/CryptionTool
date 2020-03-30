package All_Tool_List.Modern;

import All_Tool_List.Coding.Conversion;
import All_Tool_List.Coding.HEXCoder;

public class LM {
    public static HEXCoder hex = new HEXCoder();
    public static Conversion con = new Conversion();
    public static String LMEncrypt(String S)
    {
        if(S.length()>14)
        {
            return "超出最大长度！";
        }
        else
        {
            S = LM14check(S.toUpperCase());
            System.out.println(S.subSequence(0,14));//切割前半字符串
            System.out.println(S.subSequence(14,28));//切割后半字符串
            System.out.println(con.HEXECBin(S.subSequence(0,14).toString(),"16"));//十六进制后二进制化前半字符串
            System.out.println(con.HEXECBin(S.subSequence(14,28).toString(),"16"));//十六进制后二进制化后半字符串
            System.out.println(LM56check(con.HEXECBin(S.subSequence(0,14).toString(),"16")));
            System.out.println(LM56check(con.HEXECBin(S.subSequence(14,28).toString(),"16")));

            return "nulll";
        }
    }

    public static String LM14check(String S)
    {
        StringBuilder sb = new StringBuilder(hex.Encode(S,""));
        for (int i = hex.Encode(S,"").length(); i < 28; i++)
        {
            sb.append("0");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static String LM56check(String S)
    {
        if(S.length()==56)
        {
            return S;
        }
        else if(S.length()<56)
        {
            StringBuffer set = new StringBuffer(S);
            for (int i = 56 - (56 - S.length()); i < 56; i++) {
                set.insert(0,"0");
            }
            return set.toString();
        }
        return null;
    }

    public static String LM2T16(String S)
    {
        String[] set = new String[8];
        StringBuilder out = new StringBuilder();
        int k = 0;
        for (int i = 7; i < 56+7; i = i+7) {
            set[k] = S.substring(i-7,i)+"0";
            k++;
        }

        for (int i = 0; i <= 7; i++) {
            set[i] = con.BinECHEX(set[i].substring(0,4),"HEX")+con.BinECHEX(set[i].substring(4,8),"HEX");
        }

        for (String a:set)
        {
            out.append(a);
        }
        return out.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(LMEncrypt("123994"));
        System.out.println(LM2T16("00110001001100100011001100111001001110010011010000000000"));
    }
}
