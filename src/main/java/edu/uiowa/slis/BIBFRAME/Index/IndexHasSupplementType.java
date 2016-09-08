package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasSupplementType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasSupplementType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasSupplementType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasSupplementIterator theIndexHasSupplementIterator = (IndexHasSupplementIterator)findAncestorWithClass(this, IndexHasSupplementIterator.class);
			pageContext.getOut().print(theIndexHasSupplementIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

