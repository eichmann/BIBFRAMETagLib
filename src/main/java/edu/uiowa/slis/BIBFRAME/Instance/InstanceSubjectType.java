package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceSubjectIterator theInstanceSubjectIterator = (InstanceSubjectIterator)findAncestorWithClass(this, InstanceSubjectIterator.class);
			pageContext.getOut().print(theInstanceSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for subject tag ");
		}
		return SKIP_BODY;
	}
}

