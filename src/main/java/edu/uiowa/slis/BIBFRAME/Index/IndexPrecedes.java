package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexPrecedesIterator theIndexPrecedesIterator = (IndexPrecedesIterator)findAncestorWithClass(this, IndexPrecedesIterator.class);
			pageContext.getOut().print(theIndexPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for precedes tag ");
		}
		return SKIP_BODY;
	}
}
