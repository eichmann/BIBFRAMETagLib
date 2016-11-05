package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexIdentifiedByIterator theIndexIdentifiedByIterator = (IndexIdentifiedByIterator)findAncestorWithClass(this, IndexIdentifiedByIterator.class);
			pageContext.getOut().print(theIndexIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

