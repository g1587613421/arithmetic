/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.顶端迭代器;

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
    int data=0;
    boolean flag=false;
    Iterator<Integer> iterator;
        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            this.iterator=iterator;

        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            if (flag){
                return data;
            }
            else {
                flag=true;
                data=iterator.next();
                return data;
            }
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            if (flag)
            {
                flag=false;
                return data;
            }
            return iterator.next();
        }

        @Override
        public boolean hasNext() {
            return flag||iterator.hasNext();
        }

}
