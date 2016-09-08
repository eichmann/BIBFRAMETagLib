package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasOtherEditionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasOtherEditionType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasOtherEditionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasOtherEditionIterator theIndexHasOtherEditionIterator = (IndexHasOtherEditionIterator)findAncestorWithClass(this, IndexHasOtherEditionIterator.class);
			pageContext.getOut().print(theIndexHasOtherEditionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

