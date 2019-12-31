package All_Tool_List.Modern;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
    public String HashEncode(String message,String check)
    {
        MessageDigest mc = null;//实例化MessageDigest方法用来作MD5转换
        String checking;
        checking = check;
        {
            try {
                mc = MessageDigest.getInstance(checking);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        assert mc != null;
        mc.update(message.getBytes());//MD5加密
        return new BigInteger(1, mc.digest()).toString(16);
    }
}
