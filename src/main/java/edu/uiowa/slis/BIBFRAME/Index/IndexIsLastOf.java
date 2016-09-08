package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexIsLastOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexIsLastOf currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexIsLastOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexIsLastOfIterator theIndexIsLastOfIterator = (IndexIsLastOfIterator)findAncestorWithClass(this, IndexIsLastOfIterator.class);
			pageContext.getOut().print(theIndexIsLastOfIterator.getIsLastOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

