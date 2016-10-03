package edu.uiowa.slis.BIBFRAME.SourceStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SourceStatusTopConceptOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SourceStatusTopConceptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(SourceStatusTopConceptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SourceStatusTopConceptOfIterator theSourceStatusTopConceptOfIterator = (SourceStatusTopConceptOfIterator)findAncestorWithClass(this, SourceStatusTopConceptOfIterator.class);
			pageContext.getOut().print(theSourceStatusTopConceptOfIterator.getTopConceptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing SourceStatus for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing SourceStatus for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

