package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexIsPartOfIterator theIndexIsPartOfIterator = (IndexIsPartOfIterator)findAncestorWithClass(this, IndexIsPartOfIterator.class);
			pageContext.getOut().print(theIndexIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

