package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasFindingAid extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasFindingAid currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasFindingAid.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasFindingAidIterator theIndexHasFindingAidIterator = (IndexHasFindingAidIterator)findAncestorWithClass(this, IndexHasFindingAidIterator.class);
			pageContext.getOut().print(theIndexHasFindingAidIterator.getHasFindingAid());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

