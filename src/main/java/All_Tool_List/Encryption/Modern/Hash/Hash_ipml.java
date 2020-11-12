package All_Tool_List.Encryption.Modern.Hash;

import All_Tool_List.Encryption.Modern.Hash.HashAdd.MD4_ipml;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash_ipml {
    public String HashEncode(String message,String check)
    {
        MessageDigest mc = null;//实例化MessageDigest方法用来作MD5转换
        String checking;
        checking = check;
        if(checking.equals("MD4")) {
            MD4_ipml MD4_ipml = new MD4_ipml();
            return  MD4_ipml.getMD4ofStr(message);
        }//MD4
        else if(checking.equals("MD5-16"))
        {
            try {
                mc = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            assert mc != null;
            mc.update(message.getBytes());//hash摘要
            byte[] out = mc.digest();
            // String out = new BigInteger(1, mc.digest()).toString(16);
            return java.util.Base64.getEncoder().encodeToString(out);
            // return new BigInteger(1, mc.digest()).toString(16);
        }
        else {
            try {
                mc = MessageDigest.getInstance(checking);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            assert mc != null;
            mc.update(message.getBytes());//hash摘要
            byte[] out = mc.digest();
            return java.util.Base64.getEncoder().encodeToString(out);
        }
    }
}
