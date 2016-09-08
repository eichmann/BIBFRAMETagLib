package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexContinuedUnderNewTitleByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexContinuedUnderNewTitleByType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexContinuedUnderNewTitleByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexContinuedUnderNewTitleByIterator theIndexContinuedUnderNewTitleByIterator = (IndexContinuedUnderNewTitleByIterator)findAncestorWithClass(this, IndexContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theIndexContinuedUnderNewTitleByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

