package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexContinuesUnderNewTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexContinuesUnderNewTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexContinuesUnderNewTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexContinuesUnderNewTitleIterator theIndexContinuesUnderNewTitleIterator = (IndexContinuesUnderNewTitleIterator)findAncestorWithClass(this, IndexContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theIndexContinuesUnderNewTitleIterator.getContinuesUnderNewTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

