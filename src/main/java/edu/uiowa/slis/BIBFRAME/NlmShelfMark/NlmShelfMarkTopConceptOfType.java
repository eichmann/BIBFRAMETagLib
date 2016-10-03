package edu.uiowa.slis.BIBFRAME.NlmShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmShelfMarkTopConceptOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmShelfMarkTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmShelfMarkTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NlmShelfMarkTopConceptOfIterator theNlmShelfMarkTopConceptOfIterator = (NlmShelfMarkTopConceptOfIterator)findAncestorWithClass(this, NlmShelfMarkTopConceptOfIterator.class);
			pageContext.getOut().print(theNlmShelfMarkTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NlmShelfMark for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmShelfMark for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

