/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package hsbc.mock.support;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/05 10:45
 */
public class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
}
