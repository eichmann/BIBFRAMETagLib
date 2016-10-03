package edu.uiowa.slis.BIBFRAME.Motivation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MotivationTopConceptOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MotivationTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MotivationTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MotivationTopConceptOfIterator theMotivationTopConceptOfIterator = (MotivationTopConceptOfIterator)findAncestorWithClass(this, MotivationTopConceptOfIterator.class);
			pageContext.getOut().print(theMotivationTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Motivation for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Motivation for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

