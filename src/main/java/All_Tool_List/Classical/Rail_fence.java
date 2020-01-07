package All_Tool_List.Classical;

public class Rail_fence {
    public String Rail_fenceEnCode(String Source,int Quantity)
    {
        Source = Source.replace(" ","");
        char[] str = Source.toCharArray();
        String[] srt= new String[Quantity];
        int i = 0;
        for (char s:str)
        {
            srt[i] += String.valueOf(s);
            if(i<Quantity-1)
            {
                i++;
            }
            else
            {
                i=0;
            }
        }
        StringBuilder sn = new StringBuilder();
        for (String n:srt) {
            sn.append(n);
        }
        return sn.toString().replace("null","");
    }

    public String Rail_fenceDeCode(String Source,int Quantity)
    {

        int i = 0;
        char[] str = Source.toCharArray();
        String[] srt = new String[Source.length()/Quantity];
        StringBuilder ec = new StringBuilder();
        StringBuilder rc = new StringBuilder();
        if(Source.length()%Quantity==0) {
            for (char s:str) {
                srt[i] += String.valueOf(s);
                if(i<(Source.length()/Quantity)-1) {
                    i++;
                }
                else {
                    i=0;
                }
            }
        }
        else{
            int j = Source.length()%Quantity;

            for (int k = 1; k < j+1; k++) {
                ec.append(str[((Source.length()/Quantity+1)*k)-1]);
                str[((Source.length()/Quantity+1)*k)-1] = ' ';
            }

            for(char s:str) {
                rc.append(s);
            }
            str = rc.toString().replace(" ","").toCharArray();

            for (char s:str) {
                srt[i] += String.valueOf(s);
                if(i<(Source.length()/Quantity)-1)
                {
                    i++;
                }
                else
                {
                    i=0;
                }
            }
        }

        StringBuilder sn = new StringBuilder();
        for (String l:srt) {
            sn.append(l);
        }
        sn = new StringBuilder(sn.toString().replace("null", "") + ec.toString());
        return sn.toString();
    }
}