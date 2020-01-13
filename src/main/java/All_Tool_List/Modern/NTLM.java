package All_Tool_List.Modern;

import All_Tool_List.Coding.HEXCoder;
import All_Tool_List.Modern.Hashadd.MD4;

public class NTLM {
    public String NTLMEncrypt(String in)
    {
        HEXCoder HexCoder = new HEXCoder();
        MD4 MD4 = new MD4();
        return MD4.getMD4ofStr(HexCoder.Decode(HexCoder.Encode(in," ").replace(" ","00")+"00",""));
    }
}
