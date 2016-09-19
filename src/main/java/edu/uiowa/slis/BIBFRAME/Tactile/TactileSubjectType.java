package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileSubjectIterator theTactileSubjectIterator = (TactileSubjectIterator)findAncestorWithClass(this, TactileSubjectIterator.class);
			pageContext.getOut().print(theTactileSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for subject tag ");
		}
		return SKIP_BODY;
	}
}

