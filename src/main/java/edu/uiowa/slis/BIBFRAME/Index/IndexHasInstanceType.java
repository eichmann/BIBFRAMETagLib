package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasInstanceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasInstanceType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasInstanceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasInstanceIterator theIndexHasInstanceIterator = (IndexHasInstanceIterator)findAncestorWithClass(this, IndexHasInstanceIterator.class);
			pageContext.getOut().print(theIndexHasInstanceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

