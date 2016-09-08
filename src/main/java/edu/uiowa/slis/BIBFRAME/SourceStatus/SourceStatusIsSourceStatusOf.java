package edu.uiowa.slis.BIBFRAME.SourceStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SourceStatusIsSourceStatusOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SourceStatusIsSourceStatusOf currentInstance = null;
	private static final Log log = LogFactory.getLog(SourceStatusIsSourceStatusOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SourceStatusIsSourceStatusOfIterator theSourceStatusIsSourceStatusOfIterator = (SourceStatusIsSourceStatusOfIterator)findAncestorWithClass(this, SourceStatusIsSourceStatusOfIterator.class);
			pageContext.getOut().print(theSourceStatusIsSourceStatusOfIterator.getIsSourceStatusOf());
		} catch (Exception e) {
			log.error("Can't find enclosing SourceStatus for isSourceStatusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing SourceStatus for isSourceStatusOf tag ");
		}
		return SKIP_BODY;
	}
}

