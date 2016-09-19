package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileSubjectIterator theTactileSubjectIterator = (TactileSubjectIterator)findAncestorWithClass(this, TactileSubjectIterator.class);
			pageContext.getOut().print(theTactileSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for subject tag ");
		}
		return SKIP_BODY;
	}
}

