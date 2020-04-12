/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛184;

public class third {
//双引号：字符实体为 &quot; ，对应的字符是 " 。
//单引号：字符实体为 &apos; ，对应的字符是 ' 。
//与符号：字符实体为 &amp; ，对应对的字符是 & 。
//大于号：字符实体为 &gt; ，对应的字符是 > 。
//小于号：字符实体为 &lt; ，对应的字符是 < 。
//斜线号：字符实体为 &frasl; ，对应的字符是 /
    public String entityParser(String text) {
        text=text.replace("&quot;", "\"");
        text=text.replace("&apos;", "\'");
        text=text.replace("&gt;", ">");
        text=text.replace("&lt;", "<");
        text=text.replace("&frasl;", "/");
        text=text.replace("&amp;", "&");
        return text;
    }
}
