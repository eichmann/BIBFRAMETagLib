package edu.uiowa.slis.BIBFRAME.SourceStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SourceStatusIsSourceStatusOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SourceStatusIsSourceStatusOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SourceStatusIsSourceStatusOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SourceStatusIsSourceStatusOfIterator theSourceStatusIsSourceStatusOfIterator = (SourceStatusIsSourceStatusOfIterator)findAncestorWithClass(this, SourceStatusIsSourceStatusOfIterator.class);
			pageContext.getOut().print(theSourceStatusIsSourceStatusOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SourceStatus for isSourceStatusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing SourceStatus for isSourceStatusOf tag ");
		}
		return SKIP_BODY;
	}
}

