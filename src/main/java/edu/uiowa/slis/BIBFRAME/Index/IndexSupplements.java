package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexSupplements extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexSupplements currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexSupplements.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexSupplementsIterator theIndexSupplementsIterator = (IndexSupplementsIterator)findAncestorWithClass(this, IndexSupplementsIterator.class);
			pageContext.getOut().print(theIndexSupplementsIterator.getSupplements());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for supplements tag ");
		}
		return SKIP_BODY;
	}
}

