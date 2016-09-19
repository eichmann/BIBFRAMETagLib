package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasOriginalVersionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasOriginalVersionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasOriginalVersionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasOriginalVersionInverseIterator theIndexHasOriginalVersionInverseIterator = (IndexHasOriginalVersionInverseIterator)findAncestorWithClass(this, IndexHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theIndexHasOriginalVersionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

