package com.ridho.resepku;

import java.util.List;

public class TextUtils {

    /**
     * Formats a list of strings into a single string with bullet points.
     */
    public static String bullets(List<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String item : list) {
            sb.append("• ").append(item).append("\n");
        }
        return sb.toString();
    }

    /**
     * Formats a list of strings into a single string with numbering.
     */
    public static String numbered(List<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(i + 1).append(". ").append(list.get(i)).append("\n\n");
        }
        return sb.toString();
    }
}