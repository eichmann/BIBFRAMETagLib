package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexPerformedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexPerformedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexPerformedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexPerformedAtIterator theIndexPerformedAtIterator = (IndexPerformedAtIterator)findAncestorWithClass(this, IndexPerformedAtIterator.class);
			pageContext.getOut().print(theIndexPerformedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

