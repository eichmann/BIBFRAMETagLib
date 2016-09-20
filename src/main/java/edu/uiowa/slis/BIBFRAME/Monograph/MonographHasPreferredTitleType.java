package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasPreferredTitleIterator theMonographHasPreferredTitleIterator = (MonographHasPreferredTitleIterator)findAncestorWithClass(this, MonographHasPreferredTitleIterator.class);
			pageContext.getOut().print(theMonographHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

