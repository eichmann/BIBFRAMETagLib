package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexIsFirstOfIterator theIndexIsFirstOfIterator = (IndexIsFirstOfIterator)findAncestorWithClass(this, IndexIsFirstOfIterator.class);
			pageContext.getOut().print(theIndexIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

