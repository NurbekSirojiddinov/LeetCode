package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    List<String> browsers = new ArrayList<>();
    int index = 0;

    public BrowserHistory(String homepage) {
        browsers.add(homepage);
    }

    public void visit(String url) {
        while (browsers.size() > index + 1) {
            browsers.remove(index + 1);
        }
        browsers.add(url);
        index = browsers.size() - 1;
    }

    public String back(int steps) {
        if (steps > index) {
            index = 0;
        } else {
            index = index - steps;
        }
        return browsers.get(index);
    }

    public String forward(int steps) {
        index = Math.min(index + steps, browsers.size() - 1);
        return browsers.get(index);
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory("leetcode");
        browserHistory.visit("google");
        browserHistory.visit("facebook");
        browserHistory.visit("youtube");
        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.forward(1));
        browserHistory.visit("linkedin");
        System.out.println(browserHistory.forward(2));
        System.out.println(browserHistory.back(2));
        System.out.println(browserHistory.back(7));
    }
}
