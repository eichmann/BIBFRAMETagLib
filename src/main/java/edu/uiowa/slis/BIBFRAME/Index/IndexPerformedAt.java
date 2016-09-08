package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexPerformedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexPerformedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexPerformedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexPerformedAtIterator theIndexPerformedAtIterator = (IndexPerformedAtIterator)findAncestorWithClass(this, IndexPerformedAtIterator.class);
			pageContext.getOut().print(theIndexPerformedAtIterator.getPerformedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

