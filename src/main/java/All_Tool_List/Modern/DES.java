package All_Tool_List.Modern;

import javax.crypto.Cipher;


public class DES {
    private static String strDefaultKey = "jIAn";    //预设秘钥
    private StringBuffer objSb          = null;
    private Cipher objCipher;
    private java.security.Key objKey    = null;
    private int intStringLength         = 0;
    private int intTemp                 = 0;

    //构造函数
    public DES() throws Exception
    {
        this(strDefaultKey);
    }

    //秘钥
    public DES(String arg_strKey) throws Exception
    {
        setKey(arg_strKey.getBytes());
        objCipher = Cipher.getInstance("DES");
    }

    //從指定的字串製成密鑰，密鑰所需的字元陣列長度為8位，不足及超過都要處理
    private void setKey(byte[] arg_strPrivateKey) {
        byte[] arrTempByteArray = new byte[8];
        // 將原始字元陣列轉換為8位
        for (int i = 0; i < arg_strPrivateKey.length && i < arrTempByteArray.length; i++)
        {
            arrTempByteArray[i] = arg_strPrivateKey[i];
        }
        // 設定密鑰
        objKey = new javax.crypto.spec.SecretKeySpec(arrTempByteArray, "DES");
    }

    //將byte陣列轉換16進制值的字串，如：byte[]{1,18}轉換為：0112
    private String byte2Hex(byte[] arg_bteArray) {
        intStringLength = arg_bteArray.length;
        objSb = new StringBuffer(intStringLength * 2);
        for (int i = 0; i < intStringLength; i++)
        {
            intTemp = arg_bteArray[i];
            //負數需要轉成正數
            if(intTemp < 0)
            {
                intTemp = intTemp + 256;
            }
            // 小於0F需要補0
            if (intTemp < 16)
            {
                objSb.append("0");
            }
            objSb.append(Integer.toString(intTemp, 16));
        }
        return objSb.toString();
    }


    //將16進制值的字串轉成byte陣列
    private byte[] hex2Byte(String arg_strHexString) {
        byte[] arrByteDAta = arg_strHexString.getBytes();
        intStringLength = arrByteDAta.length;
        byte[] aryRetuenData = new byte[intStringLength / 2];
        for (int i = 0; i < intStringLength; i = i + 2)
        {
            aryRetuenData[i / 2] =  (byte)Integer.parseInt(new String(arrByteDAta, i, 2), 16);
        }
        return aryRetuenData;
    }

    //加密字串
    private byte[] doEncrypt(byte[] arg_bteArray) throws Exception
    {
        objCipher.init(Cipher.ENCRYPT_MODE, objKey);
        return objCipher.doFinal(arg_bteArray);
    }

    private String encrypt(String arg_strToEncriptString) throws Exception
    {
        return byte2Hex(doEncrypt(arg_strToEncriptString.getBytes()));
    }

    private byte[] doDecrypt(byte[] arg_bteArray) throws Exception
    {
        objCipher.init(Cipher.DECRYPT_MODE, objKey);
        return objCipher.doFinal(arg_bteArray);
    }
    //解密字串
    private String decrypt(String arg_strToDecriptString) throws Exception
    {
        return new String(doDecrypt(hex2Byte(arg_strToDecriptString)));
    }



    public static void main(String[] args)
    {
        try
        {
            String test = "jIAn";
            DES des = new DES("KGS!@#$%");//自定義密鑰
            System.out.println("加密前的字符："+test);
            System.out.println("加密後的字符："+des.encrypt(test));
            System.out.println("解密後的字符："+des.decrypt(des.encrypt(test)));
        }
        catch (Exception e)
        {

            e.printStackTrace();
        }

    }
}
