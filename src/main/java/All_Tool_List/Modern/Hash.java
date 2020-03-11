package All_Tool_List.Modern;

import All_Tool_List.Modern.Hashadd.MD4;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
    public String HashEncode(String message,String check)
    {
        MessageDigest mc = null;//实例化MessageDigest方法用来作MD5转换
        String checking;
        checking = check;
        if(checking.equals("MD4")) {
            MD4 MD4 = new MD4();
            return  MD4.getMD4ofStr(message);
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
            String out = new BigInteger(1, mc.digest()).toString(16);
            return out.substring(8,24);
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