package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceSubjectIterator theFiniteResourceSubjectIterator = (FiniteResourceSubjectIterator)findAncestorWithClass(this, FiniteResourceSubjectIterator.class);
			pageContext.getOut().print(theFiniteResourceSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for subject tag ");
		}
		return SKIP_BODY;
	}
}

