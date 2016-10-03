package edu.uiowa.slis.BIBFRAME.Motivation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MotivationTopConceptOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MotivationTopConceptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MotivationTopConceptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MotivationTopConceptOfIterator theMotivationTopConceptOfIterator = (MotivationTopConceptOfIterator)findAncestorWithClass(this, MotivationTopConceptOfIterator.class);
			pageContext.getOut().print(theMotivationTopConceptOfIterator.getTopConceptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Motivation for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Motivation for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

