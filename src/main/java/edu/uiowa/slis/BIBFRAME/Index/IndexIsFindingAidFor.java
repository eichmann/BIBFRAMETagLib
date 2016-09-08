package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexIsFindingAidForIterator theIndexIsFindingAidForIterator = (IndexIsFindingAidForIterator)findAncestorWithClass(this, IndexIsFindingAidForIterator.class);
			pageContext.getOut().print(theIndexIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

