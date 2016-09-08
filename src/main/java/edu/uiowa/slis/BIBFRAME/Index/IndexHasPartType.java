package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasPartIterator theIndexHasPartIterator = (IndexHasPartIterator)findAncestorWithClass(this, IndexHasPartIterator.class);
			pageContext.getOut().print(theIndexHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

