package All_Tool_List.Encryption.Coding.URL;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URL_impl {
    public String URLDecode(String in) throws UnsupportedEncodingException {
        return URLDecoder.decode(in,"UTF-8");
    }

    public String URLEncode(String in) throws UnsupportedEncodingException {
        return URLEncoder.encode(in,"UTF-8");
    }
}
