package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasOtherEditionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasOtherEditionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasOtherEditionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasOtherEditionInverseIterator theIndexHasOtherEditionInverseIterator = (IndexHasOtherEditionInverseIterator)findAncestorWithClass(this, IndexHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theIndexHasOtherEditionInverseIterator.getHasOtherEditionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

