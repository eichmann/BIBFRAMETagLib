package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexIsLastOfIterator theIndexIsLastOfIterator = (IndexIsLastOfIterator)findAncestorWithClass(this, IndexIsLastOfIterator.class);
			pageContext.getOut().print(theIndexIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

