package com.michaelahern;

import java.util.List;

public class NodeNAry {

    public int val;
    public List<NodeNAry> children;

    public NodeNAry() {}

    public NodeNAry(int _val) {
        val = _val;
    }

    public NodeNAry(int _val, List<NodeNAry> _children) {
        val = _val;
        children = _children;
    }

}
