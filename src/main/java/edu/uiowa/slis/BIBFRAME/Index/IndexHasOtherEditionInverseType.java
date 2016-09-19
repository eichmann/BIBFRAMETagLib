package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasOtherEditionInverseIterator theIndexHasOtherEditionInverseIterator = (IndexHasOtherEditionInverseIterator)findAncestorWithClass(this, IndexHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theIndexHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

