package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexSeparatedIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexSeparatedIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexSeparatedIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexSeparatedIntoIterator theIndexSeparatedIntoIterator = (IndexSeparatedIntoIterator)findAncestorWithClass(this, IndexSeparatedIntoIterator.class);
			pageContext.getOut().print(theIndexSeparatedIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

