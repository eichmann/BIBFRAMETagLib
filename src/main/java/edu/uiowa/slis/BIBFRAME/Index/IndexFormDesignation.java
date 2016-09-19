package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndexFormDesignationIterator theIndex = (IndexFormDesignationIterator)findAncestorWithClass(this, IndexFormDesignationIterator.class);
			pageContext.getOut().print(theIndex.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

