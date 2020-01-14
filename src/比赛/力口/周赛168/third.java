package 比赛.力口.周赛168;

import java.util.HashMap;
import java.util.LinkedList;

public class third {
    HashMap<String,Integer> data=new HashMap<>();
    int mx=0;
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        String bs="";
        for (char c : s.toCharArray()) {
            bs+=c;

           if (bs.length()>minSize)
           {
               bs=bs.substring(1, bs.length());
           }
           if (Plus(bs)>maxLetters)
               continue;
           if (bs.length()<minSize)
               continue;
            if (data.containsKey(bs))
            {
                continue;
            }
           data.put(bs,plusC(s, bs) );

        }

        for (Integer value : data.values()) {
            mx=Math.max(value, mx);
        }

       return mx;
    }
    LinkedList<Character> middle=new LinkedList<>();
    int Plus(String s){
        middle.clear();
        for (char c : s.toCharArray()) {
            if (middle.contains(c))
                continue;
            middle.add(c);
        }
        return middle.size();
    }
    int middn;
    int plusC(String s, String bs){
        middn=0;
        while (s.contains(bs))
        {
            middn++;
           s=s.substring((s.indexOf(bs)+1),s.length());
        }
        if (middn==2)
            return 2;
        return middn;
    }
    public static void main(String arg[]){//main--来自高金磊

        System.out.println(new third().maxFreq("jrjfprvcrsdgbkofpiqoqwrehkmpaemkjjifezufhmlbyxcvgguhxaseqlsbbleyjncnfkawfesnllfqhburxwhbrvxwdjmccamvszppefzideuwtzurumdinxdahddtowaaygbrikdcmhobjczlsbepfujixslienuskhceclcjlgiopdowtcelduhvbxqqcrnaufapsmniuitftwrvpxuwpfrmdspnwocpqmverbykwbolokvjshibeasmduhfsyxqemsbaybbdudlygihqtvxqygxbvotxdeywigrqrbsxiikcxbwrewhzissnozdzeybalfnevstephqwxhzaydgjnezvutbsxkpwejizsupqvyqjimmcbppueqhljpglqwarkcmslxqxglzlmaijpxerxtignyxdtejpiicdnnlltgwhesozucmrdxfhxudlyctzktrxgwqzbzclwcxcgrarixfetimfvoggexohhyxzhaqiusngcdslbrsjubybtprtryvqofuqdcblsnttsrhepeigkxxaxnozvfnoutnlaryrjbhszlhwvlbpkhxnsmwtwjhrkdkquudxktouuobaakzqdmfqkdgrzjfpnvbqdvmiyrhafchksrgpswxiavkxjpdiragklidudknxrovtwunyyzdtxaxxgwhimjjpwjrhulivmihlayvuvguchaizgewlkpvokrgrmnfjwsxrqsteyhyqnmnzhfdvootznekjsafaktsnfetqbejezxmbrfksoxiasbgwuyhbircmtgsiaoszsurcpcrkzlyeqwseyiezhbqibztaxvqikxcysnugdppgkwnmqqltmixlvxuwbtfvfzzxmpdftjmzepijrufdoehmdvfjtbwyuwjdbjgymugbzrevzmvgtxuhredbslmltokttggyxahikvkauqkrfxyzvoqpkovuhzssrkmpwuannshibomvxerggmogpanrlowemdv",3,4,19));
    }

}
