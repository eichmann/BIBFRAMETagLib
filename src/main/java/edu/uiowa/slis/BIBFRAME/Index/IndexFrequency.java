package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndexFrequencyIterator theIndex = (IndexFrequencyIterator)findAncestorWithClass(this, IndexFrequencyIterator.class);
			pageContext.getOut().print(theIndex.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for frequency tag ");
		}
		return SKIP_BODY;
	}
}

