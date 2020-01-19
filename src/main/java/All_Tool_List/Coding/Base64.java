package All_Tool_List.Coding;

import java.nio.charset.StandardCharsets;

public class Base64 {
    public String Base64Decode(String in)
    {
        byte[] bs64 = java.util.Base64.getDecoder().decode(in);//获取用户输入字符通过base64加密，输出byte数组型值
        return new String(bs64, StandardCharsets.UTF_8);//将byte数组转换成String输出
    }

    public String Base64Encode(String in)
    {
        byte[] bytes = in.getBytes(StandardCharsets.UTF_8);//将用户输入字符转换成byte（utf-8编码）
        return java.util.Base64.getEncoder().encodeToString(bytes);//输出值
    }
}
