package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexSeparatedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexSeparatedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexSeparatedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexSeparatedFromIterator theIndexSeparatedFromIterator = (IndexSeparatedFromIterator)findAncestorWithClass(this, IndexSeparatedFromIterator.class);
			pageContext.getOut().print(theIndexSeparatedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

