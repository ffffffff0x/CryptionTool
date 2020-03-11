package All_Tool_List.ToolView;/*
 * Created by JFormDesigner on Mon Sep 09 14:12:51 CST 2019
 */

import All_Tool_List.Authentication.JWT;
import All_Tool_List.Classical.Atbash;
import All_Tool_List.Classical.ROT;
import All_Tool_List.Classical.Rail_fence;
import All_Tool_List.Classical.Vigenere;
import All_Tool_List.Coding.*;
import All_Tool_List.Modern.AES;
import All_Tool_List.Modern.Hash;
import All_Tool_List.Modern.NTLM;
import All_Tool_List.Modern.SM3;
import All_Tool_List.Net.MailOnceCheck;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

/**
 * @author 1
 */
public class accs {
    private CaretEvent e;

    public accs() {
        initComponents();
    }
    private All_Tool_List.Modern.Hash hashC = new Hash();
    private All_Tool_List.Coding.Base64 Base64C = new All_Tool_List.Coding.Base64();
    private ROT ROTC = new ROT();
    private MorseCoder mcdC = new MorseCoder();
    private HEXCoder HexCoderC = new HEXCoder();
    private All_Tool_List.Coding.ASCII ASCIIC = new ASCII();
    private All_Tool_List.Coding.Conversion conC = new Conversion();
    private All_Tool_List.Net.MailOnceCheck mocC = new MailOnceCheck();
    private All_Tool_List.Modern.AES AESC = new AES();
    private All_Tool_List.Coding.Unicode UnicodeC = new Unicode();
    private All_Tool_List.Classical.Rail_fence railC = new Rail_fence();
    private All_Tool_List.Classical.Atbash atbC = new Atbash();
    private SM3 SM3C = new SM3();
    private All_Tool_List.Modern.NTLM NTLMC = new NTLM();
    private All_Tool_List.Classical.Vigenere VigenereC = new Vigenere();
    private All_Tool_List.Authentication.JWT JWTC = new JWT();

    private void button1ActionPerformed(ActionEvent e) {
        HashencodeHEX.setText(new BigInteger(1, java.util.Base64.getDecoder().decode(hashC.HashEncode(HashSource.getText(), Objects.requireNonNull(HashCBox.getSelectedItem().toString())))).toString(16));
        HashencodeHEXUP.setText(new BigInteger(1, java.util.Base64.getDecoder().decode(hashC.HashEncode(HashSource.getText(), Objects.requireNonNull(HashCBox.getSelectedItem().toString())))).toString(16).toUpperCase());
        HashencodeBase64.setText(hashC.HashEncode(HashSource.getText(), Objects.requireNonNull(HashCBox.getSelectedItem().toString())));
    }//MD5

    private void md5fileActionPerformed(ActionEvent e) {
        // TODO add your code here

    }//MD5

    private void base64decodeActionPerformed(ActionEvent e){
        base64code.setText(Base64C.Base64Decode(base64source.getText()));
    }//base64

    private void base64encodeActionPerformed(ActionEvent e){
        base64code.setText(Base64C.Base64Encode(base64source.getText()));
    }//base64

    private void ROT13CBOXItemStateChanged(ItemEvent e) {
        ROT13edcode.setText(ROTC.ROTEncode(ROT13source.getText(), Objects.requireNonNull(ROT13CBOX.getSelectedItem()).toString()));
    }//ROT1-25

    private void ROT13sourceCaretUpdate(CaretEvent e) {
        ROT13edcode.setText(ROTC.ROTEncode(ROT13source.getText(), Objects.requireNonNull(ROT13CBOX.getSelectedItem()).toString()));
    }//ROT1-25

    private void MorseEnCodeBTActionPerformed(ActionEvent e) {
        MorseDecode.setText(mcdC.encode(MorseSource.getText()));
    }//Morse code

    private void MorseDeCodeBTActionPerformed(ActionEvent e) {
        MorseDecode.setText(mcdC.decode(MorseSource.getText()));
    }//Morse code

    private void URLDeCodeBTActionPerformed(ActionEvent e) {
        try {
            URLDeCodeArea.setText(URLDecoder.decode(URLSourceArea.getText(),"UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }//URL

    private void URLEnCodeBTActionPerformed(ActionEvent e) {
        try {
            URLDeCodeArea.setText(URLEncoder.encode(URLSourceArea.getText(),"UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }//URL

    private void HEXEnCodeBTActionPerformed(ActionEvent e) {
        HEXDeCodeArea.setText(HexCoderC.Encode(HEXSourceArea.getText(),Objects.requireNonNull(HEXDelCBox.getSelectedItem()).toString()));
    }//HEX

    private void HEXDeCodeBTActionPerformed(ActionEvent e) {
        HEXDeCodeArea.setText(HexCoderC.Decode(HEXSourceArea.getText(),Objects.requireNonNull(HEXDelCBox.getSelectedItem()).toString()));
    }//HEX

    private void ASKIIEncodeBTActionPerformed(ActionEvent e) {
        ASCIIDeCode.setText(ASCIIC.EnCode(ASCIISource.getText(),Objects.requireNonNull(ASCIICBox.getSelectedItem()).toString()));
    }//ASCII

    private void ASKIIDeCodeBTActionPerformed(ActionEvent e) {
        ASCIIDeCode.setText(ASCIIC.DeCode(ASCIISource.getText(),Objects.requireNonNull(ASCIICBox.getSelectedItem()).toString()));
    }//ASCII

    private void BinBTActionPerformed(ActionEvent e) {
        OctalArea.setText(conC.BinECOtc(BinaryArea.getText()));
        DecimalArea.setText(conC.BinECDec(BinaryArea.getText()));
        HexadecimalArea.setText(conC.BinECHEX(BinaryArea.getText(), Objects.requireNonNull(ConversionCBox.getSelectedItem()).toString()));
    }//Conversion

    private void OctBTActionPerformed(ActionEvent e) {
        BinaryArea.setText(conC.OctECBin(OctalArea.getText()));
        DecimalArea.setText(conC.OctECDec(OctalArea.getText()));
        HexadecimalArea.setText(conC.OctECHEX(OctalArea.getText(), Objects.requireNonNull(ConversionCBox.getSelectedItem()).toString()));
    }//Conversion

    private void DecBTActionPerformed(ActionEvent e) {
        BinaryArea.setText(conC.DecECBin(DecimalArea.getText()));
        OctalArea.setText(conC.DecECOct(DecimalArea.getText()));
        HexadecimalArea.setText(conC.DecECHEX(DecimalArea.getText(), Objects.requireNonNull(ConversionCBox.getSelectedItem()).toString()));
    }//Conversion

    private void HexBTActionPerformed(ActionEvent e) {
        BinaryArea.setText(conC.HEXECBin(HexadecimalArea.getText(), Objects.requireNonNull(ConversionCBox.getSelectedItem()).toString()));
        OctalArea.setText(conC.HEXECOct(HexadecimalArea.getText(),Objects.requireNonNull(ConversionCBox.getSelectedItem()).toString()));
        DecimalArea.setText(conC.HEXECDec(HexadecimalArea.getText(),Objects.requireNonNull(ConversionCBox.getSelectedItem()).toString()));
    }//Conversion

    private void MailOnceCheckBTActionPerformed(ActionEvent e) {
        try {
            MailOnceCheckResult.setText(mocC.lifeCheck(MailOnceCheckField.getText()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//MailOnceCheck

    private void AESEncryptBTActionPerformed(ActionEvent e) {
        try {
            AESResultArea.setText(AESC.AESEncrypt(AESSourceArea.getText(),
                    AESSecretKeyArea.getText(),
                    Objects.requireNonNull(AESModeCB.getSelectedItem()).toString(),
                    Objects.requireNonNull(AESOUTCB.getSelectedItem()).toString(),
                    Integer.parseInt(Objects.requireNonNull(AESKLengthCB.getSelectedItem()).toString())));
        } catch (GeneralSecurityException ex) {
            ex.printStackTrace();
        }
    }//AES

    private void AESDecryptBTActionPerformed(ActionEvent e) {
        try {
            AESResultArea.setText(AESC.AESDecrypt(AESSourceArea.getText(),
                    AESSecretKeyArea.getText(),
                    Objects.requireNonNull(AESModeCB.getSelectedItem()).toString(),
                    Objects.requireNonNull(AESOUTCB.getSelectedItem()).toString(),
                    Integer.parseInt(Objects.requireNonNull(AESKLengthCB.getSelectedItem()).toString())));
        } catch (GeneralSecurityException ex) {
            ex.printStackTrace();
            AESResultArea.setText("Error");
        }
    }//AES

    private void UnicodeEnCodeBTActionPerformed(ActionEvent e) {
        UnicodeDeCodeArea.setText(UnicodeC.stringToUnicode(UnicodeSourceArea.getText()));
    }//Unicode

    private void UnicodeDeCodeBTActionPerformed(ActionEvent e) {
        UnicodeDeCodeArea.setText(UnicodeC.unicodeToString(UnicodeSourceArea.getText()));
    }//Unicode

    private void Rail_fenceBT1ActionPerformed(ActionEvent e) {
        Rail_fenceDecode.setText(railC.Rail_fenceEnCode(Rail_fenceSource.getText(),Integer.parseInt(Rail_fenceSpinner1.getValue().toString())));
    }

    private void Rail_fenceBT2ActionPerformed(ActionEvent e) {
        Rail_fenceDecode.setText(railC.Rail_fenceDeCode(Rail_fenceSource.getText(),Integer.parseInt(Rail_fenceSpinner1.getValue().toString())));
    }

    private void AtbashSourceAreaCaretUpdate(CaretEvent e) {
        AtbashDeCodeArea.setText(atbC.AtbashEnCode(AtbashSourceArea.getText()));
    }

    private void SM3encodebtnActionPerformed(ActionEvent e) {
        try {
            String out = SM3C.byteArrayToHexString(SM3C.hash(SM3Source1.getText().getBytes()));
            SM3encode3.setText(out);
            SM3encode2.setText(out.toLowerCase());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void NTLMSource1CaretUpdate(CaretEvent e) {
        NTLMencode1.setText(NTLMC.NTLMEncrypt(NTLMSource1.getText()));
        NTLMencode2.setText(NTLMC.NTLMEncrypt(NTLMSource1.getText()).toUpperCase());
    }

    private void VigenereEncodeBTActionPerformed(ActionEvent e) {
        VigenereResultArea.setText(VigenereC.VigenereEncryption(VigenereSorceArea.getText(),VigenereKeyArea.getText()));
    }

    private void VigenereDecoeBTActionPerformed(ActionEvent e) {
        VigenereResultArea.setText(VigenereC.VigenereDecryption(VigenereSorceArea.getText(),VigenereKeyArea.getText()));
    }

    private void JWTEncodeBTActionPerformed(ActionEvent e) {
        try {
            JWTTokenArea.setText(JWTC.JWTencode(JWTHeaderArea.getText(),JWTPayloadArea.getText(),JWTSignatureArea.getText()));
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        } catch (InvalidKeyException ex) {
            ex.printStackTrace();
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }

    private void JWTDecodeBTActionPerformed(ActionEvent e) {
        String[] out = JWTC.JWTdecode(JWTTokenArea.getText());
        JWTHeaderArea.setText(out[0]);
        JWTPayloadArea.setText(out[1]);
        JWTSignatureArea.setText(out[2]);
    }

     private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        rootview = new JPanel();
        index = new JPanel();
        IndexLB = new JLabel();
        index2 = new JPanel();
        JWT = new JPanel();
        TitleLBJWT = new JLabel();
        JWTSCLP1 = new JScrollPane();
        JWTHeaderArea = new JTextArea();
        JWTSCLP2 = new JScrollPane();
        JWTPayloadArea = new JTextArea();
        JWTSCLP3 = new JScrollPane();
        JWTSignatureArea = new JTextArea();
        JWTSCLP4 = new JScrollPane();
        JWTTokenArea = new JTextArea();
        JWTLB1 = new JLabel();
        JWTLB2 = new JLabel();
        JWTLB3 = new JLabel();
        JWTLB4 = new JLabel();
        JWTEncodeBT = new JButton();
        JWTDecodeBT = new JButton();
        MailOnceCheck = new JPanel();
        MailOnceCheckBT = new JButton();
        MailOnceCheckLB1 = new JLabel();
        MailOnceCheckAffirming = new JLabel();
        MailOnceCheckField = new JFormattedTextField();
        MailOnceCheckResult = new JLabel();
        AES = new JPanel();
        TitleLBAES = new JLabel();
        AESSCLP1 = new JScrollPane();
        AESSourceArea = new JTextArea();
        AESSCLP2 = new JScrollPane();
        AESResultArea = new JTextArea();
        AESEncryptBT = new JButton();
        AESDecryptBT = new JButton();
        AESLB3 = new JLabel();
        AESSCLP3 = new JScrollPane();
        AESSecretKeyArea = new JTextArea();
        AESModeCB = new JComboBox();
        AESOUTCB = new JComboBox();
        AESKLengthCB = new JComboBox();
        AESLB4 = new JLabel();
        AESLB5 = new JLabel();
        AESLB6 = new JLabel();
        NTLM = new JPanel();
        TieleLBNTLM = new JLabel();
        NTLMSCLP1 = new JScrollPane();
        NTLMSource1 = new JTextArea();
        NTLMSCLP2 = new JScrollPane();
        NTLMencode1 = new JTextArea();
        NTLMSCLP3 = new JScrollPane();
        NTLMencode2 = new JTextArea();
        NTLMLB1 = new JLabel();
        NTLMLB2 = new JLabel();
        NTLMLB3 = new JLabel();
        Hash = new JPanel();
        TitleLBHASH = new JLabel();
        HASHSCLP1 = new JScrollPane();
        HashSource = new JTextArea();
        HASHSCLP3 = new JScrollPane();
        HashencodeHEX = new JTextArea();
        HASHSCLP4 = new JScrollPane();
        HashencodeHEXUP = new JTextArea();
        HASHSCLP5 = new JScrollPane();
        HashencodeBase64 = new JTextArea();
        MD5encodebtn = new JButton();
        HASHLB1 = new JLabel();
        HASHLB2 = new JLabel();
        HASHLB3 = new JLabel();
        HASHLB4 = new JLabel();
        HashfileBT = new JButton();
        HashCBox = new JComboBox();
        SM3 = new JPanel();
        TitleLBSM3 = new JLabel();
        SM3SCLP1 = new JScrollPane();
        SM3Source1 = new JTextArea();
        SM3SCLP2 = new JScrollPane();
        SM3encode2 = new JTextArea();
        SM3SCLP3 = new JScrollPane();
        SM3encode3 = new JTextArea();
        SM3encodebtn = new JButton();
        SM3LB4 = new JLabel();
        SM3LB5 = new JLabel();
        SM3LB6 = new JLabel();
        base64 = new JPanel();
        TitleLBbase64 = new JLabel();
        base64SCLP1 = new JScrollPane();
        base64source = new JTextArea();
        base64SCLP2 = new JScrollPane();
        base64code = new JTextArea();
        base64decode = new JButton();
        base64encode = new JButton();
        ROT13 = new JPanel();
        TitleLBROT = new JLabel();
        ROT13SCLP1 = new JScrollPane();
        ROT13source = new JTextArea();
        ROT13SCLP2 = new JScrollPane();
        ROT13edcode = new JTextArea();
        ROT13CBOX = new JComboBox();
        Rail_fence = new JPanel();
        TitleLBRai_Fence = new JLabel();
        Rail_fenceSCLP1 = new JScrollPane();
        Rail_fenceSource = new JTextArea();
        Rail_fenceSCLP2 = new JScrollPane();
        Rail_fenceDecode = new JTextArea();
        Rail_fenceBT1 = new JButton();
        Rail_fenceBT2 = new JButton();
        Rail_fenceSpinner1 = new JSpinner();
        Atbash = new JPanel();
        TitleLBAtbash = new JLabel();
        AtbashSCLP1 = new JScrollPane();
        AtbashSourceArea = new JTextArea();
        AtbashSCLP2 = new JScrollPane();
        AtbashDeCodeArea = new JTextArea();
        AtbashLB1 = new JLabel();
        AtbashLB2 = new JLabel();
        Vigenere = new JPanel();
        VigenereLB = new JLabel();
        VigenereSCLP1 = new JScrollPane();
        VigenereSorceArea = new JTextArea();
        VigenereSCLP2 = new JScrollPane();
        VigenereResultArea = new JTextArea();
        VigenereEncodeBT = new JButton();
        VigenereDecoeBT = new JButton();
        VigenereSCLP3 = new JScrollPane();
        VigenereKeyArea = new JTextArea();
        morse = new JPanel();
        TitleLBMorse = new JLabel();
        morseSCLP1 = new JScrollPane();
        MorseSource = new JTextArea();
        morseSCLP2 = new JScrollPane();
        MorseDecode = new JTextArea();
        MorseEnCodeBT = new JButton();
        MorseDeCodeBT = new JButton();
        URL = new JPanel();
        TitleLBURL = new JLabel();
        URLSCLP1 = new JScrollPane();
        URLSourceArea = new JTextArea();
        URLSCLP2 = new JScrollPane();
        URLDeCodeArea = new JTextArea();
        URLEnCodeBT = new JButton();
        URLDeCodeBT = new JButton();
        HEX = new JPanel();
        TitleLBHEX = new JLabel();
        HEXSCLP1 = new JScrollPane();
        HEXSourceArea = new JTextArea();
        HEXSCLP2 = new JScrollPane();
        HEXDeCodeArea = new JTextArea();
        HEXEnCodeBT = new JButton();
        HEXDeCodeBT = new JButton();
        HEXDelCBox = new JComboBox();
        ASCII = new JPanel();
        TitleLBASCII = new JLabel();
        ASCIISCLP1 = new JScrollPane();
        ASCIISource = new JTextArea();
        ASCIISCLP2 = new JScrollPane();
        ASCIIDeCode = new JTextArea();
        ASCIIEncodeBT = new JButton();
        ASCIIDeCodeBT = new JButton();
        ASCIICBox = new JComboBox();
        Conversion = new JPanel();
        TitleLBConversion = new JLabel();
        ConversionSCLP1 = new JScrollPane();
        BinaryArea = new JTextArea();
        ConversionSCLP2 = new JScrollPane();
        OctalArea = new JTextArea();
        ConversionSCLP3 = new JScrollPane();
        DecimalArea = new JTextArea();
        ConversionSCLP4 = new JScrollPane();
        HexadecimalArea = new JTextArea();
        ConversionLB1 = new JLabel();
        ConversionLB2 = new JLabel();
        ConversionLB3 = new JLabel();
        ConversionLB4 = new JLabel();
        BinBT = new JButton();
        OctBT = new JButton();
        DecBT = new JButton();
        HexBT = new JButton();
        ConversionCBox = new JComboBox();
        Unicode = new JPanel();
        TitleLBUnicode = new JLabel();
        UnicodeSCLP1 = new JScrollPane();
        UnicodeSourceArea = new JTextArea();
        UnicodeSCLP2 = new JScrollPane();
        UnicodeDeCodeArea = new JTextArea();
        UnicodeEnCodeBT = new JButton();
        UnicodeDeCodeBT = new JButton();
        Template = new JPanel();
        TitleLBTEMP = new JLabel();
        TemplateSCLP1 = new JScrollPane();
        TempArea1 = new JTextArea();
        TemplateSCLP2 = new JScrollPane();
        TempArea2 = new JTextArea();
        Tempbutton2 = new JButton();
        Tempbutton3 = new JButton();
        Jtreee = new JScrollPane();

        //======== rootview ========
        {
            rootview.setBackground(new Color(204, 204, 204));
            rootview.setBorder(UIManager.getBorder("List.focusCellHighlightBorder"));
            rootview.setPreferredSize(new Dimension(890, 600));
            rootview.setMinimumSize(new Dimension(1000, 600));
            rootview.setMaximumSize(new Dimension(1000, 600));
            rootview.setFont(new Font("\u9ed1\u4f53", Font.PLAIN, 12));
            rootview.setLayout(null);

            //======== index ========
            {
                index.setBackground(new Color(228, 230, 235));
                index.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                index.setLayout(null);

                //---- IndexLB ----
                IndexLB.setIcon(new ImageIcon(getClass().getResource("/img/ffffffff0x_Logo.jpg")));
                IndexLB.setHorizontalAlignment(SwingConstants.CENTER);
                index.add(IndexLB);
                IndexLB.setBounds(0, 0, 620, 590);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < index.getComponentCount(); i++) {
                        Rectangle bounds = index.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = index.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    index.setMinimumSize(preferredSize);
                    index.setPreferredSize(preferredSize);
                }
            }
            rootview.add(index);
            index.setBounds(265, 5, 620, 590);

            //======== index2 ========
            {
                index2.setBackground(new Color(228, 230, 235));
                index2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                index2.setVisible(false);
                index2.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < index2.getComponentCount(); i++) {
                        Rectangle bounds = index2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = index2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    index2.setMinimumSize(preferredSize);
                    index2.setPreferredSize(preferredSize);
                }
            }
            rootview.add(index2);
            index2.setBounds(265, 5, 620, 590);

            //======== JWT ========
            {
                JWT.setBackground(new Color(228, 230, 235));
                JWT.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                JWT.setVisible(false);
                JWT.setLayout(null);

                //---- TitleLBJWT ----
                TitleLBJWT.setText("JWT");
                TitleLBJWT.setFont(new Font("Jokerman", Font.PLAIN, 35));
                TitleLBJWT.setForeground(Color.black);
                JWT.add(TitleLBJWT);
                TitleLBJWT.setBounds(264, 28, 92, 54);

                //======== JWTSCLP1 ========
                {

                    //---- JWTHeaderArea ----
                    JWTHeaderArea.setLineWrap(true);
                    JWTSCLP1.setViewportView(JWTHeaderArea);
                }
                JWT.add(JWTSCLP1);
                JWTSCLP1.setBounds(16, 135, 180, 170);

                //======== JWTSCLP2 ========
                {

                    //---- JWTPayloadArea ----
                    JWTPayloadArea.setLineWrap(true);
                    JWTSCLP2.setViewportView(JWTPayloadArea);
                }
                JWT.add(JWTSCLP2);
                JWTSCLP2.setBounds(221, 135, 180, 170);

                //======== JWTSCLP3 ========
                {

                    //---- JWTSignatureArea ----
                    JWTSignatureArea.setLineWrap(true);
                    JWTSCLP3.setViewportView(JWTSignatureArea);
                }
                JWT.add(JWTSCLP3);
                JWTSCLP3.setBounds(426, 135, 180, 170);

                //======== JWTSCLP4 ========
                {

                    //---- JWTTokenArea ----
                    JWTTokenArea.setLineWrap(true);
                    JWTSCLP4.setViewportView(JWTTokenArea);
                }
                JWT.add(JWTSCLP4);
                JWTSCLP4.setBounds(15, 415, 593, 140);

                //---- JWTLB1 ----
                JWTLB1.setText("TOKEN :");
                JWTLB1.setFont(JWTLB1.getFont().deriveFont(JWTLB1.getFont().getSize() + 5f));
                JWTLB1.setForeground(Color.black);
                JWT.add(JWTLB1);
                JWTLB1.setBounds(19, 384, 70, 32);

                //---- JWTLB2 ----
                JWTLB2.setText("Header :");
                JWTLB2.setFont(JWTLB2.getFont().deriveFont(JWTLB2.getFont().getSize() + 5f));
                JWTLB2.setForeground(Color.black);
                JWT.add(JWTLB2);
                JWTLB2.setBounds(19, 104, 75, 32);

                //---- JWTLB3 ----
                JWTLB3.setText("Payload :");
                JWTLB3.setFont(JWTLB3.getFont().deriveFont(JWTLB3.getFont().getSize() + 5f));
                JWTLB3.setForeground(Color.black);
                JWT.add(JWTLB3);
                JWTLB3.setBounds(224, 104, 75, 32);

                //---- JWTLB4 ----
                JWTLB4.setText("Verify Signature :");
                JWTLB4.setFont(JWTLB4.getFont().deriveFont(JWTLB4.getFont().getSize() + 5f));
                JWTLB4.setForeground(Color.black);
                JWT.add(JWTLB4);
                JWTLB4.setBounds(429, 104, 165, 32);

                //---- JWTEncodeBT ----
                JWTEncodeBT.setFont(JWTEncodeBT.getFont().deriveFont(Font.BOLD));
                JWTEncodeBT.setText("\u2193");
                JWTEncodeBT.addActionListener(e -> JWTEncodeBTActionPerformed(e));
                JWT.add(JWTEncodeBT);
                JWTEncodeBT.setBounds(139, 339, 130, 40);

                //---- JWTDecodeBT ----
                JWTDecodeBT.setText("\u2191");
                JWTDecodeBT.setFont(JWTDecodeBT.getFont().deriveFont(JWTDecodeBT.getFont().getStyle() | Font.BOLD));
                JWTDecodeBT.addActionListener(e -> JWTDecodeBTActionPerformed(e));
                JWT.add(JWTDecodeBT);
                JWTDecodeBT.setBounds(339, 339, 130, 40);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < JWT.getComponentCount(); i++) {
                        Rectangle bounds = JWT.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = JWT.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    JWT.setMinimumSize(preferredSize);
                    JWT.setPreferredSize(preferredSize);
                }
            }
            rootview.add(JWT);
            JWT.setBounds(265, 5, 620, 590);

            //======== MailOnceCheck ========
            {
                MailOnceCheck.setBackground(new Color(228, 230, 235));
                MailOnceCheck.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                MailOnceCheck.setVisible(false);
                MailOnceCheck.setLayout(null);

                //---- MailOnceCheckBT ----
                MailOnceCheckBT.setText("Check");
                MailOnceCheckBT.addActionListener(e -> MailOnceCheckBTActionPerformed(e));
                MailOnceCheck.add(MailOnceCheckBT);
                MailOnceCheckBT.setBounds(426, 180, 115, 45);

                //---- MailOnceCheckLB1 ----
                MailOnceCheckLB1.setText("\u2190  MailAddress");
                MailOnceCheckLB1.setForeground(Color.black);
                MailOnceCheckLB1.setFont(MailOnceCheckLB1.getFont().deriveFont(MailOnceCheckLB1.getFont().getSize() + 5f));
                MailOnceCheck.add(MailOnceCheckLB1);
                MailOnceCheckLB1.setBounds(406, 114, 155, 23);

                //---- MailOnceCheckAffirming ----
                MailOnceCheckAffirming.setText("\u6570\u636e\u7531Antbot.pw\u63d0\u4f9b");
                MailOnceCheckAffirming.setForeground(Color.black);
                MailOnceCheck.add(MailOnceCheckAffirming);
                MailOnceCheckAffirming.setBounds(247, 560, 127, MailOnceCheckAffirming.getPreferredSize().height);
                MailOnceCheck.add(MailOnceCheckField);
                MailOnceCheckField.setBounds(61, 110, 310, MailOnceCheckField.getPreferredSize().height);

                //---- MailOnceCheckResult ----
                MailOnceCheckResult.setText("Result");
                MailOnceCheckResult.setForeground(Color.black);
                MailOnceCheckResult.setFont(MailOnceCheckResult.getFont().deriveFont(MailOnceCheckResult.getFont().getSize() + 5f));
                MailOnceCheck.add(MailOnceCheckResult);
                MailOnceCheckResult.setBounds(130, 185, 173, 35);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < MailOnceCheck.getComponentCount(); i++) {
                        Rectangle bounds = MailOnceCheck.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = MailOnceCheck.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    MailOnceCheck.setMinimumSize(preferredSize);
                    MailOnceCheck.setPreferredSize(preferredSize);
                }
            }
            rootview.add(MailOnceCheck);
            MailOnceCheck.setBounds(265, 5, 620, 590);

            //======== AES ========
            {
                AES.setBackground(new Color(228, 230, 235));
                AES.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                AES.setVisible(false);
                AES.setLayout(null);

                //---- TitleLBAES ----
                TitleLBAES.setText("AES");
                TitleLBAES.setFont(new Font("Jokerman", Font.PLAIN, 35));
                TitleLBAES.setForeground(Color.black);
                AES.add(TitleLBAES);
                TitleLBAES.setBounds(273, 14, 73, 54);

                //======== AESSCLP1 ========
                {

                    //---- AESSourceArea ----
                    AESSourceArea.setLineWrap(true);
                    AESSCLP1.setViewportView(AESSourceArea);
                }
                AES.add(AESSCLP1);
                AESSCLP1.setBounds(4, 81, 611, 139);

                //======== AESSCLP2 ========
                {

                    //---- AESResultArea ----
                    AESResultArea.setLineWrap(true);
                    AESSCLP2.setViewportView(AESResultArea);
                }
                AES.add(AESSCLP2);
                AESSCLP2.setBounds(5, 421, 611, 139);

                //---- AESEncryptBT ----
                AESEncryptBT.setText("Encrypt");
                AESEncryptBT.addActionListener(e -> AESEncryptBTActionPerformed(e));
                AES.add(AESEncryptBT);
                AESEncryptBT.setBounds(123, 345, 115, 45);

                //---- AESDecryptBT ----
                AESDecryptBT.setText("Decrypt");
                AESDecryptBT.addActionListener(e -> AESDecryptBTActionPerformed(e));
                AES.add(AESDecryptBT);
                AESDecryptBT.setBounds(398, 345, 115, 45);

                //---- AESLB3 ----
                AESLB3.setText("SecretKey");
                AESLB3.setFont(AESLB3.getFont().deriveFont(AESLB3.getFont().getSize() + 5f));
                AESLB3.setForeground(Color.black);
                AES.add(AESLB3);
                AESLB3.setBounds(75, 244, 85, AESLB3.getPreferredSize().height);

                //======== AESSCLP3 ========
                {

                    //---- AESSecretKeyArea ----
                    AESSecretKeyArea.setLineWrap(true);
                    AESSCLP3.setViewportView(AESSecretKeyArea);
                }
                AES.add(AESSCLP3);
                AESSCLP3.setBounds(32, 274, 170, 40);
                AES.add(AESModeCB);
                AESModeCB.setBounds(233, 274, 95, 40);
                AES.add(AESOUTCB);
                AESOUTCB.setBounds(359, 274, 95, 40);
                AES.add(AESKLengthCB);
                AESKLengthCB.setBounds(485, 274, 95, 40);

                //---- AESLB4 ----
                AESLB4.setText("Mode");
                AESLB4.setFont(AESLB4.getFont().deriveFont(AESLB4.getFont().getSize() + 5f));
                AESLB4.setForeground(Color.black);
                AES.add(AESLB4);
                AESLB4.setBounds(254, 244, 53, 23);

                //---- AESLB5 ----
                AESLB5.setText("AESLayout");
                AESLB5.setFont(AESLB5.getFont().deriveFont(AESLB5.getFont().getSize() + 5f));
                AESLB5.setForeground(Color.black);
                AES.add(AESLB5);
                AESLB5.setBounds(361, 244, 90, 23);

                //---- AESLB6 ----
                AESLB6.setText(" KLength");
                AESLB6.setFont(AESLB6.getFont().deriveFont(AESLB6.getFont().getSize() + 5f));
                AESLB6.setForeground(Color.black);
                AES.add(AESLB6);
                AESLB6.setBounds(492, 244, 80, 23);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < AES.getComponentCount(); i++) {
                        Rectangle bounds = AES.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = AES.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    AES.setMinimumSize(preferredSize);
                    AES.setPreferredSize(preferredSize);
                }
            }
            rootview.add(AES);
            AES.setBounds(265, 5, 620, 590);

            //======== NTLM ========
            {
                NTLM.setBackground(new Color(228, 230, 235));
                NTLM.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                NTLM.setVisible(false);
                NTLM.setLayout(null);

                //---- TieleLBNTLM ----
                TieleLBNTLM.setText("NTLM");
                TieleLBNTLM.setFont(new Font("Jokerman", Font.PLAIN, 35));
                TieleLBNTLM.setForeground(Color.black);
                NTLM.add(TieleLBNTLM);
                TieleLBNTLM.setBounds(249, 35, 112, 54);

                //======== NTLMSCLP1 ========
                {

                    //---- NTLMSource1 ----
                    NTLMSource1.setLineWrap(true);
                    NTLMSource1.addCaretListener(e -> NTLMSource1CaretUpdate(e));
                    NTLMSCLP1.setViewportView(NTLMSource1);
                }
                NTLM.add(NTLMSCLP1);
                NTLMSCLP1.setBounds(5, 129, 611, 140);

                //======== NTLMSCLP2 ========
                {

                    //---- NTLMencode1 ----
                    NTLMencode1.setLineWrap(true);
                    NTLMSCLP2.setViewportView(NTLMencode1);
                }
                NTLM.add(NTLMSCLP2);
                NTLMSCLP2.setBounds(85, 383, 403, 57);

                //======== NTLMSCLP3 ========
                {

                    //---- NTLMencode2 ----
                    NTLMencode2.setLineWrap(true);
                    NTLMSCLP3.setViewportView(NTLMencode2);
                }
                NTLM.add(NTLMSCLP3);
                NTLMSCLP3.setBounds(85, 469, 403, 57);

                //---- NTLMLB1 ----
                NTLMLB1.setText("\u2191   Source");
                NTLMLB1.setBackground(new Color(51, 51, 51));
                NTLMLB1.setForeground(Color.black);
                NTLMLB1.setFont(NTLMLB1.getFont().deriveFont(NTLMLB1.getFont().getSize() + 5f));
                NTLM.add(NTLMLB1);
                NTLMLB1.setBounds(12, 275, 98, 22);

                //---- NTLMLB2 ----
                NTLMLB2.setText("Result      \u2192");
                NTLMLB2.setForeground(Color.black);
                NTLM.add(NTLMLB2);
                NTLMLB2.setBounds(7, 401, 77, 21);

                //---- NTLMLB3 ----
                NTLMLB3.setText("UPResult  \u2192");
                NTLMLB3.setForeground(Color.black);
                NTLM.add(NTLMLB3);
                NTLMLB3.setBounds(7, 487, 77, 21);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < NTLM.getComponentCount(); i++) {
                        Rectangle bounds = NTLM.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = NTLM.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    NTLM.setMinimumSize(preferredSize);
                    NTLM.setPreferredSize(preferredSize);
                }
            }
            rootview.add(NTLM);
            NTLM.setBounds(265, 5, 620, 590);

            //======== Hash ========
            {
                Hash.setBackground(new Color(228, 230, 235));
                Hash.setToolTipText(" ");
                Hash.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                Hash.setVisible(false);
                Hash.setLayout(null);

                //---- TitleLBHASH ----
                TitleLBHASH.setText("HSAH");
                TitleLBHASH.setFont(new Font("Jokerman", Font.PLAIN, 35));
                TitleLBHASH.setForeground(Color.black);
                Hash.add(TitleLBHASH);
                TitleLBHASH.setBounds(262, 35, 97, TitleLBHASH.getPreferredSize().height);

                //======== HASHSCLP1 ========
                {

                    //---- HashSource ----
                    HashSource.setLineWrap(true);
                    HASHSCLP1.setViewportView(HashSource);
                }
                Hash.add(HASHSCLP1);
                HASHSCLP1.setBounds(5, 129, 611, 120);

                //======== HASHSCLP3 ========
                {

                    //---- HashencodeHEX ----
                    HashencodeHEX.setLineWrap(true);
                    HASHSCLP3.setViewportView(HashencodeHEX);
                }
                Hash.add(HASHSCLP3);
                HASHSCLP3.setBounds(85, 392, 403, 40);

                //======== HASHSCLP4 ========
                {

                    //---- HashencodeHEXUP ----
                    HashencodeHEXUP.setLineWrap(true);
                    HASHSCLP4.setViewportView(HashencodeHEXUP);
                }
                Hash.add(HASHSCLP4);
                HASHSCLP4.setBounds(85, 449, 403, 40);

                //======== HASHSCLP5 ========
                {

                    //---- HashencodeBase64 ----
                    HashencodeBase64.setLineWrap(true);
                    HASHSCLP5.setViewportView(HashencodeBase64);
                }
                Hash.add(HASHSCLP5);
                HASHSCLP5.setBounds(85, 506, 403, 40);

                //---- MD5encodebtn ----
                MD5encodebtn.setText("Encrypt");
                MD5encodebtn.addActionListener(e -> button1ActionPerformed(e));
                Hash.add(MD5encodebtn);
                MD5encodebtn.setBounds(515, 464, 80, 61);

                //---- HASHLB1 ----
                HASHLB1.setText("\u2191   Source");
                HASHLB1.setBackground(new Color(51, 51, 51));
                HASHLB1.setForeground(Color.black);
                HASHLB1.setFont(HASHLB1.getFont().deriveFont(HASHLB1.getFont().getSize() + 5f));
                Hash.add(HASHLB1);
                HASHLB1.setBounds(12, 258, 98, 22);

                //---- HASHLB2 ----
                HASHLB2.setText("R/HEX");
                HASHLB2.setForeground(Color.black);
                Hash.add(HASHLB2);
                HASHLB2.setBounds(30, 402, 41, 21);

                //---- HASHLB3 ----
                HASHLB3.setText("UPResult");
                HASHLB3.setForeground(Color.black);
                Hash.add(HASHLB3);
                HASHLB3.setBounds(20, 459, 51, 21);

                //---- HASHLB4 ----
                HASHLB4.setText("R/Base64");
                HASHLB4.setForeground(Color.black);
                Hash.add(HASHLB4);
                HASHLB4.setBounds(16, 516, 55, 21);

                //---- HashfileBT ----
                HashfileBT.setText("File");
                HashfileBT.setEnabled(false);
                HashfileBT.addActionListener(e -> md5fileActionPerformed(e));
                Hash.add(HashfileBT);
                HashfileBT.setBounds(122, 295, 96, 53);
                Hash.add(HashCBox);
                HashCBox.setBounds(506, 401, 98, 36);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < Hash.getComponentCount(); i++) {
                        Rectangle bounds = Hash.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = Hash.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    Hash.setMinimumSize(preferredSize);
                    Hash.setPreferredSize(preferredSize);
                }
            }
            rootview.add(Hash);
            Hash.setBounds(265, 5, 620, 590);

            //======== SM3 ========
            {
                SM3.setBackground(new Color(228, 230, 235));
                SM3.setToolTipText(" ");
                SM3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                SM3.setVisible(false);
                SM3.setLayout(null);

                //---- TitleLBSM3 ----
                TitleLBSM3.setText("SM3");
                TitleLBSM3.setFont(new Font("Jokerman", Font.PLAIN, 35));
                TitleLBSM3.setForeground(Color.black);
                SM3.add(TitleLBSM3);
                TitleLBSM3.setBounds(270, 35, 81, TitleLBSM3.getPreferredSize().height);

                //======== SM3SCLP1 ========
                {

                    //---- SM3Source1 ----
                    SM3Source1.setLineWrap(true);
                    SM3SCLP1.setViewportView(SM3Source1);
                }
                SM3.add(SM3SCLP1);
                SM3SCLP1.setBounds(5, 129, 611, 140);

                //======== SM3SCLP2 ========
                {

                    //---- SM3encode2 ----
                    SM3encode2.setLineWrap(true);
                    SM3SCLP2.setViewportView(SM3encode2);
                }
                SM3.add(SM3SCLP2);
                SM3SCLP2.setBounds(85, 383, 403, 57);

                //======== SM3SCLP3 ========
                {

                    //---- SM3encode3 ----
                    SM3encode3.setLineWrap(true);
                    SM3SCLP3.setViewportView(SM3encode3);
                }
                SM3.add(SM3SCLP3);
                SM3SCLP3.setBounds(85, 469, 403, 57);

                //---- SM3encodebtn ----
                SM3encodebtn.setText("Encrypt");
                SM3encodebtn.addActionListener(e -> SM3encodebtnActionPerformed(e));
                SM3.add(SM3encodebtn);
                SM3encodebtn.setBounds(515, 420, 80, 61);

                //---- SM3LB4 ----
                SM3LB4.setText("\u2191   Source");
                SM3LB4.setBackground(new Color(51, 51, 51));
                SM3LB4.setForeground(Color.black);
                SM3LB4.setFont(SM3LB4.getFont().deriveFont(SM3LB4.getFont().getSize() + 5f));
                SM3.add(SM3LB4);
                SM3LB4.setBounds(12, 275, 98, 22);

                //---- SM3LB5 ----
                SM3LB5.setText("Result      \u2192");
                SM3LB5.setForeground(Color.black);
                SM3.add(SM3LB5);
                SM3LB5.setBounds(7, 401, 77, 21);

                //---- SM3LB6 ----
                SM3LB6.setText("UPResult  \u2192");
                SM3LB6.setForeground(Color.black);
                SM3.add(SM3LB6);
                SM3LB6.setBounds(7, 487, 77, 21);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < SM3.getComponentCount(); i++) {
                        Rectangle bounds = SM3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = SM3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    SM3.setMinimumSize(preferredSize);
                    SM3.setPreferredSize(preferredSize);
                }
            }
            rootview.add(SM3);
            SM3.setBounds(265, 5, 620, 590);

            //======== base64 ========
            {
                base64.setBackground(new Color(228, 230, 235));
                base64.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                base64.setVisible(false);
                base64.setLayout(null);

                //---- TitleLBbase64 ----
                TitleLBbase64.setText("BASE64");
                TitleLBbase64.setFont(new Font("Jokerman", Font.PLAIN, 35));
                TitleLBbase64.setForeground(Color.black);
                base64.add(TitleLBbase64);
                TitleLBbase64.setBounds(240, 35, 143, 54);

                //======== base64SCLP1 ========
                {

                    //---- base64source ----
                    base64source.setLineWrap(true);
                    base64SCLP1.setViewportView(base64source);
                }
                base64.add(base64SCLP1);
                base64SCLP1.setBounds(45, 120, 530, 151);

                //======== base64SCLP2 ========
                {

                    //---- base64code ----
                    base64code.setLineWrap(true);
                    base64SCLP2.setViewportView(base64code);
                }
                base64.add(base64SCLP2);
                base64SCLP2.setBounds(45, 410, 530, 151);

                //---- base64decode ----
                base64decode.setText("DeCode");
                base64decode.addActionListener(e -> base64decodeActionPerformed(e));
                base64.add(base64decode);
                base64decode.setBounds(352, 318, 115, 45);

                //---- base64encode ----
                base64encode.setText("EnCode");
                base64encode.addActionListener(e -> base64encodeActionPerformed(e));
                base64.add(base64encode);
                base64encode.setBounds(155, 318, 115, 45);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < base64.getComponentCount(); i++) {
                        Rectangle bounds = base64.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = base64.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    base64.setMinimumSize(preferredSize);
                    base64.setPreferredSize(preferredSize);
                }
            }
            rootview.add(base64);
            base64.setBounds(265, 5, 620, 590);

            //======== ROT13 ========
            {
                ROT13.setBackground(new Color(228, 230, 235));
                ROT13.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                ROT13.setVisible(false);
                ROT13.setLayout(null);

                //---- TitleLBROT ----
                TitleLBROT.setText("ROT13");
                TitleLBROT.setFont(new Font("Jokerman", Font.PLAIN, 35));
                TitleLBROT.setForeground(Color.black);
                ROT13.add(TitleLBROT);
                TitleLBROT.setBounds(254, 35, 113, 54);

                //======== ROT13SCLP1 ========
                {
                    ROT13SCLP1.setBackground(new Color(60, 63, 65, 160));

                    //---- ROT13source ----
                    ROT13source.setLineWrap(true);
                    ROT13source.addCaretListener(e -> ROT13sourceCaretUpdate(e));
                    ROT13SCLP1.setViewportView(ROT13source);
                }
                ROT13.add(ROT13SCLP1);
                ROT13SCLP1.setBounds(45, 120, 530, 151);

                //======== ROT13SCLP2 ========
                {

                    //---- ROT13edcode ----
                    ROT13edcode.setLineWrap(true);
                    ROT13SCLP2.setViewportView(ROT13edcode);
                }
                ROT13.add(ROT13SCLP2);
                ROT13SCLP2.setBounds(45, 410, 530, 151);

                //---- ROT13CBOX ----
                ROT13CBOX.addItemListener(e -> ROT13CBOXItemStateChanged(e));
                ROT13.add(ROT13CBOX);
                ROT13CBOX.setBounds(248, 318, 125, 45);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < ROT13.getComponentCount(); i++) {
                        Rectangle bounds = ROT13.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = ROT13.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    ROT13.setMinimumSize(preferredSize);
                    ROT13.setPreferredSize(preferredSize);
                }
            }
            rootview.add(ROT13);
            ROT13.setBounds(265, 5, 620, 590);

            //======== Rail_fence ========
            {
                Rail_fence.setBackground(new Color(228, 230, 235));
                Rail_fence.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                Rail_fence.setVisible(false);
                Rail_fence.setLayout(null);

                //---- TitleLBRai_Fence ----
                TitleLBRai_Fence.setText("Rail Fence");
                TitleLBRai_Fence.setFont(new Font("Jokerman", Font.PLAIN, 35));
                TitleLBRai_Fence.setForeground(Color.black);
                Rail_fence.add(TitleLBRai_Fence);
                TitleLBRai_Fence.setBounds(221, 35, 178, 54);

                //======== Rail_fenceSCLP1 ========
                {

                    //---- Rail_fenceSource ----
                    Rail_fenceSource.setLineWrap(true);
                    Rail_fenceSCLP1.setViewportView(Rail_fenceSource);
                }
                Rail_fence.add(Rail_fenceSCLP1);
                Rail_fenceSCLP1.setBounds(45, 120, 530, 151);

                //======== Rail_fenceSCLP2 ========
                {

                    //---- Rail_fenceDecode ----
                    Rail_fenceDecode.setLineWrap(true);
                    Rail_fenceSCLP2.setViewportView(Rail_fenceDecode);
                }
                Rail_fence.add(Rail_fenceSCLP2);
                Rail_fenceSCLP2.setBounds(45, 410, 530, 151);

                //---- Rail_fenceBT1 ----
                Rail_fenceBT1.setText("Encrypt");
                Rail_fenceBT1.addActionListener(e -> Rail_fenceBT1ActionPerformed(e));
                Rail_fence.add(Rail_fenceBT1);
                Rail_fenceBT1.setBounds(104, 318, 115, 45);

                //---- Rail_fenceBT2 ----
                Rail_fenceBT2.setText("Decrypt");
                Rail_fenceBT2.addActionListener(e -> Rail_fenceBT2ActionPerformed(e));
                Rail_fence.add(Rail_fenceBT2);
                Rail_fenceBT2.setBounds(407, 318, 115, 45);

                //---- Rail_fenceSpinner1 ----
                Rail_fenceSpinner1.setModel(new SpinnerNumberModel(2, null, null, 1));
                Rail_fence.add(Rail_fenceSpinner1);
                Rail_fenceSpinner1.setBounds(263, 321, 100, 38);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < Rail_fence.getComponentCount(); i++) {
                        Rectangle bounds = Rail_fence.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = Rail_fence.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    Rail_fence.setMinimumSize(preferredSize);
                    Rail_fence.setPreferredSize(preferredSize);
                }
            }
            rootview.add(Rail_fence);
            Rail_fence.setBounds(265, 5, 620, 590);

            //======== Atbash ========
            {
                Atbash.setBackground(new Color(228, 230, 235));
                Atbash.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                Atbash.setVisible(false);
                Atbash.setLayout(null);

                //---- TitleLBAtbash ----
                TitleLBAtbash.setText("Atabash");
                TitleLBAtbash.setFont(new Font("Jokerman", Font.PLAIN, 35));
                TitleLBAtbash.setForeground(Color.black);
                Atbash.add(TitleLBAtbash);
                TitleLBAtbash.setBounds(236, 35, 148, 54);

                //======== AtbashSCLP1 ========
                {

                    //---- AtbashSourceArea ----
                    AtbashSourceArea.setLineWrap(true);
                    AtbashSourceArea.addCaretListener(e -> AtbashSourceAreaCaretUpdate(e));
                    AtbashSCLP1.setViewportView(AtbashSourceArea);
                }
                Atbash.add(AtbashSCLP1);
                AtbashSCLP1.setBounds(45, 136, 530, 151);

                //======== AtbashSCLP2 ========
                {

                    //---- AtbashDeCodeArea ----
                    AtbashDeCodeArea.setLineWrap(true);
                    AtbashSCLP2.setViewportView(AtbashDeCodeArea);
                }
                Atbash.add(AtbashSCLP2);
                AtbashSCLP2.setBounds(45, 374, 530, 151);

                //---- AtbashLB1 ----
                AtbashLB1.setText("\u2193  Atbash");
                AtbashLB1.setFont(AtbashLB1.getFont().deriveFont(AtbashLB1.getFont().getSize() + 5f));
                AtbashLB1.setForeground(Color.black);
                Atbash.add(AtbashLB1);
                AtbashLB1.setBounds(465, 350, 155, 23);

                //---- AtbashLB2 ----
                AtbashLB2.setText("Source  \u2191");
                AtbashLB2.setForeground(Color.black);
                AtbashLB2.setFont(AtbashLB2.getFont().deriveFont(AtbashLB2.getFont().getSize() + 5f));
                Atbash.add(AtbashLB2);
                AtbashLB2.setBounds(65, 289, 155, 23);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < Atbash.getComponentCount(); i++) {
                        Rectangle bounds = Atbash.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = Atbash.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    Atbash.setMinimumSize(preferredSize);
                    Atbash.setPreferredSize(preferredSize);
                }
            }
            rootview.add(Atbash);
            Atbash.setBounds(265, 5, 620, 590);

            //======== Vigenere ========
            {
                Vigenere.setBackground(new Color(228, 230, 235));
                Vigenere.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                Vigenere.setVisible(false);
                Vigenere.setLayout(null);

                //---- VigenereLB ----
                VigenereLB.setText("Vigenere");
                VigenereLB.setFont(new Font("Jokerman", Font.PLAIN, 35));
                VigenereLB.setForeground(Color.black);
                Vigenere.add(VigenereLB);
                VigenereLB.setBounds(230, 35, 161, 54);

                //======== VigenereSCLP1 ========
                {

                    //---- VigenereSorceArea ----
                    VigenereSorceArea.setLineWrap(true);
                    VigenereSCLP1.setViewportView(VigenereSorceArea);
                }
                Vigenere.add(VigenereSCLP1);
                VigenereSCLP1.setBounds(45, 120, 530, 151);

                //======== VigenereSCLP2 ========
                {

                    //---- VigenereResultArea ----
                    VigenereResultArea.setLineWrap(true);
                    VigenereSCLP2.setViewportView(VigenereResultArea);
                }
                Vigenere.add(VigenereSCLP2);
                VigenereSCLP2.setBounds(45, 410, 530, 151);

                //---- VigenereEncodeBT ----
                VigenereEncodeBT.setText("Encrypt");
                VigenereEncodeBT.addActionListener(e -> VigenereEncodeBTActionPerformed(e));
                Vigenere.add(VigenereEncodeBT);
                VigenereEncodeBT.setBounds(76, 318, 115, 45);

                //---- VigenereDecoeBT ----
                VigenereDecoeBT.setText("Decrypt");
                VigenereDecoeBT.addActionListener(e -> VigenereDecoeBTActionPerformed(e));
                Vigenere.add(VigenereDecoeBT);
                VigenereDecoeBT.setBounds(429, 318, 115, 45);

                //======== VigenereSCLP3 ========
                {

                    //---- VigenereKeyArea ----
                    VigenereKeyArea.setLineWrap(true);
                    VigenereSCLP3.setViewportView(VigenereKeyArea);
                }
                Vigenere.add(VigenereSCLP3);
                VigenereSCLP3.setBounds(230, 318, 160, 45);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < Vigenere.getComponentCount(); i++) {
                        Rectangle bounds = Vigenere.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = Vigenere.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    Vigenere.setMinimumSize(preferredSize);
                    Vigenere.setPreferredSize(preferredSize);
                }
            }
            rootview.add(Vigenere);
            Vigenere.setBounds(265, 5, 620, 590);

            //======== morse ========
            {
                morse.setBackground(new Color(228, 230, 235));
                morse.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                morse.setVisible(false);
                morse.setLayout(null);

                //---- TitleLBMorse ----
                TitleLBMorse.setText("Morse Code");
                TitleLBMorse.setFont(new Font("Jokerman", Font.PLAIN, 35));
                TitleLBMorse.setForeground(Color.black);
                morse.add(TitleLBMorse);
                TitleLBMorse.setBounds(202, 35, 216, 54);

                //======== morseSCLP1 ========
                {

                    //---- MorseSource ----
                    MorseSource.setLineWrap(true);
                    morseSCLP1.setViewportView(MorseSource);
                }
                morse.add(morseSCLP1);
                morseSCLP1.setBounds(45, 120, 530, 151);

                //======== morseSCLP2 ========
                {

                    //---- MorseDecode ----
                    MorseDecode.setLineWrap(true);
                    morseSCLP2.setViewportView(MorseDecode);
                }
                morse.add(morseSCLP2);
                morseSCLP2.setBounds(45, 410, 530, 151);

                //---- MorseEnCodeBT ----
                MorseEnCodeBT.setText("EnCode");
                MorseEnCodeBT.addActionListener(e -> MorseEnCodeBTActionPerformed(e));
                morse.add(MorseEnCodeBT);
                MorseEnCodeBT.setBounds(155, 318, 115, 45);

                //---- MorseDeCodeBT ----
                MorseDeCodeBT.setText("DeCode");
                MorseDeCodeBT.addActionListener(e -> MorseDeCodeBTActionPerformed(e));
                morse.add(MorseDeCodeBT);
                MorseDeCodeBT.setBounds(352, 318, 115, 45);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < morse.getComponentCount(); i++) {
                        Rectangle bounds = morse.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = morse.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    morse.setMinimumSize(preferredSize);
                    morse.setPreferredSize(preferredSize);
                }
            }
            rootview.add(morse);
            morse.setBounds(265, 5, 620, 590);

            //======== URL ========
            {
                URL.setBackground(new Color(228, 230, 235));
                URL.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                URL.setVisible(false);
                URL.setLayout(null);

                //---- TitleLBURL ----
                TitleLBURL.setText("URL");
                TitleLBURL.setFont(new Font("Jokerman", Font.PLAIN, 35));
                TitleLBURL.setForeground(Color.black);
                URL.add(TitleLBURL);
                TitleLBURL.setBounds(271, 35, 78, 54);

                //======== URLSCLP1 ========
                {

                    //---- URLSourceArea ----
                    URLSourceArea.setLineWrap(true);
                    URLSCLP1.setViewportView(URLSourceArea);
                }
                URL.add(URLSCLP1);
                URLSCLP1.setBounds(45, 120, 530, 151);

                //======== URLSCLP2 ========
                {

                    //---- URLDeCodeArea ----
                    URLDeCodeArea.setLineWrap(true);
                    URLSCLP2.setViewportView(URLDeCodeArea);
                }
                URL.add(URLSCLP2);
                URLSCLP2.setBounds(45, 410, 530, 151);

                //---- URLEnCodeBT ----
                URLEnCodeBT.setText("EnCode");
                URLEnCodeBT.addActionListener(e -> URLEnCodeBTActionPerformed(e));
                URL.add(URLEnCodeBT);
                URLEnCodeBT.setBounds(155, 318, 115, 45);

                //---- URLDeCodeBT ----
                URLDeCodeBT.setText("DeCode");
                URLDeCodeBT.addActionListener(e -> URLDeCodeBTActionPerformed(e));
                URL.add(URLDeCodeBT);
                URLDeCodeBT.setBounds(352, 318, 115, 45);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < URL.getComponentCount(); i++) {
                        Rectangle bounds = URL.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = URL.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    URL.setMinimumSize(preferredSize);
                    URL.setPreferredSize(preferredSize);
                }
            }
            rootview.add(URL);
            URL.setBounds(265, 5, 620, 590);

            //======== HEX ========
            {
                HEX.setBackground(new Color(228, 230, 235));
                HEX.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                HEX.setVisible(false);
                HEX.setLayout(null);

                //---- TitleLBHEX ----
                TitleLBHEX.setText("HEX");
                TitleLBHEX.setFont(new Font("Jokerman", Font.PLAIN, 35));
                TitleLBHEX.setForeground(Color.black);
                HEX.add(TitleLBHEX);
                TitleLBHEX.setBounds(271, 35, 78, 54);

                //======== HEXSCLP1 ========
                {

                    //---- HEXSourceArea ----
                    HEXSourceArea.setLineWrap(true);
                    HEXSCLP1.setViewportView(HEXSourceArea);
                }
                HEX.add(HEXSCLP1);
                HEXSCLP1.setBounds(45, 120, 530, 151);

                //======== HEXSCLP2 ========
                {

                    //---- HEXDeCodeArea ----
                    HEXDeCodeArea.setLineWrap(true);
                    HEXSCLP2.setViewportView(HEXDeCodeArea);
                }
                HEX.add(HEXSCLP2);
                HEXSCLP2.setBounds(45, 410, 530, 151);

                //---- HEXEnCodeBT ----
                HEXEnCodeBT.setText("EnCode");
                HEXEnCodeBT.addActionListener(e -> HEXEnCodeBTActionPerformed(e));
                HEX.add(HEXEnCodeBT);
                HEXEnCodeBT.setBounds(104, 318, 115, 45);

                //---- HEXDeCodeBT ----
                HEXDeCodeBT.setText("DeCode");
                HEXDeCodeBT.addActionListener(e -> HEXDeCodeBTActionPerformed(e));
                HEX.add(HEXDeCodeBT);
                HEXDeCodeBT.setBounds(407, 318, 115, 45);
                HEX.add(HEXDelCBox);
                HEXDelCBox.setBounds(249, 321, 128, 38);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < HEX.getComponentCount(); i++) {
                        Rectangle bounds = HEX.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = HEX.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    HEX.setMinimumSize(preferredSize);
                    HEX.setPreferredSize(preferredSize);
                }
            }
            rootview.add(HEX);
            HEX.setBounds(265, 5, 620, 590);

            //======== ASCII ========
            {
                ASCII.setBackground(new Color(228, 230, 235));
                ASCII.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                ASCII.setVisible(false);
                ASCII.setLayout(null);

                //---- TitleLBASCII ----
                TitleLBASCII.setText("ASCII");
                TitleLBASCII.setFont(new Font("Jokerman", Font.PLAIN, 35));
                TitleLBASCII.setForeground(Color.black);
                ASCII.add(TitleLBASCII);
                TitleLBASCII.setBounds(259, 35, 103, 54);

                //======== ASCIISCLP1 ========
                {

                    //---- ASCIISource ----
                    ASCIISource.setLineWrap(true);
                    ASCIISCLP1.setViewportView(ASCIISource);
                }
                ASCII.add(ASCIISCLP1);
                ASCIISCLP1.setBounds(45, 120, 530, 151);

                //======== ASCIISCLP2 ========
                {

                    //---- ASCIIDeCode ----
                    ASCIIDeCode.setLineWrap(true);
                    ASCIISCLP2.setViewportView(ASCIIDeCode);
                }
                ASCII.add(ASCIISCLP2);
                ASCIISCLP2.setBounds(45, 410, 530, 151);

                //---- ASCIIEncodeBT ----
                ASCIIEncodeBT.setText("EnCode");
                ASCIIEncodeBT.addActionListener(e -> ASKIIEncodeBTActionPerformed(e));
                ASCII.add(ASCIIEncodeBT);
                ASCIIEncodeBT.setBounds(104, 318, 115, 45);

                //---- ASCIIDeCodeBT ----
                ASCIIDeCodeBT.setText("DeCode");
                ASCIIDeCodeBT.addActionListener(e -> ASKIIDeCodeBTActionPerformed(e));
                ASCII.add(ASCIIDeCodeBT);
                ASCIIDeCodeBT.setBounds(407, 318, 115, 45);
                ASCII.add(ASCIICBox);
                ASCIICBox.setBounds(249, 321, 128, 38);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < ASCII.getComponentCount(); i++) {
                        Rectangle bounds = ASCII.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = ASCII.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    ASCII.setMinimumSize(preferredSize);
                    ASCII.setPreferredSize(preferredSize);
                }
            }
            rootview.add(ASCII);
            ASCII.setBounds(265, 5, 620, 590);

            //======== Conversion ========
            {
                Conversion.setBackground(new Color(228, 230, 235));
                Conversion.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                Conversion.setVisible(false);
                Conversion.setLayout(null);

                //---- TitleLBConversion ----
                TitleLBConversion.setText("Conversion");
                TitleLBConversion.setFont(new Font("Jokerman", Font.PLAIN, 35));
                TitleLBConversion.setForeground(Color.black);
                Conversion.add(TitleLBConversion);
                TitleLBConversion.setBounds(208, 10, 203, 54);

                //======== ConversionSCLP1 ========
                {

                    //---- BinaryArea ----
                    BinaryArea.setLineWrap(true);
                    ConversionSCLP1.setViewportView(BinaryArea);
                }
                Conversion.add(ConversionSCLP1);
                ConversionSCLP1.setBounds(18, 97, 485, 80);

                //======== ConversionSCLP2 ========
                {

                    //---- OctalArea ----
                    OctalArea.setLineWrap(true);
                    ConversionSCLP2.setViewportView(OctalArea);
                }
                Conversion.add(ConversionSCLP2);
                ConversionSCLP2.setBounds(18, 219, 485, 80);

                //======== ConversionSCLP3 ========
                {

                    //---- DecimalArea ----
                    DecimalArea.setLineWrap(true);
                    ConversionSCLP3.setViewportView(DecimalArea);
                }
                Conversion.add(ConversionSCLP3);
                ConversionSCLP3.setBounds(18, 341, 485, 80);

                //======== ConversionSCLP4 ========
                {

                    //---- HexadecimalArea ----
                    HexadecimalArea.setLineWrap(true);
                    ConversionSCLP4.setViewportView(HexadecimalArea);
                }
                Conversion.add(ConversionSCLP4);
                ConversionSCLP4.setBounds(18, 463, 485, 80);

                //---- ConversionLB1 ----
                ConversionLB1.setText("Oct");
                ConversionLB1.setForeground(Color.black);
                ConversionLB1.setFont(ConversionLB1.getFont().deriveFont(ConversionLB1.getFont().getSize() + 3f));
                Conversion.add(ConversionLB1);
                ConversionLB1.setBounds(20, 193, 60, 23);

                //---- ConversionLB2 ----
                ConversionLB2.setText("Dec");
                ConversionLB2.setForeground(Color.black);
                ConversionLB2.setFont(ConversionLB2.getFont().deriveFont(ConversionLB2.getFont().getSize() + 3f));
                Conversion.add(ConversionLB2);
                ConversionLB2.setBounds(20, 316, 60, 23);

                //---- ConversionLB3 ----
                ConversionLB3.setText("Bin");
                ConversionLB3.setForeground(Color.black);
                ConversionLB3.setFont(ConversionLB3.getFont().deriveFont(ConversionLB3.getFont().getSize() + 3f));
                Conversion.add(ConversionLB3);
                ConversionLB3.setBounds(20, 72, 60, 23);

                //---- ConversionLB4 ----
                ConversionLB4.setText("Hex/O");
                ConversionLB4.setForeground(Color.black);
                ConversionLB4.setFont(ConversionLB4.getFont().deriveFont(ConversionLB4.getFont().getSize() + 3f));
                Conversion.add(ConversionLB4);
                ConversionLB4.setBounds(20, 439, 60, 23);

                //---- BinBT ----
                BinBT.setText("BIN");
                BinBT.addActionListener(e -> BinBTActionPerformed(e));
                Conversion.add(BinBT);
                BinBT.setBounds(523, 118, 78, 38);

                //---- OctBT ----
                OctBT.setText("OCT");
                OctBT.addActionListener(e -> OctBTActionPerformed(e));
                Conversion.add(OctBT);
                OctBT.setBounds(523, 240, 78, 38);

                //---- DecBT ----
                DecBT.setText("DEC");
                DecBT.addActionListener(e -> DecBTActionPerformed(e));
                Conversion.add(DecBT);
                DecBT.setBounds(523, 362, 78, 38);

                //---- HexBT ----
                HexBT.setText("HEX/O");
                HexBT.addActionListener(e -> HexBTActionPerformed(e));
                Conversion.add(HexBT);
                HexBT.setBounds(523, 501, 78, 38);

                //---- ConversionCBox ----
                ConversionCBox.setMaximumRowCount(4);
                Conversion.add(ConversionCBox);
                ConversionCBox.setBounds(523, 464, 78, ConversionCBox.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < Conversion.getComponentCount(); i++) {
                        Rectangle bounds = Conversion.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = Conversion.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    Conversion.setMinimumSize(preferredSize);
                    Conversion.setPreferredSize(preferredSize);
                }
            }
            rootview.add(Conversion);
            Conversion.setBounds(265, 5, 620, 590);

            //======== Unicode ========
            {
                Unicode.setBackground(new Color(228, 230, 235));
                Unicode.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                Unicode.setVisible(false);
                Unicode.setLayout(null);

                //---- TitleLBUnicode ----
                TitleLBUnicode.setText("Unicode");
                TitleLBUnicode.setFont(new Font("Jokerman", Font.PLAIN, 35));
                TitleLBUnicode.setForeground(Color.black);
                Unicode.add(TitleLBUnicode);
                TitleLBUnicode.setBounds(235, 35, 150, 54);

                //======== UnicodeSCLP1 ========
                {

                    //---- UnicodeSourceArea ----
                    UnicodeSourceArea.setLineWrap(true);
                    UnicodeSCLP1.setViewportView(UnicodeSourceArea);
                }
                Unicode.add(UnicodeSCLP1);
                UnicodeSCLP1.setBounds(45, 120, 530, 151);

                //======== UnicodeSCLP2 ========
                {

                    //---- UnicodeDeCodeArea ----
                    UnicodeDeCodeArea.setLineWrap(true);
                    UnicodeSCLP2.setViewportView(UnicodeDeCodeArea);
                }
                Unicode.add(UnicodeSCLP2);
                UnicodeSCLP2.setBounds(45, 410, 530, 151);

                //---- UnicodeEnCodeBT ----
                UnicodeEnCodeBT.setText("EnCode");
                UnicodeEnCodeBT.addActionListener(e -> UnicodeEnCodeBTActionPerformed(e));
                Unicode.add(UnicodeEnCodeBT);
                UnicodeEnCodeBT.setBounds(155, 318, 115, 45);

                //---- UnicodeDeCodeBT ----
                UnicodeDeCodeBT.setText("DeCode");
                UnicodeDeCodeBT.addActionListener(e -> UnicodeDeCodeBTActionPerformed(e));
                Unicode.add(UnicodeDeCodeBT);
                UnicodeDeCodeBT.setBounds(352, 318, 115, 45);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < Unicode.getComponentCount(); i++) {
                        Rectangle bounds = Unicode.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = Unicode.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    Unicode.setMinimumSize(preferredSize);
                    Unicode.setPreferredSize(preferredSize);
                }
            }
            rootview.add(Unicode);
            Unicode.setBounds(265, 5, 620, 590);

            //======== Template ========
            {
                Template.setBackground(new Color(228, 230, 235));
                Template.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                Template.setVisible(false);
                Template.setLayout(null);

                //---- TitleLBTEMP ----
                TitleLBTEMP.setText("TEMP");
                TitleLBTEMP.setFont(new Font("Jokerman", Font.PLAIN, 35));
                TitleLBTEMP.setForeground(Color.black);
                Template.add(TitleLBTEMP);
                TitleLBTEMP.setBounds(258, 35, 105, 54);

                //======== TemplateSCLP1 ========
                {

                    //---- TempArea1 ----
                    TempArea1.setLineWrap(true);
                    TemplateSCLP1.setViewportView(TempArea1);
                }
                Template.add(TemplateSCLP1);
                TemplateSCLP1.setBounds(45, 120, 530, 151);

                //======== TemplateSCLP2 ========
                {

                    //---- TempArea2 ----
                    TempArea2.setLineWrap(true);
                    TemplateSCLP2.setViewportView(TempArea2);
                }
                Template.add(TemplateSCLP2);
                TemplateSCLP2.setBounds(45, 410, 530, 151);

                //---- Tempbutton2 ----
                Tempbutton2.setText("EnCode");
                Template.add(Tempbutton2);
                Tempbutton2.setBounds(155, 318, 115, 45);

                //---- Tempbutton3 ----
                Tempbutton3.setText("DeCode");
                Template.add(Tempbutton3);
                Tempbutton3.setBounds(352, 318, 115, 45);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < Template.getComponentCount(); i++) {
                        Rectangle bounds = Template.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = Template.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    Template.setMinimumSize(preferredSize);
                    Template.setPreferredSize(preferredSize);
                }
            }
            rootview.add(Template);
            Template.setBounds(265, 5, 620, 590);
            rootview.add(Jtreee);
            Jtreee.setBounds(5, 3, 256, 593);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < rootview.getComponentCount(); i++) {
                    Rectangle bounds = rootview.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = rootview.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                rootview.setMinimumSize(preferredSize);
                rootview.setPreferredSize(preferredSize);
            }
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel rootview;
    private JPanel index;
    private JLabel IndexLB;
    private JPanel index2;
    private JPanel JWT;
    private JLabel TitleLBJWT;
    private JScrollPane JWTSCLP1;
    private JTextArea JWTHeaderArea;
    private JScrollPane JWTSCLP2;
    private JTextArea JWTPayloadArea;
    private JScrollPane JWTSCLP3;
    private JTextArea JWTSignatureArea;
    private JScrollPane JWTSCLP4;
    private JTextArea JWTTokenArea;
    private JLabel JWTLB1;
    private JLabel JWTLB2;
    private JLabel JWTLB3;
    private JLabel JWTLB4;
    private JButton JWTEncodeBT;
    private JButton JWTDecodeBT;
    private JPanel MailOnceCheck;
    private JButton MailOnceCheckBT;
    private JLabel MailOnceCheckLB1;
    private JLabel MailOnceCheckAffirming;
    private JFormattedTextField MailOnceCheckField;
    private JLabel MailOnceCheckResult;
    private JPanel AES;
    private JLabel TitleLBAES;
    private JScrollPane AESSCLP1;
    private JTextArea AESSourceArea;
    private JScrollPane AESSCLP2;
    private JTextArea AESResultArea;
    private JButton AESEncryptBT;
    private JButton AESDecryptBT;
    private JLabel AESLB3;
    private JScrollPane AESSCLP3;
    private JTextArea AESSecretKeyArea;
    private JComboBox AESModeCB;
    private JComboBox AESOUTCB;
    private JComboBox AESKLengthCB;
    private JLabel AESLB4;
    private JLabel AESLB5;
    private JLabel AESLB6;
    private JPanel NTLM;
    private JLabel TieleLBNTLM;
    private JScrollPane NTLMSCLP1;
    private JTextArea NTLMSource1;
    private JScrollPane NTLMSCLP2;
    private JTextArea NTLMencode1;
    private JScrollPane NTLMSCLP3;
    private JTextArea NTLMencode2;
    private JLabel NTLMLB1;
    private JLabel NTLMLB2;
    private JLabel NTLMLB3;
    private JPanel Hash;
    private JLabel TitleLBHASH;
    private JScrollPane HASHSCLP1;
    private JTextArea HashSource;
    private JScrollPane HASHSCLP3;
    private JTextArea HashencodeHEX;
    private JScrollPane HASHSCLP4;
    private JTextArea HashencodeHEXUP;
    private JScrollPane HASHSCLP5;
    private JTextArea HashencodeBase64;
    private JButton MD5encodebtn;
    private JLabel HASHLB1;
    private JLabel HASHLB2;
    private JLabel HASHLB3;
    private JLabel HASHLB4;
    private JButton HashfileBT;
    private JComboBox HashCBox;
    private JPanel SM3;
    private JLabel TitleLBSM3;
    private JScrollPane SM3SCLP1;
    private JTextArea SM3Source1;
    private JScrollPane SM3SCLP2;
    private JTextArea SM3encode2;
    private JScrollPane SM3SCLP3;
    private JTextArea SM3encode3;
    private JButton SM3encodebtn;
    private JLabel SM3LB4;
    private JLabel SM3LB5;
    private JLabel SM3LB6;
    private JPanel base64;
    private JLabel TitleLBbase64;
    private JScrollPane base64SCLP1;
    private JTextArea base64source;
    private JScrollPane base64SCLP2;
    private JTextArea base64code;
    private JButton base64decode;
    private JButton base64encode;
    private JPanel ROT13;
    private JLabel TitleLBROT;
    private JScrollPane ROT13SCLP1;
    private JTextArea ROT13source;
    private JScrollPane ROT13SCLP2;
    private JTextArea ROT13edcode;
    private JComboBox ROT13CBOX;
    private JPanel Rail_fence;
    private JLabel TitleLBRai_Fence;
    private JScrollPane Rail_fenceSCLP1;
    private JTextArea Rail_fenceSource;
    private JScrollPane Rail_fenceSCLP2;
    private JTextArea Rail_fenceDecode;
    private JButton Rail_fenceBT1;
    private JButton Rail_fenceBT2;
    private JSpinner Rail_fenceSpinner1;
    private JPanel Atbash;
    private JLabel TitleLBAtbash;
    private JScrollPane AtbashSCLP1;
    private JTextArea AtbashSourceArea;
    private JScrollPane AtbashSCLP2;
    private JTextArea AtbashDeCodeArea;
    private JLabel AtbashLB1;
    private JLabel AtbashLB2;
    private JPanel Vigenere;
    private JLabel VigenereLB;
    private JScrollPane VigenereSCLP1;
    private JTextArea VigenereSorceArea;
    private JScrollPane VigenereSCLP2;
    private JTextArea VigenereResultArea;
    private JButton VigenereEncodeBT;
    private JButton VigenereDecoeBT;
    private JScrollPane VigenereSCLP3;
    private JTextArea VigenereKeyArea;
    private JPanel morse;
    private JLabel TitleLBMorse;
    private JScrollPane morseSCLP1;
    private JTextArea MorseSource;
    private JScrollPane morseSCLP2;
    private JTextArea MorseDecode;
    private JButton MorseEnCodeBT;
    private JButton MorseDeCodeBT;
    private JPanel URL;
    private JLabel TitleLBURL;
    private JScrollPane URLSCLP1;
    private JTextArea URLSourceArea;
    private JScrollPane URLSCLP2;
    private JTextArea URLDeCodeArea;
    private JButton URLEnCodeBT;
    private JButton URLDeCodeBT;
    private JPanel HEX;
    private JLabel TitleLBHEX;
    private JScrollPane HEXSCLP1;
    private JTextArea HEXSourceArea;
    private JScrollPane HEXSCLP2;
    private JTextArea HEXDeCodeArea;
    private JButton HEXEnCodeBT;
    private JButton HEXDeCodeBT;
    private JComboBox HEXDelCBox;
    private JPanel ASCII;
    private JLabel TitleLBASCII;
    private JScrollPane ASCIISCLP1;
    private JTextArea ASCIISource;
    private JScrollPane ASCIISCLP2;
    private JTextArea ASCIIDeCode;
    private JButton ASCIIEncodeBT;
    private JButton ASCIIDeCodeBT;
    private JComboBox ASCIICBox;
    private JPanel Conversion;
    private JLabel TitleLBConversion;
    private JScrollPane ConversionSCLP1;
    private JTextArea BinaryArea;
    private JScrollPane ConversionSCLP2;
    private JTextArea OctalArea;
    private JScrollPane ConversionSCLP3;
    private JTextArea DecimalArea;
    private JScrollPane ConversionSCLP4;
    private JTextArea HexadecimalArea;
    private JLabel ConversionLB1;
    private JLabel ConversionLB2;
    private JLabel ConversionLB3;
    private JLabel ConversionLB4;
    private JButton BinBT;
    private JButton OctBT;
    private JButton DecBT;
    private JButton HexBT;
    private JComboBox ConversionCBox;
    private JPanel Unicode;
    private JLabel TitleLBUnicode;
    private JScrollPane UnicodeSCLP1;
    private JTextArea UnicodeSourceArea;
    private JScrollPane UnicodeSCLP2;
    private JTextArea UnicodeDeCodeArea;
    private JButton UnicodeEnCodeBT;
    private JButton UnicodeDeCodeBT;
    private JPanel Template;
    private JLabel TitleLBTEMP;
    private JScrollPane TemplateSCLP1;
    private JTextArea TempArea1;
    private JScrollPane TemplateSCLP2;
    private JTextArea TempArea2;
    private JButton Tempbutton2;
    private JButton Tempbutton3;
    private JScrollPane Jtreee;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    //Jtree
    private NodeAdd na = new NodeAdd();
    private JTree ta = new JTree(na.root);// 使用根节点创建树组件

    private void NodeSelect()
    {
        ta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //super.mouseClicked(e);
                DefaultMutableTreeNode dmt = (DefaultMutableTreeNode) ta.getLastSelectedPathComponent();
                // 如果是叶子结点
                if (dmt.isLeaf()) {
                    // 判断
                    switch(dmt.toString())// 叶子结点的字符串
                    {
                        //case "Index": PanelHide();index.setVisible(true);break;
                        case "Disposable Email Check":PanelHide();MailOnceCheck.setVisible(true);break;
                        case "JWT":PanelHide();JWT.setVisible(true);break;
                        //Modern
                        case "AES":PanelHide();AES.setVisible(true);break;
                        case "Hash": PanelHide();Hash.setVisible(true);break;//显示单个需要的panel
                        case "NTLM":PanelHide();NTLM.setVisible(true);break;
                        case "SM3":PanelHide();SM3.setVisible(true);break;
                        //Classical
                        case "ROT13": PanelHide();ROT13.setVisible(true);break;
                        case "Rail fence(栅栏密码)": PanelHide();Rail_fence.setVisible(true);break;
                        case "Atbash(埃特巴什码)":PanelHide();Atbash.setVisible(true);break;
                        case "Vigenere(维吉尼亚密码)":PanelHide();Vigenere.setVisible(true);break;
                        //Coding
                        case "Base64": PanelHide();base64.setVisible(true);break;
                        case "Morse Code": PanelHide();morse.setVisible(true);break;
                        case "URL": PanelHide();URL.setVisible(true);break;
                        case "HEX": PanelHide();HEX.setVisible(true);break;
                        case "ASCII": PanelHide();ASCII.setVisible(true);break;
                        case "Base Conversion": PanelHide();Conversion.setVisible(true);break;
                        case "Unicode":PanelHide();Unicode.setVisible(true);break;
                        default: break;
                    }
                }//pannel切换
            }
        });
    }

    private void PanelHide()
    {
        int count = rootview.getComponentCount();//获取这个panel内的所有控件
        for (int i = 0; i < count; i++) {
            Object obj = rootview.getComponent(i);
            if (obj instanceof JPanel) {
                ((JPanel) obj).setVisible(false);//隐藏全部panel
            }
        }
    }

    private void CBoxAddItem()
    {
        for(int i=13;i<=25;i++)//combobox添加node
        {
            String ii = String.valueOf(i);
            ROT13CBOX.addItem("ROT"+ii);
        }
        for (int i = 1; i < 13; i++) {
            String ii = String.valueOf(i);
            ROT13CBOX.addItem("ROT"+ii);
        }
        //-----------
        HEXDelCBox.addItem("NULL");
        HEXDelCBox.addItem("0x");
        HEXDelCBox.addItem("\\x");
        HEXDelCBox.addItem("    Space");
        HEXDelCBox.addItem(",   Comma");
        HEXDelCBox.addItem(";   Semicolon");
        HEXDelCBox.addItem(":   Colon");
        HEXDelCBox.addItem("\\n Newline");
        //-----------
        ASCIICBox.addItem("    Space");
        ASCIICBox.addItem("NULL");
        ASCIICBox.addItem("\\n Newline");
        //-----------
        ConversionCBox.addItem("HEX");
        for (int i = 3; i < 8; i++) ConversionCBox.addItem(String.valueOf(i));
        for (int i = 9; i < 16; i++) ConversionCBox.addItem(String.valueOf(i));
        for (int i = 17; i <= 30; i++) ConversionCBox.addItem(String.valueOf(i));
        //-----------
        HashCBox.addItem("MD5");
        HashCBox.addItem("MD5-16");
        HashCBox.addItem("MD2");
        HashCBox.addItem("MD4");
        HashCBox.addItem("SHA-1");
        HashCBox.addItem("SHA-224");
        HashCBox.addItem("SHA-256");
        HashCBox.addItem("SHA-384");
        HashCBox.addItem("SHA-512");
        //-----------
        AESModeCB.addItem("ECB");
        AESModeCB.addItem("CBC");
        //-----------
        AESOUTCB.addItem("Base64");
        AESOUTCB.addItem("HEX");
        //-----------
        AESKLengthCB.addItem("128");
        AESKLengthCB.addItem("192");
        AESKLengthCB.addItem("256");
    }

    public void init()
    {
        na.setnode();
        NodeSelect();
        ta.setShowsRootHandles(true);// 设置树显示根节点句柄
        ta.expandRow(0);//展开根节点
        //ta.putClientProperty("JTree.lineStyle", "Angled");
        //md.ta.setEditable(true);// 设置树节点可编辑
        Jtreee.setViewportView(ta);//创建一个视口并设置其视图

        CBoxAddItem();

        JFrame frame = new JFrame("TT2 v0.1.7");

        frame.setContentPane(rootview);
        Image frame_icon=Toolkit.getDefaultToolkit().createImage(getClass().getResource("/img/ffffffff0x_ico.png"));
        frame.setResizable(false);

        frame.setIconImage(frame_icon);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);//窗体在屏幕中心出现
        frame.setVisible(true);
    }
}