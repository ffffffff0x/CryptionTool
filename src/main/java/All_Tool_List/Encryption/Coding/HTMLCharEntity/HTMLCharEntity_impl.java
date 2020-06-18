package All_Tool_List.Encryption.Coding.HTMLCharEntity;


import All_Tool_List.Encryption.Coding.Unicode.Unicode_impl;
import org.apache.commons.text.StringEscapeUtils;

import java.math.BigInteger;

public class HTMLCharEntity_impl {
    private static Unicode_impl unicode_impl = new Unicode_impl();

    public String HTMLCharEntityEncode(String Source,String reference){
        String[] SourceSplit = Source.split("");
        StringBuilder out = new StringBuilder();
        for (String a:SourceSplit) {
            out.append(HTMLCharEntityEncode_impl(a,reference));
        }
        return out.toString();
    }

    public String HTMLCharEntityDecode(String Source,String reference){
        String[] SourceSplit = Source.split(";");
        StringBuilder out = new StringBuilder();
        for (String a:SourceSplit) {
            if(reference.equals("CER: &[char];")){
                out.append(HTMLCharEntityDecode_impl(a+";",reference));
            }else {
                out.append(HTMLCharEntityDecode_impl(a,reference));
            }
        }
        return out.toString();
    }

    private static String HTMLCharEntityEncode_impl(String Source,String reference){
        String out = unicode_impl.stringToUnicode(Source).substring(2);

        if(reference.equals("NCR: &#[dec];")) {
            return "&#"+(new BigInteger(out,16).toString(10))+";";
        }else if (reference.equals("NCR: &#x[hex];")){
            return "&#x"+out+";";
        }else {
            return StringEscapeUtils.escapeHtml4(Source);
        }
    }

    private static String HTMLCharEntityDecode_impl(String Source,String reference){

        if(reference.equals("NCR: &#[dec];")) {
            return unicode_impl.unicodeToString("\\u"+new BigInteger(Source.substring(2),10).toString(16));
        }else if (reference.equals("NCR: &#x[hex];")){
            return unicode_impl.unicodeToString("\\u"+Source.substring(3));
        }else {
            return StringEscapeUtils.unescapeHtml4(Source);
        }
    }
}