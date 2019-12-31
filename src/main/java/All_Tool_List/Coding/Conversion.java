package All_Tool_List.Coding;

import java.math.BigInteger;
import java.util.Objects;

public class Conversion {
    public String BinECOtc(String a)
    {
        return new BigInteger(a,2).toString(8);
    }

    public String BinECDec(String a)
    {
        return new BigInteger(a,2).toString(10);
    }

    public String BinECHEX(String a,String b)
    {
        b = CheckCB(b);
        return new BigInteger(a,2).toString(Integer.parseInt(b)).toUpperCase();
    }
    //----
    public String OctECBin(String a)
    {
        return new BigInteger(a,8).toString(2);
    }

    public String OctECDec(String a)
    {
        return new BigInteger(a,8).toString(10);
    }

    public String OctECHEX(String a,String b)
    {
        b = CheckCB(b);
        return new BigInteger(a,8).toString(Integer.parseInt(b)).toUpperCase();
    }
    //----
    public String DecECBin(String a)
    {
        return new BigInteger(a,10).toString(2);
    }

    public String DecECOct(String a)
    {
        return new BigInteger(a,10).toString(8);
    }

    public String DecECHEX(String a,String b)
    {
        b = CheckCB(b);
        return new BigInteger(a,10).toString(Integer.parseInt(b)).toUpperCase();
    }
    //---
    public String HEXECBin(String a,String b)
    {
        b = CheckCB(b);
        return new BigInteger(a,Integer.parseInt(b)).toString(2);
    }

    public String HEXECOct(String a,String b)
    {
        b = CheckCB(b);
        return new BigInteger(a,Integer.parseInt(b)).toString(8);
    }

    public String HEXECDec(String a,String b)
    {
        b = CheckCB(b);
        return new BigInteger(a,Integer.parseInt(b)).toString(10);
    }

    private String CheckCB(String a)
    {
        String out;
        if(Objects.equals(a, "HEX"))
        {
            out = "16";
        }
        else
        {
            out = a;
        }
        return out;
    }
}