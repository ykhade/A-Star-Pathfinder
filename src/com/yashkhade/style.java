package com.yashkhade;

import java.awt.*;

public @interface style {
    Font bigText = new Font("serif", 1, 24);
    Font REALBIGText = new Font("serif", 1, 72);
    Font numbers = new Font("serif", 1, 12);
    Font smallNumbers = new Font("serif", 0, 11);
    Color greenHighlight = new Color(132, 255, 138);
    Color redHighlight = new Color(253, 90, 90);
    Color blueHighlight = new Color(32, 233, 255);
    Color btnPanel = new Color(120, 120, 120, 80);
    Color darkText = new Color(48, 48, 48);
    Color lightText = new Color(232, 232, 232);
}
