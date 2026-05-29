package Revision;

interface Whatsapp {
    void group();
}

interface Instagram {
    void group();
}

class WhatGram implements Whatsapp, Instagram {
    public void group() {
        System.out.println("Can share Reels");
    }
}

public class AbstractionInterface {
    static void main(String[] args) {
        WhatGram wg = new WhatGram();
        wg.group();
    }
}
