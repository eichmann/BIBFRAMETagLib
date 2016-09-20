package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographSplitInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographSplitInto currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographSplitInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographSplitIntoIterator theMonographSplitIntoIterator = (MonographSplitIntoIterator)findAncestorWithClass(this, MonographSplitIntoIterator.class);
			pageContext.getOut().print(theMonographSplitIntoIterator.getSplitInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

