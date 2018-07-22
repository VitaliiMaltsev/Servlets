package ru.edu.gemini.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import javax.swing.plaf.PanelUI;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormattedDate extends TagSupport {

public String format;

    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            DateFormat df = new SimpleDateFormat(format);
            out.print(df.format(new Date()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
