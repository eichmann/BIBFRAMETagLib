package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceSubjectIterator theIntegratingResourceSubjectIterator = (IntegratingResourceSubjectIterator)findAncestorWithClass(this, IntegratingResourceSubjectIterator.class);
			pageContext.getOut().print(theIntegratingResourceSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for subject tag ");
		}
		return SKIP_BODY;
	}
}

