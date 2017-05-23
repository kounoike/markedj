package io.github.gitbucket.markedj;

import org.jsoup.safety.Whitelist;

public class Options {

    private boolean gfm = true;
    private boolean tables = true;
    private boolean breaks = false;
    private boolean sanitize = false;
    private String langPrefix = "lang-";
    private String headerPrefix = "";
    private Whitelist whitelist = new Whitelist()
                .addTags(
                        "a", "b", "blockquote", "br", "caption", "cite", "code", "col",
                                "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6",
                                "i", "img", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong",
                                "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u",
                                "ul", "input", "del")
                .addAttributes("a", "href", "title")
                .addAttributes("blockquote", "cite")
                .addAttributes("col", "span", "width")
                .addAttributes("colgroup", "span", "width")
                .addAttributes("img", "align", "alt", "height", "src", "title", "width")
                .addAttributes("ol", "start", "type")
                .addAttributes("q", "cite")
                .addAttributes("table", "summary", "width")
                .addAttributes("td", "abbr", "axis", "colspan", "rowspan", "width")
                .addAttributes("th", "abbr", "axis", "colspan", "rowspan", "scope", "width")
                .addAttributes("ul", "type")
                .addAttributes("input", "type", "checked", "name", "value", "disabled")
                .addAttributes(":all", "id", "class", "style");

    public void setGfm(boolean gfm) {
        this.gfm = gfm;
    }

    public void setTables(boolean tables) {
        this.tables = tables;
    }

    public void setBreaks(boolean breaks) {
        this.breaks = breaks;
    }

    public void setSanitize(boolean sanitize) {
        this.sanitize = sanitize;
    }

    public void setLangPrefix(String langPrefix) {
        this.langPrefix = langPrefix;
    }

    public void setHeaderPrefix(String headerPrefix) {
        this.headerPrefix = headerPrefix;
    }

    public void setWhitelist(Whitelist whitelist){
        this.whitelist = whitelist;
    }

    public boolean isGfm() {
        return gfm;
    }

    public boolean isTables() {
        return tables;
    }

    public boolean isBreaks() {
        return breaks;
    }

    public boolean isSanitize() {
        return sanitize;
    }

    public String getLangPrefix() {
        return langPrefix;
    }

    public String getHeaderPrefix() {
        return headerPrefix;
    }

    public Whitelist getWhitelist(){
        return whitelist;
    }

}
