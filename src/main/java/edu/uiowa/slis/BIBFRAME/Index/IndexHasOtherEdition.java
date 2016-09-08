package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasOtherEditionIterator theIndexHasOtherEditionIterator = (IndexHasOtherEditionIterator)findAncestorWithClass(this, IndexHasOtherEditionIterator.class);
			pageContext.getOut().print(theIndexHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

