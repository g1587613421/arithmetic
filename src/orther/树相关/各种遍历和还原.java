/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.树相关;

import java.util.*;

public class 各种遍历和还原 <T> {

    /** 通过数组构造二叉树--如果数组排序就是二叉搜索树--结果是平衡树
     *
     * @param arrays 二叉树的值的集合,支持任何object
     * @return 二叉树的根节点
     */
    protected Node build_BinarySearchTree_fromArray(T[] arrays){
        return build_BinarySearchTree_fromArray_Plus(arrays,0, arrays.length-1);
    }

    /**
     * 通过数组和指定的数组范围构造二叉树--如果数组排序就是二叉搜索树--结果是平衡树
     *
     * @param start -数组的起始位置 闭区间
     * @param end  数组的结束位置 闭区间
     * @return 二叉树的根节点
     */
    protected Node build_BinarySearchTree_fromArray_Plus(T[] arrays,int start,int end)
    {
        if (start>end)
            return null;
        if (start==end)
            return new Node<T>(arrays[start]);
        int middle=(start+end)/2;
        Node<T> node=new Node<T>(arrays[middle]);
        node.left=build_BinarySearchTree_fromArray_Plus(arrays,start, middle-1);
        node.right=build_BinarySearchTree_fromArray_Plus(arrays,middle+1, end);
        return node;
    }

    /**
     * 二叉树广度优先遍历的结果
     * @param root
     * @return
     */
    protected List<T> hierarchical_Traversal(Node<T> root){

        if (root==null)
            return new LinkedList<>();
        ArrayList<T> res=new ArrayList<>();
        LinkedList<Node<T>> data=new LinkedList<>();
        data.addLast(root);
        while (!data.isEmpty()){
            Node node=data.poll();
            res.add((T) node.val);
            if (node.left!=null)
                data.addLast(node.left);
            if (node.right!=null)
                data.addLast(node.right);
        }
        return res;
    }

    /**
     * 深度优先遍历(数据有损型)---先根遍历
     * @param root 根节点
     * @return 包含结点数据的列表
     */
    protected List<T> depthFirst_And_Destory_Tree(Node root){
        LinkedList<T> res=new LinkedList<>();
        LinkedList<Node> middle=new LinkedList<>();
        middle.addFirst(root);
        while (!middle.isEmpty())
        {
            Node node=middle.pollFirst();
            //就是node是叶子结点
            if (node.right==node.left){
                res.addFirst((T) node.val);
                continue;
            }
            middle.addFirst(node);
            if (node.left!=null){
                middle.addFirst(node.left);
                node.left=null;
            }
            if (node.right!=null){
                middle.addFirst(node.right);
                node.right=null;
            }

        }
        return res;
    }

    /**
     * 深度优先遍历(数据无损型)---先根遍历
     * @param root 根节点
     * @return 包含结点数据的列表
     */
    protected List<T> depthFirst_And_NOt_Destory_Tree(Node root){
        LinkedList<T> res=new LinkedList<>();
        if (root==null)
            return res;
        LinkedList<Node> middle=new LinkedList<>();
        ArrayList<Node> flag=new ArrayList<>();
        middle.addFirst(root);
        while (!middle.isEmpty()){
            Node node=middle.pollFirst();
            if (flag.contains(node)||(node.left==node.right)){
                res.addFirst((T)node.val);
                continue;
            }
            flag.add(node);
            middle.addFirst(node);
            if (node.left!=null){
                middle.addFirst(node.left);
            }
            if (node.right!=null){
                middle.addFirst(node.right);
            }
        }
        return res;
    }
    /**
     * 深度优先遍历(数据无损型)---中根遍历
     * @param root 根节点
     * @param reversed 0正序,1逆序
     * @return 包含结点数据的列表
     */
    final public static int reversedOrder=1;
    final public static int Order=0;
    protected List<T> root_Traversal_Not_Destory_Tree(Node root,int reversed) throws Exception {
        if (reversed!=Order&&reversed!=reversedOrder)
            throw new Exception("错误的排序模式");
        LinkedList<T> res=new LinkedList<>();
        if (root==null)
            return res;
        HashSet<Node> flag=new HashSet<>();
        LinkedList<Node> middle=new LinkedList<>();
        middle.addFirst(root);
        while (!middle.isEmpty()){
            Node node=middle.pollFirst();
            if (flag.contains(node)||(node.left==node.right))
            {
                if (reversed==reversedOrder)
                res.addFirst((T)node.val);
                else
                    res.addLast((T)node.val);
                continue;
            }
            if (node.right!=null){
                middle.addFirst(node.right);
            }
            flag.add(node);
            middle.addFirst(node);
            if (node.left!=null){
                middle.addFirst(node.left);
            }
        }
        return res;
    }



    /**
     * 打印链表的内容
     * @param data
     */
    private void show_list(List data){
        for (Object datum : data) {
            System.out.print(datum+" ");
        }
        System.out.println();
    }

    public static void main(String[] arg) throws Exception {//main--来自高金磊
        各种遍历和还原<Integer> tools=new 各种遍历和还原();

        Integer[] integer_data=new Integer[]{1,2,3,4,5,6,7,8,9};
        Node data_node=tools.build_BinarySearchTree_fromArray(integer_data);
        List list_data=tools.hierarchical_Traversal(data_node);
        tools.show_list(list_data);
        tools.show_list(tools.depthFirst_And_NOt_Destory_Tree(data_node));
        tools.show_list(tools.depthFirst_And_Destory_Tree(data_node));
        //树的结构已经被破坏
        System.out.println("树的结构已经被破坏?\t"+(data_node.left==data_node.right));
        data_node=tools.build_BinarySearchTree_fromArray_Plus(integer_data,0,integer_data.length-1);
        tools.show_list(tools.root_Traversal_Not_Destory_Tree(data_node, Order));
        //后根和先根中根类似只需要换一下添加顺序--就不再写了


    }

}

