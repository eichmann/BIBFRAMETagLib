package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasOriginalVersionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasOriginalVersionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasOriginalVersionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasOriginalVersionInverseIterator theIndexHasOriginalVersionInverseIterator = (IndexHasOriginalVersionInverseIterator)findAncestorWithClass(this, IndexHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theIndexHasOriginalVersionInverseIterator.getHasOriginalVersionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

