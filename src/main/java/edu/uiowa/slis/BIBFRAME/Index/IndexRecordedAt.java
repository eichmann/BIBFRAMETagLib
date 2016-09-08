package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexRecordedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexRecordedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexRecordedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexRecordedAtIterator theIndexRecordedAtIterator = (IndexRecordedAtIterator)findAncestorWithClass(this, IndexRecordedAtIterator.class);
			pageContext.getOut().print(theIndexRecordedAtIterator.getRecordedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

