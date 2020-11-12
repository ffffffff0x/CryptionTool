package All_Tool_List.Encryption.Modern.Authentication.NTLM;

import All_Tool_List.Encryption.Coding.HEXCoder.HEXCoder_impl;
import All_Tool_List.Encryption.Modern.Hash.HashAdd.MD4_ipml;
import sun.security.provider.MD4;

import java.io.UnsupportedEncodingException;

public class NTLM_impl {
    public String NTLMEncrypt(String in)
    {
        HEXCoder_impl HexCoder = new HEXCoder_impl();
        MD4_ipml MD4_ipml = new MD4_ipml();
        try {
            return MD4_ipml.getMD4ofStr(HexCoder.Decode(HexCoder.Encode(in," ").replace(" ","00")+"00",""));
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }
}
