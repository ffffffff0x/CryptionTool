package All_Tool_List.ToolView.Node;

import All_Tool_List.Encryption.Classical.Atbash.Atbash_Form;
import All_Tool_List.Encryption.Classical.ROT.ROT_Form;
import All_Tool_List.Encryption.Classical.Rail_fence.Rail_fence_Form;
import All_Tool_List.Encryption.Classical.Vigenere.Vigenere_Form;
import All_Tool_List.Encryption.Coding.ASCII.ASCII_Form;
import All_Tool_List.Encryption.Coding.Base64.Base64_Form;
import All_Tool_List.Encryption.Coding.Conversion.Conversion_Form;
import All_Tool_List.Encryption.Coding.Conversion_2.Conversion_2_form;
import All_Tool_List.Encryption.Coding.HEXCoder.HEXCoder_Form;
import All_Tool_List.Encryption.Coding.MorseCoder.MorseCoder_Form;
import All_Tool_List.Encryption.Coding.URL.URL_Form;
import All_Tool_List.Encryption.Coding.Unicode.Unicode_Form;
import All_Tool_List.Encryption.Modern.AES.AES_Form;
import All_Tool_List.Encryption.Modern.Authentication.JWT.JWT_Form;
import All_Tool_List.Encryption.Modern.Authentication.NTLM.NTLM_Form;
import All_Tool_List.Encryption.Modern.Hash.Hash_Form;
import All_Tool_List.Encryption.Modern.SM3.SM3_Form;
import All_Tool_List.Encryption.Modern.SM4.SM4_Form;
import All_Tool_List.Tools.NetTool.PortScan.ProtScan_form;
import All_Tool_List.Tools.NetTool.WebDirectoryScan.WebDirectoryScan_form;
import All_Tool_List.Tools.TextModify.Case_conversion.Case_conversion_form;
import All_Tool_List.Tools.TextModify.Text_segmentation.Text_segmentation_form;
import All_Tool_List.Tools.TextModify.Text_substitution.Text_substitution_form;

import javax.swing.*;
import java.util.HashMap;

public class NodeMap {

    //Coding
    private final All_Tool_List.Encryption.Coding.ASCII.ASCII_Form ASCII_Form = new ASCII_Form();
    private final All_Tool_List.Encryption.Coding.Base64.Base64_Form Base64_Form = new Base64_Form();
    private final All_Tool_List.Encryption.Coding.Conversion.Conversion_Form Conversion_Form = new Conversion_Form();
    private final All_Tool_List.Encryption.Coding.Conversion_2.Conversion_2_form Conversion_2_form = new Conversion_2_form();
    private final All_Tool_List.Encryption.Coding.HEXCoder.HEXCoder_Form HEXCoder_Form = new HEXCoder_Form();
    private final All_Tool_List.Encryption.Coding.MorseCoder.MorseCoder_Form MorseCoder_Form = new MorseCoder_Form();
    private final All_Tool_List.Encryption.Coding.Unicode.Unicode_Form Unicode_Form = new Unicode_Form();
    private final All_Tool_List.Encryption.Coding.URL.URL_Form URL_Form = new URL_Form();

    //Classical
    private final All_Tool_List.Encryption.Classical.Atbash.Atbash_Form Atbash_Form = new Atbash_Form();
    private final All_Tool_List.Encryption.Classical.Rail_fence.Rail_fence_Form Rail_fence_Form = new Rail_fence_Form();
    private final All_Tool_List.Encryption.Classical.ROT.ROT_Form ROT_Form = new ROT_Form();
    private final All_Tool_List.Encryption.Classical.Vigenere.Vigenere_Form Vigenere_Form = new Vigenere_Form();

    //Modern
    private final All_Tool_List.Encryption.Modern.AES.AES_Form AES_Form = new AES_Form();
    private final All_Tool_List.Encryption.Modern.Authentication.JWT.JWT_Form JWT_Form = new JWT_Form();
    private final All_Tool_List.Encryption.Modern.Authentication.NTLM.NTLM_Form NTLM_Form = new NTLM_Form();
    private final All_Tool_List.Encryption.Modern.Hash.Hash_Form Hash_Form = new Hash_Form();
    private final All_Tool_List.Encryption.Modern.SM3.SM3_Form SM3_Form = new SM3_Form();
    private final All_Tool_List.Encryption.Modern.SM4.SM4_Form SM4_Form = new SM4_Form();

    //Tools
    //NetTool
    private final All_Tool_List.Tools.NetTool.PortScan.ProtScan_form ProtScan_form = new ProtScan_form();
    private final All_Tool_List.Tools.NetTool.WebDirectoryScan.WebDirectoryScan_form WebDirectoryScan_form = new WebDirectoryScan_form();
    //TextModify
    private final All_Tool_List.Tools.TextModify.Case_conversion.Case_conversion_form Case_conversion_form = new Case_conversion_form();
    private final All_Tool_List.Tools.TextModify.Text_substitution.Text_substitution_form Text_substitution_form = new Text_substitution_form();
    private final All_Tool_List.Tools.TextModify.Text_segmentation.Text_segmentation_form Text_segmentation_form = new Text_segmentation_form();

    public HashMap<String, JPanel> nodemap = new HashMap<>();

    public NodeMap(){
        nodemap.put("JWT",JWT_Form);
        nodemap.put("AES",AES_Form);
        nodemap.put("Hash",Hash_Form);
        nodemap.put("NTLM-HASH",NTLM_Form);
        nodemap.put("SM3",SM3_Form);
        nodemap.put("SM4",SM4_Form);
        nodemap.put("ROT",ROT_Form);
        nodemap.put("Rail fence(栅栏密码)",Rail_fence_Form);
        nodemap.put("Atbash(埃特巴什码)",Atbash_Form);
        nodemap.put("Vigenere(维吉尼亚密码)",Vigenere_Form);
        nodemap.put("Base64",Base64_Form);
        nodemap.put("Morse Code",MorseCoder_Form);
        nodemap.put("URL",URL_Form);
        nodemap.put("HEX",HEXCoder_Form);
        nodemap.put("ASCII",ASCII_Form);
        nodemap.put("Base Conversion",Conversion_Form);
        nodemap.put("Base Conversion Split",Conversion_2_form);
        nodemap.put("Unicode",Unicode_Form);
        nodemap.put("Case Convert(大小写转换)",Case_conversion_form);
        nodemap.put("Text Replace(文本替换)",Text_substitution_form);
        nodemap.put("Text Separate(文本分隔)",Text_segmentation_form);
        nodemap.put("Port Scan",ProtScan_form);
        nodemap.put("WebDirectory Scan",WebDirectoryScan_form);
    }
}
