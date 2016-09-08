package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexSupersededBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexSupersededBy currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexSupersededBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexSupersededByIterator theIndexSupersededByIterator = (IndexSupersededByIterator)findAncestorWithClass(this, IndexSupersededByIterator.class);
			pageContext.getOut().print(theIndexSupersededByIterator.getSupersededBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

