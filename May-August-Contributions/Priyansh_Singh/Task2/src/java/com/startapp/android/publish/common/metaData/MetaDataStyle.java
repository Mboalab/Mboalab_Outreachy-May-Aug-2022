package com.startapp.android.publish.common.metaData;

import com.startapp.common.b.f;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MetaDataStyle
implements Serializable {
    public static final int DEFAULT_ITEM_BOTTOM = -8750199;
    public static final Integer DEFAULT_ITEM_DESC_TEXT_COLOR;
    public static final Set<String> DEFAULT_ITEM_DESC_TEXT_DECORATION;
    public static final Integer DEFAULT_ITEM_DESC_TEXT_SIZE;
    public static final Integer DEFAULT_ITEM_TITLE_TEXT_COLOR;
    public static final Set<String> DEFAULT_ITEM_TITLE_TEXT_DECORATION;
    public static final Integer DEFAULT_ITEM_TITLE_TEXT_SIZE;
    public static final int DEFAULT_ITEM_TOP = -14014151;
    private static final long serialVersionUID = 1L;
    private Integer itemDescriptionTextColor = DEFAULT_ITEM_DESC_TEXT_COLOR;
    @f(b="Ljava/util/HashSet;")
    private Set<String> itemDescriptionTextDecoration = DEFAULT_ITEM_DESC_TEXT_DECORATION;
    private Integer itemDescriptionTextSize = DEFAULT_ITEM_DESC_TEXT_SIZE;
    private Integer itemGradientBottom = -8750199;
    private Integer itemGradientTop = -14014151;
    private Integer itemTitleTextColor = DEFAULT_ITEM_TITLE_TEXT_COLOR;
    @f(b="Ljava/util/HashSet;")
    private Set<String> itemTitleTextDecoration = DEFAULT_ITEM_TITLE_TEXT_DECORATION;
    private Integer itemTitleTextSize = DEFAULT_ITEM_TITLE_TEXT_SIZE;
    private String name = "";

    static {
        DEFAULT_ITEM_TITLE_TEXT_SIZE = 18;
        DEFAULT_ITEM_TITLE_TEXT_COLOR = -1;
        DEFAULT_ITEM_TITLE_TEXT_DECORATION = new HashSet((Collection)Arrays.asList((Object[])new String[]{"BOLD"}));
        DEFAULT_ITEM_DESC_TEXT_SIZE = 14;
        DEFAULT_ITEM_DESC_TEXT_COLOR = -1;
        DEFAULT_ITEM_DESC_TEXT_DECORATION = new HashSet();
    }

    public Integer getItemDescriptionTextColor() {
        return this.itemDescriptionTextColor;
    }

    public Set<String> getItemDescriptionTextDecoration() {
        return this.itemDescriptionTextDecoration;
    }

    public Integer getItemDescriptionTextSize() {
        return this.itemDescriptionTextSize;
    }

    public Integer getItemGradientBottom() {
        return this.itemGradientBottom;
    }

    public Integer getItemGradientTop() {
        return this.itemGradientTop;
    }

    public Integer getItemTitleTextColor() {
        return this.itemTitleTextColor;
    }

    public Set<String> getItemTitleTextDecoration() {
        return this.itemTitleTextDecoration;
    }

    public Integer getItemTitleTextSize() {
        return this.itemTitleTextSize;
    }

    public String getName() {
        return this.name;
    }

    public void setItemDescriptionTextColor(Integer n2) {
        this.itemDescriptionTextColor = n2;
    }

    public void setItemDescriptionTextDecoration(Set<String> set) {
        this.itemDescriptionTextDecoration = set;
    }

    public void setItemDescriptionTextSize(Integer n2) {
        this.itemDescriptionTextSize = n2;
    }

    public void setItemGradientBottom(Integer n2) {
        this.itemGradientBottom = n2;
    }

    public void setItemGradientTop(Integer n2) {
        this.itemGradientTop = n2;
    }

    public void setItemTitleTextColor(Integer n2) {
        this.itemTitleTextColor = n2;
    }

    public void setItemTitleTextDecoration(Set<String> set) {
        this.itemTitleTextDecoration = set;
    }

    public void setItemTitleTextSize(Integer n2) {
        this.itemTitleTextSize = n2;
    }

    public void setName(String string) {
        this.name = string;
    }
}

