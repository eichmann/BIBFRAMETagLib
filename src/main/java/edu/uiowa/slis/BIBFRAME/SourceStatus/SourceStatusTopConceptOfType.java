package edu.uiowa.slis.BIBFRAME.SourceStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SourceStatusTopConceptOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SourceStatusTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SourceStatusTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SourceStatusTopConceptOfIterator theSourceStatusTopConceptOfIterator = (SourceStatusTopConceptOfIterator)findAncestorWithClass(this, SourceStatusTopConceptOfIterator.class);
			pageContext.getOut().print(theSourceStatusTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SourceStatus for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing SourceStatus for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

