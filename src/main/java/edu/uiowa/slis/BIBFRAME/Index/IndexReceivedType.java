package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexReceivedIterator theIndexReceivedIterator = (IndexReceivedIterator)findAncestorWithClass(this, IndexReceivedIterator.class);
			pageContext.getOut().print(theIndexReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for received tag ");
		}
		return SKIP_BODY;
	}
}

