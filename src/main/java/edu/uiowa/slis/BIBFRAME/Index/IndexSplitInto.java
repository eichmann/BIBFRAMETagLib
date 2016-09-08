package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexSplitInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexSplitInto currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexSplitInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexSplitIntoIterator theIndexSplitIntoIterator = (IndexSplitIntoIterator)findAncestorWithClass(this, IndexSplitIntoIterator.class);
			pageContext.getOut().print(theIndexSplitIntoIterator.getSplitInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

