package All_Tool_List.Encryption.Coding.Unicode;

public class Unicode_impl {
    //字符串转换unicode
    public String stringToUnicode(String string) {
        StringBuilder unico = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);// 取出每一个字符
            unico.append("\\u");
            for (int j = 0; j < 4-Integer.toHexString(c).length(); j++) {
                unico.append("0");
            }
            unico.append(Integer.toHexString(c));// 转换为unicode
        }
        return unico.toString();
    }

    //unicode 转字符串
    public String unicodeToString(String unicode) {
        StringBuilder str = new StringBuilder();
        String[] hex = unicode.split("\\\\u");
        for (int i = 1; i < hex.length; i++) {
            int data = Integer.parseInt(hex[i], 16);// 转换出每一个代码点
            str.append((char) data);// 追加成string
        }
        return str.toString();
    }
}
