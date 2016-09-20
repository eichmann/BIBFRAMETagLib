package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasPreferredTitleIterator theMonographHasPreferredTitleIterator = (MonographHasPreferredTitleIterator)findAncestorWithClass(this, MonographHasPreferredTitleIterator.class);
			pageContext.getOut().print(theMonographHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

