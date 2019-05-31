package com.yashkhade;

import org.w3c.dom.Node;

import java.util.ArrayList;

public class AStar {
    private int size;
    private long runTime;
    private double kValue;
    private Frame frame;
    private Node startNode, endNode, par;
    private boolean diagonal, running, noPath, complete, trig;
    private ArrayList<Node> borders, open, closed, path;
    private Sort sort = new Sort();

}
