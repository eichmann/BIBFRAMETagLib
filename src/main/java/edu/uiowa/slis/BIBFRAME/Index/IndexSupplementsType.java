package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexSupplementsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexSupplementsType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexSupplementsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexSupplementsIterator theIndexSupplementsIterator = (IndexSupplementsIterator)findAncestorWithClass(this, IndexSupplementsIterator.class);
			pageContext.getOut().print(theIndexSupplementsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for supplements tag ");
		}
		return SKIP_BODY;
	}
}

