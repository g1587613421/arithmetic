/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.设计浏览器历史记录;

import java.util.LinkedList;

public class BrowserHistory {
    LinkedList<String> backs=new LinkedList<>();
    LinkedList<String> forwards=new LinkedList<>();
        public BrowserHistory(String homepage) {
            backs.addFirst(homepage);
        }

        public void visit(String url) {
            backs.addFirst(url);
            forwards.clear();
        }

        public String back(int steps) {
            steps=steps>backs.size()-1?backs.size()-1:steps;
            for (int i = 0; i < steps; i++) {
                forwards.addFirst(backs.pollFirst());
            }
            return backs.peek();
        }

        public String forward(int steps) {
            steps=steps>forwards.size()-1?forwards.size():steps;
            for (int i = 0; i < steps; i++) {
                backs.addFirst(forwards.pollFirst());
            }
            return backs.peek();
        }
}
