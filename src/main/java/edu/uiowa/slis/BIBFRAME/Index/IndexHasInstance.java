package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasInstance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasInstance currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasInstance.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasInstanceIterator theIndexHasInstanceIterator = (IndexHasInstanceIterator)findAncestorWithClass(this, IndexHasInstanceIterator.class);
			pageContext.getOut().print(theIndexHasInstanceIterator.getHasInstance());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

