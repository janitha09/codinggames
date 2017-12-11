/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codinggames;

/**
 *
 * @author 212486104
 * @param <Key>
 * @param <Value>
 */
public class RedBlackBST<Key, Value> {

    private Node root;

    private static final boolean RED = true;
    private static final boolean BLACK = false;

    public void put(Key k, Value val) {
        if (root == null) {
            root = new Node(k, val, BLACK); //the root is always black
        }
    }

    private class Node {

        private Key key;
        private Value val;
        private Node left, right;
        boolean color; //inbound color.

        public Node(Key key, Value val, boolean color) {
            this.key = key;
            this.val = val;
            this.color = color;
        }
    }
}
