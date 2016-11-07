package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasPreferredTitleIterator theIndexHasPreferredTitleIterator = (IndexHasPreferredTitleIterator)findAncestorWithClass(this, IndexHasPreferredTitleIterator.class);
			pageContext.getOut().print(theIndexHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}
