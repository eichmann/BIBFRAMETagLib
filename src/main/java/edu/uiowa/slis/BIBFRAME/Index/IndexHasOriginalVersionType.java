package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasOriginalVersionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasOriginalVersionType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasOriginalVersionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasOriginalVersionIterator theIndexHasOriginalVersionIterator = (IndexHasOriginalVersionIterator)findAncestorWithClass(this, IndexHasOriginalVersionIterator.class);
			pageContext.getOut().print(theIndexHasOriginalVersionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

