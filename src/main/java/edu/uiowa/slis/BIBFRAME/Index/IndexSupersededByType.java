package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexSupersededByIterator theIndexSupersededByIterator = (IndexSupersededByIterator)findAncestorWithClass(this, IndexSupersededByIterator.class);
			pageContext.getOut().print(theIndexSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

