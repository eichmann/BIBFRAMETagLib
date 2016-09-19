package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RWOSubjectIterator theRWOSubjectIterator = (RWOSubjectIterator)findAncestorWithClass(this, RWOSubjectIterator.class);
			pageContext.getOut().print(theRWOSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for subject tag ");
		}
		return SKIP_BODY;
	}
}

