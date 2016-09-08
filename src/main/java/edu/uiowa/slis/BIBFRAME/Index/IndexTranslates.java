package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexTranslatesIterator theIndexTranslatesIterator = (IndexTranslatesIterator)findAncestorWithClass(this, IndexTranslatesIterator.class);
			pageContext.getOut().print(theIndexTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for translates tag ");
		}
		return SKIP_BODY;
	}
}

