package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationSubjectIterator theDissertationSubjectIterator = (DissertationSubjectIterator)findAncestorWithClass(this, DissertationSubjectIterator.class);
			pageContext.getOut().print(theDissertationSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for subject tag ");
		}
		return SKIP_BODY;
	}
}

